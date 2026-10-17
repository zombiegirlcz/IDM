package lyi;

import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_passengers.AirportLoungePassPassengersScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.d0;
import lyi.b;
import svi.s;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AirportLoungePassPassengersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(AirportLoungePassPassengersScreen airportLoungePassPassengersScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = airportLoungePassPassengersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            default:
                return new i(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AirportLoungePassPassengersScreen airportLoungePassPassengersScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m) airportLoungePassPassengersScreen.d()).C2(b.a.f200832a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = (m) airportLoungePassPassengersScreen.d();
                a aVar3 = (a) ((j2) mVar.f200842r.f22677a).getValue();
                String str = aVar3.f200830b;
                String str2 = aVar3.f200831c;
                if (d0.W(str) || d0.W(str2)) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "AirportLoungePassPassengersScreenModel", "onConfirmClicked: firstName or lastName is blank, skipping", null, null, 16);
                } else {
                    s sVar = aVar3.d;
                    if (sVar == null) {
                        sVar = new s(null, str, str2);
                    }
                    mVar.l2(new ll6.i(mVar, sVar, null, 28), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
