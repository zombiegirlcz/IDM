package fr;

import vw.l;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137313a;

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
        f137313a = iArr;
    }
}
