package org.bouncycastle.pqc.legacy.rainbow;

import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class RainbowPublicKeyParameters extends RainbowKeyParameters {
    short[][][] l1_Q3;
    short[][][] l1_Q5;
    short[][][] l1_Q6;
    short[][][] l1_Q9;
    short[][][] l2_Q9;
    short[][][] pk;
    byte[] pk_seed;

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, byte[] bArr) {
        super(false, rainbowParameters);
        int m3 = rainbowParameters.getM();
        int n3 = rainbowParameters.getN();
        Version version = getParameters().getVersion();
        Version version2 = Version.CLASSIC;
        Class cls = Short.TYPE;
        if (version != version2) {
            this.pk_seed = Arrays.copyOfRange(bArr, 0, rainbowParameters.getLen_pkseed());
            this.l1_Q3 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getV1(), rainbowParameters.getO2());
            this.l1_Q5 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO1(), rainbowParameters.getO1());
            this.l1_Q6 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO1(), rainbowParameters.getO2());
            this.l1_Q9 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO2(), rainbowParameters.getO2());
            this.l2_Q9 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO2(), rainbowParameters.getO2(), rainbowParameters.getO2());
            int len_pkseed = rainbowParameters.getLen_pkseed();
            int iLoadEncoded = len_pkseed + RainbowUtil.loadEncoded(this.l1_Q3, bArr, len_pkseed, false);
            int iLoadEncoded2 = iLoadEncoded + RainbowUtil.loadEncoded(this.l1_Q5, bArr, iLoadEncoded, true);
            int iLoadEncoded3 = iLoadEncoded2 + RainbowUtil.loadEncoded(this.l1_Q6, bArr, iLoadEncoded2, false);
            int iLoadEncoded4 = iLoadEncoded3 + RainbowUtil.loadEncoded(this.l1_Q9, bArr, iLoadEncoded3, true);
            if (iLoadEncoded4 + RainbowUtil.loadEncoded(this.l2_Q9, bArr, iLoadEncoded4, true) != bArr.length) {
                throw new IllegalArgumentException("unparsed data in key encoding");
            }
            return;
        }
        this.pk = (short[][][]) Array.newInstance((Class<?>) cls, m3, n3, n3);
        int i = 0;
        for (int i2 = 0; i2 < n3; i2++) {
            for (int i3 = 0; i3 < n3; i3++) {
                for (int i5 = 0; i5 < m3; i5++) {
                    short[][][] sArr = this.pk;
                    if (i2 > i3) {
                        sArr[i5][i2][i3] = 0;
                    } else {
                        sArr[i5][i2][i3] = (short) (bArr[i] & UnsignedBytes.MAX_VALUE);
                        i++;
                    }
                }
            }
        }
    }

    public byte[] getEncoded() {
        return getParameters().getVersion() != Version.CLASSIC ? Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(this.pk_seed, RainbowUtil.getEncoded(this.l1_Q3, false)), RainbowUtil.getEncoded(this.l1_Q5, true)), RainbowUtil.getEncoded(this.l1_Q6, false)), RainbowUtil.getEncoded(this.l1_Q9, true)), RainbowUtil.getEncoded(this.l2_Q9, true)) : RainbowUtil.getEncoded(this.pk, true);
    }

    public short[][][] getPk() {
        return RainbowUtil.cloneArray(this.pk);
    }

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, byte[] bArr, short[][][] sArr, short[][][] sArr2, short[][][] sArr3, short[][][] sArr4, short[][][] sArr5) {
        super(false, rainbowParameters);
        this.pk_seed = (byte[]) bArr.clone();
        this.l1_Q3 = RainbowUtil.cloneArray(sArr);
        this.l1_Q5 = RainbowUtil.cloneArray(sArr2);
        this.l1_Q6 = RainbowUtil.cloneArray(sArr3);
        this.l1_Q9 = RainbowUtil.cloneArray(sArr4);
        this.l2_Q9 = RainbowUtil.cloneArray(sArr5);
    }

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, short[][][] sArr, short[][][] sArr2, short[][][] sArr3, short[][][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11, short[][][] sArr12) {
        super(false, rainbowParameters);
        int v16 = rainbowParameters.getV1();
        int o110 = rainbowParameters.getO1();
        int o210 = rainbowParameters.getO2();
        this.pk = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, rainbowParameters.getM(), rainbowParameters.getN(), rainbowParameters.getN());
        for (int i = 0; i < o110; i++) {
            for (int i2 = 0; i2 < v16; i2++) {
                System.arraycopy(sArr[i][i2], 0, this.pk[i][i2], 0, v16);
                System.arraycopy(sArr2[i][i2], 0, this.pk[i][i2], v16, o110);
                System.arraycopy(sArr3[i][i2], 0, this.pk[i][i2], v16 + o110, o210);
            }
            for (int i3 = 0; i3 < o110; i3++) {
                int i5 = i3 + v16;
                System.arraycopy(sArr4[i][i3], 0, this.pk[i][i5], v16, o110);
                System.arraycopy(sArr5[i][i3], 0, this.pk[i][i5], v16 + o110, o210);
            }
            for (int i6 = 0; i6 < o210; i6++) {
                System.arraycopy(sArr6[i][i6], 0, this.pk[i][i6 + v16 + o110], v16 + o110, o210);
            }
        }
        for (int i21 = 0; i21 < o210; i21++) {
            for (int i22 = 0; i22 < v16; i22++) {
                int i32 = i21 + o110;
                System.arraycopy(sArr7[i21][i22], 0, this.pk[i32][i22], 0, v16);
                System.arraycopy(sArr8[i21][i22], 0, this.pk[i32][i22], v16, o110);
                System.arraycopy(sArr9[i21][i22], 0, this.pk[i32][i22], v16 + o110, o210);
            }
            for (int i33 = 0; i33 < o110; i33++) {
                int i43 = i21 + o110;
                int i59 = i33 + v16;
                System.arraycopy(sArr10[i21][i33], 0, this.pk[i43][i59], v16, o110);
                System.arraycopy(sArr11[i21][i33], 0, this.pk[i43][i59], v16 + o110, o210);
            }
            for (int i66 = 0; i66 < o210; i66++) {
                System.arraycopy(sArr12[i21][i66], 0, this.pk[i21 + o110][i66 + v16 + o110], v16 + o110, o210);
            }
        }
    }
}
