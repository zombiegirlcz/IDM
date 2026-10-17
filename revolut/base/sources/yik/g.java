package yik;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.PlanBadge;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import hha.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f314340a;

    public g(f appearanceMapper) {
        Intrinsics.checkNotNullParameter(appearanceMapper, "appearanceMapper");
        this.f314340a = appearanceMapper;
    }

    public final LayeredImage a(w0 w0Var) {
        PlanBadge planBadgeB;
        if (w0Var == null || (planBadgeB = f.b(w0Var)) == null) {
            return null;
        }
        return LayeredImage.Companion.g(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_logo_revolut, null, new Color.SolidInt(-16777216), new Color.Solid(planBadgeB.f58058b), Integer.valueOf(planBadgeB.f58057a), 4.0f, BitmapDescriptorFactory.HUE_RED, null, 450);
    }

    public final AvatarModel.BadgeModel b(w0 w0Var) {
        PlanBadge planBadgeB;
        if (w0Var == null || (planBadgeB = f.b(w0Var)) == null) {
            return null;
        }
        return new AvatarModel.BadgeModel(planBadgeB, com.revolut.core.ui_kit.models.avatar.b.BOTTOM);
    }

    public final AvatarModel.Border.StaticGradient c(w0 planTier) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        UiKitGradient uiKitGradientA = f.a(planTier);
        if (uiKitGradientA == null) {
            return null;
        }
        return new AvatarModel.Border.StaticGradient(uiKitGradientA, com.revolut.core.ui_kit.models.avatar.c.OVAL);
    }

    public final StylableContactImage$Style d(w0 planTier) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        this.f314340a.getClass();
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        switch (e.f314339a[planTier.ordinal()]) {
            case 1:
                numValueOf = Integer.valueOf(R$attr.uikit_colorBlack);
                break;
            case 2:
                numValueOf = Integer.valueOf(R$attr.uikit_colorBlack);
                break;
            case 3:
                numValueOf = Integer.valueOf(R$attr.uikit_colorPlanMetalDark);
                break;
            case 4:
                numValueOf = Integer.valueOf(R$attr.uikit_colorPlanPremiumDark);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                numValueOf = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (numValueOf != null) {
            return new StylableContactImage$Style(numValueOf.intValue(), R$attr.uikit_colorWhite);
        }
        return null;
    }

    public final TagViewData e(w0 planTier) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        UiKitGradient uiKitGradientA = f.a(planTier);
        if (uiKitGradientA == null) {
            return null;
        }
        return new TagViewData(null, dok.g.e(planTier, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254)), new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorBlack)), null, new TagViewData.TagOutline.Gradient(uiKitGradientA), false, null, null, null, 0, null, 2024);
    }
}
