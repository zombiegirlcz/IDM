package yyi;

import com.revolut.retail.feature.airportlounges.api.model.SchemeAirportLoungesFooter;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.SchemeLoungesHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import svi.u1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SchemeLoungesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SchemeLoungesHomeScreen schemeLoungesHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = schemeLoungesHomeScreen;
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
        SchemeAirportLoungesFooter schemeAirportLoungesFooter;
        SchemeAirportLoungesFooter.Action action;
        int i = this.u;
        SchemeLoungesHomeScreen schemeLoungesHomeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                schemeLoungesHomeScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a aVar3 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a) schemeLoungesHomeScreen.R2();
                u1 u1Var = (u1) ((g) ((j2) aVar3.f99155r.f22677a).getValue()).f317942a.getContent();
                if (u1Var != null && (schemeAirportLoungesFooter = u1Var.f266002a.d) != null && (action = schemeAirportLoungesFooter.f98940b) != null) {
                    aVar3.l2(new k(aVar3, action, null), new yea.l(1, aVar3, czi.c.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 17));
                }
                break;
        }
        return Unit.f186387a;
    }
}
