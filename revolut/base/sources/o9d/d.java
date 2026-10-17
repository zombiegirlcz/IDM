package o9d;

import kotlin.jvm.internal.Intrinsics;
import lde.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f223254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.c f223255b;

    public d(lde.d sharedHelpFeatureToggleInteractor, n sharedHelpWidgetsInteractor, j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(sharedHelpFeatureToggleInteractor, "sharedHelpFeatureToggleInteractor");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f223254a = sharedHelpWidgetsInteractor;
        this.f223255b = chatFeatureToggles;
    }
}
