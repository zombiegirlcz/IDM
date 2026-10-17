package avk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nel.n f10082w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, nel.n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = h0Var;
        this.f10082w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.v, this.f10082w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r3.b3(r10, r2, r9) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r3.f3(r10, r2, r9) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r3.Z2(r10, r2) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        return r4;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            nel.n r0 = r9.f10082w
            xi0.b r1 = r0.i
            java.lang.String r0 = r0.f214596b
            avk.h0 r2 = r9.v
            u1d.a r3 = r2.D
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r9.u
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L27
            if (r5 == r8) goto L22
            if (r5 == r7) goto L22
            if (r5 != r6) goto L1a
            goto L22
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            yhm.o.b(r10)
            goto L99
        L27:
            yhm.o.b(r10)
            gte.a r10 = r2.f10089s
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$MultipleWatchlists r5 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.MultipleWatchlists.f95167c
            jte.d r10 = (jte.d) r10
            boolean r10 = r10.c(r5)
            if (r10 == 0) goto L4d
            y1d.a r10 = y1d.b.Companion
            r10.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r10 = y1d.a.i
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = r1.f306286a
            r2.<init>(r0, r1)
            r9.u = r8
            java.lang.Object r10 = r3.b3(r10, r2, r9)
            if (r10 != r4) goto L99
            goto L98
        L4d:
            cli.y r10 = r2.G
            java.lang.Object r10 = r10.f22677a
            vkm.j2 r10 = (vkm.j2) r10
            java.lang.Object r10 = r10.getValue()
            avk.m r10 = (avk.m) r10
            com.revolut.data.model.Data r10 = r10.f10110m
            if (r10 == 0) goto L9c
            java.lang.Object r10 = r10.getContent()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L9c
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L82
            y1d.a r10 = y1d.b.Companion
            r10.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r10 = y1d.a.i
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = r1.f306286a
            r2.<init>(r0, r1)
            r9.u = r7
            java.lang.Object r10 = r3.f3(r10, r2, r9)
            if (r10 != r4) goto L99
            goto L98
        L82:
            y1d.a r10 = y1d.b.Companion
            r10.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r10 = y1d.a.i
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = r1.f306286a
            r2.<init>(r0, r1)
            r9.u = r6
            kotlin.Unit r10 = r3.Z2(r10, r2)
            if (r10 != r4) goto L99
        L98:
            return r4
        L99:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L9c:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: avk.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
