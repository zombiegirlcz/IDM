package smj;

import aw0.e;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundProration;
import com.revolut.retail.feature.esim.impl.R$plurals;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.refund_summary.EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData;
import ip0.e8;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final umj.a f264453a;

    public d(umj.a prorationMapper) {
        Intrinsics.checkNotNullParameter(prorationMapper, "prorationMapper");
        this.f264453a = prorationMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        List list;
        i e8Var;
        List listC;
        EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData domainState = (EsimDataPlanRefundSummaryBottomSheetScreenContract$InputData) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_terms_dialog_refund, null, null, 14);
        EsimSubscriptionRefundProration esimSubscriptionRefundProration = domainState.f101414a;
        if (esimSubscriptionRefundProration instanceof EsimSubscriptionRefundProration.DaysPassed) {
            i = R$string.esim_checkout_change_data_plan_refund_unlimited_subtitle;
        } else if (esimSubscriptionRefundProration instanceof EsimSubscriptionRefundProration.DataUsage) {
            i = R$string.esim_checkout_change_data_plan_refund_subtitle;
        } else {
            if (esimSubscriptionRefundProration != null) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.esim_checkout_change_data_plan_refund_full_refund_subtitle;
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(i, null, null, 14), null, null, false, 28);
        EsimSubscriptionRefundProration proration = domainState.f101414a;
        if (proration != null) {
            gej.a aVar2 = this.f264453a.f281320a;
            Intrinsics.checkNotNullParameter(proration, "proration");
            if (proration instanceof EsimSubscriptionRefundProration.DataUsage) {
                EsimSubscriptionRefundProration.DataUsage dataUsage = (EsimSubscriptionRefundProration.DataUsage) proration;
                CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_DATA_USED", new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_terms_dialog_local_data_used_title, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" / ", (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), v.k(gej.a.a(aVar2, dataUsage.f100509b, null, 6), gej.a.a(aVar2, dataUsage.f100508a, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 2))), null, null, null, null, 0, null, false, false, null, null, 32760);
                dj0.d dVar = dataUsage.f100510c;
                i[] elements = {model, dVar != null ? new CellDetailsDelegate.Model("ID_DATA_COST", new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_terms_dialog_local_data_cost_title, null, null, 14), (Image) null, 0, false, 30), yoj.b.m(new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(R$string.esim_common_unit_gb, null, null, 14))), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listC = kotlin.collections.d.L(elements);
            } else {
                if (!(proration instanceof EsimSubscriptionRefundProration.DaysPassed)) {
                    throw new NoWhenBranchMatchedException();
                }
                listC = u.c(new CellDetailsDelegate.Model("ID_DAYS_REMAINING", new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_terms_dialog_days_remaining_label, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedQuantityClause(R$plurals.esim_checkout_validity_days, Integer.valueOf(((EsimSubscriptionRefundProration.DaysPassed) proration).f100512b), (List) null, (Style) null, 28), null, null, null, null, 0, null, false, false, null, null, 32760));
            }
            list = listC;
            yp0.b.k(list, 0, 0, 0, 0, 31);
        } else {
            list = null;
        }
        if (list == null) {
            list = f0.f322471a;
        }
        List list2 = list;
        dj0.d dVar2 = domainState.f101415b;
        double d = domainState.f101416c;
        if (dVar2.f(dj0.d.e) || d > 0.0d) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_terms_dialog_refund, null, null, 14);
            MoneyClause moneyClause = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
            e8Var = d > 0.0d ? new e8("ID_REFUND_AMOUNT", textLocalisedClause2, null, new nw0.a(new BigDecimal(String.valueOf(d)), moneyClause), null, 0, 0, 500) : new CellDetailsDelegate.Model("ID_REFUND_AMOUNT", new t0((Clause) textLocalisedClause2, (Image) null, 0, false, 30), moneyClause, null, null, null, null, 0, null, false, false, null, null, 32760);
            yp0.b.l(e8Var, 0, 0, 0, 0, null, false, 63);
        } else {
            e8Var = null;
        }
        return new cii.b(new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), d0.E0(v.l(e8Var), list2), aVar);
    }
}
