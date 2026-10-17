package xn1;

import com.revolut.feature.apm.bills.bpay.impl.data.network.bills.BPayBillService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BPayBillService f307305a;

    public e(BPayBillService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f307305a = service;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(no1.c r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xn1.c
            if (r0 == 0) goto L13
            r0 = r8
            xn1.c r0 = (xn1.c) r0
            int r1 = r0.f307302w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f307302w = r1
            goto L18
        L13:
            xn1.c r0 = new xn1.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f307302w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            xec.c0 r8 = new xec.c0
            r2 = 28
            r4 = 0
            r8.<init>(r6, r7, r4, r2)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            r0.f307302w = r3
            java.lang.Object r8 = skm.e0.J(r7, r8, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            vn1.b r8 = (vn1.b) r8
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r7)
            com.revolut.feature.apm.bills.bpay.impl.screen.input.model.BPayBill r0 = new com.revolut.feature.apm.bills.bpay.impl.screen.input.model.BPayBill
            java.lang.String r1 = r8.getPaymentMethod()
            vn1.b$b r7 = r8.getServiceProviderDto()
            com.revolut.feature.apm.bills.bpay.impl.screen.input.model.BPayBill$ServiceProvider r2 = qn1.a.a(r7)
            boolean r3 = r8.getAmountEditable()
            boolean r4 = r8.getAllowScheduling()
            boolean r5 = r8.getAllowRecurring()
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xn1.e.a(no1.c, gim.c):java.lang.Object");
    }
}
