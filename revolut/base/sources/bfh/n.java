package bfh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nel.n f14999w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, nel.n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f14999w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f14999w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r3.b3(r10, r2, r9) == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r3.f3(r10, r2, r9) == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (r3.Z2(r10, r2) == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
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
            nel.n r0 = r9.f14999w
            xi0.b r1 = r0.i
            java.lang.String r0 = r0.f214596b
            bfh.o r2 = r9.v
            u1d.a r3 = r2.f15002r
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r9.u
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L26
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
            goto L96
        L26:
            yhm.o.b(r10)
            gte.a r10 = r2.f15000p
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$MultipleWatchlists r5 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.MultipleWatchlists.f95167c
            jte.d r10 = (jte.d) r10
            boolean r10 = r10.c(r5)
            if (r10 == 0) goto L4c
            y1d.a r10 = y1d.b.Companion
            r10.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r10 = y1d.a.f
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = r1.f306286a
            r2.<init>(r0, r1)
            r9.u = r8
            java.lang.Object r10 = r3.b3(r10, r2, r9)
            if (r10 != r4) goto L96
            goto L95
        L4c:
            cli.y r10 = r2.f15004t
            java.lang.Object r10 = r10.f22677a
            vkm.j2 r10 = (vkm.j2) r10
            java.lang.Object r10 = r10.getValue()
            bfh.c r10 = (bfh.c) r10
            com.revolut.data.model.Data r10 = r10.e
            java.lang.Object r10 = r10.getContent()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L99
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L7f
            y1d.a r10 = y1d.b.Companion
            r10.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r10 = y1d.a.f
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = r1.f306286a
            r2.<init>(r0, r1)
            r9.u = r7
            java.lang.Object r10 = r3.f3(r10, r2, r9)
            if (r10 != r4) goto L96
            goto L95
        L7f:
            y1d.a r10 = y1d.b.Companion
            r10.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r10 = y1d.a.f
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = r1.f306286a
            r2.<init>(r0, r1)
            r9.u = r6
            kotlin.Unit r10 = r3.Z2(r10, r2)
            if (r10 != r4) goto L96
        L95:
            return r4
        L96:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L99:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bfh.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
