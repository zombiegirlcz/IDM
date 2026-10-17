package jsd;

import kotlin.jvm.internal.Intrinsics;
import ppk.f;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f178169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f178170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final twg.c f178171c;

    public a(n walletInteractor, f ratesInteractor, c personalNetWorthProductMapper, twg.c totalWealthPocketsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(personalNetWorthProductMapper, "personalNetWorthProductMapper");
        Intrinsics.checkNotNullParameter(totalWealthPocketsInteractor, "totalWealthPocketsInteractor");
        this.f178169a = walletInteractor;
        this.f178170b = ratesInteractor;
        this.f178171c = totalWealthPocketsInteractor;
    }
}
