package v17;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerSalesFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FreelancerSalesFiltersScreen freelancerSalesFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerSalesFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarH3 = this.v.T2();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        r rVar = (r) mVarH3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(listId, "MINIMUM_AMOUNT_ID")) {
            rVar.y2(new uo7.k(text, 15));
        } else if (Intrinsics.f(listId, "MAXIMUM_AMOUNT_ID")) {
            rVar.y2(new uo7.k(text, 16));
        }
        return Unit.f186387a;
    }
}
