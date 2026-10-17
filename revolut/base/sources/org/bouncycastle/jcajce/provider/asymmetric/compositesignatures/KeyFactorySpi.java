package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import a10.b;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okl.m;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes14.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    private static Map<ASN1ObjectIdentifier, int[]> componentKeySizes;
    private static final AlgorithmIdentifier ecDsaBrainpoolP256r1;
    private static final AlgorithmIdentifier ecDsaBrainpoolP384r1;
    private static final AlgorithmIdentifier ecDsaP256;
    private static final AlgorithmIdentifier ecDsaP384;
    private static final AlgorithmIdentifier ecDsaP521;
    private static final AlgorithmIdentifier ed25519;
    private static final AlgorithmIdentifier ed448;
    private static final AlgorithmIdentifier mlDsa44;
    private static final AlgorithmIdentifier mlDsa65;
    private static final AlgorithmIdentifier mlDsa87;
    private static Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> pairings;

    /* JADX INFO: renamed from: rsa, reason: collision with root package name */
    private static final AlgorithmIdentifier f228593rsa;
    private JcaJceHelper helper;

    static {
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_44);
        mlDsa44 = algorithmIdentifier;
        AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_65);
        mlDsa65 = algorithmIdentifier2;
        AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_87);
        mlDsa87 = algorithmIdentifier3;
        AlgorithmIdentifier algorithmIdentifier4 = new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed25519);
        ed25519 = algorithmIdentifier4;
        AlgorithmIdentifier algorithmIdentifier5 = new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed448);
        ed448 = algorithmIdentifier5;
        AlgorithmIdentifier algorithmIdentifierCreateECAlgID = createECAlgID(SECObjectIdentifiers.secp256r1);
        ecDsaP256 = algorithmIdentifierCreateECAlgID;
        AlgorithmIdentifier algorithmIdentifierCreateECAlgID2 = createECAlgID(SECObjectIdentifiers.secp384r1);
        ecDsaP384 = algorithmIdentifierCreateECAlgID2;
        AlgorithmIdentifier algorithmIdentifierCreateECAlgID3 = createECAlgID(SECObjectIdentifiers.secp521r1);
        ecDsaP521 = algorithmIdentifierCreateECAlgID3;
        AlgorithmIdentifier algorithmIdentifierCreateECAlgID4 = createECAlgID(TeleTrusTObjectIdentifiers.brainpoolP256r1);
        ecDsaBrainpoolP256r1 = algorithmIdentifierCreateECAlgID4;
        AlgorithmIdentifier algorithmIdentifierCreateECAlgID5 = createECAlgID(TeleTrusTObjectIdentifiers.brainpoolP384r1);
        ecDsaBrainpoolP384r1 = algorithmIdentifierCreateECAlgID5;
        AlgorithmIdentifier algorithmIdentifier6 = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption);
        f228593rsa = algorithmIdentifier6;
        pairings = new HashMap();
        componentKeySizes = new HashMap();
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = IANAObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256;
        map.put(aSN1ObjectIdentifier, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier6});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map2 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = IANAObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256;
        map2.put(aSN1ObjectIdentifier2, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier6});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map3 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = IANAObjectIdentifiers.id_MLDSA44_Ed25519_SHA512;
        map3.put(aSN1ObjectIdentifier3, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifier4});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map4 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = IANAObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256;
        map4.put(aSN1ObjectIdentifier4, new AlgorithmIdentifier[]{algorithmIdentifier, algorithmIdentifierCreateECAlgID});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map5 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = IANAObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA512;
        map5.put(aSN1ObjectIdentifier5, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier6});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map6 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = IANAObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA512;
        map6.put(aSN1ObjectIdentifier6, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier6});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map7 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = IANAObjectIdentifiers.id_MLDSA65_RSA4096_PSS_SHA512;
        map7.put(aSN1ObjectIdentifier7, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier6});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map8 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = IANAObjectIdentifiers.id_MLDSA65_RSA4096_PKCS15_SHA512;
        map8.put(aSN1ObjectIdentifier8, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier6});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map9 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = IANAObjectIdentifiers.id_MLDSA65_ECDSA_P256_SHA512;
        map9.put(aSN1ObjectIdentifier9, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifierCreateECAlgID});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map10 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = IANAObjectIdentifiers.id_MLDSA65_ECDSA_P384_SHA512;
        map10.put(aSN1ObjectIdentifier10, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifierCreateECAlgID2});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map11 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = IANAObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA512;
        map11.put(aSN1ObjectIdentifier11, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifierCreateECAlgID4});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map12 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = IANAObjectIdentifiers.id_MLDSA65_Ed25519_SHA512;
        map12.put(aSN1ObjectIdentifier12, new AlgorithmIdentifier[]{algorithmIdentifier2, algorithmIdentifier4});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map13 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = IANAObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA512;
        map13.put(aSN1ObjectIdentifier13, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifierCreateECAlgID2});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map14 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = IANAObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA512;
        map14.put(aSN1ObjectIdentifier14, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifierCreateECAlgID5});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map15 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = IANAObjectIdentifiers.id_MLDSA87_Ed448_SHAKE256;
        map15.put(aSN1ObjectIdentifier15, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifier5});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map16 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = IANAObjectIdentifiers.id_MLDSA87_RSA4096_PSS_SHA512;
        map16.put(aSN1ObjectIdentifier16, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifier6});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map17 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = IANAObjectIdentifiers.id_MLDSA87_ECDSA_P521_SHA512;
        map17.put(aSN1ObjectIdentifier17, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifierCreateECAlgID3});
        Map<ASN1ObjectIdentifier, AlgorithmIdentifier[]> map18 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = IANAObjectIdentifiers.id_MLDSA87_RSA3072_PSS_SHA512;
        map18.put(aSN1ObjectIdentifier18, new AlgorithmIdentifier[]{algorithmIdentifier3, algorithmIdentifier6});
        componentKeySizes.put(aSN1ObjectIdentifier, new int[]{1312, 268});
        componentKeySizes.put(aSN1ObjectIdentifier2, new int[]{1312, 284});
        componentKeySizes.put(aSN1ObjectIdentifier3, new int[]{1312, 32});
        componentKeySizes.put(aSN1ObjectIdentifier4, new int[]{1312, 76});
        componentKeySizes.put(aSN1ObjectIdentifier5, new int[]{1952, 256});
        componentKeySizes.put(aSN1ObjectIdentifier6, new int[]{1952, 256});
        componentKeySizes.put(aSN1ObjectIdentifier7, new int[]{1952, 542});
        componentKeySizes.put(aSN1ObjectIdentifier8, new int[]{1952, 542});
        componentKeySizes.put(aSN1ObjectIdentifier9, new int[]{1952, 76});
        componentKeySizes.put(aSN1ObjectIdentifier10, new int[]{1952, 87});
        componentKeySizes.put(aSN1ObjectIdentifier11, new int[]{1952, 76});
        componentKeySizes.put(aSN1ObjectIdentifier12, new int[]{1952, 32});
        componentKeySizes.put(aSN1ObjectIdentifier13, new int[]{2592, 87});
        componentKeySizes.put(aSN1ObjectIdentifier14, new int[]{2592, 87});
        componentKeySizes.put(aSN1ObjectIdentifier15, new int[]{2592, 57});
        componentKeySizes.put(aSN1ObjectIdentifier16, new int[]{2592, 542});
        componentKeySizes.put(aSN1ObjectIdentifier18, new int[]{2592, 256});
        componentKeySizes.put(aSN1ObjectIdentifier17, new int[]{2592, 93});
    }

    public KeyFactorySpi() {
        this(null);
    }

    private static AlgorithmIdentifier createECAlgID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, new X962Parameters(aSN1ObjectIdentifier));
    }

    private List<KeyFactory> getKeyFactoriesFromIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier) throws NoSuchAlgorithmException, NoSuchProviderException {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        String[] pairing = CompositeIndex.getPairing(aSN1ObjectIdentifier);
        if (pairing == null) {
            throw new NoSuchAlgorithmException("Cannot create KeyFactories. Unsupported algorithm identifier.");
        }
        arrayList.add(this.helper.createKeyFactory(CompositeIndex.getBaseName(pairing[0])));
        arrayList.add(this.helper.createKeyFactory(CompositeIndex.getBaseName(pairing[1])));
        return Collections.unmodifiableList(arrayList);
    }

    private X509EncodedKeySpec[] getKeysSpecs(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1BitString[] aSN1BitStringArr) throws IOException {
        X509EncodedKeySpec[] x509EncodedKeySpecArr = new X509EncodedKeySpec[aSN1BitStringArr.length];
        SubjectPublicKeyInfo[] subjectPublicKeyInfoArr = new SubjectPublicKeyInfo[aSN1BitStringArr.length];
        AlgorithmIdentifier[] algorithmIdentifierArr = pairings.get(aSN1ObjectIdentifier);
        if (algorithmIdentifierArr == null) {
            throw new IOException("Cannot create key specs. Unsupported algorithm identifier.");
        }
        subjectPublicKeyInfoArr[0] = new SubjectPublicKeyInfo(algorithmIdentifierArr[0], aSN1BitStringArr[0]);
        subjectPublicKeyInfoArr[1] = new SubjectPublicKeyInfo(algorithmIdentifierArr[1], aSN1BitStringArr[1]);
        x509EncodedKeySpecArr[0] = new X509EncodedKeySpec(subjectPublicKeyInfoArr[0].getEncoded());
        x509EncodedKeySpecArr[1] = new X509EncodedKeySpec(subjectPublicKeyInfoArr[1].getEncoded());
        return x509EncodedKeySpecArr;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (this.helper == null) {
            this.helper = new BCJcaJceHelper();
        }
        try {
            if (key instanceof PrivateKey) {
                return generatePrivate(PrivateKeyInfo.getInstance(key.getEncoded()));
            }
            if (key instanceof PublicKey) {
                return generatePublic(SubjectPublicKeyInfo.getInstance(key.getEncoded()));
            }
            throw new InvalidKeyException("Key not recognized");
        } catch (IOException e) {
            throw new InvalidKeyException(m.f(e, new StringBuilder("Key could not be parsed: ")));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        byte[] octets;
        if (this.helper == null) {
            this.helper = new BCJcaJceHelper();
        }
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        int i = 0;
        if (MiscObjectIdentifiers.id_alg_composite.equals((ASN1Primitive) algorithm) || MiscObjectIdentifiers.id_composite_key.equals((ASN1Primitive) algorithm)) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
            PrivateKey[] privateKeyArr = new PrivateKey[aSN1Sequence.size()];
            while (i != aSN1Sequence.size()) {
                PrivateKeyInfo privateKeyInfo2 = PrivateKeyInfo.getInstance(ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i)));
                try {
                    privateKeyArr[i] = this.helper.createKeyFactory(privateKeyInfo2.getPrivateKeyAlgorithm().getAlgorithm().getId()).generatePrivate(new PKCS8EncodedKeySpec(privateKeyInfo2.getEncoded()));
                    i++;
                } catch (Exception e) {
                    throw new IOException(b.r(e, new StringBuilder("cannot decode generic composite: ")), e);
                }
            }
            return new CompositePrivateKey(privateKeyArr);
        }
        try {
            List<KeyFactory> keyFactoriesFromIdentifier = getKeyFactoriesFromIdentifier(algorithm);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            try {
                octets = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            } catch (Exception unused) {
                octets = privateKeyInfo.getPrivateKey().getOctets();
            }
            aSN1EncodableVector.add(new DEROctetString(Arrays.copyOfRange(octets, 0, 32)));
            String algorithm2 = keyFactoriesFromIdentifier.get(1).getAlgorithm();
            aSN1EncodableVector.add(algorithm2.equals("Ed25519") ? new DEROctetString(Arrays.concatenate(new byte[]{4, 32}, Arrays.copyOfRange(octets, 32, octets.length))) : algorithm2.equals("Ed448") ? new DEROctetString(Arrays.concatenate(new byte[]{4, 57}, Arrays.copyOfRange(octets, 32, octets.length))) : new DEROctetString(Arrays.copyOfRange(octets, 32, octets.length)));
            DERSequence dERSequence = new DERSequence(aSN1EncodableVector);
            PrivateKey[] privateKeyArr2 = new PrivateKey[dERSequence.size()];
            AlgorithmIdentifier[] algorithmIdentifierArr = pairings.get(algorithm);
            while (i < dERSequence.size()) {
                if (dERSequence.getObjectAt(i) instanceof ASN1OctetString) {
                    ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
                    aSN1EncodableVector2.add(privateKeyInfo.getVersion());
                    aSN1EncodableVector2.add(algorithmIdentifierArr[i]);
                    aSN1EncodableVector2.add(dERSequence.getObjectAt(i));
                    privateKeyArr2[i] = keyFactoriesFromIdentifier.get(i).generatePrivate(new PKCS8EncodedKeySpec(PrivateKeyInfo.getInstance(new DERSequence(aSN1EncodableVector2)).getEncoded()));
                } else {
                    privateKeyArr2[i] = keyFactoriesFromIdentifier.get(i).generatePrivate(new PKCS8EncodedKeySpec(PrivateKeyInfo.getInstance(ASN1Sequence.getInstance(dERSequence.getObjectAt(i))).getEncoded()));
                }
                i++;
            }
            return new CompositePrivateKey(algorithm, privateKeyArr2);
        } catch (GeneralSecurityException e2) {
            throw Exceptions.ioException(e2.getMessage(), e2);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1Sequence aSN1Sequence;
        if (this.helper == null) {
            this.helper = new BCJcaJceHelper();
        }
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        byte[][] bArrSplit = new byte[2][];
        try {
            aSN1Sequence = ASN1Sequence.getInstance(subjectPublicKeyInfo.getPublicKeyData().getOctets());
        } catch (Exception unused) {
            bArrSplit = split(algorithm, subjectPublicKeyInfo.getPublicKeyData());
            aSN1Sequence = null;
        }
        int i = 0;
        if (MiscObjectIdentifiers.id_alg_composite.equals((ASN1Primitive) algorithm) || MiscObjectIdentifiers.id_composite_key.equals((ASN1Primitive) algorithm)) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(subjectPublicKeyInfo.getPublicKeyData().getOctets());
            PublicKey[] publicKeyArr = new PublicKey[aSN1Sequence2.size()];
            while (i != aSN1Sequence2.size()) {
                SubjectPublicKeyInfo subjectPublicKeyInfo2 = SubjectPublicKeyInfo.getInstance(aSN1Sequence2.getObjectAt(i));
                try {
                    publicKeyArr[i] = this.helper.createKeyFactory(subjectPublicKeyInfo2.getAlgorithm().getAlgorithm().getId()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo2.getEncoded()));
                    i++;
                } catch (Exception e) {
                    throw new IOException(b.r(e, new StringBuilder("cannot decode generic composite: ")), e);
                }
            }
            return new CompositePublicKey(publicKeyArr);
        }
        try {
            int length = aSN1Sequence == null ? bArrSplit.length : aSN1Sequence.size();
            List<KeyFactory> keyFactoriesFromIdentifier = getKeyFactoriesFromIdentifier(algorithm);
            ASN1BitString[] aSN1BitStringArr = new ASN1BitString[length];
            for (int i2 = 0; i2 < length; i2++) {
                if (aSN1Sequence == null) {
                    aSN1BitStringArr[i2] = new DERBitString(bArrSplit[i2]);
                } else if (aSN1Sequence.getObjectAt(i2) instanceof DEROctetString) {
                    aSN1BitStringArr[i2] = new DERBitString(((DEROctetString) aSN1Sequence.getObjectAt(i2)).getOctets());
                } else {
                    aSN1BitStringArr[i2] = (DERBitString) aSN1Sequence.getObjectAt(i2);
                }
            }
            X509EncodedKeySpec[] keysSpecs = getKeysSpecs(algorithm, aSN1BitStringArr);
            PublicKey[] publicKeyArr2 = new PublicKey[length];
            while (i < length) {
                publicKeyArr2[i] = keyFactoriesFromIdentifier.get(i).generatePublic(keysSpecs[i]);
                i++;
            }
            return new CompositePublicKey(algorithm, publicKeyArr2);
        } catch (GeneralSecurityException e2) {
            throw Exceptions.ioException(e2.getMessage(), e2);
        }
    }

    public byte[][] split(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1BitString aSN1BitString) {
        int[] iArr = componentKeySizes.get(aSN1ObjectIdentifier);
        byte[] octets = aSN1BitString.getOctets();
        int i = iArr[0];
        byte[][] bArr = {new byte[i], new byte[octets.length - i]};
        System.arraycopy(octets, 0, bArr[0], 0, i);
        int i2 = iArr[0];
        byte[] bArr2 = bArr[1];
        System.arraycopy(octets, i2, bArr2, 0, bArr2.length);
        return bArr;
    }

    public KeyFactorySpi(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }
}
