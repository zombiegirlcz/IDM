package ymh;

import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c1l.e f315001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wxk.c f315002m;

    public g(c1l.e tradingOnboardingStartCommandProvider, wxk.c privateMarketsProductCommsCommandProvider) {
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(privateMarketsProductCommsCommandProvider, "privateMarketsProductCommsCommandProvider");
        this.f315001l = tradingOnboardingStartCommandProvider;
        this.f315002m = privateMarketsProductCommsCommandProvider;
    }
}
