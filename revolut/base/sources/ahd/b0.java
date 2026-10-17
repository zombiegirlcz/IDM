package ahd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gfd.e f4934w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, gfd.e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = c0Var;
        this.f4934w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b0(this.v, this.f4934w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r12.i(r1, r2, r11) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r12 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L15:
            yhm.o.b(r12)
            goto L60
        L19:
            yhm.o.b(r12)
            ahd.c0 r12 = r11.v
            com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreenContract$InputData r1 = r12.o
            java.lang.String r8 = r1.f86929a
            com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext r1 = r1.f86930b
            gfd.e r4 = r11.f4934w
            if (r8 != 0) goto L37
            l3d.h0 r12 = r12.f4940r
            java.lang.String r1 = r1.f86889a
            ogd.k r2 = r4.f143392a
            r11.u = r3
            java.lang.Object r12 = r12.i(r1, r2, r11)
            if (r12 != r0) goto L60
            goto L5f
        L37:
            l3d.r r12 = r12.f4938p
            java.lang.String r9 = r1.f86889a
            ogd.k r7 = r4.f143392a
            r11.u = r2
            a4d.a r12 = r12.f191928a
            r6 = r12
            n4d.m r6 = (n4d.m) r6
            mtj.i r4 = new mtj.i
            r10 = 0
            r5 = 4
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r11)
            if (r12 != r0) goto L56
            goto L58
        L56:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L58:
            if (r12 != r0) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L5d:
            if (r12 != r0) goto L60
        L5f:
            return r0
        L60:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ahd.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
