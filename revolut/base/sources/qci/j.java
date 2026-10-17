package qci;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.CountriesSelectionScreenContract$InputData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import q2j.v;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountriesSelectionScreenContract$InputData f244801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f244802b;

    public j(CountriesSelectionScreenContract$InputData inputData, l countriesStateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countriesStateMapper, "countriesStateMapper");
        this.f244801a = inputData;
        this.f244802b = countriesStateMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        ListSubheaderDelegate.Model modelA;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String query = domainState.f244792b;
        CountriesSelectionScreenContract$InputData countriesSelectionScreenContract$InputData = this.f244801a;
        ArrayList<wi0.b> suggestedCountries = countriesSelectionScreenContract$InputData.e;
        ArrayList<wi0.b> allCountries = countriesSelectionScreenContract$InputData.f;
        Set selectedDestinations = domainState.f244791a;
        l lVar = this.f244802b;
        CountriesSelectionScreenContract$InputData countriesSelectionScreenContract$InputData2 = lVar.f244803a;
        f01.a aVar = lVar.f244804b.f219016a;
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        Intrinsics.checkNotNullParameter(allCountries, "allCountries");
        Intrinsics.checkNotNullParameter(selectedDestinations, "selectedDestinations");
        Intrinsics.checkNotNullParameter(query, "query");
        ArrayList arrayList = new ArrayList(w.t(suggestedCountries, 10));
        for (wi0.b countryCode : suggestedCountries) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            arrayList.add(new b(countryCode, aVar.b(new CountryClause(countryCode, null)).toString()));
        }
        ArrayList arrayList2 = new ArrayList(w.t(allCountries, 10));
        for (wi0.b countryCode2 : allCountries) {
            Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
            arrayList2.add(new b(countryCode2, aVar.b(new CountryClause(countryCode2, null)).toString()));
        }
        ?? arrayList3 = new ArrayList();
        if (query.length() == 0) {
            if (arrayList.isEmpty()) {
                z = false;
            } else {
                if (countriesSelectionScreenContract$InputData2.f97760h) {
                    z = false;
                    modelA = new ListSubheaderDelegate.Model("SUGGESTED_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.transaction_countries_section_header_suggested, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) "SUGGESTED_HEADER_ID", (Parcelable) null, 0, 0, 0, 0, 64506);
                } else {
                    z = false;
                    modelA = l.a();
                }
                arrayList3.add(modelA);
                a0.x(lVar.b(d0.P0(arrayList, new v(new v(lVar, 2), 3)), selectedDestinations), arrayList3);
            }
            if (!arrayList2.isEmpty()) {
                ListSubheaderDelegate.Model modelA2 = (arrayList.isEmpty() || countriesSelectionScreenContract$InputData2.f97760h) ? l.a() : null;
                if (modelA2 != null) {
                    arrayList3.add(modelA2);
                }
                a0.x(lVar.b(d0.P0(arrayList2, new v(new v(lVar, 2), 3)), selectedDestinations), arrayList3);
            }
        } else {
            z = false;
            ArrayList countries = d0.E0(arrayList, arrayList2);
            Intrinsics.checkNotNullParameter(countries, "countries");
            Intrinsics.checkNotNullParameter(query, "query");
            List listU = d0.U(countries);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : listU) {
                b bVar = (b) obj2;
                if (kotlin.text.d0.J(bVar.f244790b, query, true) || kotlin.text.d0.J(bVar.f244789a.f297794a, query, true)) {
                    arrayList4.add(obj2);
                }
            }
            a0.x(lVar.b(d0.P0(arrayList4, new ob0.l(cim.b.a(new qc0.w(query, 4), new qc0.w(query, 5)), 2)), selectedDestinations), arrayList3);
        }
        boolean z3 = (query.length() <= 0 || !arrayList3.isEmpty()) ? z : true;
        if (z3) {
            List listC = u.c(new FullScreenStateDelegate.Model("NO_SEARCH_RESULT_LIST_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.search_empty_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, null, 2020));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            arrayList3 = listC;
        }
        return new h(arrayList3, !selectedDestinations.isEmpty(), !z3, query, countriesSelectionScreenContract$InputData.d ? new TextNavBarMenuItem("SKIP_ITEM_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_skip, null, null, 14), null, null, 12) : null);
    }
}
