package androidx.camera.core.impl;

import android.util.Size;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface CameraDeviceSurfaceManager extends InternalCameraPresenceListener {

    public interface Provider {
    }

    SurfaceStreamSpecQueryResult getSuggestedStreamSpecs(int i, String str, List<AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, List<Size>> map, VideoStabilization videoStabilization, boolean z, boolean z3, boolean z4);

    SurfaceConfig transformSurfaceConfig(int i, String str, int i2, Size size, StreamUseCase streamUseCase);
}
