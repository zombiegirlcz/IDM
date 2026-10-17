package jch;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.BondsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterValueId;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import ip0.iq;
import ip0.qd0;
import ip0.r70;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        r70 r70VarA;
        Collection collectionK;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = 14;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_bonds_filters_header_title, null, null, 14);
        List list = domainState.f172801a;
        List list2 = domainState.f172802b;
        List listL = v.l(!Intrinsics.f(list, list2) ? new TextNavBarMenuItem("INSTRUMENTS_COLLECTION_CLEAR_ALL_LIST_ID", new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_clear_all_menu_action_title, null, null, 14), null, null, 12) : null);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_action_view_bonds, null, null, 14);
        List<InstrumentsCollectionFilter> list3 = list2;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (InstrumentsCollectionFilter instrumentsCollectionFilter : list3) {
            if (instrumentsCollectionFilter instanceof InstrumentsCollectionFilter.ListFilter) {
                InstrumentsCollectionFilter.ListFilter filter = (InstrumentsCollectionFilter.ListFilter) instrumentsCollectionFilter;
                Intrinsics.checkNotNullParameter(filter, "filter");
                InstrumentsCollectionFilterId instrumentsCollectionFilterId = filter.f95289a;
                int i3 = filter.d;
                List list4 = filter.f95291c;
                if (instrumentsCollectionFilterId == BondsCollectionFilterId.ISSUER_COUNTRY) {
                    ListSubheaderDelegate.Model modelA = kch.a.a(filter);
                    List<InstrumentsCollectionFilter.ListFilter.Value> listV0 = d0.V0(d0.P0(list4, new kch.b()), i3);
                    ArrayList arrayList2 = new ArrayList(w.t(listV0, i2));
                    for (InstrumentsCollectionFilter.ListFilter.Value value : listV0) {
                        InstrumentsCollectionFilterValueId instrumentsCollectionFilterValueId = value.f95292a;
                        arrayList2.add(new SelectableDelegate.Model("INSTRUMENTS_COLLECTION_LIST_VALUE_LIST_ID_" + instrumentsCollectionFilterValueId, new RowDelegate.Model(String.valueOf(instrumentsCollectionFilterValueId), new RowDelegate.Model.MainImage.Image40(new CountryImage(((InstrumentsCollectionFilterValueId.BondsIssuerCountry) instrumentsCollectionFilterValueId).f95305a.f297794a, (Integer) null, (ez0.e) null, i), null, null, false, null, false, 62), adh.d.a(instrumentsCollectionFilterValueId), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), value.f95293b ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.CHECKBOX, false, null, new k(instrumentsCollectionFilterId, value), null, false, 32488));
                    }
                    yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                    collectionK = ue0.e.J(modelA, arrayList2);
                } else {
                    ListSubheaderDelegate.Model modelA2 = kch.a.a(filter);
                    List<InstrumentsCollectionFilter.ListFilter.Value> listV02 = d0.V0(list4, i3);
                    ArrayList arrayList3 = new ArrayList(w.t(listV02, 10));
                    for (InstrumentsCollectionFilter.ListFilter.Value value2 : listV02) {
                        arrayList3.add(new InputChecklistDelegate.Model("INSTRUMENTS_COLLECTION_LIST_VALUE_LIST_ID_" + value2.f95292a, adh.d.a(value2.f95292a), value2.f95293b, false, null, iq.CHECK_BUTTON, null, null, new k(instrumentsCollectionFilterId, value2), null, 0, 0, 0, 523992));
                    }
                    yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                    collectionK = ue0.e.J(modelA2, arrayList3);
                }
            } else {
                if (!(instrumentsCollectionFilter instanceof InstrumentsCollectionFilter.RangeFilter)) {
                    throw new NoWhenBranchMatchedException();
                }
                InstrumentsCollectionFilter.RangeFilter filter2 = (InstrumentsCollectionFilter.RangeFilter) instrumentsCollectionFilter;
                InstrumentsCollectionFilterId instrumentsCollectionFilterId2 = filter2.f95294a;
                Intrinsics.checkNotNullParameter(filter2, "filter");
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("INSTRUMENTS_COLLECTION_SUBHEADER_LIST_ID_" + instrumentsCollectionFilterId2, (Image) null, (Clause) adh.d.b(instrumentsCollectionFilterId2), filter2.f95295b ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, filter2.f95295b, false, (Clause) null, false, (Object) filter2, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 260066);
                int i5 = filter2.d;
                int i6 = filter2.f95296c;
                InstrumentsCollectionFilter.RangeFilter.Range range = filter2.e;
                if (instrumentsCollectionFilterId2 == BondsCollectionFilterId.YIELD_TO_MATURITY) {
                    r70VarA = kch.c.a(filter2, yoj.b.m(new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(a0.d.h(range.f95297a, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(a0.d.h(range.f95298b, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126))), new TextClause(a0.d.h(i6, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(a0.d.h(i5, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                } else {
                    if (instrumentsCollectionFilterId2 != BondsCollectionFilterId.MATURITY) {
                        throw new NotImplementedError(null, 1, null);
                    }
                    int i21 = range.f95297a;
                    int i22 = range.f95298b;
                    r70VarA = kch.c.a(filter2, yoj.b.m(new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextClause(String.valueOf(i21), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), i22 == i5 ? new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_range_picker_years_plus, u.c(Integer.valueOf(i22)), null, 12) : new TextLocalisedQuantityClause(R$plurals.wealth_trading_bonds_filtering_range_picker_years, Integer.valueOf(i22), u.c(Integer.valueOf(i22)), (Style) null, 24))), new TextLocalisedQuantityClause(R$plurals.wealth_trading_bonds_filtering_range_picker_years, Integer.valueOf(i6), u.c(Integer.valueOf(i6)), (Style) null, 24), new TextLocalisedClause(R$string.wealth_trading_bonds_filtering_range_picker_years_plus, u.c(Integer.valueOf(i5)), null, 12));
                }
                r70 r70Var = r70VarA;
                yp0.b.l(r70Var, 0, 0, 0, 0, null, false, 63);
                collectionK = v.k(model, r70Var);
            }
            arrayList.add(collectionK);
            i = 14;
            i2 = 10;
        }
        return new o(textLocalisedClause, listL, textLocalisedClause2, w.u(arrayList));
    }
}
