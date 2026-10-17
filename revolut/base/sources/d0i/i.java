package d0i;

import aw0.k7;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f110368b;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.TAKE_PROFIT_STOP_LOSS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.h.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f110367a = iArr;
        int[] iArr2 = new int[k7.values().length];
        try {
            iArr2[k7.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k7.ONLY_NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k7.NEVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f110368b = iArr2;
    }
}
