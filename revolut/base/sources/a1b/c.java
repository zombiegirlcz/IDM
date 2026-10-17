package a1b;

import d1b.e;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f581a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.BARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.CANDLES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.LINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.AREA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.RENKO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e.KAGI.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[e.POINTANDFIGURE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[e.LINEBREAK.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[e.HEIKENASHI.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[e.HOLLOWCANDLES.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[e.BASELINE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[e.HILO.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[e.COLUMN.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[e.LINEWITHMARKERS.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[e.STEPLINE.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[e.HLCAREA.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[e.VOLCANDLE.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        f581a = iArr;
    }
}
