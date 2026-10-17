package x84;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreen;
import com.revolut.feature.credit.core.R$string;
import ip0.tm0;
import ip0.um0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.t;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DebtsHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DebtsHubScreen debtsHubScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = debtsHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
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
        Continuation continuation = null;
        DebtsHubScreen debtsHubScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) debtsHubScreen.T2();
                j60.a aVar2 = qVar.f303291r;
                if (aVar2.j()) {
                    j60.a.v(aVar2, true, null, 2);
                } else {
                    qVar.v2(i.f303282a);
                }
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar2 = (q) debtsHubScreen.T2();
                List list = (List) ((g) qVar2.t2()).f303280a.getContent();
                if (list == null || !list.isEmpty()) {
                    qVar2.l2(new wr1.s(qVar2, continuation, 24), new yi5.b(26));
                } else {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_outstanding_debts_submit_no_debts_dialog_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_submit_no_debts_dialog_subtitle, null, null, 14);
                    um0 um0Var = new um0("SUBMIT_ACTION_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_action_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_application_outstanding_debts_debts_hub_action_skip_and_submit, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016);
                    qVar2.f303291r.x(dy4.b.b(rp0.m.Companion, u.c(um0Var), new t(textLocalisedClause, textLocalisedClause2, null, 28), null, null, null, null, 1020));
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) debtsHubScreen.T2()).v2(h.f303281a);
                break;
        }
        return Unit.f186387a;
    }
}
