package gtd;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.TravelController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TravelController travelController, Continuation continuation) {
        super(2, continuation);
        this.v = travelController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.e;
        jtd.a infoItem = obj3 instanceof jtd.a ? (jtd.a) obj3 : null;
        if (infoItem != null) {
            p pVarE3 = this.v.d();
            pVarE3.getClass();
            Intrinsics.checkNotNullParameter(infoItem, "infoItem");
            r rVar = pVarE3.o;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(infoItem, "infoItem");
            rVar.f146598a.c(u0.f(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(infoItem.f178473b, 14), (SharedFaqDestination.PassthroughData) null, false, 14)));
        }
        return Unit.f186387a;
    }
}
