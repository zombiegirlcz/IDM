package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes16.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    public static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i) {
        char c2;
        double[] dArr;
        double[] dArr2;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr3 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            c2 = 1;
            if (i2 >= iArr.length) {
                break;
            }
            int i5 = iArr[i2];
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i5));
            if (num == null) {
                dArr3[i3] = pointProviderLab.fromInt(i5);
                iArr3[i3] = i5;
                i3++;
                linkedHashMap.put(Integer.valueOf(i5), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() + 1));
            }
            i2++;
        }
        int[] iArr4 = new int[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            iArr4[i6] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i6]))).intValue();
        }
        int iMin = Math.min(i, i3);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr4 = new double[iMin][];
        int i21 = 0;
        for (int i22 = 0; i22 < iArr2.length; i22++) {
            dArr4[i22] = pointProviderLab.fromInt(iArr2[i22]);
            i21++;
        }
        int i32 = iMin - i21;
        if (i32 > 0) {
            for (int i33 = 0; i33 < i32; i33++) {
            }
        }
        int[] iArr5 = new int[i3];
        for (int i43 = 0; i43 < i3; i43++) {
            iArr5[i43] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i59 = 0; i59 < iMin; i59++) {
            iArr6[i59] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i66 = 0; i66 < iMin; i66++) {
            distanceArr[i66] = new Distance[iMin];
            for (int i74 = 0; i74 < iMin; i74++) {
                distanceArr[i66][i74] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i92 = 0;
        while (i92 < 10) {
            int i96 = 0;
            while (i96 < iMin) {
                int i99 = i96 + 1;
                int i100 = i99;
                while (i100 < iMin) {
                    int[] iArr8 = iArr4;
                    double dDistance = pointProviderLab.distance(dArr4[i96], dArr4[i100]);
                    Distance distance = distanceArr[i100][i96];
                    distance.distance = dDistance;
                    distance.index = i96;
                    Distance distance2 = distanceArr[i96][i100];
                    distance2.distance = dDistance;
                    distance2.index = i100;
                    i100++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    c2 = c2;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                char c3 = c2;
                Arrays.sort(distanceArr[i96]);
                for (int i101 = 0; i101 < iMin; i101++) {
                    iArr6[i96][i101] = distanceArr[i96][i101].index;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i96 = i99;
                c2 = c3;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            char c5 = c2;
            int i102 = 0;
            int i103 = 0;
            while (i102 < i3) {
                double[] dArr5 = dArr3[i102];
                int i104 = iArr12[i102];
                double dDistance2 = pointProviderLab.distance(dArr5, dArr4[i104]);
                int i105 = i102;
                double d = dDistance2;
                int i106 = -1;
                int i107 = 0;
                while (i107 < iMin) {
                    int i108 = i103;
                    int[][] iArr13 = iArr6;
                    if (distanceArr[i104][i107].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr5, dArr4[i107]);
                        if (dDistance3 < d) {
                            d = dDistance3;
                            i106 = i107;
                        }
                    }
                    i107++;
                    iArr6 = iArr13;
                    i103 = i108;
                }
                int i109 = i103;
                int[][] iArr14 = iArr6;
                if (i106 == -1 || Math.abs(Math.sqrt(d) - Math.sqrt(dDistance2)) <= 3.0d) {
                    i103 = i109;
                } else {
                    i103 = i109 + 1;
                    iArr12[i105] = i106;
                }
                i102 = i105 + 1;
                iArr6 = iArr14;
            }
            int[][] iArr15 = iArr6;
            if (i103 == 0 && i92 != 0) {
                break;
            }
            double[] dArr6 = new double[iMin];
            double[] dArr7 = new double[iMin];
            double[] dArr8 = new double[iMin];
            boolean z = false;
            Arrays.fill(iArr7, 0);
            int i110 = 0;
            while (i110 < i3) {
                int i111 = iArr12[i110];
                double[] dArr9 = dArr3[i110];
                boolean z3 = z;
                int i112 = iArr11[i110];
                iArr7[i111] = iArr7[i111] + i112;
                double d5 = i112;
                dArr6[i111] = (dArr9[z3 ? 1 : 0] * d5) + dArr6[i111];
                dArr7[i111] = (dArr9[c5] * d5) + dArr7[i111];
                dArr8[i111] = (dArr9[2] * d5) + dArr8[i111];
                i110++;
                z = false;
            }
            int i113 = 0;
            while (i113 < iMin) {
                int i114 = iArr7[i113];
                if (i114 == 0) {
                    dArr4[i113] = new double[]{0.0d, 0.0d, 0.0d};
                    dArr = dArr6;
                    dArr2 = dArr7;
                } else {
                    double d6 = dArr6[i113];
                    dArr = dArr6;
                    dArr2 = dArr7;
                    double d10 = i114;
                    double d15 = d6 / d10;
                    double d41 = dArr2[i113] / d10;
                    double d51 = dArr8[i113] / d10;
                    double[] dArr10 = dArr4[i113];
                    dArr10[0] = d15;
                    dArr10[c5] = d41;
                    dArr10[2] = d51;
                }
                i113++;
                dArr6 = dArr;
                dArr7 = dArr2;
            }
            i92++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            c2 = c5;
            iArr6 = iArr15;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i115 = 0; i115 < iMin; i115++) {
            int i116 = iArr7[i115];
            if (i116 != 0) {
                int i117 = pointProviderLab.toInt(dArr4[i115]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i117))) {
                    linkedHashMap2.put(Integer.valueOf(i117), Integer.valueOf(i116));
                }
            }
        }
        return linkedHashMap2;
    }
}
