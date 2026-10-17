package puk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nel.n f239953w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, nel.n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
        this.f239953w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.v, this.f239953w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r7.b3(r10, r3, r9) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r7.f3(r10, r3, r9) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r7.Z2(r10, r3) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            nel.n r0 = r9.f239953w
            xi0.b r1 = r0.i
            java.lang.String r0 = r0.f214596b
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.u
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L23
            if (r3 == r6) goto L1e
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            yhm.o.b(r10)
            goto L97
        L23:
            yhm.o.b(r10)
            puk.s r10 = r9.v
            gte.a r3 = r10.f239954p
            u1d.a r7 = r10.f239957s
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$MultipleWatchlists r8 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.MultipleWatchlists.f95167c
            jte.d r3 = (jte.d) r3
            boolean r3 = r3.c(r8)
            if (r3 == 0) goto L4d
            y1d.a r10 = y1d.b.Companion
            r10.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r10 = y1d.a.f
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r1 = r1.f306286a
            r3.<init>(r0, r1)
            r9.u = r6
            java.lang.Object r10 = r7.b3(r10, r3, r9)
            if (r10 != r2) goto L97
            goto L96
        L4d:
            cli.y r10 = r10.z
            java.lang.Object r10 = r10.f22677a
            vkm.j2 r10 = (vkm.j2) r10
            java.lang.Object r10 = r10.getValue()
            puk.f r10 = (puk.f) r10
            com.revolut.data.model.Data r10 = r10.e
            java.lang.Object r10 = r10.getContent()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L9a
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L80
            y1d.a r10 = y1d.b.Companion
            r10.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r10 = y1d.a.f
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r1 = r1.f306286a
            r3.<init>(r0, r1)
            r9.u = r5
            java.lang.Object r10 = r7.f3(r10, r3, r9)
            if (r10 != r2) goto L97
            goto L96
        L80:
            y1d.a r10 = y1d.b.Companion
            r10.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r10 = y1d.a.f
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r1 = r1.f306286a
            r3.<init>(r0, r1)
            r9.u = r4
            kotlin.Unit r10 = r7.Z2(r10, r3)
            if (r10 != r2) goto L97
        L96:
            return r2
        L97:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L9a:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: puk.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
