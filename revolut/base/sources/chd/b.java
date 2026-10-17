package chd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a f24194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f24195x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z, com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f24194w = aVar;
        this.f24195x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f24194w, this.f24195x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r0.g(r7, r3, r1, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r0.a(r7, r1, r6) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a r0 = r6.f24194w
            com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreenContract$InputData r1 = r0.o
            l3d.r r0 = r0.f86934p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L1f
            if (r3 == r5) goto L1b
            if (r3 != r4) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            yhm.o.b(r7)
            goto L57
        L1f:
            yhm.o.b(r7)
            boolean r7 = r6.v
            java.lang.Object r3 = r6.f24195x
            if (r7 == 0) goto L39
            com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist r3 = (com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist) r3
            java.lang.String r7 = r3.f86895a
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r3 = r1.f86932b
            kotlin.Pair r1 = r1.f86931a
            r6.u = r5
            java.lang.Object r7 = r0.g(r7, r3, r1, r6)
            if (r7 != r2) goto L57
            goto L56
        L39:
            com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist r3 = (com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist) r3
            java.lang.String r7 = r3.f86895a
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r3 = r1.f86932b
            kotlin.Pair r1 = r1.f86931a
            java.util.List r1 = zhm.u.c(r1)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r3, r1)
            java.util.Map r1 = zhm.q0.c(r5)
            r6.u = r4
            java.lang.Object r7 = r0.a(r7, r1, r6)
            if (r7 != r2) goto L57
        L56:
            return r2
        L57:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: chd.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
