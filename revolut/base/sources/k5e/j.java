package k5e;

import jel.e2;
import mel.j0;
import nel.d0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f181488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f181489c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[q4e.b.values().length];
        try {
            iArr[q4e.b.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q4e.b.HOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q4e.b.SELL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f181487a = iArr;
        int[] iArr2 = new int[e2.values().length];
        try {
            iArr2[e2.AVERAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[e2.WORST_PERFORMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e2.SINGLE_ASSET.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f181488b = iArr2;
        int[] iArr3 = new int[j0.values().length];
        try {
            iArr3[j0.STRONG_BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[j0.BUY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[j0.HOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[j0.SELL.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[j0.STRONG_SELL.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        f181489c = iArr3;
        int[] iArr4 = new int[d0.values().length];
        try {
            iArr4[d0.AUTOCALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[d0.CAPITAL_PROTECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[d0.LEVERAGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
