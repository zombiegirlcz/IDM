package bw6;

import bt9.t;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.notes.FreelancerAddNotesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ FreelancerAddNotesScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FreelancerAddNotesScreen freelancerAddNotesScreen, Continuation continuation) {
        super(2, continuation);
        this.u = freelancerAddNotesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVarE3 = this.u.R2();
        lVarE3.H2(lVarE3.f19256q, new t(18));
        return Unit.f186387a;
    }
}
