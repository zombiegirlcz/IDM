package org.bouncycastle.pqc.legacy.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class RainbowPublicMap {
    private RainbowParameters params;
    private final int num_gf_elements = 256;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ComputeInField f228928cf = new ComputeInField();

    public RainbowPublicMap(RainbowParameters rainbowParameters) {
        this.params = rainbowParameters;
    }

    private short[] add_and_reduce(short[][] sArr) {
        int m3 = this.params.getM();
        short[] sArrAddVect = new short[m3];
        for (int i = 0; i < 8; i++) {
            int iPow = (int) Math.pow(2.0d, i);
            short[] sArrAddVect2 = new short[m3];
            for (int i2 = iPow; i2 < 256; i2 += iPow * 2) {
                for (int i3 = 0; i3 < iPow; i3++) {
                    sArrAddVect2 = this.f228928cf.addVect(sArrAddVect2, sArr[i2 + i3]);
                }
            }
            ComputeInField computeInField = this.f228928cf;
            sArrAddVect = computeInField.addVect(sArrAddVect, computeInField.multVect((short) iPow, sArrAddVect2));
        }
        return sArrAddVect;
    }

    private short[][] compute_accumulator(short[] sArr, short[] sArr2, short[][][] sArr3, int i) {
        short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 256, i);
        int length = sArr2.length;
        short[][] sArr5 = sArr3[0];
        if (length != sArr5.length || sArr.length != sArr5[0].length || sArr3.length != i) {
            throw new RuntimeException("Accumulator calculation not possible!");
        }
        for (int i2 = 0; i2 < sArr2.length; i2++) {
            short[] sArrMultVect = this.f228928cf.multVect(sArr2[i2], sArr);
            for (int i3 = 0; i3 < sArr.length; i3++) {
                for (int i5 = 0; i5 < sArr3.length; i5++) {
                    short s2 = sArrMultVect[i3];
                    if (s2 != 0) {
                        short[] sArr6 = sArr4[s2];
                        sArr6[i5] = GF2Field.addElem(sArr6[i5], sArr3[i5][i2][i3]);
                    }
                }
            }
        }
        return sArr4;
    }

    public short[] publicMap(RainbowPublicKeyParameters rainbowPublicKeyParameters, short[] sArr) {
        return add_and_reduce(compute_accumulator(sArr, sArr, rainbowPublicKeyParameters.pk, this.params.getM()));
    }

    public short[] publicMap_cyclic(RainbowPublicKeyParameters rainbowPublicKeyParameters, short[] sArr) {
        int v16 = this.params.getV1();
        int o110 = this.params.getO1();
        int o210 = this.params.getO2();
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 256, o110 + o210);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, 0, v16);
        int i = v16 + o110;
        short[] sArrCopyOfRange2 = Arrays.copyOfRange(sArr, v16, i);
        short[] sArrCopyOfRange3 = Arrays.copyOfRange(sArr, i, sArr.length);
        RainbowDRBG rainbowDRBG = new RainbowDRBG(rainbowPublicKeyParameters.pk_seed, rainbowPublicKeyParameters.getParameters().getHash_algo());
        short[][] sArrAddMatrix = this.f228928cf.addMatrix(this.f228928cf.addMatrix(this.f228928cf.addMatrix(this.f228928cf.addMatrix(this.f228928cf.addMatrix(compute_accumulator(sArrCopyOfRange, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o110, v16, v16, true), o110), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o110, v16, o110, false), o110)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange, rainbowPublicKeyParameters.l1_Q3, o110)), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange2, rainbowPublicKeyParameters.l1_Q5, o110)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange2, rainbowPublicKeyParameters.l1_Q6, o110)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange3, rainbowPublicKeyParameters.l1_Q9, o110));
        short[][] sArrAddMatrix2 = this.f228928cf.addMatrix(this.f228928cf.addMatrix(this.f228928cf.addMatrix(this.f228928cf.addMatrix(this.f228928cf.addMatrix(compute_accumulator(sArrCopyOfRange, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o210, v16, v16, true), o210), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o210, v16, o110, false), o210)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o210, v16, o210, false), o210)), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange2, RainbowUtil.generate_random(rainbowDRBG, o210, o110, o110, true), o210)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange2, RainbowUtil.generate_random(rainbowDRBG, o210, o110, o210, false), o210)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange3, rainbowPublicKeyParameters.l2_Q9, o210));
        for (int i2 = 0; i2 < 256; i2++) {
            sArr2[i2] = Arrays.concatenate(sArrAddMatrix[i2], sArrAddMatrix2[i2]);
        }
        return add_and_reduce(sArr2);
    }
}
