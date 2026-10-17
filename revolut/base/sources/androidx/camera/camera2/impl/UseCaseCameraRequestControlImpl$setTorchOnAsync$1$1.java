package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.core.Logger;
import fim.a;
import gim.d;
import gim.i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1", f = "UseCaseCameraRequestControl.kt", l = {749}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "<anonymous>", "()Lskm/g0;"}, k = 3, mv = {2, 1, 0})
public final class UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1 extends i implements Function1<Continuation<? super g0>, Object> {
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, Continuation<? super UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1> continuation) {
        super(1, continuation);
        this.this$0 = useCaseCameraRequestControlImpl;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1(this.this$0, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                o.b(obj2);
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                }
                CameraGraph graph = this.this$0.useCaseGraphContext.getGraph();
                this.label = 1;
                obj2 = graph.acquireSession(this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj2;
            try {
                g0 torchOn = ((CameraGraph.Session) autoCloseable).setTorchOn();
                mra.d.l(autoCloseable, null);
                return torchOn;
            } finally {
            }
        } catch (CancellationException e) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
            }
            return UseCaseCameraRequestControlImpl.submitFailedResult;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super g0> continuation) {
        return ((UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1) create(continuation)).invokeSuspend(Unit.f186387a);
    }
}
