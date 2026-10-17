package h43;

import cli.y;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreen;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ChooserScreen chooserScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = chooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ChooserScreen chooserScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) chooserScreen.d();
                y yVar = sVar.B;
                f0 f0Var = ((n) ((j2) yVar.f22677a).getValue()).f149295b;
                if (f0Var == null) {
                    sVar.H2(yVar, new h3d.a(7));
                } else {
                    PocketWithSubaccount pocketWithSubaccount = sVar.f149302p.f65269a;
                    sVar.n2(new g0a.e(16, sVar, f0Var, pocketWithSubaccount, pocketWithSubaccount.e, null), new whi.b(6));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) chooserScreen.d()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
