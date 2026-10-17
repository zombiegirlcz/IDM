package n4d;

import com.revolut.feature.separate_favourites.item_data.impl.watchlist.network.WatchlistService;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import d9.t0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import n33.i2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f212349b;

    public /* synthetic */ b0(r0 r0Var, int i) {
        this.f212348a = i;
        this.f212349b = r0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        z3d.b bVar;
        o4d.b bVar2;
        switch (this.f212348a) {
            case 0:
                if (((Boolean) obj2).booleanValue()) {
                    this.f212349b.i.k(Unit.f186387a);
                }
                return Unit.f186387a;
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                final int i = 1;
                final r0 r0Var = this.f212349b;
                ufm.i iVar = new ufm.i(new ufm.c(new Callable() { // from class: n4d.z
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i) {
                            case 0:
                                return Boolean.valueOf(r0Var.f212396a.e().isEmpty());
                            default:
                                return r0Var.f212396a.e();
                        }
                    }
                }, 2), new a0(new b0(r0Var, 8), 5), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                pfm.z zVar = new pfm.z(te0.w.i0(mra.d.H(iVar, 0L, new n33.l0(12))), 1, new kx7.o0(27), null);
                Intrinsics.checkNotNullExpressionValue(zVar, "onErrorReturn(...)");
                return zVar;
            case 2:
                List params = (List) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                Map map = (Map) this.f212349b.f212397b.get("CONFIGS_MEMORY_KEY");
                ArrayList arrayList = new ArrayList();
                Iterator it9 = params.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        if (params.size() == arrayList.size()) {
                            return arrayList;
                        }
                        return null;
                    }
                    z3d.b bVar3 = map != null ? (z3d.b) map.get(((FavouritesAssetTypeKey) it9.next()).f86866a) : null;
                    if (bVar3 != null) {
                        arrayList.add(bVar3);
                    }
                }
                break;
            case 3:
                List params2 = (List) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                Map map2 = (Map) this.f212349b.f212398c.T2("CONFIGS_STORAGE_KEY", r0.f212395p);
                List<FavouritesAssetTypeKey> list = params2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                for (FavouritesAssetTypeKey assetTypeKey : list) {
                    if (map2 == null || (bVar2 = (o4d.b) map2.get(assetTypeKey.f86866a)) == null) {
                        bVar = new z3d.b(assetTypeKey, 300);
                    } else {
                        Intrinsics.checkNotNullParameter(bVar2, "<this>");
                        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
                        bVar = new z3d.b(assetTypeKey, bVar2.getLimit());
                    }
                    arrayList2.add(bVar);
                }
                return arrayList2;
            case 4:
                h0 params3 = (h0) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                ne0.j jVar = this.f212349b.f212397b;
                r0.Companion.getClass();
                return (List) jVar.get(e0.b(params3));
            case 5:
                h0 params4 = (h0) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                r0 r0Var2 = this.f212349b;
                ufm.i iVar2 = new ufm.i(new ufm.c(new m1i.t(r0Var2, params4, 6), 2), new i2(28, new y(r0Var2, params4, 1)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 6:
                String context = (String) obj2;
                Intrinsics.checkNotNullParameter(context, "context");
                return (ogd.a) v7.r("MEMORY_ORDERING_KEY_", context, this.f212349b.f212397b);
            case 7:
                String context2 = (String) obj2;
                Intrinsics.checkNotNullParameter(context2, "context");
                o4d.a aVar = (o4d.a) j6.a.k(o4d.a.class, this.f212349b.f212398c, j6.a.q("STORAGE_ORDERING_KEY_", context2));
                if (aVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                return new ogd.a(aVar.getOrderingKey(), aVar.getAssetPairIds());
            default:
                List notSyncedItems = (List) obj2;
                Intrinsics.checkNotNullParameter(notSyncedItems, "notSyncedItems");
                if (notSyncedItems.isEmpty()) {
                    return efm.d0.m(Boolean.TRUE);
                }
                final r0 r0Var3 = this.f212349b;
                WatchlistService watchlistService = r0Var3.d;
                Intrinsics.checkNotNullParameter(notSyncedItems, "<this>");
                ArrayList arrayList3 = new ArrayList();
                Iterator it10 = notSyncedItems.iterator();
                while (true) {
                    Object obj3 = null;
                    if (!it10.hasNext()) {
                        efm.b bVarUpdateWatchlistItems = watchlistService.updateWatchlistItems(new s4d.n(arrayList3));
                        Intrinsics.checkNotNullParameter(bVarUpdateWatchlistItems, "<this>");
                        pfm.r rVarT = bVarUpdateWatchlistItems.t(hhm.f.f152431c);
                        Intrinsics.checkNotNullExpressionValue(rVarT, "observeOn(...)");
                        final int i2 = 0;
                        return new pfm.z(rVarT.l(new la8.j(r0Var3, notSyncedItems, 25)), i2, new Callable() { // from class: n4d.z
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                switch (i2) {
                                    case 0:
                                        return Boolean.valueOf(r0Var3.f212396a.e().isEmpty());
                                    default:
                                        return r0Var3.f212396a.e();
                                }
                            }
                        }, obj3);
                    }
                    o4d.c cVar = (o4d.c) it10.next();
                    s4d.c cVarH = qk.d.H((z3d.f) u1.u(cVar.e, t0.g()));
                    if (cVarH == null) {
                        throw new IllegalStateException(p.a.p("syncState='", cVar.e, "' is not supported"));
                    }
                    xi0.a aVar2 = xi0.b.Companion;
                    String str = cVar.f222196b;
                    aVar2.getClass();
                    arrayList3.add(new s4d.o(cp5.d.d(new Pair(xi0.a.a(str), xi0.a.a(cVar.f222197c))), cVarH, cVar.f222195a, null));
                }
                break;
        }
    }
}
