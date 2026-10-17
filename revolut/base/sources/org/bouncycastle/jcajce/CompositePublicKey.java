package org.bouncycastle.jcajce;

import j6.a;
import java.io.IOException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class CompositePublicKey implements PublicKey {
    private final AlgorithmIdentifier algorithmIdentifier;
    private final List<PublicKey> keys;
    private final List<Provider> providers;

    public static class Builder {
        private final AlgorithmIdentifier algorithmIdentifier;
        private int count;
        private final PublicKey[] keys;
        private final Provider[] providers;

        private Builder(AlgorithmIdentifier algorithmIdentifier) {
            this.keys = new PublicKey[2];
            this.providers = new Provider[2];
            this.count = 0;
            this.algorithmIdentifier = algorithmIdentifier;
        }

        public Builder addPublicKey(PublicKey publicKey) {
            return addPublicKey(publicKey, (Provider) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CompositePublicKey build() {
            Provider[] providerArr = this.providers;
            return (providerArr[0] == null && providerArr[1] == null) ? new CompositePublicKey(this.algorithmIdentifier, this.keys, null) : new CompositePublicKey(this.algorithmIdentifier, this.keys, providerArr);
        }

        public Builder addPublicKey(PublicKey publicKey, String str) {
            return addPublicKey(publicKey, Security.getProvider(str));
        }

        public Builder addPublicKey(PublicKey publicKey, Provider provider) {
            int i = this.count;
            PublicKey[] publicKeyArr = this.keys;
            if (i == publicKeyArr.length) {
                throw new IllegalStateException(a.v(new StringBuilder("only "), " allowed in composite", this.keys.length));
            }
            publicKeyArr[i] = publicKey;
            Provider[] providerArr = this.providers;
            this.count = i + 1;
            providerArr[i] = provider;
            return this;
        }
    }

    public CompositePublicKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, PublicKey... publicKeyArr) {
        this(new AlgorithmIdentifier(aSN1ObjectIdentifier), publicKeyArr);
    }

    public static Builder builder(String str) {
        return builder(CompositeUtil.getOid(str));
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof CompositePublicKey)) {
            return false;
        }
        CompositePublicKey compositePublicKey = (CompositePublicKey) obj2;
        return this.algorithmIdentifier.equals(compositePublicKey.algorithmIdentifier) && this.keys.equals(compositePublicKey.keys);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return CompositeIndex.getAlgorithmName(this.algorithmIdentifier.getAlgorithm());
    }

    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ASN1ObjectIdentifier algorithm = this.algorithmIdentifier.getAlgorithm();
        if (algorithm.on(IANAObjectIdentifiers.id_alg)) {
            try {
                return new SubjectPublicKeyInfo(this.algorithmIdentifier, Arrays.concatenate(SubjectPublicKeyInfo.getInstance(this.keys.get(0).getEncoded()).getPublicKeyData().getOctets(), SubjectPublicKeyInfo.getInstance(this.keys.get(1).getEncoded()).getPublicKeyData().getOctets())).getEncoded("DER");
            } catch (IOException e) {
                throw new IllegalStateException(m.f(e, new StringBuilder("unable to encode composite public key: ")));
            }
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i = 0; i < this.keys.size(); i++) {
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(this.keys.get(i).getEncoded());
            SubjectPublicKeyInfo publicKeyData = subjectPublicKeyInfo;
            if (!MiscObjectIdentifiers.id_composite_key.equals((ASN1Primitive) algorithm)) {
                publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
            }
            aSN1EncodableVector.add(publicKeyData);
        }
        try {
            return new SubjectPublicKeyInfo(this.algorithmIdentifier, new DERSequence(aSN1EncodableVector)).getEncoded("DER");
        } catch (IOException e2) {
            throw new IllegalStateException(m.f(e2, new StringBuilder("unable to encode composite public key: ")));
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public List<Provider> getProviders() {
        return this.providers;
    }

    public List<PublicKey> getPublicKeys() {
        return this.keys;
    }

    public int hashCode() {
        return this.algorithmIdentifier.hashCode() ^ this.keys.hashCode();
    }

    public CompositePublicKey(AlgorithmIdentifier algorithmIdentifier, PublicKey... publicKeyArr) {
        this.algorithmIdentifier = algorithmIdentifier;
        if (publicKeyArr == null || publicKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one public key must be provided for the composite public key");
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        for (PublicKey publicKey : publicKeyArr) {
            arrayList.add(publicKey);
        }
        this.keys = Collections.unmodifiableList(arrayList);
        this.providers = null;
    }

    public static Builder builder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new Builder(new AlgorithmIdentifier(aSN1ObjectIdentifier));
    }

    private CompositePublicKey(AlgorithmIdentifier algorithmIdentifier, PublicKey[] publicKeyArr, Provider[] providerArr) {
        List<Provider> listUnmodifiableList;
        this.algorithmIdentifier = algorithmIdentifier;
        if (publicKeyArr.length != 2) {
            throw new IllegalArgumentException("two keys required for composite private key");
        }
        ArrayList arrayList = new ArrayList(publicKeyArr.length);
        int i = 0;
        if (providerArr == null) {
            while (i < publicKeyArr.length) {
                arrayList.add(publicKeyArr[i]);
                i++;
            }
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(providerArr.length);
            while (i < publicKeyArr.length) {
                arrayList2.add(providerArr[i]);
                arrayList.add(publicKeyArr[i]);
                i++;
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        this.providers = listUnmodifiableList;
        this.keys = Collections.unmodifiableList(arrayList);
    }

    public CompositePublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            if (!CompositeIndex.isAlgorithmSupported(subjectPublicKeyInfo.getAlgorithm().getAlgorithm())) {
                throw new IllegalStateException("unable to create CompositePublicKey from SubjectPublicKeyInfo");
            }
            CompositePublicKey compositePublicKey = (CompositePublicKey) new KeyFactorySpi().generatePublic(subjectPublicKeyInfo);
            if (compositePublicKey == null) {
                throw new IllegalStateException("unable to create CompositePublicKey from SubjectPublicKeyInfo");
            }
            this.keys = compositePublicKey.getPublicKeys();
            this.algorithmIdentifier = compositePublicKey.getAlgorithmIdentifier();
            this.providers = null;
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public CompositePublicKey(PublicKey... publicKeyArr) {
        this(MiscObjectIdentifiers.id_composite_key, publicKeyArr);
    }
}
