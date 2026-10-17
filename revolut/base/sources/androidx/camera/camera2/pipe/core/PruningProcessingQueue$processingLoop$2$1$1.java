package androidx.camera.camera2.pipe.core;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ukm.y;
import ukm.z;
import yhm.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$1", f = "PruningProcessingQueue.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class PruningProcessingQueue$processingLoop$2$1$1<T> extends i implements Function2<T, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PruningProcessingQueue<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PruningProcessingQueue$processingLoop$2$1$1(PruningProcessingQueue<T> pruningProcessingQueue, Continuation<? super PruningProcessingQueue$processingLoop$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = pruningProcessingQueue;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        PruningProcessingQueue$processingLoop$2$1$1 pruningProcessingQueue$processingLoop$2$1$1 = new PruningProcessingQueue$processingLoop$2$1$1(this.this$0, continuation);
        pruningProcessingQueue$processingLoop$2$1$1.L$0 = obj2;
        return pruningProcessingQueue$processingLoop$2$1$1;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        ((PruningProcessingQueue) this.this$0).queue.addLast(this.L$0);
        Object objC = ((PruningProcessingQueue) this.this$0).channel.c();
        while (!(objC instanceof y)) {
            ArrayDeque arrayDeque = ((PruningProcessingQueue) this.this$0).queue;
            z.c(objC);
            arrayDeque.addLast(objC);
            objC = ((PruningProcessingQueue) this.this$0).channel.c();
        }
        Log log2 = Log.INSTANCE;
        PruningProcessingQueue<T> pruningProcessingQueue = this.this$0;
        if (log2.getDEBUG_LOGGABLE()) {
            String str = "PruningProcessingQueue: Pruning " + ((PruningProcessingQueue) pruningProcessingQueue).queue;
        }
        ((PruningProcessingQueue) this.this$0).prune.invoke(((PruningProcessingQueue) this.this$0).queue);
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(T t2, Continuation<? super Unit> continuation) {
        return ((PruningProcessingQueue$processingLoop$2$1$1) create(t2, continuation)).invokeSuspend(Unit.f186387a);
    }
}
