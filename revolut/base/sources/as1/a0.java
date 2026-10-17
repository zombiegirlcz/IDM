package as1;

import aqd.h1;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import ip0.v7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends oki.h implements m {
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zof.f f8754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wo1.b f8755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f8756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l2j.a f8757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tr1.g f8758t;
    public final abk.c u;
    public final tr1.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cli.y f8759w;

    public a0(h inputData, zof.f transferFeatureScreensProvider, wo1.b billsInteractor, wsg.n walletInteractor, l2j.a currencyChooserFlowFactory, tr1.g tapiInteractor, abk.c transferReviewScreenDialogProvider, tr1.f tapiBalanceInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(tapiInteractor, "tapiInteractor");
        Intrinsics.checkNotNullParameter(transferReviewScreenDialogProvider, "transferReviewScreenDialogProvider");
        Intrinsics.checkNotNullParameter(tapiBalanceInteractor, "tapiBalanceInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f8754p = transferFeatureScreensProvider;
        this.f8755q = billsInteractor;
        this.f8756r = walletInteractor;
        this.f8757s = currencyChooserFlowFactory;
        this.f8758t = tapiInteractor;
        this.u = transferReviewScreenDialogProvider;
        this.v = tapiBalanceInteractor;
        dj0.d dVar = inputData.f8764b;
        BillSearchTapiResult billSearchTapiResult = inputData.f8763a;
        String str = inputData.f8765c;
        ApmQuote apmQuote = inputData.f;
        xi0.b.Companion.getClass();
        this.f8759w = mra.d.b(this, new g(dVar, billSearchTapiResult, str, null, apmQuote, new dj0.d(Long.MAX_VALUE, xi0.b.z)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new akb.s(this, continuation, 15), new yi5.b(26));
        arf.h hVar = new arf.h(2);
        cli.y yVar = this.f8759w;
        a3i.i iVar = new a3i.i(v7.w(yVar.B(hVar)), this, 23);
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.d(iVar, h0Var), null, null, new r(this, null, 1), 3);
        yji.l.a1(this, rd0.e.d(vkm.q.Q(vkm.q.r(new h1(6), new t0(yVar.B(new arf.h(3)), 1)), new a0e.m(continuation, this, 26)), h0Var), null, null, new r(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f8759w;
    }
}
