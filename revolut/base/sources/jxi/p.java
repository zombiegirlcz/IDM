package jxi;

import aw0.ib;
import aw0.jb;
import aw0.kb;
import com.revolut.core.ui_kit.delegates.WalletWidgetDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AirportLoungesHomeScreen airportLoungesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((WalletWidgetDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        WalletWidgetDelegate.Model model = (WalletWidgetDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        kb kbVar = model.f53630a;
        boolean z = kbVar instanceof ib;
        AirportLoungesHomeScreen airportLoungesHomeScreen = this.v;
        if (z) {
            ((com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) airportLoungesHomeScreen.d()).C2(a.C0605a.f99087a);
        } else {
            if (!(kbVar instanceof jb)) {
                throw new NoWhenBranchMatchedException();
            }
            ((com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) airportLoungesHomeScreen.d()).C2(a.c.f99089a);
        }
        return Unit.f186387a;
    }
}
