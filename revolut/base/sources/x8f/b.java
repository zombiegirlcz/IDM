package x8f;

import u8f.d;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303317a;

    static {
        int[] iArr = new int[d.values().length];
        f303317a = iArr;
        try {
            iArr[d.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f303317a[d.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f303317a[d.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
