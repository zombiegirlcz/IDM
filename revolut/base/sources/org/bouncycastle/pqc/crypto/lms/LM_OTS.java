package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class LM_OTS {
    static final short D_MESG = -32383;
    private static final short D_PBLC = -32640;
    private static final int ITER_J = 22;
    private static final int ITER_K = 20;
    private static final int ITER_PREV = 23;
    static final int MAX_HASH = 32;
    static final int SEED_RANDOMISER_INDEX = -3;

    public static int cksm(byte[] bArr, int i, LMOtsParameters lMOtsParameters) {
        int w3 = (1 << lMOtsParameters.getW()) - 1;
        int iCoef = 0;
        for (int i2 = 0; i2 < (i * 8) / lMOtsParameters.getW(); i2++) {
            iCoef = (iCoef + w3) - coef(bArr, i2, lMOtsParameters.getW());
        }
        return iCoef << lMOtsParameters.getLs();
    }

    public static int coef(byte[] bArr, int i, int i2) {
        int i3 = (i * i2) / 8;
        return (bArr[i3] >>> (((~i) & ((8 / i2) - 1)) * i2)) & ((1 << i2) - 1);
    }

    public static LMOtsSignature lm_ots_generate_signature(LMOtsPrivateKey lMOtsPrivateKey, byte[] bArr, byte[] bArr2) {
        LMOtsParameters parameter = lMOtsPrivateKey.getParameter();
        int n3 = parameter.getN();
        int p2 = parameter.getP();
        int w3 = parameter.getW();
        byte[] bArr3 = new byte[p2 * n3];
        Digest digest = DigestUtil.getDigest(parameter);
        SeedDerive derivationFunction = lMOtsPrivateKey.getDerivationFunction();
        int iCksm = cksm(bArr, n3, parameter);
        bArr[n3] = (byte) ((iCksm >>> 8) & 255);
        bArr[n3 + 1] = (byte) iCksm;
        int i = n3 + 23;
        byte[] bArrBuild = Composer.compose().bytes(lMOtsPrivateKey.getI()).u32str(lMOtsPrivateKey.getQ()).padUntil(0, i).build();
        derivationFunction.setJ(0);
        int i2 = 0;
        while (i2 < p2) {
            Pack.shortToBigEndian((short) i2, bArrBuild, 20);
            derivationFunction.deriveSeed(bArrBuild, i2 < p2 + (-1), 23);
            int iCoef = coef(bArr, i2, w3);
            for (int i3 = 0; i3 < iCoef; i3++) {
                bArrBuild[22] = (byte) i3;
                digest.update(bArrBuild, 0, i);
                digest.doFinal(bArrBuild, 23);
            }
            System.arraycopy(bArrBuild, 23, bArr3, n3 * i2, n3);
            i2++;
        }
        return new LMOtsSignature(parameter, bArr2, bArr3);
    }

    public static boolean lm_ots_validate_signature(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr, boolean z) throws LMSException {
        if (lMOtsSignature.getType().equals(lMOtsPublicKey.getParameter())) {
            return Arrays.areEqual(lm_ots_validate_signature_calculate(lMOtsPublicKey, lMOtsSignature, bArr), lMOtsPublicKey.getK());
        }
        throw new LMSException("public key and signature ots types do not match");
    }

    public static byte[] lm_ots_validate_signature_calculate(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr) {
        LMSContext lMSContextCreateOtsContext = lMOtsPublicKey.createOtsContext(lMOtsSignature);
        LmsUtils.byteArray(bArr, lMSContextCreateOtsContext);
        return lm_ots_validate_signature_calculate(lMSContextCreateOtsContext);
    }

    public static LMOtsPublicKey lms_ots_generatePublicKey(LMOtsPrivateKey lMOtsPrivateKey) {
        return new LMOtsPublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lms_ots_generatePublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lMOtsPrivateKey.getMasterSecret()));
    }

    public static LMOtsSignature lm_ots_generate_signature(LMSigParameters lMSigParameters, LMOtsPrivateKey lMOtsPrivateKey, byte[][] bArr, byte[] bArr2, boolean z) {
        byte[] c2;
        byte[] q5 = new byte[34];
        if (z) {
            int n3 = lMOtsPrivateKey.getParameter().getN();
            c2 = new byte[n3];
            System.arraycopy(bArr2, 0, q5, 0, n3);
        } else {
            LMSContext signatureContext = lMOtsPrivateKey.getSignatureContext(lMSigParameters, bArr);
            LmsUtils.byteArray(bArr2, 0, bArr2.length, signatureContext);
            c2 = signatureContext.getC();
            q5 = signatureContext.getQ();
        }
        return lm_ots_generate_signature(lMOtsPrivateKey, q5, c2);
    }

    public static byte[] lm_ots_validate_signature_calculate(LMSContext lMSContext) {
        LMOtsPublicKey publicKey = lMSContext.getPublicKey();
        LMOtsParameters parameter = publicKey.getParameter();
        Object signature = lMSContext.getSignature();
        LMOtsSignature otsSignature = signature instanceof LMSSignature ? ((LMSSignature) signature).getOtsSignature() : (LMOtsSignature) signature;
        int n3 = parameter.getN();
        int w3 = parameter.getW();
        int p2 = parameter.getP();
        byte[] q5 = lMSContext.getQ();
        int iCksm = cksm(q5, n3, parameter);
        q5[n3] = (byte) ((iCksm >>> 8) & 255);
        q5[n3 + 1] = (byte) iCksm;
        byte[] i = publicKey.getI();
        int q19 = publicKey.getQ();
        Digest digest = DigestUtil.getDigest(parameter);
        LmsUtils.byteArray(i, digest);
        LmsUtils.u32str(q19, digest);
        LmsUtils.u16str(D_PBLC, digest);
        Composer composerU32str = Composer.compose().bytes(i).u32str(q19);
        int i2 = n3 + 23;
        byte[] bArrBuild = composerU32str.padUntil(0, i2).build();
        int i3 = (1 << w3) - 1;
        byte[] y2 = otsSignature.getY();
        Digest digest2 = DigestUtil.getDigest(parameter);
        for (int i5 = 0; i5 < p2; i5++) {
            Pack.shortToBigEndian((short) i5, bArrBuild, 20);
            System.arraycopy(y2, i5 * n3, bArrBuild, 23, n3);
            for (int iCoef = coef(q5, i5, w3); iCoef < i3; iCoef++) {
                bArrBuild[22] = (byte) iCoef;
                digest2.update(bArrBuild, 0, i2);
                digest2.doFinal(bArrBuild, 23);
            }
            digest.update(bArrBuild, 23, n3);
        }
        byte[] bArr = new byte[n3];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    public static byte[] lms_ots_generatePublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i, byte[] bArr2) {
        Digest digest = DigestUtil.getDigest(lMOtsParameters);
        byte[] bArrBuild = Composer.compose().bytes(bArr).u32str(i).u16str(-32640).padUntil(0, 22).build();
        digest.update(bArrBuild, 0, bArrBuild.length);
        Digest digest2 = DigestUtil.getDigest(lMOtsParameters);
        byte[] bArrBuild2 = Composer.compose().bytes(bArr).u32str(i).padUntil(0, digest2.getDigestSize() + 23).build();
        SeedDerive seedDerive = new SeedDerive(bArr, bArr2, DigestUtil.getDigest(lMOtsParameters));
        seedDerive.setQ(i);
        seedDerive.setJ(0);
        int p2 = lMOtsParameters.getP();
        int n3 = lMOtsParameters.getN();
        int w3 = (1 << lMOtsParameters.getW()) - 1;
        int i2 = 0;
        while (i2 < p2) {
            seedDerive.deriveSeed(bArrBuild2, i2 < p2 + (-1), 23);
            Pack.shortToBigEndian((short) i2, bArrBuild2, 20);
            for (int i3 = 0; i3 < w3; i3++) {
                bArrBuild2[22] = (byte) i3;
                digest2.update(bArrBuild2, 0, bArrBuild2.length);
                digest2.doFinal(bArrBuild2, 23);
            }
            digest.update(bArrBuild2, 23, n3);
            i2++;
        }
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        return bArr3;
    }
}
