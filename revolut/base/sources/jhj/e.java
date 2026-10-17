package jhj;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanCoverageCode;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOption;
import com.revolut.retail.feature.esim.impl.R$plurals;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jhj.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.w;
import zhm.z;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public e(a optionsMapper) {
        Intrinsics.checkNotNullParameter(optionsMapper, "optionsMapper");
    }

    public static LinkedHashMap c(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Boolean boolValueOf = Boolean.valueOf(((EsimDataPlanOption.CountryOption) obj2).d);
            Object arrayList = linkedHashMap.get(boolValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(boolValueOf, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        List list2 = (List) linkedHashMap.get(Boolean.FALSE);
        if (list2 != null && list2.size() > 1) {
            z.w(list2, new d());
        }
        return linkedHashMap;
    }

    public final List a(Clause clause, boolean z, List list, int i) {
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model model = clause != null ? new ListSubheaderDelegate.Model("ID_SUBHEADER", (Image) null, clause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(d((EsimDataPlanOption) it8.next(), z));
        }
        if (model != null) {
            return yp0.b.g(arrayList, model, null, 0, i, LDSFile.EF_DG4_TAG);
        }
        yp0.b.k(arrayList, 0, i, 0, 0, 29);
        return arrayList;
    }

    public final List b(b groupingType, List countries) {
        Intrinsics.checkNotNullParameter(groupingType, "groupingType");
        Intrinsics.checkNotNullParameter(countries, "countries");
        if (groupingType instanceof b.C0992b) {
            b.C0992b c0992b = (b.C0992b) groupingType;
            return a(c0992b.f174274a, c0992b.f174275b, countries, R$attr.uikit_dp24);
        }
        if (!(groupingType instanceof b.c)) {
            if (!(groupingType instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashMap linkedHashMapC = c(countries);
            List list = (List) linkedHashMapC.get(Boolean.FALSE);
            if (list == null) {
                list = f0.f322471a;
            }
            List listA = a(new TextLocalisedClause(R$string.esim_country_picker_data_calls_sms_title, null, null, 14), true, list, R$attr.uikit_dp24);
            if (list.size() == countries.size()) {
                return listA;
            }
            List list2 = (List) linkedHashMapC.get(Boolean.TRUE);
            if (list2 == null) {
                list2 = f0.f322471a;
            }
            return d0.E0(a(new TextLocalisedClause(R$string.esim_country_picker_data_only_title, null, null, 14), true, list2, R$attr.uikit_dp24), listA);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : countries) {
            if (((EsimDataPlanOption.CountryOption) obj2).f100240c) {
                arrayList.add(obj2);
            }
        }
        List listV0 = d0.V0(d0.P0(arrayList, new c()), 3);
        ArrayList arrayList2 = new ArrayList(w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList2.add(d((EsimDataPlanOption.CountryOption) it8.next(), true));
        }
        e0 e0Var = e0.OUTSIDE_BOX;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        if (!arrayList2.isEmpty()) {
            arrayList2 = yp0.b.d(arrayList2, new ListSubheaderDelegate.Model("ID_POPULAR_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.esim_country_picker_popular_destinations_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0Var, i, i, i2, i2);
        }
        return d0.E0(a(new TextLocalisedClause(R$string.esim_country_picker_supported_countries_title, null, null, 14), true, countries, R$attr.uikit_dp24), arrayList2);
    }

    public final RowDelegate.Model d(EsimDataPlanOption option, boolean z) {
        Intrinsics.checkNotNullParameter(option, "option");
        if (option instanceof EsimDataPlanOption.CountryOption) {
            EsimDataPlanOption.CountryOption countryOption = (EsimDataPlanOption.CountryOption) option;
            wi0.b bVar = countryOption.f100238a;
            return new RowDelegate.Model(bVar.f297794a, new RowDelegate.Model.MainImage.Image40(ynj.e.a(bVar), null, null, false, null, false, 62), new CountryClause(bVar, null), null, 0, null, null, null, 0, null, z, null, false, null, null, null, null, null, null, countryOption, null, 0, 0, 0, 0, 532674552);
        }
        if (option instanceof EsimDataPlanOption.RegionalOption) {
            EsimDataPlanOption.RegionalOption regionalOption = (EsimDataPlanOption.RegionalOption) option;
            EsimDataPlanCoverageCode coverageCode = regionalOption.f100244a;
            String str = "ID_REGION_ITEM_" + coverageCode.f100235a;
            Intrinsics.checkNotNullParameter(coverageCode, "regionCoverageCode");
            Clause clauseN = ynj.e.n(coverageCode);
            TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.esim_data_plans_number_of_countries, Integer.valueOf(regionalOption.f100245b.size()), (List) null, (Style) null, 28);
            ynj.c config = ynj.c.BORDERED;
            Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
            Intrinsics.checkNotNullParameter(config, "config");
            return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(ynj.e.e(ynj.e.m(coverageCode), config), null, null, false, null, false, 62), clauseN, null, 0, textLocalisedQuantityClause, null, null, 0, null, z, null, false, null, null, null, null, null, null, regionalOption, null, 0, 0, 0, 0, 532674520);
        }
        if (!(option instanceof EsimDataPlanOption.GlobalOption)) {
            throw new NoWhenBranchMatchedException();
        }
        EsimDataPlanOption.GlobalOption globalOption = (EsimDataPlanOption.GlobalOption) option;
        EsimDataPlanCoverageCode coverageCode2 = globalOption.f100241a;
        String str2 = "ID_GLOBAL_ITEM_" + coverageCode2.f100235a;
        Intrinsics.checkNotNullParameter(coverageCode2, "regionCoverageCode");
        Clause clauseN2 = ynj.e.n(coverageCode2);
        TextLocalisedQuantityClause textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(R$plurals.esim_data_plans_number_of_countries, Integer.valueOf(globalOption.f100242b.size()), (List) null, (Style) null, 28);
        ynj.c config2 = ynj.c.BORDERED;
        Intrinsics.checkNotNullParameter(coverageCode2, "coverageCode");
        Intrinsics.checkNotNullParameter(config2, "config");
        return new RowDelegate.Model(str2, new RowDelegate.Model.MainImage.Image40(ynj.e.e(ynj.e.m(coverageCode2), config2), null, null, false, null, false, 62), clauseN2, null, 0, textLocalisedQuantityClause2, null, null, 0, null, z, null, false, null, null, null, null, null, null, globalOption, null, 0, 0, 0, 0, 532674520);
    }
}
