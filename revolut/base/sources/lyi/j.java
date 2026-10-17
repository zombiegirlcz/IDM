package lyi;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import svi.s;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungePassPassengersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AirportLoungePassPassengersScreen airportLoungePassPassengersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungePassPassengersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVarE3 = this.v.d();
        Object obj3 = suggestion.f53496h;
        m mVar = (m) dVarE3;
        mVar.getClass();
        s sVar = obj3 instanceof s ? (s) obj3 : null;
        if (sVar != null) {
            mVar.H2(mVar.f200842r, new lu5.o(sVar, 18));
        }
        return Unit.f186387a;
    }
}
