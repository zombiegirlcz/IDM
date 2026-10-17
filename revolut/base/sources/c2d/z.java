package c2d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements u3d.c {

    @NotNull
    public static final w Companion = new w();
    public static final Lazy e = yhm.j.b(new c0d.e(1));
    public static final Lazy f = yhm.j.b(new c0d.e(2));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy f20761g = yhm.j.b(new c0d.e(3));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f20762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f20763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8h.k f20764c;
    public final xv5.c d;

    public z(wsg.n walletInteractor, ImmutableSet watchlistItemsInteractors, x8h.k wealthDisplayCurrencyInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(watchlistItemsInteractors, "watchlistItemsInteractors");
        Intrinsics.checkNotNullParameter(wealthDisplayCurrencyInteractor, "wealthDisplayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f20762a = walletInteractor;
        this.f20763b = watchlistItemsInteractors;
        this.f20764c = wealthDisplayCurrencyInteractor;
        this.d = cryptoCommodityBaseCurrencyInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(c2d.z r5, gim.c r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof c2d.x
            if (r0 == 0) goto L13
            r0 = r6
            c2d.x r0 = (c2d.x) r0
            int r1 = r0.f20755w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20755w = r1
            goto L18
        L13:
            c2d.x r0 = new c2d.x
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20755w
            kotlin.Lazy r3 = c2d.z.e
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            goto L49
        L29:
            r5 = move-exception
            goto L85
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            wsg.n r5 = r5.f20762a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            ufm.i r5 = r5.x(r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            r0.f20755w = r4     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            java.lang.Object r6 = nim.a.b(r5, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            if (r6 != r1) goto L49
            return r1
        L49:
            xi0.b r6 = (xi0.b) r6     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            c2d.w r5 = c2d.z.Companion     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            r5.getClass()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            java.lang.Object r5 = r3.getValue()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            r0.<init>()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
        L61:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            if (r1 == 0) goto L78
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            r2 = r1
            xi0.b r2 = (xi0.b) r2     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            if (r2 != 0) goto L61
            r0.add(r1)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            goto L61
        L78:
            java.util.List r5 = zhm.u.c(r6)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            java.util.ArrayList r5 = zhm.d0.E0(r0, r5)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> Lbb
            goto L8b
        L85:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L8b:
            java.lang.Throwable r6 = yhm.m.a(r5)
            if (r6 == 0) goto L94
            hx7.e.n(r6)
        L94:
            boolean r6 = r5 instanceof yhm.n
            if (r6 == 0) goto L99
            r5 = 0
        L99:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto La8
            c2d.w r5 = c2d.z.Companion
            r5.getClass()
            java.lang.Object r5 = r3.getValue()
            java.util.List r5 = (java.util.List) r5
        La8:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 3
            java.util.List r5 = zhm.d0.V0(r5, r6)
            y1d.a r6 = y1d.b.Companion
            r6.getClass()
            com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey r6 = y1d.a.f310358b
            java.util.ArrayList r5 = c(r5, r6)
            return r5
        Lbb:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c2d.z.a(c2d.z, gim.c):java.io.Serializable");
    }

    public static final ArrayList b(z zVar, List list, FavouritesAssetTypeKey favouritesAssetTypeKey, xi0.b bVar) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ogd.c(favouritesAssetTypeKey, (xi0.b) it8.next(), bVar));
        }
        return arrayList;
    }

    public static ArrayList c(List list, FavouritesAssetTypeKey favouritesAssetTypeKey) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ogd.b(favouritesAssetTypeKey, (xi0.b) it8.next()));
        }
        return arrayList;
    }
}
