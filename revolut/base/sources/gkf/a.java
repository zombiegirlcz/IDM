package gkf;

import klf.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f144375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f144376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0a.a f144377c;

    public a(z2 subscriptionDataSource, gte.a featureToggleInteractor, v0a.a recurringSplitInteractor) {
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(recurringSplitInteractor, "recurringSplitInteractor");
        this.f144375a = subscriptionDataSource;
        this.f144376b = featureToggleInteractor;
        this.f144377c = recurringSplitInteractor;
    }
}
