package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ReferralStatusDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import dx4.b4;
import dx4.d4;
import ip0.fa0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {
    public static List a(dx4.r0 item) {
        boolean z;
        Clause textClause;
        Clause textClause2;
        Intrinsics.checkNotNullParameter(item, "item");
        List list = item.e;
        String str = item.f120737c;
        b4 b4Var = item.d;
        String str2 = item.f120735a;
        dx4.n0 n0Var = item.i;
        dx4.j1 j1Var = item.f120738g;
        dx4.a1 a1Var = item.f;
        if (list.isEmpty()) {
            String str3 = item.f120735a;
            RowDelegate.Model.MainImage.Image40 image40 = a1Var != null ? new RowDelegate.Model.MainImage.Image40(a1Var.d(), j1Var != null ? d9.t0.p(j1Var) : null, null, false, null, false, 60) : null;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_cell_title, zhm.u.c(new TextClause(item.f120736b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), n0Var != null ? b(n0Var) : null, 8);
            tf tfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
            if (b4Var != null) {
                Intrinsics.checkNotNullParameter(b4Var, "<this>");
                textClause2 = new CompositeClause(d4.a(b4Var), null, null, null, 14);
            } else {
                textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            }
            return zhm.u.c(new RowDelegate.Model(str3, image40, textLocalisedClause, null, 0, textClause2, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, item.f120739h, new AnalyticsContext(zw4.a.a(str2)), 0, 0, 0, 0, 524286936));
        }
        String str4 = item.f120736b;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_constructor_cell_title, zhm.u.c(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), n0Var != null ? b(n0Var) : null, 8);
        if (b4Var != null) {
            Intrinsics.checkNotNullParameter(b4Var, "<this>");
            textClause = new CompositeClause(d4.a(b4Var), null, null, null, 14);
            z = false;
        } else if (str != null) {
            z = false;
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            z = false;
            textClause = null;
        }
        GlyphImage glyphImageD = a1Var != null ? a1Var.d() : null;
        CircleBadgeModel circleBadgeModelP = j1Var != null ? d9.t0.p(j1Var) : null;
        List<dx4.q0> list2 = item.e;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (dx4.q0 q0Var : list2) {
            arrayList.add(new fa0(new TextClause(q0Var.f120724a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), q0Var.f120725b == dx4.p0.SUCCESS ? true : z));
        }
        return zhm.u.c(new ReferralStatusDelegate.Model(str4, glyphImageD, textLocalisedClause2, textClause, circleBadgeModelP, arrayList, item, new AnalyticsContext(zw4.a.a(str2))));
    }

    public static Custom b(dx4.n0 n0Var) {
        if (o.f210187a[n0Var.ordinal()] == 1) {
            return new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254);
        }
        throw new NoWhenBranchMatchedException();
    }
}
