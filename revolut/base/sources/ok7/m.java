package ok7;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.api.models.details.CFACDocument;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.impl.R$string;
import ip0.xc;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ArrayList b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            CFACDocument cFACDocument = (CFACDocument) obj2;
            arrayList.add(new RowDelegate.Model(a0.d.n("ID_DOCUMENT_PREFIX_", i), new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, Float.valueOf(40.0f), null, 32), null, null, false, null, false, 62), new TextClause(cFACDocument.f74983a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, cFACDocument, null, 0, 0, 0, 0, 532673528));
            i = i2;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List listC;
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f225921c;
        CFACProductDetails cFACProductDetails = domainState.f225919a;
        if (z) {
            listC = v.k(new xc("ID_DOC_PROOF_TAB", b(cFACProductDetails.e.e), 0, null, null, 0, 0, 0, 1020), new xc("ID_NO_PROOF_TAB", b(cFACProductDetails.f.e), 0, null, null, 0, 0, 0, 1020));
        } else {
            String str = domainState.f225920b;
            listC = u.c(new xc(str, b(Intrinsics.f(str, "ID_DOC_PROOF_TAB") ? cFACProductDetails.e.e : cFACProductDetails.f.e), 0, null, null, 0, 0, 0, 1020));
        }
        List list = listC;
        List listK = v.k(new FixedTabs.Item("ID_DOC_PROOF_TAB", new TextLocalisedClause(R$string.cfac_policy_details_limits_group_title, u.c(new PercentageClause(new BigDecimal(cFACProductDetails.e.f75007a), (PercentageClause.Format) null, (Style) null, 6)), null, 12), (AnalyticsContext) null, 12), new FixedTabs.Item("ID_NO_PROOF_TAB", new TextLocalisedClause(R$string.cfac_policy_details_limits_group_title, u.c(new PercentageClause(new BigDecimal(cFACProductDetails.f.f75007a), (PercentageClause.Format) null, (Style) null, 6)), null, 12), (AnalyticsContext) null, 12));
        String str2 = domainState.f225920b;
        k.Companion.getClass();
        return new j(((Number) r0.h(domainState.f225920b, g.f225918c)).intValue(), str2, domainState.f225921c, list, listK);
    }
}
