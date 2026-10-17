package a3b;

import android.os.Parcelable;
import as1.a0;
import ck3.n;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.domain.model.ExchangeLimitExceededError;
import com.revolut.feature.wealth.api.domain.model.ExchangePocketIsDisabledError;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.trading.orders.ui.invest.placement.screens.review.o;
import gq4.r;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.e0;
import nii.m0;
import nii.z;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h implements nii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1085b;

    public /* synthetic */ h(dtl.m mVar, InvestOrder investOrder) {
        this.f1084a = 12;
        this.f1085b = investOrder;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) throws Throwable {
        int i = this.f1084a;
        Object obj3 = this.f1085b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                ((com.revolut.feature.retail.cfd.impl.flows.withdraw.a) obj3).f82201r.getClass();
                return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 1:
                return ((com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b) obj3).f102489p.a((Throwable) obj2);
            case 2:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return ((wp1.a) ((com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.b) obj3).f78752q).a(throwable).f216244b;
            case 3:
                ((com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.a) obj3).f61175q.getClass();
                return new z(new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.boleto_finder_onboarding_accept_result_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.bills.boleto.api.R$string.boleto_finder_onboarding_accept_result_error_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 4:
                Throwable throwable2 = (Throwable) obj2;
                abk.c cVar = ((a0) obj3).u;
                v60.e eVar = cVar.f2977b;
                Intrinsics.checkNotNullParameter(throwable2, "throwable");
                if (throwable2 instanceof HandledNetworkException) {
                    return null;
                }
                ServerError serverErrorA = cVar.f2976a.a(throwable2);
                v60.d dVarB = ((ao0.a) eVar).b(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null);
                if (dVarB == null) {
                    dVarB = new v60.b();
                }
                return new z(new TextLocalisedClause(dVarB.a(), (List) null, (Clause) null, false, 30), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 5:
                vu.g gVar = ((bt2.k) obj3).f18268p;
                return new z(new TextLocalisedClause(((n5j.b) gVar).b(vu.f.referrals_select_retail_account_error), null, null, 14), null, new TextLocalisedClause(((n5j.b) gVar).b(vu.f.referrals_select_retail_account_try_again), null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
            case 6:
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var);
                ((com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) obj3).f69736r.getClass();
                return vt4.b.a();
            case 7:
                ((com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) obj3).f71780t.getClass();
                return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, null, false, null, null, null, null, null, null, 32734);
            case 8:
                ((c7k.j) obj3).f22056q.getClass();
                return new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            case 9:
                Throwable error = (Throwable) obj2;
                ((n) obj3).f24770s.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                return tj0.a.a(error) ? new e0((Clause) new TextLocalisedClause(R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.common_offline_state_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020) : new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 10:
                ((crg.h) obj3).f108386q.getClass();
                return new z(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_common_error_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.vaults.R$string.moneyboxes_error_generic_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
            case 11:
                ((d2c.j) obj3).f110791p.getClass();
                return p2c.z.a((Throwable) obj2);
            case 12:
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Failed to cancel the order.", (Throwable) obj2, h0Var2);
                return dtl.m.b3((InvestOrder) obj3);
            case 13:
                dx5.n nVar = (dx5.n) obj3;
                vw5.a aVar = nVar.f120884r;
                Throwable th10 = (Throwable) obj2;
                if (th10 instanceof ExchangeLimitExceededError) {
                    TextLocalisedClause errorMessage = ((ExchangeLimitExceededError) th10).f95224a;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    z configuration = new z(errorMessage, null, null, null, null, null, false, null, null, null, null, null, null, 32766);
                    Intrinsics.checkNotNullParameter(configuration, "configuration");
                    return configuration;
                }
                if (th10 instanceof ExchangePocketIsDisabledError) {
                    ExchangePocketIsDisabledError.Payload payload = ((ExchangePocketIsDisabledError) th10).f95225a;
                    xi0.b bVar = payload.f95226a;
                    nVar.f120887w.b(new rp0.b("POCKET_ACTIVATION_DIALOG", new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.crypto_commodity_pocket_activation_alert_title, u.c(bVar.f306286a), null, 12), new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.crypto_commodity_pocket_activation_alert_message, u.c(bVar.f306286a), null, 12), new TextLocalisedClause(com.revolut.feature.cryptocommodity_invest.api.R$string.crypto_commodity_pocket_activation_alert_action_activate, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), payload, false, 912));
                    return null;
                }
                aVar.getClass();
                z configuration2 = new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
                Intrinsics.checkNotNullParameter(configuration2, "configuration");
                return configuration2;
            case 14:
                ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) obj3).f103237t.getClass();
                return fik.d.e();
            case 15:
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var3);
                ((com.revolut.feature.credit.card.impl.ui.statement_financing.details.a) obj3).v.getClass();
                return vt4.b.a();
            case 16:
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.a) obj3).f101101s.getClass();
                return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), new TextLocalisedClause(R$string.common_action_ok, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
            case 17:
                return ((fo1.e0) obj3).v.a((Throwable) obj2, true);
            case 18:
                h0 h0Var4 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var4);
                ((r) obj3).f145560q.getClass();
                return vt4.b.a();
            case 19:
                ((com.revolut.feature.pockets.impl.details_v2.pocket_details.a) obj3).A.getClass();
                return new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 20:
                ((hkj.f) obj3).f152936r.getClass();
                return jkj.a.a();
            case 21:
                h0 h0Var5 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var5);
                ((com.revolut.feature.security_hub.impl.ui.flow.m) obj3).f85572r.getClass();
                return new z(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_linked_wallets_acknowledge_new_dialog_error, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 22:
                return ((rud.b) ((com.revolut.feature.staking.impl.confirmation.a) obj3).v).a((Throwable) obj2);
            case 23:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                h0 h0Var6 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Submit order failed", error2, h0Var6);
                ((o) obj3).H.getClass();
                Intrinsics.checkNotNullParameter(error2, "error");
                return new z(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_order_error_place, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 24:
                com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a aVar2 = (com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a) obj3;
                if (!tj0.a.a((Throwable) obj2)) {
                    return new z(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_withdraw_status_dialog_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_withdraw_status_dialog_error_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_withdraw_status_dialog_error_primary_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
                }
                aVar2.f95549s.getClass();
                return fah.c.a();
            case 25:
                Throwable th11 = (Throwable) obj2;
                ServerError serverErrorA2 = ((com.revolut.feature.credit.card.impl.ui.direct_debit.b) obj3).f69272q.a(th11);
                if (serverErrorA2 != null && serverErrorA2.f51362a == 9401) {
                    throw th11;
                }
                h0 h0Var7 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var7);
                return new z(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 26:
                return ((com.revolut.feature.apm.payid.impl.flow.a) obj3).f62707q.a((Throwable) obj2, true);
            case 27:
                h0 h0Var8 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList8 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var8);
                ((com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a) obj3).f69432s.getClass();
                return vt4.b.a();
            case 28:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((com.revolut.feature.statements.impl.ui.savings.a) obj3).f88378s.c(it8);
            default:
                ((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c) obj3).f74398q.getClass();
                return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
        }
    }

    public /* synthetic */ h(yji.l lVar, int i) {
        this.f1084a = i;
        this.f1085b = lVar;
    }
}
