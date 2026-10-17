package h52;

import ag1.k;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.transfer.core.models.FundingSource;
import efm.r;
import ghk.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l12.f;
import l12.g;
import l12.h;
import l12.i;
import l1l.s;
import te0.w;
import vkm.j2;
import vkm.q;
import yji.n;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ApmTransferContract$InputData f149437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wsg.n f149438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u5k.c f149439n;
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l12.c f149440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f149441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f149442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f149443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f149444t;

    public e(ApmTransferContract$InputData inputData, wsg.n walletInteractor, u5k.c transferWalletLimitsInteractor, g transferErrorStateMapper, l12.c transferAmountBalanceValidator, f transferDecimalsValidator, i transferLimitsValidator, s commonWalletLimitsValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transferWalletLimitsInteractor, "transferWalletLimitsInteractor");
        Intrinsics.checkNotNullParameter(transferErrorStateMapper, "transferErrorStateMapper");
        Intrinsics.checkNotNullParameter(transferAmountBalanceValidator, "transferAmountBalanceValidator");
        Intrinsics.checkNotNullParameter(transferDecimalsValidator, "transferDecimalsValidator");
        Intrinsics.checkNotNullParameter(transferLimitsValidator, "transferLimitsValidator");
        Intrinsics.checkNotNullParameter(commonWalletLimitsValidator, "commonWalletLimitsValidator");
        this.f149437l = inputData;
        this.f149438m = walletInteractor;
        this.f149439n = transferWalletLimitsInteractor;
        this.o = transferErrorStateMapper;
        this.f149440p = transferAmountBalanceValidator;
        this.f149441q = transferDecimalsValidator;
        this.f149442r = transferLimitsValidator;
        this.f149443s = commonWalletLimitsValidator;
        this.f149444t = q.c(new a(f0.f322471a));
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, rd0.e.b(m70.a.g(osg.b.k(this.f149438m, true, 2), null, null, 3)), null, new b(this, null), 3);
    }

    public final a0 Z2(TransferData transferData, m02.a aVar) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        r rVarH = w.h(((a) this.f149444t.getValue()).f149433a);
        r rVarH2 = w.h(transferData.getF72729b());
        r rVarX = this.f149438m.x(AccountId.Personal.f51414a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r map = ((u5k.d) this.f149439n).b(rVarH, rVarH2, rVarX).map(new h0l.g(new gvi.s(this, transferData, 22), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        vkm.d dVarB = rd0.e.b(map);
        FundingSource fundingSource = transferData.f62453a;
        long j2 = fundingSource.getF92243g().f115082a;
        long j3 = transferData.f62454b;
        xi0.b bVar = transferData.f62455c;
        xi0.b bVar2 = fundingSource.f92241b;
        ApmQuote apmQuote = aVar != null ? aVar.f201040a : null;
        ApmTransferContract$InputData apmTransferContract$InputData = this.f149437l;
        l12.d dVar = new l12.d(j2, j3, bVar, bVar2, apmQuote, apmTransferContract$InputData.f62280a.f62293a);
        this.f149440p.getClass();
        go.g gVar = new go.g(l12.c.a(dVar).f316033b, 2);
        l12.e eVar = new l12.e(transferData.getF72729b(), aVar != null ? aVar.f201042c : true);
        this.f149441q.getClass();
        go.g gVar2 = new go.g(f.a(eVar).f316033b, 2);
        h hVar = new h(transferData.f62454b, apmTransferContract$InputData.f62280a.f62293a, aVar != null ? aVar.f201041b : null);
        this.f149442r.getClass();
        return new a0(new k((Flow[]) d0.d1(v.k(dVarB, gVar, gVar2, new go.g(i.a(hVar).f316033b, 2), new go.g(transferData.e.length() > 100 ? u.c(srf.f.f265211a) : f0.f322471a, 2))).toArray(new Flow[0]), 23), this, 10);
    }
}
