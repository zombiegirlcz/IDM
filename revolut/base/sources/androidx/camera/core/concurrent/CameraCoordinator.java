package androidx.camera.core.concurrent;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.InternalCameraPresenceListener;

/* JADX INFO: loaded from: classes15.dex */
public interface CameraCoordinator extends InternalCameraPresenceListener {
    void addPendingCameraInfo(CameraInfo cameraInfo);

    int getCameraOperatingMode();

    void init(CameraRepository cameraRepository);

    void removePendingCameraInfo(CameraInfo cameraInfo);

    void setCameraOperatingMode(int i);
}
