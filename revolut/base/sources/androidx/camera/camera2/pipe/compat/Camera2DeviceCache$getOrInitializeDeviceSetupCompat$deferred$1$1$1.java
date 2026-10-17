package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompat;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1", f = "Camera2DeviceCache.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Landroidx/camera/featurecombinationquery/CameraDeviceSetupCompat;"}, k = 3, mv = {2, 1, 0})
public final class Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1 extends i implements Function2<CoroutineScope, Continuation<? super CameraDeviceSetupCompat>, Object> {
    final /* synthetic */ String $cameraId;
    int label;
    final /* synthetic */ Camera2DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1(String str, Camera2DeviceCache camera2DeviceCache, Continuation<? super Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1> continuation) {
        super(2, continuation);
        this.$cameraId = str;
        this.this$0 = camera2DeviceCache;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1(this.$cameraId, this.this$0, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        Log log2 = Log.INSTANCE;
        String str = this.$cameraId;
        if (log2.getDEBUG_LOGGABLE()) {
            String str2 = "Initializing CameraDeviceSetupCompat for " + ((Object) CameraId.m186toStringimpl(str));
        }
        String str3 = this.$cameraId;
        CameraErrorListener cameraErrorListener = this.this$0.cameraErrorListener;
        try {
            return this.this$0.getCameraDeviceSetupCompatFactory().getCameraDeviceSetupCompat(this.$cameraId);
        } catch (Exception e) {
            if (e instanceof CameraAccessException) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str4 = "Failed to execute call: Camera encountered an error: " + e.getMessage();
                }
                cameraErrorListener.mo396onCameraError3M5Xam4(str3, CameraError.INSTANCE.m138fromPVuDhNw$camera_camera2_pipe((CameraAccessException) e), true);
                return null;
            }
            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                if (e instanceof IllegalStateException) {
                    return Log.INSTANCE.getDEBUG_LOGGABLE() ? null : null;
                }
                throw e;
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str5 = "Failed to execute call: Unexpected exception: " + e.getMessage();
            }
            cameraErrorListener.mo396onCameraError3M5Xam4(str3, CameraError.INSTANCE.m149getERROR_GRAPH_CONFIGv7Vf74A(), false);
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CameraDeviceSetupCompat> continuation) {
        return ((Camera2DeviceCache$getOrInitializeDeviceSetupCompat$deferred$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
