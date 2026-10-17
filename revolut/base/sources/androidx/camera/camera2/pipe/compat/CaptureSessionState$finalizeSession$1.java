package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.core.Log;
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
@d(c = "androidx.camera.camera2.pipe.compat.CaptureSessionState$finalizeSession$1", f = "CaptureSessionState.kt", l = {475}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class CaptureSessionState$finalizeSession$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delayMs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CaptureSessionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureSessionState$finalizeSession$1(long j2, CaptureSessionState captureSessionState, Continuation<? super CaptureSessionState$finalizeSession$1> continuation) {
        super(2, continuation);
        this.$delayMs = j2;
        this.this$0 = captureSessionState;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        CaptureSessionState$finalizeSession$1 captureSessionState$finalizeSession$1 = new CaptureSessionState$finalizeSession$1(this.$delayMs, this.this$0, continuation);
        captureSessionState$finalizeSession$1.L$0 = obj2;
        return captureSessionState$finalizeSession$1;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Log log2 = Log.INSTANCE;
            long j2 = this.$delayMs;
            if (log2.getDEBUG_LOGGABLE()) {
                StringBuilder sb6 = new StringBuilder("Finalizing ");
                sb6.append(coroutineScope);
                sb6.append(" in ");
                sb6.append(j2);
                j6.a.C(sb6, " ms", "CXCP");
            }
            long j3 = this.$delayMs;
            this.label = 1;
            if (k0.b(j3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        this.this$0.finalizeSession$camera_camera2_pipe(0L);
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CaptureSessionState$finalizeSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
