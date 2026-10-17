package ojk;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dnk.l f225835a;

    public p0(dnk.l iconMapper, n0 badgeIconMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(badgeIconMapper, "badgeIconMapper");
        this.f225835a = iconMapper;
    }

    public final CircleBadgeModel a(PlanScreenElementView.Badge badge) {
        String str;
        if (badge == null) {
            return null;
        }
        PlanScreenElementView.Icon icon = badge.f81011a;
        dw0.a aVarA = (icon == null || (str = icon.f81076a) == null) ? null : n0.a(str);
        com.revolut.feature.pricingplans.models.a aVar = badge.f81012b;
        if (aVarA == null || aVar == null) {
            ResourceImage resourceImageB = b(badge);
            if (resourceImageB != null) {
                return new RawImageBadge(resourceImageB);
            }
            return null;
        }
        switch (o0.f225832a[aVar.ordinal()]) {
            case 1:
                return new AccentCircleBadge(aVarA);
            case 2:
                return new SuccessCircleBadge(aVarA);
            case 3:
                return new WarningCircleBadge(aVarA);
            case 4:
                return new DangerCircleBadge(aVarA);
            case 5:
                return new InactiveCircleBadge(aVarA);
            case 6:
                return new WhiteCircleBadge(aVarA);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final ResourceImage b(PlanScreenElementView.Badge badge) {
        PlanScreenElementView.Icon icon;
        String str;
        if (badge == null || (icon = badge.f81011a) == null || (str = icon.f81076a) == null) {
            return null;
        }
        return ResourceImage.a(this.f225835a.c(str), 0, null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorPopoverBackground), false, 4), new CustomColors(new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(R$attr.uikit_colorPopoverBackground)), gz0.b.Center, null, 12, 12, 17), 191);
    }
}
