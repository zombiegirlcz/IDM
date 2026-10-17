package dkj;

import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumber;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanFeaturedNumberSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanFeaturedNumberSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                esimMobilePlanFeaturedNumberSelectionScreen.e3().B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVarE3 = esimMobilePlanFeaturedNumberSelectionScreen.e3();
                EsimFeaturedPhoneNumber esimFeaturedPhoneNumber = ((g) ((j2) lVarE3.f115579r.f22677a).getValue()).d;
                if (esimFeaturedPhoneNumber != null) {
                    lVarE3.C2(new i(esimFeaturedPhoneNumber.f100254a));
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimMobilePlanFeaturedNumberSelectionScreenModel", "Can't navigate to checkout, selectedPhoneNumber is null", null, h0Var);
                }
                break;
        }
        return Unit.f186387a;
    }
}
