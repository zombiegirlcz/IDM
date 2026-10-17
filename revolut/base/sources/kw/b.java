package kw;

import vw.l;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f190178a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.CAMERA_SENSOR_REALTIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.CAMERA_SENSOR_UNKNOWN_WITH_CALLBACK_ELAPSED_REALTIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f190178a = iArr;
    }
}
