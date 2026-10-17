package xed;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wed.g0;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifd.h f304634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffd.a f304635b;

    public o(ffd.a alertsMapper, ifd.h watchlistMapper) {
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        Intrinsics.checkNotNullParameter(alertsMapper, "alertsMapper");
        this.f304634a = watchlistMapper;
        this.f304635b = alertsMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.shared_alerts_completed_alerts_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(((n3d.d) this.f304634a).c(domainState.f304616a), null, null, 14);
        ArrayList arrayList = new ArrayList();
        Data data = domainState.f304617b;
        FavouritesAssetTypeKey favouritesAssetTypeKey = domainState.f304616a;
        arrayList.addAll((List) iii.c.f(data, new l2d.c(this, favouritesAssetTypeKey, 3), new g0(favouritesAssetTypeKey, 1), new wx6.k(this, favouritesAssetTypeKey, 11)));
        Unit unit = Unit.f186387a;
        return new i(textLocalisedClause, textLocalisedClause2, arrayList);
    }
}
