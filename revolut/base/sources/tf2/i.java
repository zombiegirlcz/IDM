package tf2;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.Identification;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.upi.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.k f270216a;

    public i(yof.k transferReviewMapper) {
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        this.f270216a = transferReviewMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listA;
        Identification identification;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVar = domainState.f270211a;
        if (eVar == null) {
            listA = ((ppf.d) this.f270216a).e();
        } else {
            ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = eVar.f270212a;
            dj0.d dVarM = pyd.c.M(apmPaymentAuthorisationSummary.f);
            CounterTextDelegate.Model model = new CounterTextDelegate.Model("ID_COUNTER_TOTAL_AMOUNT", new TextLocalisedClause(R$string.upi_transfer_review_recipient_total_amount_header, null, null, 14), new t4(new MoneyClause(dVarM, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, false, null, null, 0, 0, 0, 0, 2040);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            aim.e eVarB = u.b();
            PaymentMethodDetails paymentMethodDetails = apmPaymentAuthorisationSummary.f61995g;
            PaymentMethodDetails.Upi upi2 = paymentMethodDetails instanceof PaymentMethodDetails.Upi ? (PaymentMethodDetails.Upi) paymentMethodDetails : null;
            if (upi2 != null) {
                PaymentMethodDetails.Creditor creditor = upi2.f62071c;
                aim.e eVarB2 = u.b();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.contacts_to, null, null, 14);
                String str = creditor != null ? creditor.f62030a : null;
                eVarB2.add(new CellDetailsActionDelegate.Model("ID_COUNTERPARTY", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(str == null ? "" : str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, null, null, null, 0, 0, 0, 0, 4194276));
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.upi_transfer_review_upi_id_title, null, null, 14);
                String str2 = (creditor == null || (identification = creditor.f62031b) == null) ? null : identification.f62023b;
                eVarB2.add(new CellDetailsDelegate.Model("ID_UPI_ID", textLocalisedClause2, new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
                eVarB.addAll(u.a(eVarB2));
            }
            eVarB.add(new CellDetailsDelegate.Model("ID_SCHEDULED_ON", new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_bank_transfer_review_field_title_estimated_arrival, null, null, 14), new TextLocalisedClause(R$string.upi_transfer_review_estimated_arrival_instantly, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760));
            aim.e eVarA = u.a(eVarB);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            List listK = v.k(new CellDetailsDelegate.Model("ID_RECIPIENT_GETS", new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_fees_bank_transfer_section_recipient_fix, null, null, 14), new MoneyClause(dVarM, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_FEES", new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_core_fees_bank_transfer_section_fees, null, null, 14), new TextLocalisedClause(R$string.upi_transfer_review_fees_no_fees, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            IconDelegate.Model model2 = new IconDelegate.Model("UPI_LOGO_LIST_ID", new CdnImage("logo", "mobile/payments/upi", null, new ImageTransformations(null, null, null, null, null, null, 50, 63), null, null, Constants.TAG_F4), null, null, 124);
            aim.e eVarB3 = u.b();
            eVarB3.add(model);
            eVarB3.addAll(eVarA);
            eVarB3.addAll(listK);
            eVarB3.add(model2);
            listA = u.a(eVarB3);
        }
        return new g(listA);
    }
}
