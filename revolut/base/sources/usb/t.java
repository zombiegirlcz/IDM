package usb;

import k4l.c0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f282887a;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f282887a = iArr;
    }
}
