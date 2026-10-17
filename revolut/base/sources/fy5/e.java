package fy5;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import d6j.g0;
import hb4.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx5.b f138914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f138915b;

    public e(hx5.b mapper, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f138914a = mapper;
        this.f138915b = uiKitResources;
    }

    public static CompositeClause a() {
        return new CompositeClause(v.k(new TextLocalisedClause(R$string.cryptocommodity_invest_collections_detail_screen_performance_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28)), new TextClause("   ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final Clause b(a aVar) {
        TrendViewDelegate.a aVar2 = (TrendViewDelegate.a) aVar.f138912b.f224257a;
        Integer numValueOf = null;
        if (aVar2 != null && (aVar2 instanceof mi)) {
            numValueOf = Integer.valueOf(((mi) aVar2).f54485b);
        }
        Data chartData = aVar.d;
        qta.f selectedPeriod = aVar.f138911a;
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        hx5.b bVar = this.f138914a;
        return (Clause) iii.c.f(chartData, new g0(bVar, selectedPeriod), new hw9.b(bVar, selectedPeriod), new n(numValueOf, bVar, selectedPeriod));
    }
}
