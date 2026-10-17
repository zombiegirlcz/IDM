package tx6;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTax;
import com.revolut.feature.freelancer.impl.R$string;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f275337a;

    public b(f taxRateMapper) {
        Intrinsics.checkNotNullParameter(taxRateMapper, "taxRateMapper");
        this.f275337a = taxRateMapper;
    }

    public static CellDetailsDelegate.Model a(TextLocalisedClause textLocalisedClause, String str, boolean z) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) textLocalisedClause, (Image) null, 0, false, 30), z ? new TextLocalisedClause(R$string.freelancer_sale_details_section_extra_details_state_enabled, null, null, 14) : new TextLocalisedClause(R$string.freelancer_sale_details_section_extra_details_state_disabled, null, null, 14), null, null, null, null, 0, z ? new ResourceImage(R$drawable.uikit_icn_24_circle_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreen), (List) null, (ImageTransformations) null, (Clause) null, 246) : new ResourceImage(R$drawable.uikit_icn_24_cross_circled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, null, null, 31736);
    }

    public final RowDelegate.Model b(FreelancerInvoiceItemPayload freelancerInvoiceItemPayload, int i, boolean z) throws IOException {
        TextLocalisedClause textLocalisedClause;
        Clause textClause;
        String strN = a0.d.n("ITEM_ID_ITEMS_PREFIX", i);
        List listN0 = d0.n0(freelancerInvoiceItemPayload.f73394b, new String[]{" "}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listN0.iterator();
        while (it8.hasNext()) {
            Character chQ0 = f0.Q0((String) it8.next());
            if (chQ0 != null) {
                arrayList.add(chQ0);
            }
        }
        TextImage textImage = new TextImage(zhm.d0.k0(zhm.d0.V0(arrayList, 2), "", null, null, 0, null, 62), new Color.Solid(R$attr.uikit_colorDeepGrey), new Color.Solid(R$attr.uikit_colorDeepGrey_10), null, 16, 40, null, null, 200);
        TextClause textClause2 = new TextClause(freelancerInvoiceItemPayload.f73394b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        CompositeClause compositeClauseM = null;
        if (z) {
            int i2 = R$string.freelancer_vat_value;
            FreelancerInvoiceTax freelancerInvoiceTax = (FreelancerInvoiceTax) zhm.d0.d0(freelancerInvoiceItemPayload.i);
            if (freelancerInvoiceTax != null) {
                textClause = this.f275337a.b(freelancerInvoiceTax.f73416a);
                if (textClause == null) {
                }
                textLocalisedClause = new TextLocalisedClause(i2, u.c(textClause), null, 12);
            }
            textClause = new TextClause("0%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            textLocalisedClause = new TextLocalisedClause(i2, u.c(textClause), null, 12);
        } else {
            textLocalisedClause = null;
        }
        MoneyClause moneyClause = new MoneyClause(freelancerInvoiceItemPayload.f73396g, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        double d = freelancerInvoiceItemPayload.d;
        if (d > 1.0d) {
            compositeClauseM = yoj.b.m(new TextClause(" x ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(String.valueOf((int) d), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(freelancerInvoiceItemPayload.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)));
        }
        return new RowDelegate.Model(strN, textImage, null, null, textClause2, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(moneyClause, compositeClauseM, null, false, 124), false, false, null, null, null, null, null, freelancerInvoiceItemPayload, null, 0, 0, 0, 0, 1056962412);
    }
}
