package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Log;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1", f = "RetryingCameraStateOpener.kt", l = {280}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1 extends i implements Function2<CoroutineScope, Continuation<? super OpenCameraResult>, Object> {
    final /* synthetic */ String $cameraId;
    final /* synthetic */ AndroidCameraState $cameraState;
    int label;
    final /* synthetic */ CameraStateOpener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1(CameraStateOpener cameraStateOpener, String str, AndroidCameraState androidCameraState, Continuation<? super CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = cameraStateOpener;
        this.$cameraId = str;
        this.$cameraState = androidCameraState;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1(this.this$0, this.$cameraId, this.$cameraState, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                o.b(obj2);
                CameraOpener cameraOpener = this.this$0.cameraOpener;
                String str = this.$cameraId;
                AndroidCameraState androidCameraState = this.$cameraState;
                this.label = 1;
                if (cameraOpener.mo385openCameraRzXb1QE(str, androidCameraState, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
        } catch (Exception e) {
            Log log2 = Log.INSTANCE;
            String str2 = this.$cameraId;
            if (log2.getWARN_LOGGABLE()) {
                String str3 = "Failed to open " + ((Object) CameraId.m186toStringimpl(str2));
            }
            this.$cameraState.closeWith$camera_camera2_pipe(e);
            new OpenCameraResult(null, CameraError.m129boximpl(CameraError.INSTANCE.m139fromPVuDhNw$camera_camera2_pipe(e)), 1, null);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OpenCameraResult> continuation) {
        return ((CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
