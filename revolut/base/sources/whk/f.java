package whk;

import hha.i;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f297685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f297686b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.DISCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.FREE_PERIOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f297685a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[i.ANNUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f297686b = iArr2;
    }
}
