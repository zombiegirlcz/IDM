package f38;

import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements v1d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f131912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f131913b;

    public b(gte.a featureToggleInteractor, c watchlistContextProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(watchlistContextProvider, "watchlistContextProvider");
        this.f131912a = featureToggleInteractor;
        this.f131913b = watchlistContextProvider;
    }

    @Override // v1d.b
    public final v1d.a a() {
        return ((d) this.f131912a).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c) ? v1d.a.MULTIPLE : v1d.a.SINGLE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // v1d.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof f38.a
            if (r5 == 0) goto L13
            r5 = r6
            f38.a r5 = (f38.a) r5
            int r0 = r5.f131911w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f131911w = r0
            goto L18
        L13:
            f38.a r5 = new f38.a
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f131911w
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            f38.c r6 = r4.f131913b
            akg.n r6 = r6.a()
            ewh.y r1 = new ewh.y
            r3 = 25
            r1.<init>(r3)
            r3 = 0
            jhi.b r6 = mo3.a.g(r6, r3, r1, r2)
            r5.f131911w = r2
            java.lang.Object r6 = vkm.q.z(r6, r5)
            if (r6 != r0) goto L4d
            return r0
        L4d:
            com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext r6 = (com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext) r6
            if (r6 == 0) goto L52
            goto L53
        L52:
            r2 = 0
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f38.b.b(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // v1d.b
    public final CombinedWatchlistContext c() {
        CombinedWatchlistContext combinedWatchlistContext = this.f131913b.e;
        if (combinedWatchlistContext != null) {
            return combinedWatchlistContext;
        }
        throw new IllegalStateException("observeAndInitializeWatchlistContext must be called first");
    }
}
