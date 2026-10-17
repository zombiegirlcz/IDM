package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraMode {
    public static String toLabelString(int i) {
        return i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA";
    }
}
