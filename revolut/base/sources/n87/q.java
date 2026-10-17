package n87;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends oki.h implements dli.b {
    public final ou5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s4i.i f213264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qrk.d f213265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aah.h f213266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f213267s;

    public q(t stateMapper, GlobalMarketsCollectionScreenContract$InputData inputData, ou5.b globalMarketsCollectionProvider, s4i.i globalMarketsAssetDetailsProvider, qrk.d widgetDismissStatusInteractor, aah.h wealthDisclaimersControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(globalMarketsCollectionProvider, "globalMarketsCollectionProvider");
        Intrinsics.checkNotNullParameter(globalMarketsAssetDetailsProvider, "globalMarketsAssetDetailsProvider");
        Intrinsics.checkNotNullParameter(widgetDismissStatusInteractor, "widgetDismissStatusInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        this.o = globalMarketsCollectionProvider;
        this.f213264p = globalMarketsAssetDetailsProvider;
        this.f213265q = widgetDismissStatusInteractor;
        this.f213266r = wealthDisclaimersControllerModelExtension;
        this.f213267s = mra.d.b(this, new k(inputData.f74598a, null, false, null, new Data(null, null, false, 7, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nim.a.v(this.f213266r.f2828l.w0(), new n5k.c(19)), null, null, new p(this, null, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, this.o.v(((k) ((j2) this.f213267s.f22677a).getValue()).f213254a), null, new p(this, null, 0), 3);
        yji.l.b1(this, this.f213265q.a(tqk.a.GLOBAL_MARKETS_COLLECTION_REORDER, ""), null, new jkh.g(this, (Continuation) null, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f213267s;
    }
}
