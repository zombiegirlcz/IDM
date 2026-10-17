package knk;

import aw0.n6;
import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutAsset;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Subtitle;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$TextStyle;
import ggk.h0;
import ggk.i0;
import ggk.l0;
import ggk.y0;
import ip0.qe0;
import ip0.re0;
import ip0.ue0;
import ip0.ve0;
import ip0.we0;
import java.util.List;
import kkf.b4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dnk.a f186190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dok.i f186191b;

    public o(mmk.e loadingStateMapper, dnk.a benefitCategoriesMapper, dok.i navigationItemMapper, com.revolut.retail.feature.pricing_plans.ui.impl.footer.e footerMapper) {
        Intrinsics.checkNotNullParameter(loadingStateMapper, "loadingStateMapper");
        Intrinsics.checkNotNullParameter(benefitCategoriesMapper, "benefitCategoriesMapper");
        Intrinsics.checkNotNullParameter(navigationItemMapper, "navigationItemMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f186190a = benefitCategoriesMapper;
        this.f186191b = navigationItemMapper;
    }

    public static n6 a(PlansDashboardLayout$Button plansDashboardLayout$Button, String str) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton;
        TextClause textClause = new TextClause(plansDashboardLayout$Button.f102734c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        h0 h0Var = plansDashboardLayout$Button.f102732a;
        int i = h0Var == null ? -1 : n.f186189b[h0Var.ordinal()];
        if (i == -1) {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        } else if (i == 1) {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        }
        return new n6(textClause, defaultFilledButton, null, str, false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 0;
        g gVar = (g) iii.c.f(domainState.f186174a, new knd.a(13), new b4(26), new Function3(this) { // from class: knk.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f186187b;

            {
                this.f186187b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                l0 l0Var;
                PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle;
                PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle;
                PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle2;
                PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle2;
                we0 we0Var;
                PlanPageLayoutAsset planPageLayoutAsset;
                ve0 qe0Var;
                switch (i) {
                    case 0:
                        ggk.f layout = (ggk.f) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(layout, "layout");
                        y0 y0Var = layout.d;
                        NavBarMenuItem navBarMenuItemA = null;
                        String str = y0Var != null ? y0Var.f143801a : null;
                        if (str == null) {
                            str = "";
                        }
                        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str2 = (y0Var == null || (plansDashboardLayout$PlanPageLayout$Subtitle2 = y0Var.f143803c) == null || (plansDashboardLayout$PlanPageLayout$TextStyle2 = plansDashboardLayout$PlanPageLayout$Subtitle2.f102785a) == null) ? null : plansDashboardLayout$PlanPageLayout$TextStyle2.f102788a;
                        TextClause textClause2 = new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str3 = (y0Var == null || (plansDashboardLayout$PlanPageLayout$Subtitle = y0Var.f143803c) == null || (plansDashboardLayout$PlanPageLayout$TextStyle = plansDashboardLayout$PlanPageLayout$Subtitle.f102786b) == null) ? null : plansDashboardLayout$PlanPageLayout$TextStyle.f102788a;
                        TextClause textClause3 = new TextClause(str3 == null ? "" : str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        i0 i0Var = layout.f143712b;
                        if (i0Var != null && (l0Var = i0Var.f143729a) != null) {
                            navBarMenuItemA = this.f186187b.f186191b.a(l0Var);
                        }
                        return new g(textClause2, textClause3, textClause, navBarMenuItemA);
                    default:
                        Pair pair = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        ggk.f fVar = (ggk.f) pair.f186385a;
                        y0 y0Var2 = fVar.d;
                        if (y0Var2 == null || (planPageLayoutAsset = y0Var2.e) == null) {
                            we0Var = null;
                        } else {
                            int i2 = n.f186188a[planPageLayoutAsset.f102709b.ordinal()];
                            if (i2 == 1) {
                                qe0Var = new qe0(-2, new UrlImage(planPageLayoutAsset.f102708a, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774));
                            } else {
                                if (i2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                qe0Var = new ue0(new UrlVideo(planPageLayoutAsset.f102708a, (String) null, false, oz0.b.FIT, false, oz0.c.ENABLED, 50), new re0(812, 1250));
                            }
                            we0Var = new we0("plan_video_header", qe0Var);
                        }
                        return d0.E0(this.f186187b.f186190a.a(fVar.f143714g), v.l(we0Var));
                }
            }
        });
        Data data = domainState.f186174a;
        final int i2 = 1;
        return new i(gVar, (List) iii.c.f(t1.t(data, domainState.f186175b), new knd.a(this, 15), new b4(28), new Function3(this) { // from class: knk.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f186187b;

            {
                this.f186187b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                l0 l0Var;
                PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle;
                PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle;
                PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle2;
                PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle2;
                we0 we0Var;
                PlanPageLayoutAsset planPageLayoutAsset;
                ve0 qe0Var;
                switch (i2) {
                    case 0:
                        ggk.f layout = (ggk.f) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(layout, "layout");
                        y0 y0Var = layout.d;
                        NavBarMenuItem navBarMenuItemA = null;
                        String str = y0Var != null ? y0Var.f143801a : null;
                        if (str == null) {
                            str = "";
                        }
                        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str2 = (y0Var == null || (plansDashboardLayout$PlanPageLayout$Subtitle2 = y0Var.f143803c) == null || (plansDashboardLayout$PlanPageLayout$TextStyle2 = plansDashboardLayout$PlanPageLayout$Subtitle2.f102785a) == null) ? null : plansDashboardLayout$PlanPageLayout$TextStyle2.f102788a;
                        TextClause textClause2 = new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str3 = (y0Var == null || (plansDashboardLayout$PlanPageLayout$Subtitle = y0Var.f143803c) == null || (plansDashboardLayout$PlanPageLayout$TextStyle = plansDashboardLayout$PlanPageLayout$Subtitle.f102786b) == null) ? null : plansDashboardLayout$PlanPageLayout$TextStyle.f102788a;
                        TextClause textClause3 = new TextClause(str3 == null ? "" : str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        i0 i0Var = layout.f143712b;
                        if (i0Var != null && (l0Var = i0Var.f143729a) != null) {
                            navBarMenuItemA = this.f186187b.f186191b.a(l0Var);
                        }
                        return new g(textClause2, textClause3, textClause, navBarMenuItemA);
                    default:
                        Pair pair = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        ggk.f fVar = (ggk.f) pair.f186385a;
                        y0 y0Var2 = fVar.d;
                        if (y0Var2 == null || (planPageLayoutAsset = y0Var2.e) == null) {
                            we0Var = null;
                        } else {
                            int i22 = n.f186188a[planPageLayoutAsset.f102709b.ordinal()];
                            if (i22 == 1) {
                                qe0Var = new qe0(-2, new UrlImage(planPageLayoutAsset.f102708a, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774));
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                qe0Var = new ue0(new UrlVideo(planPageLayoutAsset.f102708a, (String) null, false, oz0.b.FIT, false, oz0.c.ENABLED, 50), new re0(812, 1250));
                            }
                            we0Var = new we0("plan_video_header", qe0Var);
                        }
                        return d0.E0(this.f186187b.f186190a.a(fVar.f143714g), v.l(we0Var));
                }
            }
        }), (aw0.i) iii.c.f(data, new knd.a(14), new b4(27), new joa.j(this, domainState, 28)));
    }
}
