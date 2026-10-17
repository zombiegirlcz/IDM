package mhd;

import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreenContract$InputData;
import ip0.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 implements p {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchlistHomeScreenContract$InputData f205495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifd.h f205496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n3d.c f205497c;
    public final t70.b d;
    public final t5d.d e;

    public f0(WatchlistHomeScreenContract$InputData inputData, ifd.h watchlistMapper, n3d.c watchlistFooterDelegate, t70.b currenciesLocalization, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        Intrinsics.checkNotNullParameter(watchlistFooterDelegate, "watchlistFooterDelegate");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f205495a = inputData;
        this.f205496b = watchlistMapper;
        this.f205497c = watchlistFooterDelegate;
        this.d = currenciesLocalization;
        this.e = swipeAssetTradeActionsMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List list;
        List list2;
        List listD;
        Data data;
        n domainState = (n) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CombinedWatchlistContext context = this.f205495a.f86973a;
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean boolValueOf = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.shared_watchlist_widget_header_title, null, null, 14);
        List list3 = domainState.f205516b;
        Data data2 = domainState.f205515a;
        List list4 = list3;
        ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
        Iterator it8 = list4.iterator();
        while (it8.hasNext()) {
            l1 l1Var = new l1((AppTipUIModel) it8.next());
            yp0.b.l(l1Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(l1Var);
        }
        if (data2 == null || (list = (List) iii.c.f(data2, new mh4.x(6), new mh1.e(2), new m88.c(this, domainState, 6))) == null) {
            list = zhm.f0.f322471a;
        }
        List listO = i2b.a.o(arrayList, list);
        Set typeKeys = context.f86890b;
        Data data3 = domainState.f205517c;
        Intrinsics.checkNotNullParameter(typeKeys, "typeKeys");
        n3d.c cVar = this.f205497c;
        List<FavouritesAssetTypeKey> listP0 = zhm.d0.P0(cVar.c(typeKeys), cVar.f211981a);
        ArrayList arrayList2 = new ArrayList();
        for (FavouritesAssetTypeKey favouritesAssetTypeKey : listP0) {
            x3d.b bVar = (x3d.b) cVar.f211983c.get(favouritesAssetTypeKey);
            if (bVar != null) {
                if (data3 != null) {
                    try {
                        Object content = data3.getContent();
                        data = new Data(content != null ? (lgd.c) ((Map) content).get(favouritesAssetTypeKey) : null, data3.getError(), data3.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, data3.getLoading());
                    }
                } else {
                    data = null;
                }
                listD = bVar.d(data);
            } else {
                listD = null;
            }
            if (listD != null) {
                arrayList2.add(listD);
            }
        }
        List listO2 = i2b.a.o(listO, zhm.w.u(arrayList2));
        if (data2 != null && (list2 = (List) data2.getContent()) != null) {
            boolValueOf = Boolean.valueOf(!list2.isEmpty());
        }
        return new y(listO2, textLocalisedClause, pd.b.j(boolValueOf), domainState.d);
    }
}
