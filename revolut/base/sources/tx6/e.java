package tx6;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceCustomerDetails;
import com.revolut.feature.freelancer.impl.R$plurals;
import com.revolut.feature.freelancer.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import jr6.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import sr6.g;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f275339a;

    public e(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f275339a = dateProvider;
    }

    public final ResourceImage a(FreelancerInvoice invoice) {
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        if (e0.q(invoice)) {
            return new ResourceImage(R$drawable.uikit_icn_16_cross_circle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        if (e0.x(invoice)) {
            return new ResourceImage(R$drawable.uikit_icn_16_time, (Integer) null, (Integer) null, Integer.valueOf(e0.t(invoice, ((l80.f) this.f275339a).g()) ? R$attr.uikit_colorOrange : R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        }
        return null;
    }

    public final RowDelegate.Model b(FreelancerInvoice invoice) {
        Clause textClause;
        g fVar;
        TextLocalisedQuantityClause textLocalisedQuantityClause;
        Clause clauseW;
        String str;
        String strL;
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        String str2 = invoice.f73374a;
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 10.0f, Float.valueOf(20.0f), null, 32);
        FreelancerInvoiceCustomerDetails freelancerInvoiceCustomerDetails = invoice.f73383p;
        Clause textLocalisedClause = (freelancerInvoiceCustomerDetails == null || (str = freelancerInvoiceCustomerDetails.f73391a) == null || (strL = m70.a.l(str)) == null) ? new TextLocalisedClause(R$string.freelancer_sale_invoice_status_kind_draft, null, null, 14) : new TextClause(strL, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean zU = e0.u(invoice);
        DateTime dateTime = invoice.f73377g;
        if (zU) {
            clauseW = yoj.b.w(yoj.b.w(new TextLocalisedClause(R$string.freelancer_sale_invoice_status_kind_paid, null, null, 14), new DotDividerClause((Integer) null)), new TextClause(invoice.f73376c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        } else {
            if (!e0.q(invoice)) {
                if (e0.x(invoice)) {
                    DateTime now = ((l80.f) this.f275339a).g();
                    Intrinsics.checkNotNullParameter(invoice, "<this>");
                    Intrinsics.checkNotNullParameter(now, "now");
                    int iAbs = Math.abs(Days.daysBetween(now, dateTime).getDays());
                    boolean zIsAfter = now.isAfter(dateTime);
                    if (iAbs >= 1) {
                        fVar = zIsAfter ? new sr6.e(iAbs) : new sr6.c(iAbs);
                    } else {
                        int iMax = Math.max(Math.abs(Hours.hoursBetween(now, dateTime).getHours()), 1);
                        fVar = zIsAfter ? new sr6.f(iMax) : new sr6.d(iMax);
                    }
                    if (fVar instanceof sr6.c) {
                        textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.freelancer_sale_invoice_due_in_days, Integer.valueOf(((sr6.c) fVar).f265126a), (List) null, (Style) null, 28);
                    } else if (fVar instanceof sr6.d) {
                        textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.freelancer_sale_invoice_due_in_hours, Integer.valueOf(((sr6.d) fVar).f265127a), (List) null, (Style) null, 28);
                    } else if (fVar instanceof sr6.e) {
                        textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.freelancer_sale_invoice_overdue_days, Integer.valueOf(((sr6.e) fVar).f265128a), (List) null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 12);
                    } else {
                        if (!(fVar instanceof sr6.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.freelancer_sale_invoice_overdue_hours, Integer.valueOf(((sr6.f) fVar).f265129a), (List) null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 12);
                    }
                    textClause = yoj.b.w(yoj.b.w(textLocalisedQuantityClause, new DotDividerClause((Integer) null)), new TextClause(invoice.f73376c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                } else {
                    textClause = new TextClause(invoice.f73376c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                return new RowDelegate.Model(str2, layeredImageB, null, null, textLocalisedClause, textClause, null, null, 0, new RowDelegate.Model.c.b(d(invoice), null, wf.REGULAR, false, LDSFile.EF_DG4_TAG), false, false, a(invoice), null, null, null, null, invoice, null, 0, 0, 0, 0, 1056946028);
            }
            clauseW = yoj.b.w(yoj.b.w(new TextLocalisedClause(R$string.freelancer_sale_invoice_status_kind_cancelled, null, null, 14), new DotDividerClause((Integer) null)), new TextClause(invoice.f73376c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        textClause = clauseW;
        return new RowDelegate.Model(str2, layeredImageB, null, null, textLocalisedClause, textClause, null, null, 0, new RowDelegate.Model.c.b(d(invoice), null, wf.REGULAR, false, LDSFile.EF_DG4_TAG), false, false, a(invoice), null, null, null, null, invoice, null, 0, 0, 0, 0, 1056946028);
    }

    public final TextLocalisedClause c(FreelancerInvoice invoice) {
        int i;
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        switch (d.f275338a[invoice.f73378h.ordinal()]) {
            case 1:
                i = R$string.freelancer_sale_invoice_status_kind_draft;
                break;
            case 2:
                i = R$string.freelancer_sale_invoice_status_kind_sent;
                break;
            case 3:
                i = R$string.freelancer_sale_invoice_status_kind_processing;
                break;
            case 4:
                i = R$string.freelancer_sale_invoice_status_kind_active;
                break;
            case 5:
                i = R$string.freelancer_sale_invoice_status_kind_completed;
                break;
            case 6:
                i = R$string.freelancer_sale_invoice_status_kind_paid;
                break;
            case 7:
                i = R$string.freelancer_sale_invoice_status_kind_expired;
                break;
            case 8:
                i = R$string.freelancer_sale_invoice_status_kind_cancelled;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public final MoneyClause d(FreelancerInvoice invoice) {
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        return new MoneyClause(invoice.f73379j, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(e0.u(invoice) ? R$attr.uikit_colorForeground : R$attr.uikit_colorGreyTone50), e0.q(invoice), null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8);
    }
}
