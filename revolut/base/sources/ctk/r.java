package ctk;

import com.revolut.feature.wealth.api.declaration.InstrumentsCollectionDestination;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f108698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f108699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f108700n;

    public r(h inputData, c similarToCollectionProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(similarToCollectionProvider, "similarToCollectionProvider");
        this.f108698l = inputData;
        this.f108699m = similarToCollectionProvider;
        this.f108700n = pyd.c.a(this, new l(null, inputData.f108687a));
    }

    @Override // yji.n
    public final void H2() {
        String ref2 = this.f108698l.f108687a;
        c cVar = this.f108699m;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        yji.n.l2(this, new b(cVar.f108683a.d(new InstrumentsCollectionType.Related.Instruments(ref2), new InstrumentsCollectionSortOption.MostTraded(null), f0.f322471a, false), ref2, 0), null, new ck7.j(this, null, 21), 3);
    }

    @Override // ctk.e
    public final void Z2(k navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        if (navigation instanceof i) {
            A2(new AssetDetailsDestination(((i) navigation).f108688a, null, false, null, null, null, 62));
        } else {
            if (!(navigation instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(new InstrumentsCollectionDestination(new InstrumentsCollectionType.Related.Instruments(((j) navigation).f108689a)));
        }
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f108700n;
    }
}
