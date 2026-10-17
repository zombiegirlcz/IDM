package nch;

import cli.y;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterValueId;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all.InstrumentsCollectionFiltersSeeAllControllerContract$InputData;
import ich.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends oki.h implements e {
    public final f01.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f214194p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f214195q;

    public k(l stateMapper, InstrumentsCollectionFiltersSeeAllControllerContract$InputData inputData, f01.a uiKitResources, t filtersMutator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(filtersMutator, "filtersMutator");
        this.o = uiKitResources;
        this.f214194p = filtersMutator;
        InstrumentsCollectionFilter.ListFilter listFilter = inputData.f95622a;
        List list = listFilter.f95291c;
        m70.a.c(t0.f186434a);
        this.f214195q = mra.d.b(this, new f(listFilter, list, ""), stateMapper, null, false, 12);
    }

    public final ArrayList I2(String query, List list) {
        wi0.b bVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(query, "query");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            InstrumentsCollectionFilter.ListFilter.Value value = (InstrumentsCollectionFilter.ListFilter.Value) obj2;
            if (!d0.W(query)) {
                if (!jli.g.h(this.o.b(adh.d.a(value.f95292a)).toString(), query)) {
                    InstrumentsCollectionFilterValueId instrumentsCollectionFilterValueId = value.f95292a;
                    String str = null;
                    InstrumentsCollectionFilterValueId.BondsIssuerCountry bondsIssuerCountry = instrumentsCollectionFilterValueId instanceof InstrumentsCollectionFilterValueId.BondsIssuerCountry ? (InstrumentsCollectionFilterValueId.BondsIssuerCountry) instrumentsCollectionFilterValueId : null;
                    if (bondsIssuerCountry != null && (bVar = bondsIssuerCountry.f95305a) != null) {
                        str = bVar.f297794a;
                    }
                    if (jli.g.h(str, query)) {
                    }
                }
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f214195q;
    }
}
