package g3e;

import aw0.d0;
import aw0.o9;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.store.api.model.StoreOfferFilter;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements cli.n {
    public u(u3e.c tileMapper) {
        Intrinsics.checkNotNullParameter(tileMapper, "tileMapper");
    }

    public static hg a(List list) {
        return new hg("EXCLUSIVES_HERO_SCROLLER_LIST_ID", list, 1, new y4(new d0(1, 1)), null, new gg.c(0), false, false, null, null, 0, R$attr.uikit_dp24, 0, 0, 28624);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.g(domainState.f140263b, new h(3), new g0c.h(29), new fq7.k(this, 6));
        List list2 = (List) iii.c.f(domainState.f140262a, new h(this, 4), new s(0), new fq7.k(this, 7));
        List<StoreOfferFilter> list3 = domainState.f140264c;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (StoreOfferFilter storeOfferFilter : list3) {
            Set set = domainState.d;
            String str = storeOfferFilter.f88568a;
            boolean zContains = set.contains(str);
            String strQ = j6.a.q("EXCLUSIVES_FILTER_CHIP_LIST_ID_PREFIX_", str);
            String str2 = storeOfferFilter.f88569b;
            mx0.d dVar = zContains ? mx0.d.ACCENT : mx0.d.SEMIACCENT;
            TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            mx0.d dVar2 = dVar;
            arrayList.add(new ActionsView.Item(strQ, dVar2, false, null, null, textClause, null, null, null, null, false, null, null, new t(str), null, 24476));
        }
        return new c(zhm.d0.E0(list, zhm.d0.E0(arrayList.isEmpty() ? f0.f322471a : zhm.u.c(new z("EXCLUSIVES_QUICK_FILTERS_LIST_ID", arrayList, null, mx0.l.SCROLLABLE, R$attr.uikit_dp0, R$attr.uikit_dp8, 68)), list2)));
    }
}
