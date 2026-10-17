package o9f;

import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f223263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f223264b;

    public f(k tradingAccountsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f223263a = tradingAccountsInteractor;
        this.f223264b = featureToggleInteractor;
    }
}
