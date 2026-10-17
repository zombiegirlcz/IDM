package ff1;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import ip0.zj;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements p {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf1.g f134698a;

    public l(hf1.g taxRateFormatter) {
        Intrinsics.checkNotNullParameter(taxRateFormatter, "taxRateFormatter");
        this.f134698a = taxRateFormatter;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // jki.p
    public final m a(jki.i iVar) {
        List list;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list2 = domainState.f134692a;
        if (list2.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_TAX_RATES_ID", new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_tax_rates_states_no_tax_rates_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_tax_rates_states_no_tax_rates_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_tax_rates_states_no_tax_rates_action, null, null, 14), false, null, null, false, 0, 0, 31680));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            list = listC;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ListSubheaderDelegate.Model("TAX_RATES_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_tax_rates_states_some_tax_rates_sections_tax_rates_title, u.c(Integer.valueOf(list2.size())), null, 12), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.product_catalogue_flow_tax_rates_tax_rates_states_some_tax_rates_sections_tax_rates_action, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
            List<TaxRate> list3 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (TaxRate taxRate : list3) {
                String str = taxRate.f60694a;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_percent, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62);
                TextClause textClause = new TextClause(taxRate.f60696c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                hf1.g gVar = this.f134698a;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(taxRate, "taxRate");
                String str2 = ((DecimalFormat) gVar.f151741a.getValue()).format(taxRate.e);
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                arrayList2.add(new RowDelegate.Model(str, image40, textClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TextClause(str2 + "%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), false, null, false, null, null, null, null, null, null, taxRate, null, 0, 0, 0, 0, 532675576));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            a0.x(arrayList2, arrayList);
            list = arrayList;
        }
        return new i(list);
    }
}
