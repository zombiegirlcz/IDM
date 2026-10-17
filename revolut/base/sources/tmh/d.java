package tmh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f272224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f272225b;

    public d(q1 wealthDisclaimersMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f272224a = wealthDisclaimersMapper;
        this.f272225b = featureToggleInteractor;
    }
}
