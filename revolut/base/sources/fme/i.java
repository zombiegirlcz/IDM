package fme;

import aw0.o9;
import aw0.s8;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements f {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f136382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yik.h f136383b;

    public i(b lifestyleHomeActionItemsProvider, yik.h pricingPlanStringMapper, kla.a productIntroToggleResolver) {
        Intrinsics.checkNotNullParameter(lifestyleHomeActionItemsProvider, "lifestyleHomeActionItemsProvider");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(productIntroToggleResolver, "productIntroToggleResolver");
        this.f136382a = lifestyleHomeActionItemsProvider;
        this.f136383b = pricingPlanStringMapper;
    }

    public static tx0.g a(ChosenBackground chosenBackground, ld6.b bVar) {
        NavBarWithContainerBackground navBarWithContainerBackground;
        m70.a.c(t0.f186434a);
        return new tx0.g(new NavBarCenterViewModel((NavBarCenterViewModel.MainText) new NavBarCenterViewModel.MainText.Static(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), NavBarCenterViewModel.MainTextStyle.Default.f57862a), (Clause) null, (NavBarCenterViewModel.Subtitle) null, (NavBarCenterViewModel.Button) null, false, false, false, false, (Image) null, (NavBarCenterViewModel.MainTextEndIcon) null, (AnalyticsContext) null, 4092), f0.f322471a, (chosenBackground == null || (navBarWithContainerBackground = chosenBackground.f63742b) == null) ? new NavBarWithContainerBackground.VideoBackground(new UrlVideo("https://assets.revolut.com/mobile/media_library/v5/wallpaper_videos/full_video_tall/bg190.mp4", (String) null, false, oz0.b.FIXED_WIDTH, true, (oz0.c) null, 66), new CdnImage("bg190", "mobile/media_library/v5/wallpaper_videos/thumbnail", null, null, null, null, Constants.TAG_FC_SPEED_MODE), (VideoShutter) null, (s8) null, 28) : navBarWithContainerBackground, bVar != null ? bVar.c() : null, null, 3537);
    }
}
