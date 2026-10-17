package tmg;

import fmg.j0;
import fmg.k0;
import fmg.x;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f272218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f272219c;

    static {
        int[] iArr = new int[j0.values().length];
        try {
            iArr[j0.HIGHLIGHTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0.REGULAR_PRIMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j0.REGULAR_SECONDARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j0.DISABLED_PRIMARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j0.DISABLED_SECONDARY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[j0.PINK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[j0.ORANGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[j0.WHITE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[j0.RED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[j0.BLACK.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[j0.GREEN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[j0.UP.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[j0.DOWN.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        f272217a = iArr;
        int[] iArr2 = new int[x.values().length];
        try {
            iArr2[x.ORANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[x.BLUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[x.GREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        f272218b = iArr2;
        int[] iArr3 = new int[k0.values().length];
        try {
            iArr3[k0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[k0.RED.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[k0.ORANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[k0.GREEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[k0.GREY50.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        f272219c = iArr3;
    }
}
