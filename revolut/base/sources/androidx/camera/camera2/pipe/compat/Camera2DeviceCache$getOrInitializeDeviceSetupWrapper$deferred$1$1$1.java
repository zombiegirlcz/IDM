package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1", f = "Camera2DeviceCache.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceSetup;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1 extends i implements Function2<CoroutineScope, Continuation<? super Camera2DeviceSetup>, Object> {
    final /* synthetic */ String $cameraId;
    int label;
    final /* synthetic */ Camera2DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1(String str, Camera2DeviceCache camera2DeviceCache, Continuation<? super Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1> continuation) {
        super(2, continuation);
        this.$cameraId = str;
        this.this$0 = camera2DeviceCache;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1(this.$cameraId, this.this$0, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Boolean boolValueOf;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        String str = this.$cameraId;
        CameraErrorListener cameraErrorListener = this.this$0.cameraErrorListener;
        try {
            boolValueOf = Boolean.valueOf(((CameraManager) this.this$0.cameraManager.get()).isCameraDeviceSetupSupported(this.$cameraId));
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str2 = "Failed to execute call: Camera encountered an error: " + e.getMessage();
                }
                cameraErrorListener.mo396onCameraError3M5Xam4(str, CameraError.INSTANCE.m138fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e), true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str3 = "Failed to execute call: Unexpected exception: " + e.getMessage();
                }
                cameraErrorListener.mo396onCameraError3M5Xam4(str, CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                }
            }
            boolValueOf = null;
        }
        if (!Intrinsics.f(boolValueOf, Boolean.TRUE)) {
            return null;
        }
        Log log2 = Log.INSTANCE;
        String str4 = this.$cameraId;
        if (log2.getDEBUG_LOGGABLE()) {
            String str5 = "Initializing CameraDeviceSetup for " + ((Object) CameraId.m186toStringimpl(str4));
        }
        String str6 = this.$cameraId;
        CameraErrorListener cameraErrorListener2 = this.this$0.cameraErrorListener;
        try {
            cameraDeviceSetup = ((CameraManager) this.this$0.cameraManager.get()).getCameraDeviceSetup(this.$cameraId);
        } catch (Exception e2) {
            if (e2 instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str7 = "Failed to execute call: Camera encountered an error: " + e2.getMessage();
                }
                cameraErrorListener2.mo396onCameraError3M5Xam4(str6, CameraError.INSTANCE.m138fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e2), true);
            } else if ((e2 instanceof IllegalArgumentException) || (e2 instanceof SecurityException) || (e2 instanceof UnsupportedOperationException) || (e2 instanceof NullPointerException)) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str8 = "Failed to execute call: Unexpected exception: " + e2.getMessage();
                }
                cameraErrorListener2.mo396onCameraError3M5Xam4(str6, CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false);
            } else {
                if (!(e2 instanceof IllegalStateException)) {
                    throw e2;
                }
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                }
            }
            cameraDeviceSetup = null;
        }
        if (cameraDeviceSetup != null) {
            return new Camera2DeviceSetup(cameraDeviceSetup, this.$cameraId, this.this$0.cameraErrorListener, null);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Camera2DeviceSetup> continuation) {
        return ((Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$deferred$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
