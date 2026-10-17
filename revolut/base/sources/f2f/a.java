package f2f;

import u2f.j;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131780a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.MILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.TRAINS_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.HOTEL_LOYALTY_TRANSFERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f131780a = iArr;
    }
}
