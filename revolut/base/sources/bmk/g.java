package bmk;

import iha.v;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16864a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.FREE_PERIOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.DISCOUNT_PERIOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.NO_OFFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f16864a = iArr;
    }
}
