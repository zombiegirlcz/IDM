package ael;

import com.revolut.shared.feature.wealth.domain.impl.data.network.PortfolioService;
import fdl.c3;
import fdl.f3;
import fdl.h3;
import fdl.i3;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements ybl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdl.p0 f3682a;

    public y(vdl.p0 portfolioRepository) {
        Intrinsics.checkNotNullParameter(portfolioRepository, "portfolioRepository");
        this.f3682a = portfolioRepository;
    }

    public final vkm.d c(kel.j holdingRequestParams, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(holdingRequestParams, "holdingRequestParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vdl.p0 p0Var = this.f3682a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(holdingRequestParams, "holdingRequestParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(p0Var.f288031j.e(new vdl.n0(holdingRequestParams.f183169b, holdingRequestParams.f183168a), loadingStrategy));
    }

    public final q87.q d(kel.j holdingRequestParams, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(holdingRequestParams, "holdingRequestParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vdl.p0 p0Var = this.f3682a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(holdingRequestParams, "holdingRequestParams");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new q87.q(nim.a.v(rd0.e.b(p0Var.f288031j.e(new vdl.n0(holdingRequestParams.f183169b, holdingRequestParams.f183168a), loadingStrategy)), new vch.h0(22)), 10);
    }

    public final vkm.d e(String portfolioId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vdl.p0 p0Var = this.f3682a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(p0Var.f288030h.e(portfolioId, loadingStrategy));
    }

    public final vkm.f f(long j2, String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        vdl.p0 p0Var = this.f3682a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        w4l.f fVar = p0Var.f288030h;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return se0.c.a(fVar, portfolioId, j2);
    }

    public final Object g(String str, gim.c cVar) {
        Object objA = nim.a.a(h(str, true), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final efm.b h(String portfolioId, boolean z) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        vdl.p0 p0Var = this.f3682a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return p0Var.f288030h.g(portfolioId, z);
    }

    public final pfm.r i(String portfolioId, dj0.d amountToWithdraw, UUID idempotencyKey, efl.h hVar) {
        f3 f3Var;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(amountToWithdraw, "amountToWithdraw");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        vdl.p0 p0Var = this.f3682a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(amountToWithdraw, "amountToWithdraw");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        PortfolioService portfolioService = p0Var.f;
        jo3.a aVarP = mo3.a.p(amountToWithdraw);
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            int i = tcl.o.f269891a[hVar.ordinal()];
            if (i == 1) {
                f3Var = f3.REGULAR;
            } else if (i == 2) {
                f3Var = f3.SUBSTANTIAL;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f3Var = f3.SELL_ALL;
            }
        } else {
            f3Var = null;
        }
        h3 h3Var = new h3(aVarP, f3Var);
        String string = idempotencyKey.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return te0.w.g0(portfolioService.requestWithdrawal(portfolioId, h3Var, string));
    }

    public final pfm.a j(String portfolioId, efl.e topUpRequest, UUID idempotencyKey) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(topUpRequest, "topUpRequest");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        vdl.p0 p0Var = this.f3682a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(topUpRequest, "topUpRequest");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        PortfolioService portfolioService = p0Var.f;
        Intrinsics.checkNotNullParameter(topUpRequest, "<this>");
        c3 c3Var = new c3(topUpRequest.f125367b, topUpRequest.f125368c, mo3.a.p(topUpRequest.f125366a));
        String string = idempotencyKey.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        pfm.a aVarE = te0.w.g0(portfolioService.topUpPortfolio(portfolioId, c3Var, string)).k(2L, TimeUnit.SECONDS, hhm.f.f152430b).e(h(portfolioId, false));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (skm.e0.G(r4, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(efl.f r12, efl.g r13, java.util.UUID r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof ael.x
            if (r0 == 0) goto L13
            r0 = r15
            ael.x r0 = (ael.x) r0
            int r1 = r0.f3678y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3678y = r1
            goto L18
        L13:
            ael.x r0 = new ael.x
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f3676w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3678y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r15)
            goto L7c
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            efl.g r13 = r0.v
            efl.f r12 = r0.u
            yhm.o.b(r15)
            r6 = r12
            r7 = r13
            goto L67
        L3c:
            yhm.o.b(r15)
            r0.u = r12
            r0.v = r13
            r0.f3678y = r4
            vdl.p0 r6 = r11.f3682a
            r6.getClass()
            sxe.g r4 = new sxe.g
            r10 = 0
            r5 = 18
            r7 = r12
            r8 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L60
            goto L62
        L60:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L62:
            if (r12 != r1) goto L65
            goto L7b
        L65:
            r6 = r7
            r7 = r8
        L67:
            a1a.c r4 = new a1a.c
            r9 = 5
            r8 = 0
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.u = r8
            r0.v = r8
            r0.f3678y = r3
            java.lang.Object r12 = skm.e0.G(r4, r0)
            if (r12 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ael.y.k(efl.f, efl.g, java.util.UUID, gim.c):java.lang.Object");
    }

    public final pfm.a l(String holdingId, String portfolioId, String str, dj0.d money, UUID operationId, efl.j side) {
        i3 i3Var;
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(side, "side");
        String operationId2 = operationId.toString();
        Intrinsics.checkNotNullExpressionValue(operationId2, "toString(...)");
        vdl.p0 p0Var = this.f3682a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(operationId2, "operationId");
        Intrinsics.checkNotNullParameter(side, "side");
        PortfolioService portfolioService = p0Var.f;
        Intrinsics.checkNotNullParameter(money, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(operationId2, "operationId");
        long j2 = money.f115082a;
        Intrinsics.checkNotNullParameter(side, "<this>");
        int i = tcl.p.f269893a[side.ordinal()];
        if (i == 1) {
            i3Var = i3.BUY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3Var = i3.SELL;
        }
        pfm.a aVarE = te0.w.g0(portfolioService.sell(portfolioId, holdingId, new fdl.c(j2, str, operationId2, i3Var))).e(h(portfolioId, true));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
