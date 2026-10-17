package vw9;

import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlow;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vq5.x;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentProfileFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PaymentProfileFlow paymentProfileFlow, Continuation continuation) {
        super(2, continuation);
        this.v = paymentProfileFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((BasicNavBar.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BasicNavBar.b bVar = (BasicNavBar.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!(bVar instanceof com.revolut.core.ui_kit.views.navbar.e)) {
            throw new NoWhenBranchMatchedException();
        }
        g gVarE3 = this.v.R2();
        String id10 = ((com.revolut.core.ui_kit.views.navbar.e) bVar).f59525a;
        com.revolut.feature.payments.profile.impl.ui_kompot.flow.b bVar2 = (com.revolut.feature.payments.profile.impl.ui_kompot.flow.b) gVarE3;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(id10, "<this>");
        Object step = Intrinsics.f(id10, sw9.a.SCAN.getId()) ? PaymentProfileFlowContract$Step.Scanner.f79633a : Intrinsics.f(id10, sw9.a.CODE.getId()) ? PaymentProfileFlowContract$Step.Details.f79631a : null;
        if (step != null) {
            Intrinsics.checkNotNullParameter(step, "step");
            bVar2.H2(bVar2.f79642w, new x(step, 24));
        }
        return Unit.f186387a;
    }
}
