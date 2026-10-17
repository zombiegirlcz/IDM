package androidx.camera.camera2.pipe.graph;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.graph.GraphLoop$requestProcessor$2$1", f = "GraphLoop.kt", l = {83}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class GraphLoop$requestProcessor$2$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GraphRequestProcessor $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphLoop$requestProcessor$2$1(GraphRequestProcessor graphRequestProcessor, Continuation<? super GraphLoop$requestProcessor$2$1> continuation) {
        super(2, continuation);
        this.$value = graphRequestProcessor;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new GraphLoop$requestProcessor$2$1(this.$value, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            GraphRequestProcessor graphRequestProcessor = this.$value;
            this.label = 1;
            if (graphRequestProcessor.shutdown$camera_camera2_pipe(this) == aVar) {
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
        return ((GraphLoop$requestProcessor$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
