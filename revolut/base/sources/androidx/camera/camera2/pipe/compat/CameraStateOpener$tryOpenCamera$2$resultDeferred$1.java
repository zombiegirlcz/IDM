package androidx.camera.camera2.pipe.compat;

import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1", f = "RetryingCameraStateOpener.kt", l = {291}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class CameraStateOpener$tryOpenCamera$2$resultDeferred$1 extends i implements Function2<CoroutineScope, Continuation<? super OpenCameraResult>, Object> {
    final /* synthetic */ AndroidCameraState $cameraState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraStateOpener$tryOpenCamera$2$resultDeferred$1(AndroidCameraState androidCameraState, Continuation<? super CameraStateOpener$tryOpenCamera$2$resultDeferred$1> continuation) {
        super(2, continuation);
        this.$cameraState = androidCameraState;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new CameraStateOpener$tryOpenCamera$2$resultDeferred$1(this.$cameraState, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            StateFlow state = this.$cameraState.getState();
            CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1 cameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1 = new CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1(null);
            this.label = 1;
            obj2 = q.y(state, cameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        CameraState cameraState = (CameraState) obj2;
        if (cameraState instanceof CameraStateOpen) {
            return new OpenCameraResult(this.$cameraState, null, 2, null);
        }
        if (cameraState instanceof CameraStateClosing) {
            this.$cameraState.close();
            return new OpenCameraResult(null, ((CameraStateClosing) cameraState).getCameraErrorCode(), 1, null);
        }
        if (cameraState instanceof CameraStateClosed) {
            this.$cameraState.close();
            return new OpenCameraResult(null, ((CameraStateClosed) cameraState).getCameraErrorCode(), 1, null);
        }
        if (!(cameraState instanceof CameraStateUnopened)) {
            throw new NoWhenBranchMatchedException();
        }
        this.$cameraState.close();
        throw new IllegalStateException("Unexpected CameraState: " + cameraState);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OpenCameraResult> continuation) {
        return ((CameraStateOpener$tryOpenCamera$2$resultDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
