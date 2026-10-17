package bv;

import xu.l;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18921a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.CLOSE_DEVICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.DISABLE_ABORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.CLOSE_DEVICE_AND_DISABLE_ABORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f18921a = iArr;
    }
}
