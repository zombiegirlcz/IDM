package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$Step;
import hhd.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifd.d f86951a;

    public e(ifd.d assetMapper) {
        Intrinsics.checkNotNullParameter(assetMapper, "assetMapper");
        this.f86951a = assetMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        hhd.h domainState = (hhd.h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f152393b;
        int size = w.u(domainState.f152394c.values()).size();
        TextLocalisedClause textLocalisedClause = size == 0 ? new TextLocalisedClause(R$string.shared_watchlist_common_actions_done, null, null, 14) : new TextLocalisedClause(R$string.shared_watchlist_common_actions_done_with_counter, u.c(String.valueOf(size)), null, 12);
        List list = domainState.f152392a;
        ArrayList<WatchlistAddAssetFlowContract$Step.Loaded> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof WatchlistAddAssetFlowContract$Step.Loaded) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (WatchlistAddAssetFlowContract$Step.Loaded loaded : arrayList) {
            String str2 = loaded.f86946b;
            FavouritesAssetTypeKey key = loaded.f86945a;
            n3d.d dVar = (n3d.d) this.f86951a;
            Intrinsics.checkNotNullParameter(key, "key");
            x3d.f fVar = (x3d.f) dVar.f211984a.get(key);
            if (fVar == null) {
                throw new IllegalStateException(j6.a.q("provide mapper for key = ", key.f86866a));
            }
            arrayList2.add(new q(str2, new t(new TextLocalisedClause(fVar.e(), null, null, 14)), 50));
        }
        return new m(textLocalisedClause, str, arrayList2);
    }
}
