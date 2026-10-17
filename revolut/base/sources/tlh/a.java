package tlh;

import kotlin.jvm.internal.Intrinsics;
import tzg.m;
import ybl.k;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f272099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f272100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f272101c;

    public a(m wealthAccountsInteractor, k tradingAccountsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f272099a = wealthAccountsInteractor;
        this.f272100b = tradingAccountsInteractor;
        this.f272101c = featureToggleInteractor;
    }
}
