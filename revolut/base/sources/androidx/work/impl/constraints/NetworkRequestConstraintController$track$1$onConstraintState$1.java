package androidx.work.impl.constraints;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/work/impl/constraints/ConstraintsState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class NetworkRequestConstraintController$track$1$onConstraintState$1 extends u implements Function1<ConstraintsState, Unit> {
    final /* synthetic */ ProducerScope $$this$callbackFlow;
    final /* synthetic */ Job $timeoutJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1$onConstraintState$1(Job job2, ProducerScope producerScope) {
        super(1);
        this.$timeoutJob = job2;
        this.$$this$callbackFlow = producerScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((ConstraintsState) obj2);
        return Unit.f186387a;
    }

    public final void invoke(ConstraintsState it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        this.$timeoutJob.f(null);
        this.$$this$callbackFlow.mo3647trySendJP2dKIU(it8);
    }
}
