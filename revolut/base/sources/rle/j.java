package rle;

import kotlin.jvm.internal.Intrinsics;
import tzg.m;
import ybl.l;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f255035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f255036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f255037c;

    public j(m wealthAccountsInteractor, gte.a featureToggleInteractor, l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f255035a = wealthAccountsInteractor;
        this.f255036b = featureToggleInteractor;
        this.f255037c = tradingConfigInteractor;
    }
}
