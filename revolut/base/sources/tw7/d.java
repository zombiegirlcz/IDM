package tw7;

import com.revolut.feature.insurance_home.impl.data.model.Footer;
import com.revolut.feature.insurance_home.impl.data.model.FooterButton;
import com.revolut.feature.insurance_home.impl.ui.screen.home.InsuranceHomeScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InsuranceHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(InsuranceHomeScreen insuranceHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = insuranceHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Footer footer;
        FooterButton footerButton;
        int i = this.u;
        InsuranceHomeScreen insuranceHomeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                insuranceHomeScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance_home.impl.ui.screen.home.a aVar3 = (com.revolut.feature.insurance_home.impl.ui.screen.home.a) insuranceHomeScreen.R2();
                com.revolut.feature.insurance_home.impl.data.model.f fVar = (com.revolut.feature.insurance_home.impl.data.model.f) ((h) ((j2) aVar3.u.f22677a).getValue()).f274934a.getContent();
                FooterButton.Action action = (fVar == null || (footer = fVar.d) == null || (footerButton = footer.f76171a) == null) ? null : footerButton.f76175b;
                if (action instanceof FooterButton.Action.PlanUpgrade) {
                    aVar3.K2(null, u.c(((FooterButton.Action.PlanUpgrade) action).f76177b));
                } else if (action instanceof FooterButton.Action.Upgrade) {
                    FooterButton.Action.Upgrade upgrade = (FooterButton.Action.Upgrade) action;
                    aVar3.K2(upgrade.f76180c, upgrade.f76179b);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Footer button has an unknown or null action: actionType=", action != null ? action.getClass().getSimpleName() : null));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
        }
        return Unit.f186387a;
    }
}
