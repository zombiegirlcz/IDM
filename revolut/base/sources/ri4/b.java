package ri4;

import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GiveConsentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(GiveConsentScreen giveConsentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = giveConsentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            case 2:
                return new b(this.v, continuation, 2);
            default:
                return new b(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GiveConsentScreen giveConsentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n) giveConsentScreen.T2()).v2(f.f254540a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) giveConsentScreen.T2();
                nVar.getClass();
                nVar.n2(new l(nVar, null, 1), new rg3.d(24));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar2 = (n) giveConsentScreen.T2();
                nVar2.getClass();
                nVar2.n2(new l(nVar2, null, 2), new rg3.d(25));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = GiveConsentScreen.f68473d0;
                ViewBinding value = giveConsentScreen.X.getValue(giveConsentScreen, GiveConsentScreen.f68473d0[0]);
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                NavBarWithToolbar creditApplicationNavBarWithToolbar = ((aw3.k) value).f10698b;
                Intrinsics.checkNotNullExpressionValue(creditApplicationNavBarWithToolbar, "creditApplicationNavBarWithToolbar");
                creditApplicationNavBarWithToolbar.setExpanded(false, true);
                giveConsentScreen.h().smoothScrollBy(0, giveConsentScreen.h().computeVerticalScrollRange() - giveConsentScreen.i3().getScrollY());
                break;
        }
        return Unit.f186387a;
    }
}
