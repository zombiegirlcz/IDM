package vmg;

import dng.o;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290579a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f290579a = iArr;
    }
}
