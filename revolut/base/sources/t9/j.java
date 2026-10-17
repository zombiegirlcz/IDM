package t9;

import d9.y;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268931a;

    static {
        int[] iArr = new int[y.values().length];
        f268931a = iArr;
        try {
            iArr[y.NON_DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f268931a[y.NON_ABSENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f268931a[y.NON_EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f268931a[y.CUSTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f268931a[y.NON_NULL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f268931a[y.ALWAYS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
