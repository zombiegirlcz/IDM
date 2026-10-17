package androidx.glance.session;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.glance.session.SessionWorker$work$snapshotMonitor$1", f = "SessionWorker.kt", l = {113}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SessionWorker$work$snapshotMonitor$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public SessionWorker$work$snapshotMonitor$1(Continuation<? super SessionWorker$work$snapshotMonitor$1> continuation) {
        super(2, continuation);
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new SessionWorker$work$snapshotMonitor$1(continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            this.label = 1;
            if (GlobalSnapshotManagerKt.globalSnapshotMonitor(this) == aVar) {
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
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SessionWorker$work$snapshotMonitor$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
