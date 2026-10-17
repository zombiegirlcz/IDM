package i9g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f159845a;

    public x(c availabilityFiltersInteractor, a appliedFiltersProvider) {
        Intrinsics.checkNotNullParameter(availabilityFiltersInteractor, "availabilityFiltersInteractor");
        Intrinsics.checkNotNullParameter(appliedFiltersProvider, "appliedFiltersProvider");
        this.f159845a = availabilityFiltersInteractor;
    }
}
