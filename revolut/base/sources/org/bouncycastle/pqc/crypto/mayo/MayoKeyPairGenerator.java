package org.bouncycastle.pqc.crypto.mayo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes14.dex */
public class MayoKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MayoParameters f228831p;
    private SecureRandom random;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        int i;
        int mVecLimbs = this.f228831p.getMVecLimbs();
        int m3 = this.f228831p.getM();
        int v = this.f228831p.getV();
        int o = this.f228831p.getO();
        int oBytes = this.f228831p.getOBytes();
        int p1Limbs = this.f228831p.getP1Limbs();
        int p3Limbs = this.f228831p.getP3Limbs();
        int pkSeedBytes = this.f228831p.getPkSeedBytes();
        int skSeedBytes = this.f228831p.getSkSeedBytes();
        byte[] bArr = new byte[this.f228831p.getCpkBytes()];
        byte[] bArr2 = new byte[this.f228831p.getCskBytes()];
        int i2 = oBytes + pkSeedBytes;
        byte[] bArr3 = new byte[i2];
        long[] jArr = new long[this.f228831p.getP2Limbs() + p1Limbs];
        long[] jArr2 = new long[o * o * mVecLimbs];
        int i3 = v * o;
        byte[] bArr4 = new byte[i3];
        this.random.nextBytes(bArr2);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr2, 0, skSeedBytes);
        sHAKEDigest.doFinal(bArr3, 0, i2);
        GF16.decode(bArr3, pkSeedBytes, bArr4, 0, i3);
        Utils.expandP1P2(this.f228831p, jArr, bArr3);
        int i5 = 0;
        GF16Utils.mulAddMUpperTriangularMatXMat(mVecLimbs, jArr, bArr4, jArr, p1Limbs, v, o);
        byte[] bArr5 = bArr4;
        GF16Utils.mulAddMatTransXMMat(mVecLimbs, bArr5, jArr, p1Limbs, jArr2, v, o);
        System.arraycopy(bArr3, 0, bArr, 0, pkSeedBytes);
        long[] jArr3 = new long[p3Limbs];
        int i6 = o * mVecLimbs;
        int i21 = 0;
        int i22 = 0;
        int i32 = 0;
        while (true) {
            byte[] bArr6 = bArr5;
            if (i21 >= o) {
                Utils.packMVecs(jArr3, bArr, pkSeedBytes, p3Limbs / mVecLimbs, m3);
                Arrays.clear(bArr6);
                Arrays.clear(jArr2);
                return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new MayoPublicKeyParameters(this.f228831p, bArr), (AsymmetricKeyParameter) new MayoPrivateKeyParameters(this.f228831p, bArr2));
            }
            int i33 = i21;
            int i43 = i22;
            int i59 = i5;
            while (true) {
                i = i6;
                if (i33 < o) {
                    System.arraycopy(jArr2, i22 + i59, jArr3, i32, mVecLimbs);
                    if (i21 != i33) {
                        Nat.xorTo64(mVecLimbs, jArr2, i43 + i5, jArr3, i32);
                    }
                    i32 += mVecLimbs;
                    i33++;
                    i59 += mVecLimbs;
                    i43 += i;
                    i6 = i;
                }
            }
            i21++;
            i22 += i;
            i5 += mVecLimbs;
            bArr5 = bArr6;
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f228831p = ((MayoKeyGenerationParameters) keyGenerationParameters).getParameters();
        this.random = keyGenerationParameters.getRandom();
    }
}
