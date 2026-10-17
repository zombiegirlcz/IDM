package tij;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f271569a;

    public r(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f271569a = featureToggleInteractor;
    }

    public static SmallActionButtonDelegate.Model a(Clause clause) {
        SmallActionButtonDelegate.Model model = new SmallActionButtonDelegate.Model("DEVICE_PICKER_ITEM", h4.SEMIACCENT, null, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), clause, null, null, null, null, 0, 0, 0, 0, 32704);
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp16;
        yp0.b.p(model, i, i2, i2, i2);
        return model;
    }
}
