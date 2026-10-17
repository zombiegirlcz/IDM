package androidx.camera.camera2.pipe.core;

import ch.qos.logback.core.net.SyslogConstants;
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
@d(c = "androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$deferred$1", f = "PruningProcessingQueue.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class PruningProcessingQueue$processingLoop$2$deferred$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ T $elementToProcess;
    int label;
    final /* synthetic */ PruningProcessingQueue<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PruningProcessingQueue$processingLoop$2$deferred$1(PruningProcessingQueue<T> pruningProcessingQueue, T t2, Continuation<? super PruningProcessingQueue$processingLoop$2$deferred$1> continuation) {
        super(2, continuation);
        this.this$0 = pruningProcessingQueue;
        this.$elementToProcess = t2;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new PruningProcessingQueue$processingLoop$2$deferred$1(this.this$0, this.$elementToProcess, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            Log log2 = Log.INSTANCE;
            Object obj3 = this.$elementToProcess;
            if (log2.getDEBUG_LOGGABLE()) {
                String str = "PruningProcessingQueue: Processing " + obj3;
            }
            Function2 function2 = ((PruningProcessingQueue) this.this$0).process;
            Object obj4 = this.$elementToProcess;
            this.label = 1;
            if (function2.invoke(obj4, this) == aVar) {
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
        return ((PruningProcessingQueue$processingLoop$2$deferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
