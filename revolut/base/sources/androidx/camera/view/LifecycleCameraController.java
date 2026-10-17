package androidx.camera.view;

import android.content.Context;
import androidx.camera.core.Camera;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.utils.Threads;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes15.dex */
public final class LifecycleCameraController extends CameraController {
    private LifecycleOwner mLifecycleOwner;

    public LifecycleCameraController(Context context) {
        super(context);
    }

    public void bindToLifecycle(LifecycleOwner lifecycleOwner) {
        Threads.checkMainThread();
        this.mLifecycleOwner = lifecycleOwner;
        startCameraAndTrackStates();
    }

    @Override // androidx.camera.view.CameraController
    public Camera startCamera() {
        if (this.mLifecycleOwner != null && this.mCameraProvider != null) {
            try {
                SessionConfig boundSessionConfig = getBoundSessionConfig();
                if (boundSessionConfig != null) {
                    return this.mCameraProvider.bindToLifecycle(this.mLifecycleOwner, this.mCameraSelector, boundSessionConfig);
                }
                UseCaseGroup useCaseGroupCreateUseCaseGroup = createUseCaseGroup(true);
                if (useCaseGroupCreateUseCaseGroup == null) {
                    return null;
                }
                return this.mCameraProvider.bindToLifecycle(this.mLifecycleOwner, this.mCameraSelector, useCaseGroupCreateUseCaseGroup);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
            }
        }
        return null;
    }
}
