package lph;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignContract$CollectionsPagerItem;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import koe.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kp0.m;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements n {

    @NotNull
    private static final i Companion = new i();

    public final b a(a aVar) {
        int i;
        List<ScreenerAllCollectionsRedesignContract$CollectionsPagerItem> list = aVar.f199121a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (ScreenerAllCollectionsRedesignContract$CollectionsPagerItem pagerItem : list) {
            String f103057c = pagerItem.getF94249a();
            boolean z = aVar.d;
            Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
            if (pagerItem.equals(ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.Custom.f96203a)) {
                i = R$string.screener_collections_section_collection_user_created_tab;
            } else {
                if (!(pagerItem instanceof ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.RevolutGroup)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = nph.c.f218219a[((ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.RevolutGroup) pagerItem).f96204a.ordinal()];
                if (i2 == 1) {
                    i = R$string.screener_collections_section_collection_stocks_tab;
                } else if (i2 == 2) {
                    i = z ? R$string.screener_collections_section_collection_etps_tab : R$string.screener_collections_section_collection_etfs_tab;
                } else if (i2 == 3) {
                    i = R$string.screener_collections_section_collection_bonds_tab;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.screener_collections_section_collection_cfds_tab;
                }
            }
            arrayList.add(new q(f103057c, new t(new TextLocalisedClause(i, null, null, 14)), 50));
        }
        return new b(aVar.f199122b, arrayList);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (b) iii.c.f(domainState.f199123c, new loc.a(this, 7), new m(this, domainState, 8), new y(this, domainState, 22));
    }
}
