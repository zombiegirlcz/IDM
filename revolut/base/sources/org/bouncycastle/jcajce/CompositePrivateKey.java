package org.bouncycastle.jcajce;

import j6.a;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okl.m;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.interfaces.MLDSAPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeIndex;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.KeyFactorySpi;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes14.dex */
public class CompositePrivateKey implements PrivateKey {
    private AlgorithmIdentifier algorithmIdentifier;
    private final List<PrivateKey> keys;
    private final List<Provider> providers;

    public static class Builder {
        private final AlgorithmIdentifier algorithmIdentifier;
        private int count;
        private final PrivateKey[] keys;
        private final Provider[] providers;

        private Builder(AlgorithmIdentifier algorithmIdentifier) {
            this.keys = new PrivateKey[2];
            this.providers = new Provider[2];
            this.count = 0;
            this.algorithmIdentifier = algorithmIdentifier;
        }

        public Builder addPrivateKey(PrivateKey privateKey) {
            return addPrivateKey(privateKey, (Provider) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CompositePrivateKey build() {
            Provider[] providerArr = this.providers;
            return (providerArr[0] == null && providerArr[1] == null) ? new CompositePrivateKey(this.algorithmIdentifier, this.keys, null) : new CompositePrivateKey(this.algorithmIdentifier, this.keys, providerArr);
        }

        public Builder addPrivateKey(PrivateKey privateKey, String str) {
            return addPrivateKey(privateKey, Security.getProvider(str));
        }

        public Builder addPrivateKey(PrivateKey privateKey, Provider provider) {
            int i = this.count;
            PrivateKey[] privateKeyArr = this.keys;
            if (i == privateKeyArr.length) {
                throw new IllegalStateException(a.v(new StringBuilder("only "), " allowed in composite", this.keys.length));
            }
            privateKeyArr[i] = privateKey;
            Provider[] providerArr = this.providers;
            this.count = i + 1;
            providerArr[i] = provider;
            return this;
        }
    }

    public CompositePrivateKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, PrivateKey... privateKeyArr) {
        this(new AlgorithmIdentifier(aSN1ObjectIdentifier), privateKeyArr);
    }

    public static Builder builder(String str) {
        return builder(CompositeUtil.getOid(str));
    }

