package i57;

import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {

    @NotNull
    public static final d Companion = new d();

    @Override // cli.n
    public final o c(j jVar) {
        Clause textLocalisedClause;
        Clause clauseA;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_subtitle, null, null, 14), null, null, false, 28);
        TaxHubVatSummary vatSummary = domainState.f158781b;
        ds6.a assessmentPeriod = vatSummary.f73489a;
        Intrinsics.checkNotNullParameter(assessmentPeriod, "assessmentPeriod");
        switch (k57.a.f181463a[assessmentPeriod.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_sales_monthly, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_sales_bi_monthly, null, null, 14);
                break;
            case 3:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_sales_four_monthly, null, null, 14);
                break;
            case 4:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_sales_quarterly, null, null, 14);
                break;
            case 5:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_sales_half_yearly, null, null, 14);
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_sales_yearly, null, null, 14);
                break;
            case 7:
            case 8:
            case 9:
                textLocalisedClause = k57.b.a();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        t0 t0Var = new t0(textLocalisedClause, (Image) null, 0, false, 30);
        TaxHubVatSummary.Summary summary = vatSummary.f73490b;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("LIST_ID_SALES_THIS_PERIOD", t0Var, new MoneyClause(summary.f73492a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_vat_rate, null, null, 14), (Image) null, 0, false, 30);
        es6.b taxAllocationMode = domainState.f158780a;
        Intrinsics.checkNotNullParameter(taxAllocationMode, "taxAllocationMode");
        Intrinsics.checkNotNullParameter(vatSummary, "vatSummary");
        dj0.d dVar = summary.f73492a;
        TaxHubVatSummary.TaxRateSummary taxRateSummary = summary.f73493b;
        if (dVar.f(dj0.d.e)) {
            clauseA = taxRateSummary != null ? new PercentageClause(taxRateSummary.f73496b, (PercentageClause.Format) null, (Custom) null, 6) : new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_vat_rate_variable, null, null, 14);
        } else {
            int i = k57.a.f181464b[taxAllocationMode.ordinal()];
            if (i == 1 || i == 2) {
                clauseA = k57.b.a();
            } else if (i == 3) {
                clauseA = taxRateSummary != null ? new PercentageClause(taxRateSummary.f73496b, (PercentageClause.Format) null, (Custom) null, 6) : k57.b.a();
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                clauseA = new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_vat_rate_per_product, null, null, 14);
            }
        }
        List listK = v.k(model, new CellDetailsDelegate.Model("LIST_ID_VAT_RATE", t0Var2, clauseA, null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("LIST_ID_ESTIMATED_VAT", new t0((Clause) new TextLocalisedClause(R$string.freelancer_vat_summary_estimation_explainer_item_estimated_vat, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(summary.f73494c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(null, listK, aVar);
    }
}
