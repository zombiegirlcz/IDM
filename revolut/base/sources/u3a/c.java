package u3a;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3j.b f276835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sz5.f f276836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uw1.c f276837c;
    public final gte.a d;

    public c(d3j.b beneficiaryInteractor, sz5.f recipientFilterInteractor, uw1.c apmFeatureChecker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(recipientFilterInteractor, "recipientFilterInteractor");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f276835a = beneficiaryInteractor;
        this.f276836b = recipientFilterInteractor;
        this.f276837c = apmFeatureChecker;
        this.d = featureToggleInteractor;
    }
}
