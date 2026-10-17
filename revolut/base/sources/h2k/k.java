package h2k;

import b6i.c0;
import com.revolut.retail.feature.payments.bank_transfer.api.PaymentsBankTransferApi$FeatureToggles;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import ghk.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f148866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f148867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f148868c;
    public final e d;

    public k(l pricingPlanComparisonInteractor, gte.a featureToggleInteractor, d calculator, e clauseMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanComparisonInteractor, "pricingPlanComparisonInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(calculator, "calculator");
        Intrinsics.checkNotNullParameter(clauseMapper, "clauseMapper");
        this.f148866a = pricingPlanComparisonInteractor;
        this.f148867b = featureToggleInteractor;
        this.f148868c = calculator;
        this.d = clauseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xi0.b r11, xi0.b r12, wi0.b r13, long r14, gim.c r16) {
        /*
            r10 = this;
            r0 = r16
            boolean r1 = r0 instanceof h2k.f
            if (r1 == 0) goto L15
            r1 = r0
            h2k.f r1 = (h2k.f) r1
            int r2 = r1.f148859w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f148859w = r2
            goto L1a
        L15:
            h2k.f r1 = new h2k.f
            r1.<init>(r10, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f148859w
            r9 = 1
            if (r3 == 0) goto L31
            if (r3 != r9) goto L29
            yhm.o.b(r0)
            goto L46
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            yhm.o.b(r0)
            r2 = r10
            r6 = r11
            r7 = r12
            r5 = r13
            r3 = r14
            vkm.y r0 = r2.c(r3, r5, r6, r7)
            r1.f148859w = r9
            java.lang.Object r0 = vkm.q.x(r0, r1)
            if (r0 != r8) goto L46
            return r8
        L46:
            h2k.c r0 = (h2k.c) r0
            if (r0 == 0) goto L4f
            dj0.d r0 = r0.a()
            return r0
        L4f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2k.k.a(xi0.b, xi0.b, wi0.b, long, gim.c):java.lang.Object");
    }

    public final Flow b(xi0.b senderCurrency, xi0.b recipientCurrency, wi0.b recipientCountry, long j2, RemittanceRouteId routeId) {
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(recipientCurrency, "recipientCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        if (Intrinsics.f(routeId, RemittanceRouteId.BANK.f101914b)) {
            if (((jte.d) this.f148867b).c(PaymentsBankTransferApi$FeatureToggles.PriceComparison.f101896c) && j2 > 0) {
                return new c0(c(j2, recipientCountry, senderCurrency, recipientCurrency), this, senderCurrency, recipientCountry, j2, recipientCurrency, 1);
            }
        }
        return new go.g(null, 2);
    }

    public final y c(long j2, wi0.b bVar, xi0.b bVar2, xi0.b bVar3) {
        return rd0.e.e(new a0(mo3.a.g(this.f148866a.a(j2, bVar, bVar2, bVar3), null, new gug.c(23), 1), this, 8), h0.f322473a, new g23.j(3, 23, null));
    }

    public final Flow d(xi0.b senderCurrency, xi0.b recipientCurrency, wi0.b recipientCountry, long j2, RemittanceRouteId routeId) {
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(recipientCurrency, "recipientCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        if (Intrinsics.f(routeId, RemittanceRouteId.BANK.f101914b)) {
            if (((jte.d) this.f148867b).c(PaymentsBankTransferApi$FeatureToggles.PriceComparison.f101896c) && j2 > 0) {
                return new a0(c(j2, recipientCountry, senderCurrency, recipientCurrency), this, 9);
            }
        }
        return new go.g(null, 2);
    }
}
