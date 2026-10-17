package w87;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import e3h.f;
import eel.i;
import java.util.List;
import joa.j;
import k0h.c;
import k7c.d;
import k8d.s;
import kotlin.jvm.internal.Intrinsics;
import u87.e;
import u87.g;
import u87.h;
import z0h.q1;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndexOverviewScreenContract$InputData f295599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f295600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f295601c;
    public final c d;

    public a(IndexOverviewScreenContract$InputData inputData, q1 disclaimersMapper, b chartBuilder, c collectionsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        Intrinsics.checkNotNullParameter(chartBuilder, "chartBuilder");
        Intrinsics.checkNotNullParameter(collectionsMapper, "collectionsMapper");
        this.f295599a = inputData;
        this.f295600b = disclaimersMapper;
        this.f295601c = chartBuilder;
        this.d = collectionsMapper;
    }

    public final List a(Data collection, TradingLegalEntityInformation tradingLegalEntityInformation, boolean z) {
        if (collection == null || tradingLegalEntityInformation == null) {
            return null;
        }
        k0h.b config = new k0h.b(z && tradingLegalEntityInformation.f105106a == hel.b.GB);
        k9h.c cVar = (k9h.c) this.d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(config, "config");
        return (List) iii.c.f(collection, new d(29), new s(7), new j(cVar, config, 18));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f fVar;
        Data data;
        Object obj2;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f fVar2 = this.f295601c.f295602a;
        Data data2 = domainState.d;
        Data data3 = domainState.f;
        Data data4 = domainState.f278129a;
        TradingLegalEntityInformation tradingLegalEntityInformation = domainState.f278133h;
        TrendViewDelegate.a aVar = domainState.e;
        eel.c cVar = domainState.f278130b;
        if (cVar == null) {
            cVar = eel.c.ONE_YEAR;
        }
        eel.c cVar2 = cVar;
        i iVar = i.PRICE;
        Data data5 = domainState.f278131c;
        List list = h.f278135a;
        Data dataP = zi0.c.P(tradingLegalEntityInformation, false, null, 3);
        Data data6 = domainState.f278131c;
        try {
            Object content = data6.getContent();
            fVar = fVar2;
            try {
                data = new Data(content != null ? new e3h.h(((InstrumentTicker) content).v, false) : null, data6.getError(), data6.getLoading());
                obj2 = null;
            } catch (Throwable th10) {
                th = th10;
                obj2 = null;
                data = new Data(null, th, data6.getLoading());
            }
        } catch (Throwable th11) {
            th = th11;
            fVar = fVar2;
        }
        List listC = ((i4h.d) fVar).c(data2, aVar, cVar2, iVar, data5, null, null, list, dataP, data, true, false, false, true, eel.d.FIXED);
        List list2 = (List) iii.c.f(data4, new w6h.f(9), new w6b.a(11), new w2a.o(10));
        List list3 = data3 != null ? (List) iii.c.f(data3, new w6h.f(10), new w6b.a(12), new w2a.o(11)) : null;
        List listA = a(domainState.i, tradingLegalEntityInformation, false);
        List listA2 = a(domainState.f278132g, tradingLegalEntityInformation, true);
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("index-overview-about-subheader", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_invest_index_about_title, u.c(this.f295599a.f74612b), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List[] elements = {listC, list2, list3, listA, listA2, (List) iii.c.f(data4, new lk7.o(model, 4), new w6b.a(13), new vjh.c(model, 18)), data3 != null ? (List) iii.c.f(data3, new w6h.f(11), new w6b.a(10), new vjh.c(this, 17)) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new g(w.u(kotlin.collections.d.L(elements)));
    }
}
