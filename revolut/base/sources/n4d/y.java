package n4d;

import com.revolut.data.model.Data;
import com.revolut.feature.separate_favourites.item_data.impl.watchlist.network.WatchlistService;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import d9.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import n33.i2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f212419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f212420c;

    public /* synthetic */ y(r0 r0Var, h0 h0Var, int i) {
        this.f212418a = i;
        this.f212419b = r0Var;
        this.f212420c = h0Var;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        switch (this.f212418a) {
            case 0:
                r0 r0Var = this.f212419b;
                ue0.c cVar = r0Var.f212398c;
                Boolean syncOk = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(syncOk, "syncOk");
                if (!syncOk.booleanValue()) {
                    throw new IllegalStateException("request is blocked until local data is synced");
                }
                h0 params = this.f212420c;
                Intrinsics.checkNotNullParameter(params, "params");
                e0 e0Var = r0.Companion;
                e0Var.getClass();
                String strC = e0.c(params);
                Boolean bool = Boolean.FALSE;
                Class cls = Boolean.TYPE;
                if (!((Boolean) cVar.v0(bool, strC, cls)).booleanValue()) {
                    e0Var.getClass();
                    com.revolut.data.database.models.openbanking.d.D(cls, cVar, e0.c(params), Boolean.TRUE);
                }
                WatchlistService watchlistService = r0Var.d;
                List list = params.f212360a;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
                }
                efm.d0<s4d.f> watchlistItems = watchlistService.getWatchlistItems(arrayList, u1.g(params.f212361b, t4d.a.f267973a), null);
                i2 i2Var = new i2(29, new y(r0Var, params, 2));
                watchlistItems.getClass();
                ufm.i iVar = new ufm.i(watchlistItems, i2Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return ue0.e.I(iVar, zhm.h0.f322473a, new y(r0Var, params, 3));
            case 1:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List list2 = (List) it9.getContent();
                r0 r0Var2 = this.f212419b;
                h0 h0Var = this.f212420c;
                if (list2 != null && list2.isEmpty() && !r0Var2.d(h0Var)) {
                    return Data.copy$default(it9, null, null, false, 6, null);
                }
                List list3 = (List) it9.getContent();
                if (list3 == null || !list3.isEmpty()) {
                    return it9;
                }
                ue0.c cVar2 = r0Var2.f212398c;
                r0.Companion.getClass();
                return !((Boolean) cVar2.v0(Boolean.FALSE, e0.c(h0Var), Boolean.TYPE)).booleanValue() ? Data.copy$default(it9, null, null, true, 2, null) : it9;
            case 2:
                s4d.f networkItems = (s4d.f) obj2;
                Intrinsics.checkNotNullParameter(networkItems, "networkItems");
                h0 params2 = this.f212420c;
                Intrinsics.checkNotNullParameter(params2, "params");
                r0 r0Var3 = this.f212419b;
                if (!r0Var3.d(params2)) {
                    ue0.c cVar3 = r0Var3.f212398c;
                    r0.Companion.getClass();
                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, cVar3, e0.a(params2), Boolean.TRUE);
                }
                Intrinsics.checkNotNullParameter(networkItems, "<this>");
                List items = networkItems.getItems();
                ArrayList<z3d.e> arrayList2 = new ArrayList(zhm.w.t(items, 10));
                Iterator it10 = items.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(pyd.c.d0((s4d.e) it10.next()));
                }
                n nVar = r0Var3.f212396a;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                for (z3d.e eVar : arrayList2) {
                    z3d.f syncState = z3d.f.SYNCED;
                    Intrinsics.checkNotNullParameter(eVar, "<this>");
                    Intrinsics.checkNotNullParameter(syncState, "syncState");
                    arrayList3.add(new o4d.c(eVar.d.f86866a, eVar.f319253a, eVar.f319254b, eVar.f319255c, u1.g(syncState, t0.g())));
                }
                nVar.j(arrayList3, params2.f212360a);
                return r0Var3.f(params2);
            default:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                r0 r0Var4 = this.f212419b;
                h0 h0Var2 = this.f212420c;
                ArrayList arrayListF = r0Var4.f(h0Var2);
                if (!arrayListF.isEmpty() || r0Var4.d(h0Var2)) {
                    return arrayListF;
                }
                throw error;
        }
    }
}
