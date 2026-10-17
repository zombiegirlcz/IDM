package u6k;

import com.revolut.data.network.models.transfer.mapper.TransferReasonEmbeddedDtoMapperKt;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import efm.d0;
import j4h.m;
import j6k.o;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import mri.w;
import rfm.f0;
import skm.p0;
import twb.b0;
import u3a.q;
import u6b.k;
import wsg.n;
import z8l.j;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements vv9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f277615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j6k.a f277616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pz1.b f277617c;
    public final n d;
    public final b90.a e;
    public final w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f277618g;

    public c(o moneyRequestRepository, j6k.a internalActionsRepository, pz1.b apmActionsRepository, n walletInteractor, b90.a pushMessageHandler, w jobInteractor, p streetModePaymentLocationInteractor) {
        Intrinsics.checkNotNullParameter(moneyRequestRepository, "moneyRequestRepository");
        Intrinsics.checkNotNullParameter(internalActionsRepository, "internalActionsRepository");
        Intrinsics.checkNotNullParameter(apmActionsRepository, "apmActionsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pushMessageHandler, "pushMessageHandler");
        Intrinsics.checkNotNullParameter(jobInteractor, "jobInteractor");
        Intrinsics.checkNotNullParameter(streetModePaymentLocationInteractor, "streetModePaymentLocationInteractor");
        this.f277615a = moneyRequestRepository;
        this.f277616b = internalActionsRepository;
        this.f277617c = apmActionsRepository;
        this.d = walletInteractor;
        this.e = pushMessageHandler;
        this.f = jobInteractor;
        this.f277618g = streetModePaymentLocationInteractor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ufm.f b(MoneyRequest request, krf.c cVar, qk.d dVar) {
        MoneyRequest moneyRequest;
        f0 f0VarF;
        Intrinsics.checkNotNullParameter(request, "request");
        MoneyRequestChannel moneyRequestChannel = request.f60316c;
        boolean z = moneyRequestChannel instanceof MoneyRequestChannel.Revolut;
        p pVar = this.f277618g;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (z) {
            pfm.a aVarR = pVar.r(new wj0.b("payments_money_request"));
            String requestId = request.f60314a;
            j6k.a aVar = this.f277616b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            d0<List<z8l.h>> d0VarPayRequestById = aVar.f171794a.payRequestById(requestId, new z8l.a(cVar != null ? TransferReasonEmbeddedDtoMapperKt.toEmbeddedDto(cVar) : null, dVar != null ? q11.a.d(dVar) : null), new wj0.b("payments_money_request"));
            j4e.c cVar2 = new j4e.c(12, new j3f.d(23));
            d0VarPayRequestById.getClass();
            ufm.i iVar = new ufm.i(d0VarPayRequestById, cVar2, 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            ufm.f fVar = new ufm.f(te0.w.i0(iVar), new q(new k(this, 2), 13), 3);
            Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
            f0VarF = aVarR.f(fVar);
        } else {
            if (!(moneyRequestChannel instanceof MoneyRequestChannel.APM)) {
                if (!(moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
                    throw new NoWhenBranchMatchedException();
                }
                moneyRequest = request;
                f0VarF = pVar.r(new wj0.b("payments_apm_money_request")).f(te0.w.o0(p0.f264003c, new b0(dVar, this, moneyRequest, objArr == true ? 1 : 0, 6)));
                ufm.f fVar2 = new ufm.f(new ufm.i(f0VarF, new q(new a(this, moneyRequest, 0), 11), 0), new q(new a(this, moneyRequest, 1), 12), 3);
                Intrinsics.checkNotNullExpressionValue(fVar2, "doOnSuccess(...)");
                return fVar2;
            }
            f0VarF = pVar.r(new wj0.b("payments_apm_money_request")).f(te0.w.o0(p0.f264003c, new b(this, request, objArr2 == true ? 1 : 0, 0)));
        }
        moneyRequest = request;
        ufm.f fVar22 = new ufm.f(new ufm.i(f0VarF, new q(new a(this, moneyRequest, 0), 11), 0), new q(new a(this, moneyRequest, 1), 12), 3);
        Intrinsics.checkNotNullExpressionValue(fVar22, "doOnSuccess(...)");
        return fVar22;
    }

    public final pfm.a c(MoneyRequest request) {
        efm.b bVarN;
        Intrinsics.checkNotNullParameter(request, "request");
        MoneyRequestChannel moneyRequestChannel = request.f60316c;
        String requestId = request.f60314a;
        if (moneyRequestChannel instanceof MoneyRequestChannel.Revolut) {
            j6k.a aVar = this.f277616b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            bVarN = te0.w.g0(aVar.f171794a.cancelRequest(requestId));
        } else {
            if (!(moneyRequestChannel instanceof MoneyRequestChannel.APM) && !(moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            bVarN = pd.b.n(p0.f264003c, new b(this, request, null, 1));
        }
        pfm.a aVarE = bVarN.e(this.f277615a.a(requestId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.a d(MoneyRequest request, String str) {
        efm.b bVarN;
        Intrinsics.checkNotNullParameter(request, "request");
        MoneyRequestChannel moneyRequestChannel = request.f60316c;
        String requestId = request.f60314a;
        if (moneyRequestChannel instanceof MoneyRequestChannel.Revolut) {
            j6k.a aVar = this.f277616b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            bVarN = te0.w.g0(aVar.f171794a.rejectWithReason(requestId, new j(str)));
        } else {
            if (!(moneyRequestChannel instanceof MoneyRequestChannel.APM) && !(moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            bVarN = pd.b.n(p0.f264003c, new b(this, request, null, 2));
        }
        pfm.a aVarE = bVarN.e(this.f277615a.a(requestId));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final efm.b e(MoneyRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        MoneyRequestChannel moneyRequestChannel = request.f60316c;
        if (moneyRequestChannel instanceof MoneyRequestChannel.Revolut) {
            String requestId = request.f60314a;
            j6k.a aVar = this.f277616b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            d0 d0VarFirstOrError = m70.a.g(mo3.a.n(aVar.f171795b.d(false)), null, null, 3).firstOrError();
            j4e.c cVar = new j4e.c(11, new m(aVar, requestId, 12));
            d0VarFirstOrError.getClass();
            pfm.a aVar2 = new pfm.a(d0VarFirstOrError, cVar, 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            return aVar2;
        }
        if (moneyRequestChannel instanceof MoneyRequestChannel.APM) {
            pfm.n nVarN = efm.b.n(new IllegalStateException("MoneyRequest Remind not supported for APM channel: " + moneyRequestChannel));
            Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
            return nVarN;
        }
        if (!(moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
            throw new NoWhenBranchMatchedException();
        }
        pfm.n nVarN2 = efm.b.n(new IllegalStateException("MoneyRequest Remind not supported for Bank Beneficiary channel: " + moneyRequestChannel));
        Intrinsics.checkNotNullExpressionValue(nVarN2, "error(...)");
        return nVarN2;
    }
}
