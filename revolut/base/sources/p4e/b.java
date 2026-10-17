package p4e;

import jel.e2;
import mel.j0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f232915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f232916b;

    static {
        int[] iArr = new int[e2.values().length];
        try {
            iArr[e2.SINGLE_ASSET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e2.WORST_PERFORMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e2.AVERAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f232915a = iArr;
        int[] iArr2 = new int[j0.values().length];
        try {
            iArr2[j0.STRONG_BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j0.BUY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j0.HOLD.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[j0.SELL.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[j0.STRONG_SELL.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f232916b = iArr2;
    }
}
