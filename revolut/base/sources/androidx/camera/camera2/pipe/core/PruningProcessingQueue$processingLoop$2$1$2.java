package androidx.camera.camera2.pipe.core;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.core.PruningProcessingQueue$processingLoop$2$1$2", f = "PruningProcessingQueue.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class PruningProcessingQueue$processingLoop$2$1$2 extends i implements Function2<Unit, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref$ObjectRef $processDeferred;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PruningProcessingQueue$processingLoop$2$1$2(Ref$ObjectRef ref$ObjectRef, Continuation<? super PruningProcessingQueue$processingLoop$2$1$2> continuation) {
        super(2, continuation);
        this.$processDeferred = ref$ObjectRef;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new PruningProcessingQueue$processingLoop$2$1$2(this.$processDeferred, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        this.$processDeferred.f186409a = null;
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((PruningProcessingQueue$processingLoop$2$1$2) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }
}
