package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.SystemClockOffsets;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import e4m.e;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory implements e {
    public static FrameDistributor provideFrameDistributor(StreamGraphImpl streamGraphImpl, FrameCaptureQueue frameCaptureQueue, CameraMetadata cameraMetadata, SystemClockOffsets systemClockOffsets) {
        FrameDistributor frameDistributorProvideFrameDistributor = SharedCameraGraphModules.INSTANCE.provideFrameDistributor(streamGraphImpl, frameCaptureQueue, cameraMetadata, systemClockOffsets);
        s.k(frameDistributorProvideFrameDistributor);
        return frameDistributorProvideFrameDistributor;
    }
}
