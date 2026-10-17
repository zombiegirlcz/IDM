package aoa;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f7940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f7942c;
    public final k d;
    public final AnimationRequest e;

    public e(f cellTextMapper, b actionsMapper, gte.a featureToggleInteractor, k planWidgetV3DesignResolver, AnimationRequest glowAnimationRequest) {
        Intrinsics.checkNotNullParameter(cellTextMapper, "cellTextMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(planWidgetV3DesignResolver, "planWidgetV3DesignResolver");
        Intrinsics.checkNotNullParameter(glowAnimationRequest, "glowAnimationRequest");
        this.f7940a = cellTextMapper;
        this.f7941b = actionsMapper;
        this.f7942c = featureToggleInteractor;
        this.d = planWidgetV3DesignResolver;
        this.e = glowAnimationRequest;
    }

    public static UrlVideo a(String str) {
        return new UrlVideo(str, (String) null, false, oz0.b.CENTER_CROP, false, oz0.c.ENABLED, 50);
    }
}
