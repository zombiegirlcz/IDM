package bt5;

import com.revolut.feature.shared_separate_favourites.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements s1d.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv5.c f18287a;

    public d(xv5.c cryptoCommodityBaseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f18287a = cryptoCommodityBaseCurrencyInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bt5.c
            if (r0 == 0) goto L13
            r0 = r5
            bt5.c r0 = (bt5.c) r0
            int r1 = r0.f18286w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18286w = r1
            goto L18
        L13:
            bt5.c r0 = new bt5.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18286w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            xv5.c r5 = r4.f18287a
            efm.r r5 = xv5.c.b(r5)
            vkm.d r5 = rd0.e.b(r5)
            r0.f18286w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            xi0.b r5 = (xi0.b) r5
            java.lang.String r5 = r5.f306286a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bt5.d.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s1d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof bt5.b
            if (r0 == 0) goto L13
            r0 = r6
            bt5.b r0 = (bt5.b) r0
            int r1 = r0.f18285y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18285y = r1
            goto L18
        L13:
            bt5.b r0 = new bt5.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f18283w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18285y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r1 = r0.v
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r0 = r0.u
            yhm.o.b(r6)
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            y1d.a r6 = y1d.b.Companion
            r6.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r6 = y1d.a.f310359c
            r0.u = r6
            java.lang.String r2 = "BTC"
            r0.v = r2
            r0.f18285y = r3
            java.lang.Object r0 = r5.a(r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r1 = r0
            r0 = r6
            r6 = r1
            r1 = r2
        L50:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r2 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.String r2 = "to"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            xi0.a r2 = xi0.b.Companion
            r2.getClass()
            xi0.b r2 = xi0.a.a(r1)
            xi0.b r3 = xi0.a.a(r6)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r2, r3)
            cp5.d.d(r4)
            java.lang.String r0 = r0.f86866a
            java.lang.String r2 = "-"
            java.lang.String r6 = com.google.android.gms.internal.mlkit_vision_face.a.p(r0, r2, r1, r2, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bt5.d.c(gim.c):java.lang.Object");
    }

    @Override // s1d.a
    public final Object d(gim.c cVar) {
        return Boolean.TRUE;
    }

    @Override // s1d.a
    public final Integer k() {
        return Integer.valueOf(R$string.shared_watchlist_widget_customisation_select_crypto_title);
    }
}
