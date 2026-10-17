package gtk;

import com.revolut.retail.feature.stockdetails.api.StockDetailsApi$Toggles$InstrumentSuggestion;
import com.revolut.retail.feature.stockdetails.impl.navigation.destinations.InsightsDestination;
import fq7.j;
import ft4.w;
import ftk.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import ybl.l;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ftk.e f146628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ftk.d f146629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f146630n;
    public final kdh.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gdh.a f146631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f146632q;

    public f(ftk.e inputData, ftk.d suggestionProvider, gte.a featureToggle, kdh.b instrumentActionsInteractor, gdh.a navigationExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(suggestionProvider, "suggestionProvider");
        Intrinsics.checkNotNullParameter(featureToggle, "featureToggle");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        this.f146628l = inputData;
        this.f146629m = suggestionProvider;
        this.f146630n = featureToggle;
        this.o = instrumentActionsInteractor;
        this.f146631p = navigationExtension;
        this.f146632q = pyd.c.a(this, null);
    }

    @Override // yji.n
    public final void H2() {
        if (((jte.d) this.f146630n).c(StockDetailsApi$Toggles$InstrumentSuggestion.f103735c)) {
            String ref2 = this.f146628l.f138037a;
            ftk.d dVar = this.f146629m;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Continuation continuation = null;
            n.l2(this, q.Q(mo3.a.g(nim.a.v(l.d(dVar.e), new w(4)), null, new j(14), 1), new ftk.b(continuation, dVar, ref2, 1)), null, new gii.b(this, continuation, 27), 3);
        }
    }

    @Override // ftk.k
    public final void Z2() {
        ftk.e eVar = this.f146628l;
        B2(new InsightsDestination(new InsightsDestination.InputData(eVar.f138037a, eVar.f138038b)));
    }

    @Override // ftk.k
    public final void b3() {
        n.l2(this, nim.a.v(kdh.b.b0(this.o, this.f146628l.f138037a, 6), new gmk.j(this, 18)), null, null, 7);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f146632q;
    }
}
