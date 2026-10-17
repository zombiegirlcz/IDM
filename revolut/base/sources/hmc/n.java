package hmc;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.y10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmc.d f153651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f153652b;

    public n(nmc.d roboPortfolioUiMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f153651a = roboPortfolioUiMapper;
        this.f153652b = featureToggleInteractor;
    }

    public static List a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return zhm.u.c(new sa("change-requested-cell", textLocalisedClause, textLocalisedClause2, null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 8080));
    }

    public static List b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return zhm.u.c(new sa("change-requested-cell", (Clause) textLocalisedClause, (Clause) textLocalisedClause2, (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056));
    }
}
