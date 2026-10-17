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
@d(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$4", f = "RetryingCameraStateOpener.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class CameraStateOpener$tryOpenCamera$2$result$1$4 extends i implements Function1<Continuation<? super OpenCameraResult>, Object> {
    final /* synthetic */ Ref$ObjectRef $cameraOpenCancelJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraStateOpener$tryOpenCamera$2$result$1$4(Ref$ObjectRef ref$ObjectRef, Continuation<? super CameraStateOpener$tryOpenCamera$2$result$1$4> continuation) {
        super(1, continuation);
        this.$cameraOpenCancelJob = ref$ObjectRef;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CameraStateOpener$tryOpenCamera$2$result$1$4(this.$cameraOpenCancelJob, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
        }
        this.$cameraOpenCancelJob.f186409a = null;
        return new OpenCameraResult(null, CameraError.m129boximpl(CameraError.INSTANCE.m146getERROR_CAMERA_OPEN_TIMEOUTv7Vf74A()), 1, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super OpenCameraResult> continuation) {
        return ((CameraStateOpener$tryOpenCamera$2$result$1$4) create(continuation)).invokeSuspend(Unit.f186387a);
    }
}
