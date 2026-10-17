package ad0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class z implements w {

    @NotNull
    private static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9l.i f3232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rxc.e f3233b;

    public z(z9l.i progressionStepsMapper, rxc.e progressionRevampToggleProvider) {
        Intrinsics.checkNotNullParameter(progressionStepsMapper, "progressionStepsMapper");
        Intrinsics.checkNotNullParameter(progressionRevampToggleProvider, "progressionRevampToggleProvider");
        this.f3232a = progressionStepsMapper;
        this.f3233b = progressionRevampToggleProvider;
    }
}
