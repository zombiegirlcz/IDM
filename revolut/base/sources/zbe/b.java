package zbe;

import a9e.c;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import ip0.z;
import java.io.Serializable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import ofm.q;
import qua.p;
import qua.u;
import qv0.i;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f320880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f320881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f320882c;
    public final ugc.a d;

    public b(a9e.b commonSubscriptionMapper, e dateProvider, c recurringPaymentIconMapper, mae.e recurringPaymentAutomationMapper, ugc.a walletNavBarMapper) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentIconMapper, "recurringPaymentIconMapper");
        Intrinsics.checkNotNullParameter(recurringPaymentAutomationMapper, "recurringPaymentAutomationMapper");
        Intrinsics.checkNotNullParameter(walletNavBarMapper, "walletNavBarMapper");
        this.f320880a = commonSubscriptionMapper;
        this.f320881b = dateProvider;
        this.f320882c = recurringPaymentIconMapper;
        this.d = walletNavBarMapper;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!u.i(model.f320877a, ((f) this.f320881b).g())) {
            return null;
        }
        i9e.f fVar = (i9e.f) this.f320880a;
        ActionsView.Item[] elements = {fVar.m(), fVar.x()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return fVar.c(d.L(elements));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        char c2;
        char c3;
        char c5;
        CellDetailsDelegate.Model model;
        Data data;
        int i;
        a model2 = (a) obj2;
        Intrinsics.checkNotNullParameter(model2, "model");
        p pVar = model2.f320877a;
        Data data2 = model2.f320878b;
        boolean zI = u.i(pVar, ((f) this.f320881b).g());
        aim.e eVarB = zhm.u.b();
        a9e.b bVar = this.f320880a;
        if (!zI) {
            vua.a aVar = pVar.f249330s;
            sa saVarZ = ((i9e.f) bVar).z(aVar != null ? aVar.a() : null);
            yp0.b.l(saVarZ, 0, 0, 0, 0, null, false, 63);
            eVarB.add(saVarZ);
        }
        boolean zV = u.v(pVar);
        ibd.e eVar = pVar.f249314a;
        boolean z = zV || !(eVar.e == null || q.H(pVar));
        i9e.f fVar = (i9e.f) bVar;
        i iVarR = fVar.r(pVar, false);
        CellDetailsDelegate.Model modelF = z ? fVar.F(eVar.e) : null;
        WalletAutomation walletAutomation = pVar.f249317b0;
        if (walletAutomation != null) {
            WalletAutomation.Limit d = walletAutomation.getD();
            if (d == null) {
                model = null;
                c2 = 0;
                c3 = 1;
                c5 = 3;
            } else {
                c2 = 0;
                int i2 = mae.d.f203999a[d.f86450b.ordinal()];
                if (i2 == 1) {
                    i = R$string.recurring_payments_frequency_daily;
                } else if (i2 == 2) {
                    i = R$string.subscriptions_change_frequency_options_weekly;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.subscriptions_change_frequency_options_monthly;
                }
                c3 = 1;
                c5 = 3;
                model = new CellDetailsDelegate.Model("ID_FREQUENCY", new t0((Clause) new TextLocalisedClause(R$string.recurring_payment_details_limit, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new MoneyClause(d.f86449a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(i, null, null, 14))), null, null, null, null, 0, null, false, false, null, null, 32760);
            }
        } else {
            c2 = 0;
            c3 = 1;
            c5 = 3;
            model = null;
        }
        CellDetailsDelegate.Model modelV = (zI && q.y(pVar)) ? fVar.v(eVar.f, pVar) : null;
        i[] elements = new i[4];
        elements[c2] = iVarR;
        elements[c3] = modelF;
        elements[2] = model;
        elements[c5] = modelV;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        CellDetailsNoteDelegate.Model modelW = fVar.w(pVar.f249325m);
        if (modelW != null) {
            yp0.b.l(modelW, 0, 0, 0, 0, null, false, 63);
            eVarB.add(modelW);
        }
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((hce.d) content).f150888a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        k71.q qVar = model2.f320879c;
        hce.d dVar = (hce.d) data2.getContent();
        List listD = fVar.d(data, qVar, dVar != null ? dVar.f150889b : null);
        if (listD != null) {
            eVarB.addAll(listD);
        }
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelS);
        CellDetailsChevronDelegate.Model modelL = fVar.l(R.string.common_action_delete);
        yp0.b.l(modelL, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        eVarB.add(modelL);
        return zhm.u.a(eVarB);
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Clause clauseB;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p subscription = zae.c.c(subscriptionContent);
        boolean zI = u.i(subscription, ((f) this.f320881b).g());
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        WalletAutomation automation = subscription.f249317b0;
        Clause clauseB2 = automation != null ? mae.e.b(subscription) : ((i9e.f) ((a9e.b) this.d.f279998b)).u(u.f(subscription), zI);
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        if (automation != null) {
            Intrinsics.checkNotNullParameter(automation, "automation");
            if (automation instanceof WalletAutomation.DropsBelow) {
                clauseB = new MoneyClause(((WalletAutomation.DropsBelow) automation).f86443a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            } else {
                if (!(automation instanceof WalletAutomation.Exceeds)) {
                    throw new NoWhenBranchMatchedException();
                }
                clauseB = new TextLocalisedClause(R$string.recurring_payment_details_automation_exceeds_explanation, null, null, 14);
            }
        } else {
            clauseB = mae.e.b(subscription);
        }
        Clause clause = clauseB;
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return w.h(new hce.a(clauseB2, clause, automation != null ? mae.e.a(automation) : new TextLocalisedClause(R$string.standing_order_kind_description_move_money, null, null, 14), ((mae.f) this.f320882c).b(subscription), ((i9e.f) this.f320880a).g(!zI), (Serializable) null, 96));
    }
}
