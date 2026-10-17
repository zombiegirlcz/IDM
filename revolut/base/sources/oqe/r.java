package oqe;

import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ t u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, Continuation continuation) {
        super(1, continuation);
        this.u = tVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return this.u.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.co-owned-guardian-hub", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
    }
}
