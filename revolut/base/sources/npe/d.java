package npe;

import akg.n;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o8b.g;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import s7a.c0;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends x7a.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.b f218196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f218197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f218198c;
    public final LinkedHashMap d;

    public d(n8b.b countryUtils) {
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        this.f218196a = countryUtils;
        this.f218198c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public static ListSubheaderDelegate.Model q(int i, String str) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        wi0.a aVar = wi0.b.Companion;
        String str = (String) d0.a0(ids);
        aVar.getClass();
        return new c(wi0.a.a(str));
    }

    @Override // x7a.c, x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        List listD = super.d(data, selectedModelIds, list, query, obj2);
        Object content = data.getContent();
        x7a.a aVar = content instanceof x7a.a ? (x7a.a) content : null;
        if (aVar == null) {
            return f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : listD) {
            if (aVar.f303175a.contains(com.bumptech.glide.d.c(((i) obj3).getF55277b()))) {
                arrayList.add(obj3);
            } else {
                arrayList2.add(obj3);
            }
        }
        boolean z = (query.length() != 0 || arrayList.isEmpty() || arrayList2.isEmpty()) ? false : true;
        aim.e eVarB = u.b();
        if (!arrayList.isEmpty()) {
            if (z) {
                eVarB.add(q(R$string.tin_flow_tax_country_selection_subtitle_suggested_countries, "suggested_countries_header"));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            if (z) {
                eVarB.add(q(R$string.tin_flow_tax_country_selection_subtitle_all_countries, "other_countries_header"));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList2);
        }
        return u.a(eVarB);
    }

    @Override // x7a.c
    public final ff i() {
        return ff.DP_40;
    }

    @Override // x7a.c
    public final String j(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        LinkedHashMap linkedHashMap = this.d;
        Object obj2 = linkedHashMap.get(countryCode);
        if (obj2 == null) {
            b bVar = this.f218197b;
            if (bVar == null) {
                Intrinsics.r("inputData");
                throw null;
            }
            CountryRule countryRule = (CountryRule) bVar.f218194b.get(countryCode);
            obj2 = (countryRule != null && countryRule.f90154a) ? countryRule.e : null;
            if (obj2 == null) {
                obj2 = "";
            }
            linkedHashMap.put(countryCode, obj2);
        }
        return (String) (kotlin.text.d0.W((String) obj2) ? null : obj2);
    }

    @Override // x7a.c
    public final String k(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        LinkedHashMap linkedHashMap = this.f218198c;
        Object objA = linkedHashMap.get(countryCode);
        if (objA == null) {
            objA = ((g) this.f218196a).a(countryCode.f297794a);
            linkedHashMap.put(countryCode, objA);
        }
        return (String) objA;
    }

    @Override // x7a.c
    public final Flow m(Object obj2) {
        b bVar = this.f218197b;
        if (bVar != null) {
            return zi0.c.i(d0.d1(bVar.f218194b.keySet()));
        }
        Intrinsics.r("inputData");
        throw null;
    }

    @Override // x7a.c
    public final n n(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.v2.ui.country_picker.TaxResidencyCountryPickerInteractor.InputData");
        this.f218197b = (b) obj2;
        return super.n(obj2);
    }

    @Override // x7a.c
    public final Flow o(Object obj2) {
        b bVar = this.f218197b;
        if (bVar != null) {
            return zi0.c.i(bVar.f218193a);
        }
        Intrinsics.r("inputData");
        throw null;
    }
}
