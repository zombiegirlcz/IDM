package v84;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.details.DebtDetailsScreen;
import com.revolut.feature.credit.core.R$string;
import ip0.tm0;
import ip0.um0;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.m;
import rp0.t;
import yhm.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DebtDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(DebtDetailsScreen debtDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = debtDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DebtDetailsScreen debtDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                debtDetailsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) ((e) debtDetailsScreen.X.getValue());
                pu3.b bVar = hVar.f286713p.f67440a;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_outstanding_debts_delete_dialog_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_delete_dialog_subtitle, v.k(bVar.P5(), new TextLocalisedClause(cp5.c.w(bVar.c4()), null, null, 14)), null, 12);
                um0 um0Var = new um0("DELETE_ACTION_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_action_dialog_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_action_dialog_delete, null, null, 14), false, null, null, 56), (Object) bVar, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008);
                hVar.f286714q.x(dy4.b.b(m.Companion, u.c(um0Var), new t(textLocalisedClause, textLocalisedClause2, null, 28), null, null, null, null, 1020));
                break;
        }
        return Unit.f186387a;
    }
}