    private PrivateKey processKey(PrivateKey privateKey) {
        if (!(privateKey instanceof MLDSAPrivateKey)) {
            return privateKey;
        }
        try {
            return ((MLDSAPrivateKey) privateKey).getPrivateKey(true);
        } catch (Exception unused) {
            return privateKey;
        }
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof CompositePrivateKey) {
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) obj2;
            if (compositePrivateKey.getAlgorithmIdentifier().equals(this.algorithmIdentifier) && this.keys.equals(compositePrivateKey.keys)) {
                return true;
            }
        }
        return false;
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
        ASN1OctetString privateKey;
        byte[] encoded;
        ASN1ObjectIdentifier algorithm = this.algorithmIdentifier.getAlgorithm();
        byte[] bArrConcatenate = null;
        int i = 0;
        if (!algorithm.on(IANAObjectIdentifiers.id_alg)) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            if (MiscObjectIdentifiers.id_composite_key.equals((ASN1Primitive) algorithm)) {
                while (i < this.keys.size()) {
                    aSN1EncodableVector.add(PrivateKeyInfo.getInstance(this.keys.get(i).getEncoded()));
                    i++;
                }
                try {
                    return new PrivateKeyInfo(this.algorithmIdentifier, new DERSequence(aSN1EncodableVector)).getEncoded("DER");
                } catch (IOException e) {
                    throw new IllegalStateException(m.f(e, new StringBuilder("unable to encode composite private key: ")));
                }
            }
            while (i < this.keys.size()) {
                bArrConcatenate = Arrays.concatenate(bArrConcatenate, PrivateKeyInfo.getInstance(this.keys.get(i).getEncoded()).getPrivateKey().getOctets());
                i++;
            }
            try {
                return new PrivateKeyInfo(this.algorithmIdentifier, bArrConcatenate).getEncoded("DER");
            } catch (IOException e2) {
                throw new IllegalStateException(m.f(e2, new StringBuilder("unable to encode composite private key: ")));
            }
        }
        try {
            PrivateKey privateKey2 = this.keys.get(0);
            PrivateKey privateKey3 = this.keys.get(1);
            byte[] seed = ((MLDSAPrivateKey) privateKey2).getSeed();
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(privateKey3.getEncoded());
            String algorithm2 = privateKey3.getAlgorithm();
            if (algorithm2.contains("Ed")) {
                privateKey = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey());
            } else {
                if (algorithm2.contains("EC")) {
                    ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
                    if (eCPrivateKey.getPublicKey() != null) {
                        eCPrivateKey = new ECPrivateKey(eCPrivateKey.getPrivateKey(), eCPrivateKey.getParametersObject(), (ASN1BitString) null);
                    }
                    encoded = eCPrivateKey.getEncoded("DER");
                    return new PrivateKeyInfo(this.algorithmIdentifier, Arrays.concatenate(seed, encoded)).getEncoded();
                }
                privateKey = privateKeyInfo.getPrivateKey();
            }
            encoded = privateKey.getOctets();
            return new PrivateKeyInfo(this.algorithmIdentifier, Arrays.concatenate(seed, encoded)).getEncoded();
        } catch (IOException e4) {
            throw new IllegalStateException(m.f(e4, new StringBuilder("unable to encode composite public key: ")));
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public List<PrivateKey> getPrivateKeys() {
        return this.keys;
    }

    public List<Provider> getProviders() {
        return this.providers;
    }

    public int hashCode() {
        return this.keys.hashCode();
    }

    public CompositePrivateKey(PrivateKeyInfo privateKeyInfo) {
        try {
            if (!CompositeIndex.isAlgorithmSupported(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())) {
                throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo");
            }
            CompositePrivateKey compositePrivateKey = (CompositePrivateKey) new KeyFactorySpi().generatePrivate(privateKeyInfo);
            if (compositePrivateKey == null) {
                throw new IllegalStateException("Unable to create CompositePrivateKey from PrivateKeyInfo");
            }
            this.keys = compositePrivateKey.getPrivateKeys();
            this.providers = null;
            this.algorithmIdentifier = compositePrivateKey.getAlgorithmIdentifier();
        } catch (IOException e) {
            throw Exceptions.illegalStateException(e.getMessage(), e);
        }
    }

    public static Builder builder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new Builder(new AlgorithmIdentifier(aSN1ObjectIdentifier));
    }

    public CompositePrivateKey(AlgorithmIdentifier algorithmIdentifier, PrivateKey... privateKeyArr) {
        this.algorithmIdentifier = algorithmIdentifier;
        if (privateKeyArr == null || privateKeyArr.length == 0) {
            throw new IllegalArgumentException("at least one private key must be provided for the composite private key");
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        for (PrivateKey privateKey : privateKeyArr) {
            arrayList.add(processKey(privateKey));
        }
        this.keys = Collections.unmodifiableList(arrayList);
        this.providers = null;
    }

    private CompositePrivateKey(AlgorithmIdentifier algorithmIdentifier, PrivateKey[] privateKeyArr, Provider[] providerArr) {
        List<Provider> listUnmodifiableList;
        this.algorithmIdentifier = algorithmIdentifier;
        if (privateKeyArr.length != 2) {
            throw new IllegalArgumentException("two keys required for composite private key");
        }
        ArrayList arrayList = new ArrayList(privateKeyArr.length);
        int i = 0;
        if (providerArr == null) {
            while (i < privateKeyArr.length) {
                arrayList.add(processKey(privateKeyArr[i]));
                i++;
            }
            listUnmodifiableList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(providerArr.length);
            while (i < privateKeyArr.length) {
                arrayList2.add(providerArr[i]);
                arrayList.add(processKey(privateKeyArr[i]));
                i++;
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        this.providers = listUnmodifiableList;
        this.keys = Collections.unmodifiableList(arrayList);
    }

    public CompositePrivateKey(PrivateKey... privateKeyArr) {
        this(MiscObjectIdentifiers.id_composite_key, privateKeyArr);
    }
}
