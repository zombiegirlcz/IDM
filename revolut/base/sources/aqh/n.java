package aqh;

import aqd.h1;
import aw0.n6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zph.s f8447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zph.r f8448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zph.p f8449c;

    public n(hph.j metricsResourceMapper, zph.s rangeMapper, zph.r optionsMapper, zph.p screenerAllOptionsMapper, vph.h screenerFiltersViewTextMapper) {
        Intrinsics.checkNotNullParameter(metricsResourceMapper, "metricsResourceMapper");
        Intrinsics.checkNotNullParameter(rangeMapper, "rangeMapper");
        Intrinsics.checkNotNullParameter(optionsMapper, "optionsMapper");
        Intrinsics.checkNotNullParameter(screenerAllOptionsMapper, "screenerAllOptionsMapper");
        Intrinsics.checkNotNullParameter(screenerFiltersViewTextMapper, "screenerFiltersViewTextMapper");
        this.f8447a = rangeMapper;
        this.f8448b = optionsMapper;
        this.f8449c = screenerAllOptionsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Object next;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f8438c;
        zel.g gVar = domainState.f8436a;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ScreenerSelectedFilter) next).getF105167a() == gVar) {
                break;
            }
        }
        ScreenerSelectedFilter screenerSelectedFilter = (ScreenerSelectedFilter) next;
        Data data = domainState.f;
        List list2 = data != null ? (List) iii.c.f(data, new aqb.s(this, 13), new h1(2), new a0i.a(this, 3, domainState, screenerSelectedFilter)) : null;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        return new l(hph.j.a(gVar), list2, new aw0.h(false, new n6(vph.h.a(domainState.f8437b, domainState.f8439g, domainState.f8440h), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, g.f8435a, 504), new n6(new TextLocalisedClause(R$string.screener_action_metric_calibrator_remove, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, k.f8442a, 504), null, null, null, 121));
    }
}
