package ba7;

import com.revolut.feature.exchange.models.BuyFundingCurrencyPrefill;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o97.y;
import skm.e0;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends a97.k {
    public final /* synthetic */ h d;

    public f(h hVar) {
        this.d = hVar;
    }

    @Override // a97.k
    public final koi.j a() {
        return k.b();
    }

    @Override // a97.k
    public final Object b(y yVar, Continuation continuation) {
        g gVar = (g) this.f2376a.getValue();
        return (gVar != null && Intrinsics.f(yVar.f223137c, "SMART_TILE_ASSET_VIEW_ITEM_CLICK")) ? new o97.d(new CryptoAssetDetailsFeatureConfig.AssetDetailsDestination(gVar.f13973a, (BuyFundingCurrencyPrefill) null, 6)) : o97.e.f223096a;
    }

    @Override // a97.k
    public final koi.j c(Object obj2, y searchPayload) {
        g state = (g) obj2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(searchPayload, "payload");
        k kVar = this.d.f13978c;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(searchPayload, "searchPayload");
        return (koi.j) iii.c.f(state.f13975c, new b96.a(kVar, 10), new b7d.c(state, 8), new a0i.a(state, 6, kVar, searchPayload));
    }

    @Override // a97.k
    public final Object d(a97.j jVar) {
        Object objO = e0.o(new c(this, null, 0), jVar);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // a97.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ba7.d
            if (r0 == 0) goto L13
            r0 = r11
            ba7.d r0 = (ba7.d) r0
            int r1 = r0.f13969y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13969y = r1
            goto L18
        L13:
            ba7.d r0 = new ba7.d
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f13967w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13969y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            xi0.b r10 = r0.v
            ba7.f r0 = r0.u
            yhm.o.b(r11)
            goto L90
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            yhm.o.b(r11)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L3c:
            boolean r11 = r10.hasNext()
            r2 = 0
            if (r11 == 0) goto L54
            java.lang.Object r11 = r10.next()
            a97.f r11 = (a97.f) r11
            boolean r4 = r11 instanceof a97.b
            if (r4 == 0) goto L50
            a97.b r11 = (a97.b) r11
            goto L51
        L50:
            r11 = r2
        L51:
            if (r11 != 0) goto L55
            goto L3c
        L54:
            r11 = r2
        L55:
            if (r11 == 0) goto Lb5
            xi0.b r10 = r11.f2365a
            vkm.j2 r11 = r9.f2376a
            java.lang.Object r11 = r11.getValue()
            ba7.g r11 = (ba7.g) r11
            if (r11 == 0) goto L65
            xi0.b r2 = r11.f13973a
        L65:
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r10)
            if (r2 != 0) goto Lb2
            if (r11 == 0) goto L71
            xi0.b r11 = r11.f13974b
            r0 = r9
            goto L92
        L71:
            ba7.h r11 = r9.d
            xv5.c r11 = r11.f13976a
            efm.r r11 = xv5.c.b(r11)
            efm.d0 r11 = r11.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            r0.u = r9
            r0.v = r10
            r0.f13969y = r3
            java.lang.Object r11 = nim.a.b(r11, r0)
            if (r11 != r1) goto L8f
            return r1
        L8f:
            r0 = r9
        L90:
            xi0.b r11 = (xi0.b) r11
        L92:
            kotlin.jvm.internal.Intrinsics.h(r11)
            ba7.g r1 = new ba7.g
            com.revolut.data.model.Data r2 = new com.revolut.data.model.Data
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            com.revolut.data.model.Data r3 = new com.revolut.data.model.Data
            r7 = 3
            r8 = 0
            r5 = 0
            r6 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            r1.<init>(r10, r11, r2, r3)
            vkm.j2 r10 = r0.f2376a
            r10.setValue(r1)
        Lb2:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lb5:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r11 = "No element of the collection was transformed to a non-null value."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ba7.f.e(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
