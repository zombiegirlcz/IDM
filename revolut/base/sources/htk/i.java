package htk;

import mel.j0;
import mel.q;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f155458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f155459b;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.NEUTRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.BEARISH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.BULLISH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f155458a = iArr;
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
        f155459b = iArr2;
    }
}
