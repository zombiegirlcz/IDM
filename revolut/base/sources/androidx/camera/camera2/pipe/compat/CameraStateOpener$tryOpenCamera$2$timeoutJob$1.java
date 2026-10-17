package androidx.camera.camera2.pipe.compat;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.k0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$timeoutJob$1", f = "RetryingCameraStateOpener.kt", l = {312}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class CameraStateOpener$tryOpenCamera$2$timeoutJob$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public CameraStateOpener$tryOpenCamera$2$timeoutJob$1(Continuation<? super CameraStateOpener$tryOpenCamera$2$timeoutJob$1> continuation) {
        super(2, continuation);
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new CameraStateOpener$tryOpenCamera$2$timeoutJob$1(continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            this.label = 1;
            if (k0.b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraStateOpener$tryOpenCamera$2$timeoutJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
