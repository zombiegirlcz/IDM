package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import dx4.b3;
import dx4.n3;
import dx4.p3;
import ip0.yt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y {
    public static RowDelegate.Model.MainImage.Image40 a() {
        return new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_document, null, null, 6), null, null, false, null, false, 62);
    }

    public static tf b(boolean z) {
        return z ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreen), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
    }

    public final List c(b3 item) {
        RowDelegate.Model.MainImage.Image24 image24;
        Intrinsics.checkNotNullParameter(item, "item");
        dx4.c1 c1Var = item.f120557b;
        String str = item.d;
        String str2 = item.f120556a;
        Image imageT1 = c1Var != null ? c1Var.T1() : null;
        if (item.f120558c == null) {
            List listC = zhm.u.c(new ListCellDelegate.Model("id_inlined_consent_item".concat(str2), imageT1 != null ? new j8(imageT1, yt.TOP) : null, null, str != null ? new HtmlClause(2, 12, (Integer) null, item, str) : null, false, item, new AnalyticsContext(zw4.a.a(str2)), 0, 0, 0, 0, 3908));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        String strConcat = "id_inlined_consent_item".concat(str2);
        if (imageT1 != null) {
            boolean z = false;
            image24 = new RowDelegate.Model.MainImage.Image24(imageT1, z, z, 6);
        } else {
            image24 = null;
        }
        List listC2 = zhm.u.c(new RowDelegate.Model(strConcat, image24, new TextClause(item.f120558c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 0, str != null ? new HtmlClause(0, 14, (Integer) null, item, str) : null, null, null, 50, null, false, null, false, null, null, null, null, null, null, item, new AnalyticsContext(zw4.a.a(str2)), 0, 0, 0, 0, 524285656));
        yp0.b.k(listC2, 0, 0, 0, 0, 31);
        return listC2;
    }

    public final List d(n3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String strQ = j6.a.q("id_nested_agreement_item", item.f120685a);
        RowDelegate.Model.MainImage.Image40 image40A = a();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_offer_agreement_action_title, zhm.u.c(new TextClause(item.f120687c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str = item.e;
        return zhm.u.c(new RowDelegate.Model(strQ, image40A, textLocalisedClause, null, 0, str != null ? new TextLocalisedClause(R$string.credit_application_offer_agreement_action_subtitle, prk.o.v(0, 30, null, null, str), null, 12) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, item, new AnalyticsContext(zw4.a.a(item.f120685a)), 0, 0, 0, 0, 524287960));
    }

    public final List e(p3 item, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        String strQ = j6.a.q("id_nested_consent_item", item.f120711a);
        RowDelegate.Model.MainImage.Image40 image40A = a();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.constructor_template_nested_consent, zhm.u.c(new TextClause(item.f120713c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str = item.e;
        return zhm.u.c(new RowDelegate.Model(strQ, image40A, textLocalisedClause, null, 0, str != null ? new HtmlClause(0, 30, (Integer) null, (Object) null, str) : null, null, null, 0, b(z), false, null, false, null, null, null, null, null, null, item, new AnalyticsContext(zw4.a.a(item.f120711a)), 0, 0, 0, 0, 524286936));
    }
}
