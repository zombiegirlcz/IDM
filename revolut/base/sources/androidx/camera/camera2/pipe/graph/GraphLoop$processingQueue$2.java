package androidx.camera.camera2.pipe.graph;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class GraphLoop$processingQueue$2 extends q implements Function2<List<GraphCommand>, Continuation<? super Unit>, Object> {
    public GraphLoop$processingQueue$2(Object obj2) {
        super(2, 0, GraphLoop.class, obj2, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<GraphCommand> list, Continuation<? super Unit> continuation) {
        return ((GraphLoop) this.receiver).process(list, continuation);
    }
}
