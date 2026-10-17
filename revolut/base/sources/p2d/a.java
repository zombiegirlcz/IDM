package p2d;

import mgd.e;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f232229a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.ONE_HOUR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.ONE_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f232229a = iArr;
    }
}
