package l3d;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.util.Comparator;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cim.a f191933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f191934c;
    public final /* synthetic */ Lazy d;

    public /* synthetic */ t(cim.a aVar, h0 h0Var, Lazy lazy, int i) {
        this.f191932a = i;
        this.f191933b = aVar;
        this.f191934c = h0Var;
        this.d = lazy;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f191932a) {
            case 0:
                WatchlistItem watchlistItem = (WatchlistItem) obj2;
                Lazy lazy = this.d;
                Map map = (Map) ((Map) lazy.getValue()).get(watchlistItem.f86898a.d);
                h0 h0Var = this.f191934c;
                if (map != null && map.get(h0.a(h0Var, watchlistItem)) != null) {
                    throw new ClassCastException();
                }
                WatchlistItem watchlistItem2 = (WatchlistItem) obj3;
                Map map2 = (Map) ((Map) lazy.getValue()).get(watchlistItem2.f86898a.d);
                if (map2 == null || map2.get(h0.a(h0Var, watchlistItem2)) == null) {
                    return this.f191933b.compare(null, null);
                }
                throw new ClassCastException();
            case 1:
                WatchlistItem watchlistItem3 = (WatchlistItem) obj2;
                Lazy lazy2 = this.d;
                Map map3 = (Map) ((Map) lazy2.getValue()).get(watchlistItem3.f86898a.d);
                h0 h0Var2 = this.f191934c;
                if (map3 != null && map3.get(h0.a(h0Var2, watchlistItem3)) != null) {
                    throw new ClassCastException();
                }
                WatchlistItem watchlistItem4 = (WatchlistItem) obj3;
                Map map4 = (Map) ((Map) lazy2.getValue()).get(watchlistItem4.f86898a.d);
                if (map4 == null || map4.get(h0.a(h0Var2, watchlistItem4)) == null) {
                    return this.f191933b.compare(null, null);
                }
                throw new ClassCastException();
            default:
                WatchlistItem watchlistItem5 = (WatchlistItem) obj2;
                Lazy lazy3 = this.d;
                Map map5 = (Map) ((Map) lazy3.getValue()).get(watchlistItem5.f86898a.d);
                h0 h0Var3 = this.f191934c;
                if (map5 != null && map5.get(h0.a(h0Var3, watchlistItem5)) != null) {
                    throw new ClassCastException();
                }
                WatchlistItem watchlistItem6 = (WatchlistItem) obj3;
                Map map6 = (Map) ((Map) lazy3.getValue()).get(watchlistItem6.f86898a.d);
                if (map6 == null || map6.get(h0.a(h0Var3, watchlistItem6)) == null) {
                    return this.f191933b.compare(null, null);
                }
                throw new ClassCastException();
        }
    }
}
