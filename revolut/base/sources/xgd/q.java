package xgd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a f305691b;

    public /* synthetic */ q(com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar, int i) {
        this.f305690a = i;
        this.f305691b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f305690a) {
            case 0:
                List watchlists = (List) obj2;
                Intrinsics.checkNotNullParameter(watchlists, "watchlists");
                List<Watchlist> list = watchlists;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Watchlist watchlist : list) {
                    String str = watchlist.f86895a;
                    this.f305691b.f86924p.getClass();
                    Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                    linkedHashMap.put(str, new l(watchlist, !watchlist.f86897c));
                }
                break;
            case 1:
                sgd.e it8 = (sgd.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f305691b.X1(new mii.e("watchlist-rename-success-message", new TextLocalisedClause(R$string.watchlists_rename_watchlist_success_message, null, null, 14), null, 28));
                break;
            default:
                qgd.e it9 = (qgd.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar = this.f305691b;
                aVar.f86927s.getClass();
                aVar.X1(new mii.e("new-watchlist-created-message", new TextLocalisedClause(R$string.watchlists_new_watchlist_success_message, null, null, 14), null, 28));
                break;
        }
        return Unit.f186387a;
    }
}
