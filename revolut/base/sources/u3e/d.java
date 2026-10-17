package u3e;

import t1e.x;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276924a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.EARN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.REDEEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x.MSI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x.DISCOUNT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f276924a = iArr;
    }
}
