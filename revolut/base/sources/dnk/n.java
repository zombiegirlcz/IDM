package dnk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Subtitle;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$TextStyle;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Tooltip;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import prk.o;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f116367a = w.y0(new dmj.b(4));

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final UrlImage a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, (ImageTransformations) f116367a.getValue(), null, null, false, false, 507902);
    }

    public static final Clause b(PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle, l iconMapper) {
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        if (plansDashboardLayout$PlanPageLayout$Subtitle == null) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip = plansDashboardLayout$PlanPageLayout$Subtitle.f102787c;
        ImageClause imageClause = plansDashboardLayout$PlanPageLayout$Tooltip != null ? new ImageClause(iconMapper.a(plansDashboardLayout$PlanPageLayout$Tooltip.f102790a), new ImageClauseTint.Color(R$attr.uikit_colorForeground), fValueOf, fValueOf, 16) : null;
        aim.e eVarB = u.b();
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle = plansDashboardLayout$PlanPageLayout$Subtitle.f102785a;
        if (plansDashboardLayout$PlanPageLayout$TextStyle != null) {
            eVarB.add(c(plansDashboardLayout$PlanPageLayout$TextStyle));
        }
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle2 = plansDashboardLayout$PlanPageLayout$Subtitle.f102786b;
        if (plansDashboardLayout$PlanPageLayout$TextStyle2 != null) {
            eVarB.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            eVarB.add(c(plansDashboardLayout$PlanPageLayout$TextStyle2));
        }
        if (imageClause != null) {
            eVarB.add(new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            eVarB.add(imageClause);
        }
        return new CompositeClause(u.a(eVarB), null, null, null, 14);
    }

    public static final CompositeClause c(PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle) {
        Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$TextStyle, "<this>");
        String text = plansDashboardLayout$PlanPageLayout$TextStyle.f102788a;
        Intrinsics.checkNotNullParameter(text, "text");
        return new CompositeClause(o.v(0, 28, null, null, text), null, Intrinsics.f(plansDashboardLayout$PlanPageLayout$TextStyle.f102789b, "dimmed") ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254) : new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 10);
    }
}
