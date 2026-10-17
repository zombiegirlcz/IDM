package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* JADX INFO: renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i, int i2) {
            this.resultCount = i2;
        }
    }

    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i, double d) {
            this.cutLocation = i;
            this.maximum = d;
        }
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i;
        int i2;
        int i3 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i3 == 1) {
            i = (-iArr[getIndex(box.f49072r0, box.f49071g1, box.f49070b1)]) + iArr[getIndex(box.f49072r0, box.f49071g1, box.f49069b0)] + iArr[getIndex(box.f49072r0, box.g0, box.f49070b1)];
            i2 = iArr[getIndex(box.f49072r0, box.g0, box.f49069b0)];
        } else if (i3 == 2) {
            i = (-iArr[getIndex(box.f49073r1, box.g0, box.f49070b1)]) + iArr[getIndex(box.f49073r1, box.g0, box.f49069b0)] + iArr[getIndex(box.f49072r0, box.g0, box.f49070b1)];
            i2 = iArr[getIndex(box.f49072r0, box.g0, box.f49069b0)];
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i = (-iArr[getIndex(box.f49073r1, box.f49071g1, box.f49069b0)]) + iArr[getIndex(box.f49073r1, box.g0, box.f49069b0)] + iArr[getIndex(box.f49072r0, box.f49071g1, box.f49069b0)];
            i2 = iArr[getIndex(box.f49072r0, box.g0, box.f49069b0)];
        }
        return i - i2;
    }

    public static int getIndex(int i, int i2, int i3) {
        return a10.b.C((i << 10) + (i << 6) + i, i2 << 5, i2, i3);
    }

    public static int top(Box box, Direction direction, int i, int[] iArr) {
        int i2;
        int i3;
        int i5 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i5 == 1) {
            i2 = (iArr[getIndex(i, box.f49071g1, box.f49070b1)] - iArr[getIndex(i, box.f49071g1, box.f49069b0)]) - iArr[getIndex(i, box.g0, box.f49070b1)];
            i3 = iArr[getIndex(i, box.g0, box.f49069b0)];
        } else if (i5 == 2) {
            i2 = (iArr[getIndex(box.f49073r1, i, box.f49070b1)] - iArr[getIndex(box.f49073r1, i, box.f49069b0)]) - iArr[getIndex(box.f49072r0, i, box.f49070b1)];
            i3 = iArr[getIndex(box.f49072r0, i, box.f49069b0)];
        } else {
            if (i5 != 3) {
                throw new IllegalArgumentException("unexpected direction " + direction);
            }
            i2 = (iArr[getIndex(box.f49073r1, box.f49071g1, i)] - iArr[getIndex(box.f49073r1, box.g0, i)]) - iArr[getIndex(box.f49072r0, box.f49071g1, i)];
            i3 = iArr[getIndex(box.f49072r0, box.g0, i)];
        }
        return i2 + i3;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f49073r1, box.f49071g1, box.f49070b1)] - iArr[getIndex(box.f49073r1, box.f49071g1, box.f49069b0)]) - iArr[getIndex(box.f49073r1, box.g0, box.f49070b1)]) + iArr[getIndex(box.f49073r1, box.g0, box.f49069b0)]) - iArr[getIndex(box.f49072r0, box.f49071g1, box.f49070b1)]) + iArr[getIndex(box.f49072r0, box.f49071g1, box.f49069b0)]) + iArr[getIndex(box.f49072r0, box.g0, box.f49070b1)]) - iArr[getIndex(box.f49072r0, box.g0, box.f49069b0)];
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = (iRedFromArgb * iIntValue2) + iArr2[index];
            int[] iArr3 = this.momentsG;
            iArr3[index] = (iGreenFromArgb * iIntValue2) + iArr3[index];
            int[] iArr4 = this.momentsB;
            iArr4[index] = (iBlueFromArgb * iIntValue2) + iArr4[index];
            double[] dArr = this.moments;
            int i = iBlueFromArgb * iBlueFromArgb;
            dArr[index] = dArr[index] + ((double) ((i + (iGreenFromArgb * iGreenFromArgb) + (iRedFromArgb * iRedFromArgb)) * iIntValue2));
        }
    }

    public CreateBoxesResult createBoxes(int i) {
        int i2;
        this.cubes = new Box[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.cubes[i3] = new Box(null);
        }
        double[] dArr = new double[i];
        Box box = this.cubes[0];
        box.f49073r1 = 32;
        box.f49071g1 = 32;
        box.f49070b1 = 32;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            if (i6 >= i) {
                i2 = i;
                break;
            }
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i5], boxArr[i6]).booleanValue()) {
                Box box2 = this.cubes[i5];
                dArr[i5] = box2.f49074vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i6];
                dArr[i6] = box3.f49074vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i5] = 0.0d;
                i6--;
            }
            double d = dArr[0];
            int i21 = 0;
            for (int i22 = 1; i22 <= i6; i22++) {
                double d5 = dArr[i22];
                if (d5 > d) {
                    i21 = i22;
                    d = d5;
                }
            }
            if (d <= 0.0d) {
                i2 = i6 + 1;
                break;
            }
            i6++;
            i5 = i21;
        }
        return new CreateBoxesResult(i, i2);
    }

    public void createMoments() {
        int i = 1;
        while (true) {
            int i2 = 33;
            if (i >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i3 = 1;
            while (i3 < i2) {
                int i5 = 0;
                int i6 = 0;
                double d = 0.0d;
                int i21 = 1;
                int i22 = 0;
                int i32 = 0;
                while (i21 < i2) {
                    int index = getIndex(i, i3, i21);
                    i5 += this.weights[index];
                    i22 += this.momentsR[index];
                    i32 += this.momentsG[index];
                    i6 += this.momentsB[index];
                    d += this.moments[index];
                    iArr[i21] = iArr[i21] + i5;
                    iArr2[i21] = iArr2[i21] + i22;
                    iArr3[i21] = iArr3[i21] + i32;
                    iArr4[i21] = iArr4[i21] + i6;
                    dArr[i21] = dArr[i21] + d;
                    int index2 = getIndex(i - 1, i3, i21);
                    int i33 = i21;
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i33];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i33];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i33];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i33];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i33];
                    i21 = i33 + 1;
                    i2 = 33;
                }
                i3++;
                i2 = 33;
            }
            i++;
        }
    }

    public List<Integer> createResult(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            Box box = this.cubes[i2];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                int iVolume2 = volume(box, this.momentsR) / iVolume;
                int iVolume3 = volume(box, this.momentsG) / iVolume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / iVolume) & 255) | ((iVolume2 & 255) << 16) | (-16777216) | ((iVolume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximizeResultMaximize = maximize(box, direction, box.f49072r0 + 1, box.f49073r1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultMaximize2 = maximize(box, direction2, box.g0 + 1, box.f49071g1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultMaximize3 = maximize(box, direction3, box.f49069b0 + 1, box.f49070b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d = maximizeResultMaximize.maximum;
        double d5 = maximizeResultMaximize2.maximum;
        double d6 = maximizeResultMaximize3.maximum;
        if (d < d5 || d < d6) {
            if (d5 >= d && d5 >= d6) {
                direction3 = direction2;
            }
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f49073r1 = box.f49073r1;
        box2.f49071g1 = box.f49071g1;
        box2.f49070b1 = box.f49070b1;
        int i = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction3.ordinal()];
        if (i == 1) {
            int i2 = maximizeResultMaximize.cutLocation;
            box.f49073r1 = i2;
            box2.f49072r0 = i2;
            box2.g0 = box.g0;
            box2.f49069b0 = box.f49069b0;
        } else if (i == 2) {
            int i3 = maximizeResultMaximize2.cutLocation;
            box.f49071g1 = i3;
            box2.f49072r0 = box.f49072r0;
            box2.g0 = i3;
            box2.f49069b0 = box.f49069b0;
        } else if (i == 3) {
            int i5 = maximizeResultMaximize3.cutLocation;
            box.f49070b1 = i5;
            box2.f49072r0 = box.f49072r0;
            box2.g0 = box.g0;
            box2.f49069b0 = i5;
        }
        box.f49074vol = (box.f49070b1 - box.f49069b0) * (box.f49071g1 - box.g0) * (box.f49073r1 - box.f49072r0);
        box2.f49074vol = (box2.f49070b1 - box2.f49069b0) * (box2.f49071g1 - box2.g0) * (box2.f49073r1 - box2.f49072r0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i, int i2, int i3, int i5, int i6, int i21) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int iBottom = bottom(box2, direction, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction, quantizerWu.weights);
        int i22 = -1;
        double d = 0.0d;
        int i32 = i;
        while (i32 < i2) {
            int pVar = top(box2, direction, i32, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction, i32, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction, i32, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction, i32, quantizerWu.weights) + iBottom4;
            if (pVar4 != 0) {
                double d5 = ((double) ((pVar3 * pVar3) + ((pVar2 * pVar2) + (pVar * pVar)))) / ((double) pVar4);
                int i33 = i3 - pVar;
                int i43 = i5 - pVar2;
                int i59 = i6 - pVar3;
                int i66 = i21 - pVar4;
                if (i66 != 0) {
                    double d6 = (((double) ((i59 * i59) + ((i43 * i43) + (i33 * i33)))) / ((double) i66)) + d5;
                    if (d6 > d) {
                        i22 = i32;
                        d = d6;
                    }
                }
            }
            i32++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i22, d);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i) {
        constructHistogram(new QuantizerMap().quantize(iArr, i).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listCreateResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int i = iVolume3 * iVolume3;
        return (((((((this.moments[getIndex(box.f49073r1, box.f49071g1, box.f49070b1)] - this.moments[getIndex(box.f49073r1, box.f49071g1, box.f49069b0)]) - this.moments[getIndex(box.f49073r1, box.g0, box.f49070b1)]) + this.moments[getIndex(box.f49073r1, box.g0, box.f49069b0)]) - this.moments[getIndex(box.f49072r0, box.f49071g1, box.f49070b1)]) + this.moments[getIndex(box.f49072r0, box.f49071g1, box.f49069b0)]) + this.moments[getIndex(box.f49072r0, box.g0, box.f49070b1)]) - this.moments[getIndex(box.f49072r0, box.g0, box.f49069b0)]) - (((double) (i + ((iVolume2 * iVolume2) + (iVolume * iVolume)))) / ((double) volume(box, this.weights)));
    }

    public static final class Box {

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        int f49069b0;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        int f49070b1;
        int g0;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        int f49071g1;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int f49072r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        int f49073r1;

        /* JADX INFO: renamed from: vol, reason: collision with root package name */
        int f49074vol;

        private Box() {
            this.f49072r0 = 0;
            this.f49073r1 = 0;
            this.g0 = 0;
            this.f49071g1 = 0;
            this.f49069b0 = 0;
            this.f49070b1 = 0;
            this.f49074vol = 0;
        }

        public /* synthetic */ Box(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
