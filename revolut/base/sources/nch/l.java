package nch;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.BondsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterValueId;
import com.revolut.retail.wealth.resources.R$string;
import ip0.qd0;
import ip0.vd0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list2 = null;
        i iVar = new i(adh.d.b(domainState.f214185a.f95289a), new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_see_all_search_hint, null, null, 14));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_see_all_action_apply_title, null, null, 14);
        InstrumentsCollectionFilterId instrumentsCollectionFilterId = domainState.f214185a.f95289a;
        List list3 = domainState.f214186b;
        if (instrumentsCollectionFilterId == BondsCollectionFilterId.ISSUER_COUNTRY) {
            List<InstrumentsCollectionFilter.ListFilter.Value> list4 = list3;
            ArrayList arrayList = new ArrayList(w.t(list4, 10));
            for (InstrumentsCollectionFilter.ListFilter.Value value : list4) {
                String str = "INSTRUMENTS_COLLECTION_LIST_VALUE_LIST_ID_" + value.f95292a;
                InstrumentsCollectionFilterValueId instrumentsCollectionFilterValueId = value.f95292a;
                arrayList.add(new SelectableDelegate.Model(str, new RowDelegate.Model(String.valueOf(instrumentsCollectionFilterValueId), new RowDelegate.Model.MainImage.Image40(new CountryImage(((InstrumentsCollectionFilterValueId.BondsIssuerCountry) instrumentsCollectionFilterValueId).f95305a.f297794a, (Integer) null, (ez0.e) null, 14), null, null, false, null, false, 62), adh.d.a(instrumentsCollectionFilterValueId), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), value.f95293b ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.CHECKBOX, false, null, value, null, false, 32488));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (list != null) {
            yp0.b.k(list, 0, 0, 0, 0, 31);
        } else {
            list = null;
        }
        if (list != null) {
            if (list.isEmpty()) {
                String str2 = domainState.f214187c;
                List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_SEARCH_ITEM_LIST_ID", new TextLocalisedClause(R$string.wealth_trading_assets_placeholder_title, null, null, 14), str2 != null ? new TextLocalisedClause(R$string.wealth_trading_assets_placeholder_subtitle, u.c(str2), null, 12) : null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                list = listC;
            }
            list2 = list;
        }
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        return new j(iVar, textLocalisedClause, list2);
    }
}
