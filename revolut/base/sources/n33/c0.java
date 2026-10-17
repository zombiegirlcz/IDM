package n33;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.cards_core.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f211693a;

    public c0(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f211693a = featureToggleInteractor;
    }

    public static TextLocalisedClause a(boolean z, boolean z3) {
        return z3 ? new TextLocalisedClause(R$string.card_order_physical_debit_subtitle, null, null, 14) : z ? new TextLocalisedClause(R$string.card_order_physical_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_order_debit_physical_card_description, null, null, 14);
    }

    public static pc b() {
        return e(new TextLocalisedClause(R$string.card_design_tag_limit_reached, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), "card-limit-reached-tag");
    }

    public static pc c(wi0.b bVar) {
        return e(new TextLocalisedClause(com.bumptech.glide.d.x(bVar) ? R$string.card_tag_complimentary_delivery : R$string.card_tag_free_delivery, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_present, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), "free-delivery-tag");
    }

    public static RowDelegate.Model d(c0 c0Var, String str, TextLocalisedClause textLocalisedClause, Clause clause, List list, e13.a aVar, SelectedTab selectedTab, AnalyticsContext analyticsContext, Object obj2, h93.l0 l0Var, int i) {
        int i2;
        int i3;
        AnalyticsContext analyticsContext2 = (i & 64) != 0 ? null : analyticsContext;
        Object obj3 = (i & 128) != 0 ? null : obj2;
        h93.l0 l0Var2 = (i & 256) != 0 ? null : l0Var;
        c0Var.getClass();
        int i5 = R$drawable.uikit_icn_rounded_background;
        switch (b0.f211689b[selectedTab.ordinal()]) {
            case 1:
                i2 = l0Var2 != h93.l0.BRAZIL_LOCAL ? R$attr.uikit_colorColdBlue : R$attr.uikit_colorTeal;
                break;
            case 2:
                i2 = R$attr.uikit_colorPurple;
                break;
            case 3:
            case 4:
                i2 = R$attr.uikit_colorTeal;
                break;
            case 5:
                i2 = R$attr.uikit_colorGrey50;
                break;
            case 6:
                i2 = R$attr.uikit_colorPink;
                break;
            case 7:
                i2 = R$attr.uikit_colorDeepGrey;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        LayeredImage.Layer.Drawable drawable = new LayeredImage.Layer.Drawable(i5, Integer.valueOf(i2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124);
        int i6 = b0.f211688a[aVar.ordinal()];
        if (i6 == 1) {
            i3 = selectedTab == SelectedTab.CREDIT ? R$drawable.uikit_icn_24_credit_card : R$drawable.uikit_icn_24_card;
        } else if (i6 == 2) {
            i3 = R$drawable.uikit_icn_24_smartphone;
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = R$drawable.uikit_icn_24_all_time;
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new LayeredImage(zhm.v.k(drawable, new LayeredImage.Layer.Drawable(i3, Integer.valueOf(R$attr.uikit_colorWhite), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), null, null, false, null, false, 62);
        int i21 = R$attr.uikit_dp12;
        return new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, clause, null, null, 0, null, false, null, false, null, list, null, null, null, null, obj3, analyticsContext2, i21, i21, 0, 0, 473923544);
    }

    public static pc e(TextLocalisedClause textLocalisedClause, ResourceImage resourceImage, String str) {
        return new pc(str, new TagViewData(resourceImage, textLocalisedClause, new Color.Solid(R$attr.uikit_colorWidgetBackground), R$attr.uikit_colorTransparent, null, 1000), null);
    }

    public static boolean g(do3.n nVar) {
        wi0.b.Companion.getClass();
        return te0.w.S(nVar, wi0.b.M0);
    }

    public final RowDelegate.Model f(String id10, em4.a model) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        return d(this, id10, model.f127604c, c8g.c.p(model.d), model.f127605g, e13.a.PHYSICAL, SelectedTab.CREDIT, new AnalyticsContext(model.e), model.f127606h, null, 256);
    }
}
