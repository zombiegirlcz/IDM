package dkj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumber;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanFeaturedNumberSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanFeaturedNumberSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVarE3 = this.v.R2();
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        if (obj3 instanceof EsimFeaturedPhoneNumber) {
            lVarE3.H2(lVarE3.f115579r, new av8.o(obj3, 7));
        } else {
            lVarE3.getClass();
        }
        return Unit.f186387a;
    }
}
