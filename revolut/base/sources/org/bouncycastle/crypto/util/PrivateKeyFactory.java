package org.bouncycastle.crypto.util;

import ehe.n;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKey;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECGOST3410Parameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.MLDSAParameters;
import org.bouncycastle.crypto.params.MLDSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.MLDSAPublicKeyParameters;
import org.bouncycastle.crypto.params.MLKEMParameters;
import org.bouncycastle.crypto.params.MLKEMPrivateKeyParameters;
import org.bouncycastle.crypto.params.MLKEMPublicKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.crypto.params.SLHDSAParameters;
import org.bouncycastle.crypto.params.SLHDSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.X448PrivateKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.internal.asn1.oiw.ElGamalParameter;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.internal.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class PrivateKeyFactory {
    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(PrivateKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    private static byte[] getRawKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        return ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
    }

    private static ASN1OctetString parseOctetString(ASN1OctetString aSN1OctetString, int i) throws IOException {
        ASN1OctetString octetData;
        byte[] octets = aSN1OctetString.getOctets();
        return (octets.length == i || (octetData = Utils.parseOctetData(octets)) == null) ? aSN1OctetString : ASN1OctetString.getInstance(octetData);
    }

    private static ASN1Primitive parsePrimitiveString(ASN1OctetString aSN1OctetString, int i) throws IOException {
        byte[] octets = aSN1OctetString.getOctets();
        if (octets.length == i) {
            return aSN1OctetString;
        }
        ASN1Primitive data = Utils.parseData(octets);
        return data instanceof ASN1OctetString ? ASN1OctetString.getInstance(data) : data instanceof ASN1Sequence ? ASN1Sequence.getInstance(data) : aSN1OctetString;
    }

    public static AsymmetricKeyParameter createKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        BigInteger value;
        ECGOST3410Parameters eCGOST3410Parameters;
        BigInteger bigInteger;
        if (privateKeyInfo == null) {
            throw new IllegalArgumentException("keyInfo argument null");
        }
        AlgorithmIdentifier privateKeyAlgorithm = privateKeyInfo.getPrivateKeyAlgorithm();
        ASN1ObjectIdentifier algorithm = privateKeyAlgorithm.getAlgorithm();
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.rsaEncryption) || algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_RSASSA_PSS) || algorithm.equals((ASN1Primitive) X509ObjectIdentifiers.id_ea_rsa)) {
            RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            return new RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient());
        }
        DSAParameters dSAParameters = null;
        ECGOST3410Parameters eCGOST3410Parameters2 = null;
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.dhKeyAgreement)) {
            DHParameter dHParameter = DHParameter.getInstance(privateKeyAlgorithm.getParameters());
            ASN1Integer aSN1Integer = (ASN1Integer) privateKeyInfo.parsePrivateKey();
            BigInteger l2 = dHParameter.getL();
            return new DHPrivateKeyParameters(aSN1Integer.getValue(), new DHParameters(dHParameter.getP(), dHParameter.getG(), null, l2 != null ? l2.intValue() : 0));
        }
        if (algorithm.equals((ASN1Primitive) OIWObjectIdentifiers.elGamalAlgorithm)) {
            ElGamalParameter elGamalParameter = ElGamalParameter.getInstance(privateKeyAlgorithm.getParameters());
            return new ElGamalPrivateKeyParameters(((ASN1Integer) privateKeyInfo.parsePrivateKey()).getValue(), new ElGamalParameters(elGamalParameter.getP(), elGamalParameter.getG()));
        }
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.id_dsa)) {
            ASN1Integer aSN1Integer2 = (ASN1Integer) privateKeyInfo.parsePrivateKey();
            ASN1Encodable parameters = privateKeyAlgorithm.getParameters();
            if (parameters != null) {
                DSAParameter dSAParameter = DSAParameter.getInstance(parameters.toASN1Primitive());
                dSAParameters = new DSAParameters(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            }
            return new DSAPrivateKeyParameters(aSN1Integer2.getValue(), dSAParameters);
        }
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.id_ecPublicKey)) {
            ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyAlgorithm.getParameters().toASN1Primitive());
            boolean zIsNamedCurve = x962Parameters.isNamedCurve();
            ASN1Primitive parameters2 = x962Parameters.getParameters();
            return new ECPrivateKeyParameters(eCPrivateKey.getKey(), zIsNamedCurve ? ECNamedDomainParameters.lookup(ASN1ObjectIdentifier.getInstance(parameters2)) : new ECDomainParameters(X9ECParameters.getInstance(parameters2)));
        }
        if (algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X25519)) {
            return 32 == privateKeyInfo.getPrivateKeyLength() ? new X25519PrivateKeyParameters(privateKeyInfo.getPrivateKey().getOctets()) : new X25519PrivateKeyParameters(getRawKey(privateKeyInfo));
        }
        if (algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_X448)) {
            return 56 == privateKeyInfo.getPrivateKeyLength() ? new X448PrivateKeyParameters(privateKeyInfo.getPrivateKey().getOctets()) : new X448PrivateKeyParameters(getRawKey(privateKeyInfo));
        }
        if (algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed25519)) {
            return new Ed25519PrivateKeyParameters(getRawKey(privateKeyInfo));
        }
        if (algorithm.equals((ASN1Primitive) EdECObjectIdentifiers.id_Ed448)) {
            return new Ed448PrivateKeyParameters(getRawKey(privateKeyInfo));
        }
        if (Utils.mldsaParams.containsKey(algorithm)) {
            ASN1Primitive primitiveString = parsePrimitiveString(privateKeyInfo.getPrivateKey(), 32);
            MLDSAParameters mLDSAParametersMldsaParamsLookup = Utils.mldsaParamsLookup(algorithm);
            MLDSAPublicKeyParameters publicKeyParams = privateKeyInfo.getPublicKeyData() != null ? PublicKeyFactory.MLDSAConverter.getPublicKeyParams(mLDSAParametersMldsaParamsLookup, privateKeyInfo.getPublicKeyData()) : null;
            if (primitiveString instanceof ASN1OctetString) {
                return new MLDSAPrivateKeyParameters(mLDSAParametersMldsaParamsLookup, ((ASN1OctetString) primitiveString).getOctets(), publicKeyParams);
            }
            if (!(primitiveString instanceof ASN1Sequence)) {
                throw new IllegalArgumentException("invalid " + mLDSAParametersMldsaParamsLookup.getName() + " private key");
            }
            ASN1Sequence aSN1Sequence = (ASN1Sequence) primitiveString;
            byte[] bArrD = n.D(aSN1Sequence, 0);
            byte[] bArrD2 = n.D(aSN1Sequence, 1);
            MLDSAPrivateKeyParameters mLDSAPrivateKeyParameters = new MLDSAPrivateKeyParameters(mLDSAParametersMldsaParamsLookup, bArrD, publicKeyParams);
            if (Arrays.constantTimeAreEqual(mLDSAPrivateKeyParameters.getEncoded(), bArrD2)) {
                return mLDSAPrivateKeyParameters;
            }
            throw new IllegalArgumentException("inconsistent " + mLDSAParametersMldsaParamsLookup.getName() + " private key");
        }
        if (algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_alg_ml_kem_512) || algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_alg_ml_kem_768) || algorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_alg_ml_kem_1024)) {
            ASN1Primitive primitiveString2 = parsePrimitiveString(privateKeyInfo.getPrivateKey(), 64);
            MLKEMParameters mLKEMParametersMlkemParamsLookup = Utils.mlkemParamsLookup(algorithm);
            MLKEMPublicKeyParameters publicKeyParams2 = privateKeyInfo.getPublicKeyData() != null ? PublicKeyFactory.MLKEMConverter.getPublicKeyParams(mLKEMParametersMlkemParamsLookup, privateKeyInfo.getPublicKeyData()) : null;
            if (primitiveString2 instanceof ASN1OctetString) {
                return new MLKEMPrivateKeyParameters(mLKEMParametersMlkemParamsLookup, ((ASN1OctetString) primitiveString2).getOctets(), publicKeyParams2);
            }
            if (!(primitiveString2 instanceof ASN1Sequence)) {
                throw new IllegalArgumentException("invalid " + mLKEMParametersMlkemParamsLookup.getName() + " private key");
            }
            ASN1Sequence aSN1Sequence2 = (ASN1Sequence) primitiveString2;
            byte[] bArrD3 = n.D(aSN1Sequence2, 0);
            byte[] bArrD4 = n.D(aSN1Sequence2, 1);
            MLKEMPrivateKeyParameters mLKEMPrivateKeyParameters = new MLKEMPrivateKeyParameters(mLKEMParametersMlkemParamsLookup, bArrD3, publicKeyParams2);
            if (Arrays.constantTimeAreEqual(mLKEMPrivateKeyParameters.getEncoded(), bArrD4)) {
                return mLKEMPrivateKeyParameters;
            }
            throw new IllegalArgumentException("inconsistent " + mLKEMParametersMlkemParamsLookup.getName() + " private key");
        }
        if (Utils.slhdsaParams.containsKey(algorithm)) {
            SLHDSAParameters sLHDSAParametersSlhdsaParamsLookup = Utils.slhdsaParamsLookup(algorithm);
            return new SLHDSAPrivateKeyParameters(sLHDSAParametersSlhdsaParamsLookup, parseOctetString(privateKeyInfo.getPrivateKey(), sLHDSAParametersSlhdsaParamsLookup.getN() * 4).getOctets());
        }
        if (!algorithm.equals((ASN1Primitive) CryptoProObjectIdentifiers.gostR3410_2001) && !algorithm.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512) && !algorithm.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256)) {
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        ASN1Encodable parameters3 = privateKeyAlgorithm.getParameters();
        GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(parameters3);
        ASN1Primitive aSN1Primitive = parameters3.toASN1Primitive();
        if ((aSN1Primitive instanceof ASN1Sequence) && (ASN1Sequence.getInstance(aSN1Primitive).size() == 2 || ASN1Sequence.getInstance(aSN1Primitive).size() == 3)) {
            eCGOST3410Parameters = new ECGOST3410Parameters(new ECNamedDomainParameters(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), ECGOST3410NamedCurves.getByOIDX9(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet())), gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            int privateKeyLength = privateKeyInfo.getPrivateKeyLength();
            if (privateKeyLength == 32 || privateKeyLength == 64) {
                bigInteger = new BigInteger(1, Arrays.reverse(privateKeyInfo.getPrivateKey().getOctets()));
            } else {
                ASN1Encodable privateKey = privateKeyInfo.parsePrivateKey();
                if (privateKey instanceof ASN1Integer) {
                    value = ASN1Integer.getInstance(privateKey).getPositiveValue();
                } else {
                    bigInteger = new BigInteger(1, Arrays.reverse(ASN1OctetString.getInstance(privateKey).getOctets()));
                }
            }
            value = bigInteger;
        } else {
            X962Parameters x962Parameters2 = X962Parameters.getInstance(privateKeyAlgorithm.getParameters());
            if (x962Parameters2.isNamedCurve()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters2.getParameters());
                eCGOST3410Parameters2 = new ECGOST3410Parameters(new ECNamedDomainParameters(aSN1ObjectIdentifier, ECNamedCurveTable.getByOID(aSN1ObjectIdentifier)), gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            } else if (!x962Parameters2.isImplicitlyCA()) {
                eCGOST3410Parameters2 = new ECGOST3410Parameters(new ECNamedDomainParameters(algorithm, X9ECParameters.getInstance(x962Parameters2.getParameters())), gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet());
            }
            ASN1Encodable privateKey2 = privateKeyInfo.parsePrivateKey();
            value = privateKey2 instanceof ASN1Integer ? ASN1Integer.getInstance(privateKey2).getValue() : ECPrivateKey.getInstance(privateKey2).getKey();
            eCGOST3410Parameters = eCGOST3410Parameters2;
        }
        return new ECPrivateKeyParameters(value, new ECGOST3410Parameters(eCGOST3410Parameters, gOST3410PublicKeyAlgParameters.getPublicKeyParamSet(), gOST3410PublicKeyAlgParameters.getDigestParamSet(), gOST3410PublicKeyAlgParameters.getEncryptionParamSet()));
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("privateKeyInfoData array null");
        }
        if (bArr.length != 0) {
            return createKey(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
        }
        throw new IllegalArgumentException("privateKeyInfoData array empty");
    }
}
