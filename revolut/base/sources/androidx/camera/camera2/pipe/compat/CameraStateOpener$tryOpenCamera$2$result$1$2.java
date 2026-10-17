package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Log;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$2", f = "RetryingCameraStateOpener.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class CameraStateOpener$tryOpenCamera$2$result$1$2 extends i implements Function2<OpenCameraResult, Continuation<? super OpenCameraResult>, Object> {
    final /* synthetic */ String $cameraId;
    final /* synthetic */ Ref$ObjectRef $resultDeferred;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraStateOpener$tryOpenCamera$2$result$1$2(Ref$ObjectRef ref$ObjectRef, String str, Continuation<? super CameraStateOpener$tryOpenCamera$2$result$1$2> continuation) {
        super(2, continuation);
        this.$resultDeferred = ref$ObjectRef;
        this.$cameraId = str;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        CameraStateOpener$tryOpenCamera$2$result$1$2 cameraStateOpener$tryOpenCamera$2$result$1$2 = new CameraStateOpener$tryOpenCamera$2$result$1$2(this.$resultDeferred, this.$cameraId, continuation);
        cameraStateOpener$tryOpenCamera$2$result$1$2.L$0 = obj2;
        return cameraStateOpener$tryOpenCamera$2$result$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OpenCameraResult openCameraResult, Continuation<? super OpenCameraResult> continuation) {
        return ((CameraStateOpener$tryOpenCamera$2$result$1$2) create(openCameraResult, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        OpenCameraResult openCameraResult = (OpenCameraResult) this.L$0;
        Log log2 = Log.INSTANCE;
        String str = this.$cameraId;
        if (log2.getDEBUG_LOGGABLE()) {
            String str2 = "tryOpenCamera: " + ((Object) CameraId.m186toStringimpl(str)) + " opened";
        }
        this.$resultDeferred.f186409a = null;
        return openCameraResult;
    }
}
