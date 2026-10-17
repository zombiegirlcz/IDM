package e0i;

import kotlin.jvm.internal.Intrinsics;
import tga.k;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f121721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f121722b;

    public d(k upgradeEntryPointItemProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f121721a = upgradeEntryPointItemProvider;
        this.f121722b = featureToggleInteractor;
    }
}
