package njh;

import ael.z;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import nhl.s;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f216525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f216526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ljh.c f216527c;
    public final gte.a d;
    public final Lazy e;
    public final Lazy f;

    public e(z performanceCalculator, b roboItemMapper, ljh.c wealthActionsAccountWidgetMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        Intrinsics.checkNotNullParameter(roboItemMapper, "roboItemMapper");
        Intrinsics.checkNotNullParameter(wealthActionsAccountWidgetMapper, "wealthActionsAccountWidgetMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f216525a = performanceCalculator;
        this.f216526b = roboItemMapper;
        this.f216527c = wealthActionsAccountWidgetMapper;
        this.d = featureToggleInteractor;
        this.e = j.b(new s(28));
        this.f = j.b(new s(29));
    }

    public final Image a() {
        return ((jte.d) this.d).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? (ResourceImage) this.f.getValue() : (Image) this.e.getValue();
    }
}
