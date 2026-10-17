package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Trace;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Timestamps;
import kotlin.Metadata;
import kotlin.Unit;
import m72.b;
import v1.c;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"closeWithTrace", "", "Landroid/hardware/camera2/CameraDevice;", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class CameraDeviceWrapperKt {
    public static final void closeWithTrace(CameraDevice cameraDevice) {
        if (cameraDevice != null) {
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                String str = "Closing Camera " + cameraDevice.getId();
            }
            Debug debug = Debug.INSTANCE;
            String str2 = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
            long jMo441nowvQl9yQU = debug.getSystemTimeSource$camera_camera2_pipe().mo441nowvQl9yQU();
            try {
                Trace.beginSection(str2);
                try {
                    cameraDevice.close();
                } catch (NullPointerException e) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    }
                }
                Unit unit = Unit.f186387a;
            } finally {
                long jD = c.d(debug, jMo441nowvQl9yQU);
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    StringBuilder sbL = v0.a.l(str2, " - ");
                    Timestamps timestamps = Timestamps.INSTANCE;
                    j6.a.C(sbL, b.t(new Object[]{Double.valueOf(jD / 1000000.0d)}, 1, null, "%.3f ms", "format(...)"), "CXCP");
                }
            }
        }
    }
}
