package ar4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.i;
import jki.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import xq4.j;
import xq4.k;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends k {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        int i;
        TextLocalisedClause textLocalisedClause;
        xq4.f domainState = (xq4.f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xq4.i iVarC = k.c(new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_header, null, null, 14));
        domainState.getClass();
        CreditCardDescriptionDestination.DescriptionConfig.Local local = ((xq4.d) domainState).f308106a;
        Intrinsics.i(local, "null cannot be cast to non-null type com.revolut.feature.credit.card.api.navigation.CreditCardDescriptionDestination.DescriptionConfig.Local.PromotionalBalancePeriod");
        CreditCardDescriptionDestination.DescriptionConfig.Local.PromotionalBalancePeriod promotionalBalancePeriod = (CreditCardDescriptionDestination.DescriptionConfig.Local.PromotionalBalancePeriod) local;
        j8 j8VarB = k.b(R$drawable.uikit_icn_24_gift);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_what_is_title, null, null, 14);
        int i2 = R$string.credit_promotional_transfer_explainer_what_is_subtitle;
        long j2 = promotionalBalancePeriod.f68911b;
        int i3 = promotionalBalancePeriod.f;
        TimeClause.Format.DateFull dateFull = TimeClause.Format.DateFull.f57961b;
        TimeClause timeClauseA = sx4.a.a(j2, dateFull);
        long j3 = promotionalBalancePeriod.f68912c;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i2, v.k(timeClauseA, sx4.a.a(j3, dateFull)), null, 12);
        String str = promotionalBalancePeriod.f68913g;
        if (str != null) {
            i = i3;
            textLocalisedClause = new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_what_is_terms_link, null, new Click(28, (Integer) null, (Object) str, "PROMOTION_TERMS_ID", false), 10);
        } else {
            i = i3;
            textLocalisedClause = null;
        }
        TextLocalisedClause[] elements = {textLocalisedClause3, textLocalisedClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i5 = i;
        ListCellDelegate.Model model = new ListCellDelegate.Model("id_what_is", j8VarB, textLocalisedClause2, new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, null, 0, 0, 0, 0, 4064);
        ListCellDelegate.Model model2 = new ListCellDelegate.Model("id_duration", k.b(R$drawable.uikit_icn_24_time), new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_duration_title, null, null, 14), new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_duration_subtitle, v.k(sx4.a.a(j2, dateFull), new TextLocalisedQuantityClause(R$plurals.credit_promotional_transfer_explainer_days_duration, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), (Style) null, 24), sx4.a.a(j3, dateFull)), null, 12), false, null, null, 0, 0, 0, 0, 4064);
        ListCellDelegate.Model model3 = new ListCellDelegate.Model("id_transactions_coverage", k.b(R$drawable.uikit_icn_24_card), new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_transactions_coverage_title, null, null, 14), new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_transactions_coverage_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        ListCellDelegate.Model model4 = new ListCellDelegate.Model("id_not_paid_minimum", k.b(R$drawable.uikit_icn_16_warning), new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_not_paid_minimum_title, null, null, 14), new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_not_paid_minimum_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4064);
        j8 j8VarB2 = k.b(R$drawable.uikit_icn_24_calendar);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_promotional_transfer_explainer_end_title, null, null, 14);
        wi0.b bVar = promotionalBalancePeriod.d;
        wi0.b.Companion.getClass();
        List listK = v.k(model, model2, model3, model4, new ListCellDelegate.Model("id_end", j8VarB2, textLocalisedClause4, new TextLocalisedClause(Intrinsics.f(bVar, wi0.b.f297750h0) ? R$string.credit_promotional_transfer_explainer_end_subtitle_es : R$string.credit_promotional_transfer_explainer_end_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4064));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new j(iVarC, listK, new xq4.h(), null);
    }
}
