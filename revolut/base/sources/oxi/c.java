package oxi;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oxi.d;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungesHomeHelpScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AirportLoungesHomeHelpScreen airportLoungesHomeHelpScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungesHomeHelpScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.Q.getValue();
        String id10 = model.f53228a;
        g gVar = (g) eVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        int iHashCode = id10.hashCode();
        if (iHashCode != -1404792516) {
            if (iHashCode != 789594852) {
                if (iHashCode == 1896205091 && id10.equals("ID_MODAL_HELP_ITEM_TERMS")) {
                    gVar.C2(d.c.f230847a);
                }
            } else if (id10.equals("ID_HELP_ITEM_FAQ")) {
                gVar.C2(d.a.f230845a);
            }
        } else if (id10.equals("ID_MODAL_HELP_ITEM_REFUND")) {
            gVar.C2(d.b.f230846a);
        }
        return Unit.f186387a;
    }
}
