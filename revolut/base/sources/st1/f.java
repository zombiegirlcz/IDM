package st1;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.transfer.core.models.FundingSource;
import e7l.g;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l1l.q;
import l1l.s;
import od0.i;
import s6e.v;
import sdi.k;
import ss4.z;
import te0.w;
import vkm.j2;
import w4l.h;
import yji.n;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends n implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BizumTransferInputData f265439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fk3.a f265440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wsg.n f265441n;
    public final u5k.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f265442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tt1.a f265443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tt1.e f265444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f265445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f265446t;
    public final j2 u;

    public f(BizumTransferInputData inputData, fk3.a configurationInteractor, wsg.n walletInteractor, u5k.c transferWalletLimitsInteractor, a transferErrorStateMapper, tt1.a bizumTransferAmountBalanceValidator, tt1.e bizumTransferLimitsValidator, s commonWalletLimitsValidator, q commonTransferNoteLengthValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transferWalletLimitsInteractor, "transferWalletLimitsInteractor");
        Intrinsics.checkNotNullParameter(transferErrorStateMapper, "transferErrorStateMapper");
        Intrinsics.checkNotNullParameter(bizumTransferAmountBalanceValidator, "bizumTransferAmountBalanceValidator");
        Intrinsics.checkNotNullParameter(bizumTransferLimitsValidator, "bizumTransferLimitsValidator");
        Intrinsics.checkNotNullParameter(commonWalletLimitsValidator, "commonWalletLimitsValidator");
        Intrinsics.checkNotNullParameter(commonTransferNoteLengthValidator, "commonTransferNoteLengthValidator");
        this.f265439l = inputData;
        this.f265440m = configurationInteractor;
        this.f265441n = walletInteractor;
        this.o = transferWalletLimitsInteractor;
        this.f265442p = transferErrorStateMapper;
        this.f265443q = bizumTransferAmountBalanceValidator;
        this.f265444r = bizumTransferLimitsValidator;
        this.f265445s = commonWalletLimitsValidator;
        this.f265446t = commonTransferNoteLengthValidator;
        this.u = vkm.q.c(new c(null, f0.f322471a));
    }

    @Override // yji.n
    public final void D2() {
        r map = m70.a.g(((ik3.c) this.f265440m).l(g.b.f123407a, h.f294642c), null, null, 3).map(new sp5.h(17, new z(6)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        i.Companion.getClass();
        n.j2(this, rd0.e.b(ue0.e.E(map, i.f224256b)), null, new sek.q(this, null, 19), 3);
        n.j2(this, rd0.e.b(m70.a.g(osg.b.k(this.f265441n, true, 2), null, null, 3)), null, new d(this, null), 3);
    }

    public final v Z2(BizumTransferData transferData, ApmQuote apmQuote) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        j2 j2Var = this.u;
        r rVarH = w.h(((c) j2Var.getValue()).f265437b);
        r rVarH2 = w.h(transferData.getF72729b());
        r rVarX = this.f265441n.x(AccountId.Personal.f51414a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r map = ((u5k.d) this.o).b(rVarH, rVarH2, rVarX).map(new sp5.h(18, new k(this, transferData, 25)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        vkm.d dVarB = rd0.e.b(map);
        FundingSource fundingSource = transferData.f61631a;
        long j2 = fundingSource.getF92243g().f115082a;
        long j3 = transferData.f61632b;
        xi0.b bVar = gs1.b.f146272a;
        xi0.b bVar2 = fundingSource.f92241b;
        BizumTransferInputData bizumTransferInputData = this.f265439l;
        tt1.b bVar3 = new tt1.b(j2, j3, bVar, bVar2, apmQuote, bizumTransferInputData.f61562b);
        this.f265443q.getClass();
        go.g gVar = new go.g(tt1.a.a(bVar3).f316033b, 2);
        tt1.c cVar = new tt1.c(transferData.f61632b, bizumTransferInputData.f61562b, ((c) j2Var.getValue()).f265436a);
        this.f265444r.getClass();
        go.g gVar2 = new go.g(tt1.e.b(cVar).f316033b, 2);
        String str = transferData.d;
        this.f265446t.getClass();
        return new v(new j23.b((Flow[]) d0.d1(zhm.v.k(dVarB, gVar, gVar2, new go.g(q.a(str), 2))).toArray(new Flow[0]), 19), this, 12);
    }
}
