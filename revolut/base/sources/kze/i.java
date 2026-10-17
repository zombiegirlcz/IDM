package kze;

import com.revolut.feature.topup_screen.impl.flows.topup_flows.cash_deposit.CashDepositTopupFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.cash_deposit.CashDepositTopupFlowContract$Step;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends oki.h implements b {
    public final CashDepositTopupFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f191109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w39.b f191110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nb3.c f191111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f191112s;

    public i(CashDepositTopupFlowContract$InputData inputData, t1 barcodeInteractor, w39.b locationInteractor, nb3.c cashTopUpLocationExplanationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(barcodeInteractor, "barcodeInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(cashTopUpLocationExplanationProvider, "cashTopUpLocationExplanationProvider");
        this.o = inputData;
        this.f191109p = barcodeInteractor;
        this.f191110q = locationInteractor;
        this.f191111r = cashTopUpLocationExplanationProvider;
        kj4.c cVar = new kj4.c(this, 26);
        this.f191112s = cp5.d.a(this, CashDepositTopupFlowContract$Step.f90996a, f0.f322471a, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(kze.i r8, java.lang.String r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof kze.f
            if (r0 == 0) goto L13
            r0 = r10
            kze.f r0 = (kze.f) r0
            int r1 = r0.f191107x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191107x = r1
            goto L18
        L13:
            kze.f r0 = new kze.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191107x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
        L28:
            r3 = r9
            goto L4a
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r10)
            w39.b r8 = r8.f191110q
            z39.b r8 = (z39.b) r8
            c49.d r8 = r8.f319221b
            ufm.n r8 = r8.e()
            r0.u = r9
            r0.f191107x = r3
            java.lang.Object r10 = nim.a.b(r8, r0)
            if (r10 != r1) goto L28
            return r1
        L4a:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r10 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r10
            if (r3 != 0) goto L58
            fb3.a r8 = new fb3.a
            double r0 = r10.f78066a
            double r9 = r10.f78067b
            r8.<init>(r0, r9)
            return r8
        L58:
            fb3.b r2 = new fb3.b
            double r4 = r10.f78066a
            double r6 = r10.f78067b
            r2.<init>(r3, r4, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kze.i.I2(kze.i, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f191112s;
    }
}
