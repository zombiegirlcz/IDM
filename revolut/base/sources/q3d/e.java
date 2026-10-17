package q3d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p40.n;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements v1d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifd.h f241948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f241949b;

    public e(ifd.h watchlistMapper, k symbolMapper) {
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        Intrinsics.checkNotNullParameter(symbolMapper, "symbolMapper");
        this.f241948a = watchlistMapper;
        this.f241949b = symbolMapper;
    }

    public final v1d.i a(Data data) {
        Data data2;
        od0.i iVarA;
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            Object content = data.getContent();
            if (content != null) {
                od0.i iVar = (od0.i) content;
                if (iVar.d()) {
                    WatchlistItem watchlistItem = (WatchlistItem) iVar.c();
                    od0.h hVar = od0.i.Companion;
                    Pair pair = new Pair(watchlistItem, ((n3d.d) this.f241948a).f(watchlistItem.f86898a.d, watchlistItem));
                    hVar.getClass();
                    iVarA = od0.h.a(pair);
                } else {
                    od0.i.Companion.getClass();
                    iVarA = od0.i.f224256b;
                }
            } else {
                iVarA = null;
            }
            data2 = new Data(iVarA, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            data2 = new Data(null, th10, data.getLoading());
        }
        Intrinsics.checkNotNullParameter(data2, "data");
        i iVar2 = new i(0);
        k kVar = this.f241949b;
        return (v1d.i) iii.c.f(data2, iVar2, new q34.a(kVar, 2), new n(kVar, 22));
    }
}
