package oj9;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.SquareTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public final BannerDelegate.Model a(ai9.c configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        BannerDelegate.Model model = new BannerDelegate.Model("banner_id", new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c(configuration.f5217a, new ImageTransformations(null, SquareTransformation.f60074a, new CustomColors(2, new Color.Solid(R$attr.uikit_colorGreyTone5), null), null, 11, null, null, 105), null, "mobile/3d_images/v2", 20)), configuration.f5218b, configuration.f5219c, false, true, configuration.e, null, null, null, null, 65424);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
