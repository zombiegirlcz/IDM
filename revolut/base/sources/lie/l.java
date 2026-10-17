package lie;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wxl.a f195496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f195497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b70.e f195498c;
    public final j30.c d;

    public l(wxl.a nudgeInteractor, l80.e dateProvider, b70.e accessibilityDataProvider, j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(nudgeInteractor, "nudgeInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(accessibilityDataProvider, "accessibilityDataProvider");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f195496a = nudgeInteractor;
        this.f195497b = dateProvider;
        this.f195498c = accessibilityDataProvider;
        this.d = chatFeatureToggles;
    }
}
