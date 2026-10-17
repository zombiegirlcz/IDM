package tij;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f271545a;

    public e(k esimRemoteBannerBuilder, w esimUnfreezeBannerBuilder, u esimTransferBannerBuilder, vnj.a esimAnalyticsContextBuilder) {
        Intrinsics.checkNotNullParameter(esimRemoteBannerBuilder, "esimRemoteBannerBuilder");
        Intrinsics.checkNotNullParameter(esimUnfreezeBannerBuilder, "esimUnfreezeBannerBuilder");
        Intrinsics.checkNotNullParameter(esimTransferBannerBuilder, "esimTransferBannerBuilder");
        Intrinsics.checkNotNullParameter(esimAnalyticsContextBuilder, "esimAnalyticsContextBuilder");
        this.f271545a = esimRemoteBannerBuilder;
    }

    public static com.revolut.core.ui_kit.delegates.i a(boolean z) {
        return new com.revolut.core.ui_kit.delegates.i(8, new TextLocalisedClause(R$string.esim_installation_banner_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z);
    }

    public static TextLocalisedClause b(l71.d dVar) {
        return d.f271544a[dVar.a().ordinal()] == 1 ? new TextLocalisedClause(R$string.esim_installation_banner_manual_install_subtitle_mx, null, null, 14) : new TextLocalisedClause(R$string.esim_installation_banner_subtitle, null, null, 14);
    }
}
