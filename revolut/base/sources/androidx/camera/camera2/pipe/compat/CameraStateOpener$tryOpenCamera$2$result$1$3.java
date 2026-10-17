package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.core.Log;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$3", f = "RetryingCameraStateOpener.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class CameraStateOpener$tryOpenCamera$2$result$1$3 extends i implements Function1<Continuation<? super OpenCameraResult>, Object> {
    final /* synthetic */ Ref$ObjectRef $cameraOpenDeferred;
    final /* synthetic */ AndroidCameraState $cameraState;
    final /* synthetic */ Ref$ObjectRef $timeoutJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraStateOpener$tryOpenCamera$2$result$1$3(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, AndroidCameraState androidCameraState, Continuation<? super CameraStateOpener$tryOpenCamera$2$result$1$3> continuation) {
        super(1, continuation);
        this.$timeoutJob = ref$ObjectRef;
        this.$cameraOpenDeferred = ref$ObjectRef2;
        this.$cameraState = androidCameraState;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CameraStateOpener$tryOpenCamera$2$result$1$3(this.$timeoutJob, this.$cameraOpenDeferred, this.$cameraState, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        Log log2 = Log.INSTANCE;
        if (log2.getDEBUG_LOGGABLE()) {
        }
        this.$timeoutJob.f186409a = null;
        if (this.$cameraOpenDeferred.f186409a == null) {
            return null;
        }
        if (log2.getERROR_LOGGABLE()) {
        }
        this.$cameraState.close();
        return new OpenCameraResult(null, CameraError.m129boximpl(CameraError.INSTANCE.m146getERROR_CAMERA_OPEN_TIMEOUTv7Vf74A()), 1, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super OpenCameraResult> continuation) {
        return ((CameraStateOpener$tryOpenCamera$2$result$1$3) create(continuation)).invokeSuspend(Unit.f186387a);
    }
}
