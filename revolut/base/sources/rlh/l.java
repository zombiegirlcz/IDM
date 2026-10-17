package rlh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tlh.b f255064a;

    public l(a annualReturnMapper, nbh.a instrumentImageProvider, tlh.b etfImageProvider) {
        Intrinsics.checkNotNullParameter(annualReturnMapper, "annualReturnMapper");
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(etfImageProvider, "etfImageProvider");
        this.f255064a = etfImageProvider;
    }

    public static RowDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, c0 c0Var) {
        RowDelegate.Model model = new RowDelegate.Model(str, null, textLocalisedClause, null, 0, null, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, c0Var, null, 0, 0, 0, 0, 532675578);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
