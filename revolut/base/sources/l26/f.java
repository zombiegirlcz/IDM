package l26;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mjf.b0;
import p26.k;
import p26.n;
import pt5.m;
import tof.m0;
import vkm.j2;
import vkm.q;
import vkm.t0;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends oki.h implements d8j.f {
    public final DeFiAssetDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g26.b f191670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p26.f f191671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p26.c f191672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c8j.c f191673s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w7j.a f191674t;
    public final sh5.d u;
    public final o26.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f191675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f191676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f191677y;

    public f(h stateMapper, DeFiAssetDetailsScreenContract$InputData inputData, g26.b assetDetailsInteractor, p26.f chartUIStateProvider, p26.c chartDataSource, c8j.c statsModelExtension, w7j.a aboutModelExtension, sh5.d cryptoFcaDisclaimerWidget, o26.a actionsModelExtension, m activityWidgetExtension, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(assetDetailsInteractor, "assetDetailsInteractor");
        Intrinsics.checkNotNullParameter(chartUIStateProvider, "chartUIStateProvider");
        Intrinsics.checkNotNullParameter(chartDataSource, "chartDataSource");
        Intrinsics.checkNotNullParameter(statsModelExtension, "statsModelExtension");
        Intrinsics.checkNotNullParameter(aboutModelExtension, "aboutModelExtension");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(actionsModelExtension, "actionsModelExtension");
        Intrinsics.checkNotNullParameter(activityWidgetExtension, "activityWidgetExtension");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.o = inputData;
        this.f191670p = assetDetailsInteractor;
        this.f191671q = chartUIStateProvider;
        this.f191672r = chartDataSource;
        this.f191673s = statsModelExtension;
        this.f191674t = aboutModelExtension;
        this.u = cryptoFcaDisclaimerWidget;
        this.v = actionsModelExtension;
        this.f191675w = activityWidgetExtension;
        this.f191676x = transactionsInteractor;
        this.f191677y = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        DeFiAssetDetailsScreenContract$InputData deFiAssetDetailsScreenContract$InputData = this.o;
        String str = deFiAssetDetailsScreenContract$InputData.f71679a.f306286a;
        g26.b bVar = this.f191670p;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        l.b1(this, bVar.b(str, hVar), null, new e(this, continuation, 2), 3);
        n2(new d(this, continuation, 1), new whi.b(6));
        p26.c cVar = this.f191672r;
        int i = 16;
        int i2 = 14;
        l.b1(this, q.Q(new oi3.g(rd0.e.b(xv5.c.b(cVar.f232081c)), cVar, i), new okf.m(continuation, cVar, i2)), null, new e(this, continuation, 4), 3);
        y yVar = this.f191677y;
        boolean zIsEmpty = ((b) ((j2) yVar.f22677a).getValue()).f191662c.isEmpty();
        n nVar = (n) this.f191671q;
        njj.l lVar = new njj.l(nVar.d.f2266b, 10);
        wkm.l lVarQ = q.Q(lVar, new okf.m(continuation, nVar, 15));
        wkm.l lVarA = nVar.f232097c.a(nVar.f232095a.f71679a.f306286a, hVar);
        t0 t0Var = new t0(nVar.f, 1);
        p26.c cVar2 = nVar.f232096b;
        cVar2.getClass();
        l.b1(this, new vkm.y(new l10.m(zIsEmpty, nVar, (Continuation) null), new ahe.l(new t38.e(ta6.a.e(lVarQ, lVar, t0Var, new go.g(new Data(null, null, false, 7, null), 2), q.Q(new oi3.g(rd0.e.b(xv5.c.b(cVar2.f232081c)), cVar2, i), new okf.m(continuation, cVar2, i2)), new p26.l(null)), 24, lVarA, new k(nVar, null)), 11)), null, new e(this, continuation, 3), 3);
        l.b1(this, q.Q(new t0(yVar.B(new l0g.a(23)), 1), new a3(continuation, this, i)), null, new e(this, continuation, 5), 3);
        xi0.b bVar2 = deFiAssetDetailsScreenContract$InputData.f71679a;
        int i3 = 0;
        l.b1(this, this.f191674t.Z2(bVar2), null, new e(this, continuation, i3), 3);
        l.b1(this, this.v.Z2(), null, new e(this, continuation, 1), 3);
        m mVar = this.f191675w;
        mVar.m3(bVar2);
        l.b1(this, mVar.l3(), null, new e(this, continuation, 6), 3);
        ((b0) this.f191676x).t(m0.f272923a);
        n2(new d(this, continuation, i3), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f191677y;
    }

    @Override // d8j.f
    public final void l(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) this.u).d(clickData);
        if (cryptoFcaRisksDestinationD != null) {
            C1(cryptoFcaRisksDestinationD);
        }
    }
}
