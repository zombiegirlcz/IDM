package lu6;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringOrderFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringOrderFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) nVarE3;
        y yVar = aVar2.f73688t;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(listId, "ITEM_ID_MINIMUM_AMOUNT")) {
            aVar2.H2(yVar, new l3d.a(29, text, aVar2));
        } else if (Intrinsics.f(listId, "ITEM_ID_MAXIMUM_AMOUNT")) {
            aVar2.H2(yVar, new p(0, text, aVar2));
        }
        return Unit.f186387a;
    }
}
