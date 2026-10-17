package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import dx4.v1;
import dx4.w1;
import ip0.qd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static SelectableDelegate.Model a(w1 w1Var, boolean z) {
        RowDelegate.Model.MainImage.Image40 image40;
        String str = w1Var.f120809a;
        boolean z3 = w1Var.f120812g;
        qd0 qd0Var = w1Var.f ? qd0.SELECTED : qd0.UNSELECTED;
        SelectableDelegate.b aVar = z3 ? SelectableDelegate.b.C0424b.f53319a : new SelectableDelegate.b.a(true);
        LayeredImage layeredImageD = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_expandable_checkbox_title, zhm.u.c(new TextClause(w1Var.f120810b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextClause textClause = new TextClause(w1Var.f120811c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        RowDelegate.Model.b bVar = z3 ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
        dx4.a1 a1Var = w1Var.d;
        if (a1Var != null) {
            GlyphImage glyphImageD = a1Var.d();
            dx4.f0 f0Var = w1Var.e;
            if (f0Var != null) {
                int i = R$attr.uikit_colorBlue;
                dx4.d0 d0Var = dx4.f0.Companion;
                int i2 = R$attr.uikit_colorWhite;
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                if (dx4.e0.f120580a[f0Var.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                layeredImageD = companion.d(R$drawable.uikit_icn_16_revolut, i, i2, Integer.valueOf(i2), 2.0f, 2.0f, Float.valueOf(12.0f));
            }
            image40 = new RowDelegate.Model.MainImage.Image40(glyphImageD, layeredImageD, null, false, 28);
        } else {
            image40 = null;
        }
        return new SelectableDelegate.Model(str, new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, textClause, null, null, 0, new tf(4, new ResourceImage(z ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, null, false, bVar, null, null, null, null, null, w1Var, new AnalyticsContext(zw4.a.a(w1Var.f120809a)), 0, 0, 0, 0, 524268504), qd0Var, aVar, null, false, null, null, null, true, 31728);
    }

    public static List b(w1 item, boolean z) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!z) {
            SelectableDelegate.Model header = a(item, false);
            Intrinsics.checkNotNullParameter(header, "header");
            return zhm.u.c(header);
        }
        SelectableDelegate.Model modelA = a(item, true);
        List list = item.f120813h;
        List<v1> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (v1 v1Var : list2) {
            String str = v1Var.f120799a;
            arrayList.add(new CellDetailsDelegate.Model(str, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(v1Var.f120800b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        int size = list.size();
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_BUTTON_SEE_ALL", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.credit_common_see_all, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.l(model, R$attr.uikit_dp16, R$attr.uikit_dp12, 0, 0, null, false, 60);
        return i26.l.d(modelA, arrayList, model, size);
    }
}
