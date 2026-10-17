package mhd;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f205512b;

    public /* synthetic */ k0(q0 q0Var, int i) {
        this.f205511a = i;
        this.f205512b = q0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f205511a) {
            case 0:
                gfd.e output = (gfd.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                q0 q0Var = this.f205512b;
                q0Var.V2(new m2f.b0(q0Var, output, null, 29), new yi5.b(29));
                return Unit.f186387a;
            default:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                if (items.isEmpty()) {
                    return new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : items) {
                    FavouritesAssetTypeKey favouritesAssetTypeKey = ((WatchlistItem) obj3).f86898a.d;
                    Object arrayList = linkedHashMap.get(favouritesAssetTypeKey);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(favouritesAssetTypeKey, arrayList);
                    }
                    ((List) arrayList).add(obj3);
                }
                q0 q0Var2 = this.f205512b;
                return new hy1.b0(q0Var2.f205527m.f(linkedHashMap), q0Var2, items, 26);
        }
    }
}
