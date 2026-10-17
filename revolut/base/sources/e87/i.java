package e87;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function1 {
    public u1d.a u;
    public FavouritesAssetTypeKey v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f123618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f123619x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f123620y;
    public final /* synthetic */ com.revolut.feature.global_markets.impl.ui.flow.index_details.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, com.revolut.feature.global_markets.impl.ui.flow.index_details.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f123620y = str;
        this.z = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f123620y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r2.b3(r1, r4, r11) != r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r2.g3(r1, r0, r12, r11) != r3) goto L32;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            com.revolut.feature.global_markets.impl.ui.flow.index_details.b r0 = r11.z
            com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlowContract$InputData r1 = r0.o
            u1d.a r2 = r0.f74592r
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r11.f123619x
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L3c
            if (r4 == r8) goto L32
            if (r4 == r7) goto L2d
            if (r4 == r6) goto L22
            if (r4 != r5) goto L1a
            goto L2d
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            java.lang.String r0 = r11.f123618w
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r1 = r11.v
            u1d.a r2 = r11.u
            yhm.o.b(r12)
            goto Lad
        L2d:
            yhm.o.b(r12)
            goto Lc0
        L32:
            java.lang.String r0 = r11.f123618w
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r1 = r11.v
            u1d.a r2 = r11.u
            yhm.o.b(r12)
            goto L75
        L3c:
            yhm.o.b(r12)
            java.lang.String r12 = r11.f123620y
            java.lang.String r4 = "WATCHLIST_MENU_ITEM_ID"
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r12, r4)
            if (r12 == 0) goto Lc0
            gte.a r12 = r0.f74593s
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$MultipleWatchlists r4 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.MultipleWatchlists.f95167c
            jte.d r12 = (jte.d) r12
            boolean r12 = r12.c(r4)
            if (r12 == 0) goto L8d
            y1d.a r12 = y1d.b.Companion
            r12.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r12 = y1d.a.f310362j
            java.lang.String r1 = r1.f74583b
            java.lang.String r1 = com.revolut.feature.global_markets.impl.ui.flow.index_details.b.J2(r1)
            r11.u = r2
            r11.v = r12
            r11.f123618w = r1
            r11.f123619x = r8
            java.io.Serializable r0 = com.revolut.feature.global_markets.impl.ui.flow.index_details.b.I2(r0, r11)
            if (r0 != r3) goto L71
            goto Lbf
        L71:
            r10 = r1
            r1 = r12
            r12 = r0
            r0 = r10
        L75:
            xi0.b r12 = (xi0.b) r12
            java.lang.String r12 = r12.f306286a
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r0, r12)
            r11.u = r9
            r11.v = r9
            r11.f123618w = r9
            r11.f123619x = r7
            java.lang.Object r12 = r2.b3(r1, r4, r11)
            if (r12 != r3) goto Lc0
            goto Lbf
        L8d:
            y1d.a r12 = y1d.b.Companion
            r12.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r12 = y1d.a.f310362j
            java.lang.String r1 = r1.f74583b
            java.lang.String r1 = com.revolut.feature.global_markets.impl.ui.flow.index_details.b.J2(r1)
            r11.u = r2
            r11.v = r12
            r11.f123618w = r1
            r11.f123619x = r6
            java.io.Serializable r0 = com.revolut.feature.global_markets.impl.ui.flow.index_details.b.I2(r0, r11)
            if (r0 != r3) goto La9
            goto Lbf
        La9:
            r10 = r1
            r1 = r12
            r12 = r0
            r0 = r10
        Lad:
            xi0.b r12 = (xi0.b) r12
            java.lang.String r12 = r12.f306286a
            r11.u = r9
            r11.v = r9
            r11.f123618w = r9
            r11.f123619x = r5
            java.lang.Object r12 = r2.g3(r1, r0, r12, r11)
            if (r12 != r3) goto Lc0
        Lbf:
            return r3
        Lc0:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e87.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
