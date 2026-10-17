package lyi;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu6.p;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungePassPassengersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AirportLoungePassPassengersScreen airportLoungePassPassengersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungePassPassengersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVarE3 = this.v.d();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        m mVar = (m) dVarE3;
        y yVar = mVar.f200842r;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.f(listId, "LIST_ID_FIRST_NAME")) {
            mVar.H2(yVar, new p(text, mVar, 2));
        } else if (Intrinsics.f(listId, "LIST_ID_LAST_NAME")) {
            mVar.H2(yVar, new p(text, mVar, 3));
        }
        return Unit.f186387a;
    }
}
