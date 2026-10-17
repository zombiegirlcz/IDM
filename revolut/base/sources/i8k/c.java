package i8k;

import aw0.e;
import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.payment_links.api.model.TransferLinkLimits;
import com.revolut.retail.feature.payments.payment_links.impl.R$string;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.limits_explanation.LimitsExplanationScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.time.Period;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements n {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitsExplanationScreenContract$InputData f159547a;

    public c(LimitsExplanationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f159547a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Object objA;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TransferLinkLimits transferLinkLimits = this.f159547a.f102222a;
        long j2 = transferLinkLimits.f102163a.f115082a;
        Number numberValueOf = j2 > 0 ? Float.valueOf((transferLinkLimits.f102164b.f115082a * 100.0f) / j2) : null;
        if (numberValueOf == null) {
            numberValueOf = 0;
        }
        Number number = numberValueOf;
        try {
            m.Companion companion = m.INSTANCE;
            objA = Period.parse(transferLinkLimits.f102165c);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        Period period = (Period) objA;
        if (period == null) {
            period = Period.ZERO;
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.payment_link_limits_sheet_title, null, null, 14), null, null, null, false, 30);
        RowDelegate.Model model = new RowDelegate.Model("EXPLANATION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.payment_link_limits_sheet_card_limit_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.payment_link_limits_sheet_card_limit_description, v.k(new MoneyClause(transferLinkLimits.f102163a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new PeriodClause(new PeriodClause.PeriodComponents(period.getYears(), period.getMonths(), period.getDays(), 0, 0, 0, 56), null)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payment_link_limits_sheet_progression_title, null, null, 14);
        List listK = v.k(new MoneyClause(transferLinkLimits.f102164b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause("/", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(transferLinkLimits.f102163a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
        m70.a.t(t0.f186434a);
        VaultsProgressDelegate.Model model2 = new VaultsProgressDelegate.Model("PROGRESS_LIST_ID", textLocalisedClause, null, null, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, null, false, number.intValue(), null, false, null, null, 8384476);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), v.k(model, model2), aVar);
    }
}
