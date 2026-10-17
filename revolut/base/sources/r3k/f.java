package r3k;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import efm.r;
import io3.i;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l1l.h;
import l1l.l;
import l1l.m;
import l1l.o;
import l1l.q;
import l1l.s;
import qp7.g;
import te0.w;
import vkm.j2;
import vkm.v1;
import yji.n;
import z1k.p;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends n {
    public final t3k.c A;
    public final t3k.e B;
    public final o C;
    public final h D;
    public final j2 E;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RemittanceAmountScreenContract$InputData f251306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a4k.a f251307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f251308n;
    public final g3k.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k61.a f251309p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u5k.c f251310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f251311r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f251312s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l1l.a f251313t;
    public final l1l.d u;
    public final s v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f251314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q f251315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final urf.f f251316y;
    public final e5k.b z;

    public f(RemittanceAmountScreenContract$InputData inputData, a4k.a transferDataObservable, a transferErrorStateMapper, g3k.d remittanceInteractor, k61.a transferInteractor, u5k.c transferWalletLimitsInteractor, wsg.n walletInteractor, ang.f userInteractor, l1l.a commonAmountDecimalValidator, l1l.d commonAmountMultipleValidator, s commonWalletLimitsValidator, m commonMaxTransferAmountValidator, q commonTransferNoteLengthValidator, urf.f amountTransferLimitsValidator, e5k.b remittanceAmountBalanceValidator, t3k.c remittanceFeeOptionValidator, t3k.e remittanceRouteValidator, o commonPocketTransferLimitValidator, h commonTransferAvailabilityValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferDataObservable, "transferDataObservable");
        Intrinsics.checkNotNullParameter(transferErrorStateMapper, "transferErrorStateMapper");
        Intrinsics.checkNotNullParameter(remittanceInteractor, "remittanceInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transferWalletLimitsInteractor, "transferWalletLimitsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(commonAmountDecimalValidator, "commonAmountDecimalValidator");
        Intrinsics.checkNotNullParameter(commonAmountMultipleValidator, "commonAmountMultipleValidator");
        Intrinsics.checkNotNullParameter(commonWalletLimitsValidator, "commonWalletLimitsValidator");
        Intrinsics.checkNotNullParameter(commonMaxTransferAmountValidator, "commonMaxTransferAmountValidator");
        Intrinsics.checkNotNullParameter(commonTransferNoteLengthValidator, "commonTransferNoteLengthValidator");
        Intrinsics.checkNotNullParameter(amountTransferLimitsValidator, "amountTransferLimitsValidator");
        Intrinsics.checkNotNullParameter(remittanceAmountBalanceValidator, "remittanceAmountBalanceValidator");
        Intrinsics.checkNotNullParameter(remittanceFeeOptionValidator, "remittanceFeeOptionValidator");
        Intrinsics.checkNotNullParameter(remittanceRouteValidator, "remittanceRouteValidator");
        Intrinsics.checkNotNullParameter(commonPocketTransferLimitValidator, "commonPocketTransferLimitValidator");
        Intrinsics.checkNotNullParameter(commonTransferAvailabilityValidator, "commonTransferAvailabilityValidator");
        this.f251306l = inputData;
        this.f251307m = transferDataObservable;
        this.f251308n = transferErrorStateMapper;
        this.o = remittanceInteractor;
        this.f251309p = transferInteractor;
        this.f251310q = transferWalletLimitsInteractor;
        this.f251311r = walletInteractor;
        this.f251312s = userInteractor;
        this.f251313t = commonAmountDecimalValidator;
        this.u = commonAmountMultipleValidator;
        this.v = commonWalletLimitsValidator;
        this.f251314w = commonMaxTransferAmountValidator;
        this.f251315x = commonTransferNoteLengthValidator;
        this.f251316y = amountTransferLimitsValidator;
        this.z = remittanceAmountBalanceValidator;
        this.A = remittanceFeeOptionValidator;
        this.B = remittanceRouteValidator;
        this.C = commonPocketTransferLimitValidator;
        this.D = commonTransferAvailabilityValidator;
        this.E = vkm.q.c(new b(f0.f322471a, null, new Data(null, null, false, 7, null), new Data(null, null, false, 7, null)));
    }

    @Override // yji.n
    public final void D2() {
        Continuation continuation = null;
        n.j2(this, rd0.e.b(m70.a.g(this.f251311r.U(this.f251306l.getF102029b().getF92255a(), true), null, null, 3)), null, new d(this, null), 3);
        r rVarDistinctUntilChanged = this.f251307m.f255130a.map(new r25.c(22, new r2d.d(19))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        n.j2(this, vkm.q.Q(rd0.e.b(rVarDistinctUntilChanged), new c(continuation, this, 0)), null, new g(this, continuation, 27), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qna.n Z2(RemittanceTransferData transferData, e3k.d routeData, long j2) {
        char c2;
        f fVar;
        v1 v1Var;
        List list;
        v1 v1Var2;
        go.g gVar;
        go.g gVar2;
        RemittanceTransferData remittanceTransferData;
        Object obj2;
        yqi.d dVarA;
        char c3;
        Flow gVar3;
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(routeData, "routeData");
        Intrinsics.checkNotNullParameter(routeData, "<this>");
        Continuation continuation = null;
        e3k.b bVar = routeData instanceof e3k.b ? (e3k.b) routeData : null;
        p pVar = bVar != null ? bVar.f122336a : null;
        go.g gVar4 = new go.g(this.D.b(new l1l.p(pVar != null ? pVar.e : null)).f316033b, 2);
        dj0.d dVar = transferData.f102057n;
        FundingSource fundingSource = transferData.d;
        j2 j2Var = this.E;
        l1l.b bVar2 = new l1l.b(((b) j2Var.getValue()).d, dVar);
        this.f251313t.getClass();
        go.g gVar5 = new go.g(l1l.a.a(bVar2).f316033b, 2);
        l1l.c cVar = new l1l.c(((b) j2Var.getValue()).d, dVar);
        this.u.getClass();
        go.g gVar6 = new go.g(l1l.d.a(cVar).f316033b, 2);
        v1 v1Var3 = new v1(new qd8.e((Object) this, (Object) transferData, false, continuation, 22));
        dj0.d dVar2 = ((b) j2Var.getValue()).f251300b;
        l lVar = new l(dVar, dVar2 != null ? dVar2.f115082a : 0L);
        this.f251314w.getClass();
        vkm.d dVarB = rd0.e.b(w.h(m.a(lVar).f316033b));
        asa.l lVar2 = new asa.l(this, transferData);
        this.f251316y.getClass();
        v1 v1Var4 = new v1(new p8k.h(urf.f.a(lVar2), null, 1));
        if (fundingSource.d()) {
            obj2 = f0.f322471a;
            list = null;
            fVar = this;
            v1Var = v1Var4;
            v1Var2 = v1Var3;
            gVar = gVar6;
            c2 = 1;
            gVar2 = gVar4;
            remittanceTransferData = transferData;
        } else {
            c2 = 1;
            fVar = this;
            v1Var = v1Var4;
            list = null;
            v1Var2 = v1Var3;
            gVar = gVar6;
            gVar2 = gVar4;
            remittanceTransferData = transferData;
            obj2 = fVar.z.b(new t3k.a(j2, transferData.f102049a, transferData.f102050b, transferData.f102051c, routeData, transferData.i, transferData.f102053h)).f316033b;
        }
        go.g gVar7 = new go.g(obj2, 2);
        z1k.e eVar = (z1k.e) ((b) j2Var.getValue()).f251301c.getContent();
        List options = eVar != null ? eVar.getOptions() : list;
        if (options == null) {
            options = f0.f322471a;
        }
        t3k.b bVar3 = new t3k.b(options, remittanceTransferData.k != null ? c2 : 0);
        fVar.A.getClass();
        go.g gVar8 = new go.g(t3k.c.a(bVar3).f316033b, 2);
        RemittanceRouteId remittanceRouteId = remittanceTransferData.f102054j;
        t3k.d validationData = new t3k.d(remittanceRouteId);
        fVar.B.getClass();
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (remittanceRouteId instanceof RemittanceRouteId.UNKNOWN) {
            dVarA = new yqi.d(validationData, s3k.c.f259707a);
        } else {
            yqi.d.Companion.getClass();
            dVarA = yqi.c.a(validationData);
        }
        go.g gVar9 = new go.g(dVarA.f316033b, 2);
        String strA = com.revolut.retail.feature.payments.bank_transfer.api.navigation.b.a(remittanceTransferData.f);
        fVar.f251315x.getClass();
        go.g gVar10 = new go.g(q.a(strA), 2);
        int i = 3;
        if ((fundingSource instanceof PocketSource) && ((PocketSource) fundingSource).d.f163149h == i.EXTERNAL) {
            r rVarX = fVar.f251311r.x(AccountId.Personal.f51414a).x();
            Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
            r rVarFlatMap = w.F0(rVarX, w.h(dVar)).flatMap(new r25.c(24, new r38.m(fVar, i)));
            Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
            r map = rVarFlatMap.map(new r25.c(23, new r10.b(fVar, fundingSource, 27)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            gVar3 = rd0.e.b(map);
            c3 = 2;
        } else {
            c3 = 2;
            gVar3 = new go.g(f0.f322471a, 2);
        }
        Flow[] flowArr = new Flow[11];
        flowArr[0] = gVar2;
        flowArr[c2] = gVar5;
        flowArr[c3] = gVar;
        flowArr[3] = v1Var2;
        flowArr[4] = dVarB;
        flowArr[5] = v1Var;
        flowArr[6] = gVar7;
        flowArr[7] = gVar8;
        flowArr[8] = gVar9;
        flowArr[9] = gVar10;
        flowArr[10] = gVar3;
        return new qna.n(new j23.b(flowArr, 17), fVar, 6);
    }
}
