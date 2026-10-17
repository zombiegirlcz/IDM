package bnj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.t1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd.o f17233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f17234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f17235c;

    public l(ynj.m esimInstallationStateResolver, nd.o esimAnalyticsContextResolver, g shareActionItemMapper, gte.a featureToggleInteractor, d detailsActionItemMapper) {
        Intrinsics.checkNotNullParameter(esimInstallationStateResolver, "esimInstallationStateResolver");
        Intrinsics.checkNotNullParameter(esimAnalyticsContextResolver, "esimAnalyticsContextResolver");
        Intrinsics.checkNotNullParameter(shareActionItemMapper, "shareActionItemMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(detailsActionItemMapper, "detailsActionItemMapper");
        this.f17233a = esimAnalyticsContextResolver;
        this.f17234b = featureToggleInteractor;
        this.f17235c = detailsActionItemMapper;
    }

    public final ActionsView.Item a(t1 t1Var, dm0.b bVar, List list) {
        if (!ynj.m.b(t1Var, bVar, list)) {
            return null;
        }
        return new ActionsView.Item("ID_SUBSCRIPTION_DETAILS_ESIM_INSTALL", null, false, null, null, new TextLocalisedClause(R$string.esim_mobile_plan_installation_banner_cta, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, t1Var.e, this.f17233a.j(t1Var, list), 8094);
    }
}
