package e7e;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subaccount.impl.R$string;
import dz6.o;
import e2j.j;
import g6e.d;
import gim.i;
import k6e.c;
import k6e.e;
import k6e.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import v6e.s;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f123306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f123307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f123308n;

    public a(j60.a bottomExpandableDialogControllerExtension, s subscriptionDetailsNavigationProvider, d subaccountInteractor) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(subscriptionDetailsNavigationProvider, "subscriptionDetailsNavigationProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        this.f123306l = bottomExpandableDialogControllerExtension;
        this.f123307m = subscriptionDetailsNavigationProvider;
        this.f123308n = subaccountInteractor;
    }

    @Override // k6e.e
    public final Object Z2(k6e.d dVar, i iVar) {
        boolean z = dVar instanceof k6e.b;
        j60.a aVar = this.f123306l;
        Continuation continuation = null;
        if (z) {
            f fVar = ((k6e.b) dVar).f181699a;
            int i = R$string.bill_accounts_payment_unlink_alert_title;
            String str = fVar.f181701a.f249324l;
            if (str == null) {
                str = "";
            }
            aVar.x(q7e.a.a(new TextLocalisedClause(i, u.c(str), null, 12), new TextLocalisedClause(R$string.bill_accounts_payment_unlink_alert_message, u.c(new MoneyClause(qua.u.f(fVar.f181701a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, new TextLocalisedClause(R$string.bill_accounts_common_action_stop, null, null, 14), "ACTION_ID_CONFIRM_DELETE_PAYMENT", fVar, 4));
        } else {
            if (dVar instanceof c) {
                j60.a.v(aVar, false, null, 3);
                Object objY2 = Y2(iVar, new com.revolut.feature.credit.application.plugins.impl.ui.form.a(this, dVar, continuation, 13));
                return objY2 == fim.a.COROUTINE_SUSPENDED ? objY2 : Unit.f186387a;
            }
            if (!(dVar instanceof k6e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            j60.a.v(aVar, false, null, 3);
            T2(new o(this, dVar, continuation, 27), new j(this, 25));
        }
        return Unit.f186387a;
    }
}
