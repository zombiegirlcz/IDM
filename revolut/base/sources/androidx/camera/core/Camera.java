package androidx.camera.core;

/* JADX INFO: loaded from: classes15.dex */
public interface Camera {
    CameraControl getCameraControl();

    CameraInfo getCameraInfo();

    default boolean isUseCasesCombinationSupported(boolean z, UseCase... useCaseArr) {
        return true;
    }

    default boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(true, useCaseArr);
    }
}
