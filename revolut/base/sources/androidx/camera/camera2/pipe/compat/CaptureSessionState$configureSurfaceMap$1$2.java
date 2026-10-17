package androidx.camera.camera2.pipe.compat;

import com.youTransactor.uCube.rpc.Constants;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.CaptureSessionState$configureSurfaceMap$1$2", f = "CaptureSessionState.kt", l = {Constants.EMVTag.TAG_9C_TRANSACTION_TYPE}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class CaptureSessionState$configureSurfaceMap$1$2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CaptureSessionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureSessionState$configureSurfaceMap$1$2(CaptureSessionState captureSessionState, Continuation<? super CaptureSessionState$configureSurfaceMap$1$2> continuation) {
        super(2, continuation);
        this.this$0 = captureSessionState;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new CaptureSessionState$configureSurfaceMap$1$2(this.this$0, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            CaptureSessionState captureSessionState = this.this$0;
            this.label = 1;
            if (captureSessionState.tryCreateCaptureSession(this) == aVar) {
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
        return ((CaptureSessionState$configureSurfaceMap$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
