package vp1;

import com.revolut.feature.apm.bills.core.api.model.BillTransferData;
import elm.f;
import gim.i;
import kotlin.jvm.internal.Intrinsics;
import rp1.j;
import skm.e0;
import skm.p0;
import xo1.d;
import xo1.m;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements wo1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f291042a;

    public c(j billsRepository) {
        Intrinsics.checkNotNullParameter(billsRepository, "billsRepository");
        this.f291042a = billsRepository;
    }

    public final Object a(String str, i iVar) {
        rp1.b bVar = new rp1.b(this.f291042a, str, null, 2);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, bVar, iVar);
    }

    public final Object b(d dVar, i iVar) {
        rp1.d dVar2 = new rp1.d(this.f291042a, dVar, null, 1);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, dVar2, iVar);
    }

    public final Object c(BillTransferData billTransferData, i iVar) {
        rm6.c cVar = new rm6.c(this.f291042a, billTransferData, null, 8);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, cVar, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ap1.a r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vp1.b
            if (r0 == 0) goto L13
            r0 = r6
            vp1.b r0 = (vp1.b) r0
            int r1 = r0.f291041x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291041x = r1
            goto L18
        L13:
            vp1.b r0 = new vp1.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291041x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vp1.c r5 = r0.u
            yhm.o.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r4
            r0.f291041x = r3
            rp1.h r6 = new rp1.h
            rp1.j r2 = r4.f291042a
            r3 = 0
            r6.<init>(r2, r5, r3)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r5, r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult r6 = (com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult) r6
            r5.getClass()
            boolean r5 = r6.u
            if (r5 != 0) goto L60
            java.time.LocalDate r5 = r6.f61441t
            if (r5 == 0) goto L5a
            goto L60
        L5a:
            com.revolut.feature.apm.bills.core.api.exceptions.InvalidPaymentDateOnBillSearchException r5 = new com.revolut.feature.apm.bills.core.api.exceptions.InvalidPaymentDateOnBillSearchException
            r5.<init>()
            throw r5
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.c.d(ap1.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(ap1.d r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vp1.a
            if (r0 == 0) goto L13
            r0 = r6
            vp1.a r0 = (vp1.a) r0
            int r1 = r0.f291039x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291039x = r1
            goto L18
        L13:
            vp1.a r0 = new vp1.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291039x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vp1.c r5 = r0.u
            yhm.o.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r4
            r0.f291039x = r3
            rp1.g r6 = new rp1.g
            rp1.j r2 = r4.f291042a
            r3 = 0
            r6.<init>(r2, r5, r3)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r5, r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult r6 = (com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult) r6
            r5.getClass()
            boolean r5 = r6.u
            if (r5 != 0) goto L60
            java.time.LocalDate r5 = r6.f61441t
            if (r5 == 0) goto L5a
            goto L60
        L5a:
            com.revolut.feature.apm.bills.core.api.exceptions.InvalidPaymentDateOnBillSearchException r5 = new com.revolut.feature.apm.bills.core.api.exceptions.InvalidPaymentDateOnBillSearchException
            r5.<init>()
            throw r5
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.c.e(ap1.d, gim.c):java.lang.Object");
    }

    public final Object f(cp1.a aVar, i iVar) {
        rp1.i iVar2 = new rp1.i(this.f291042a, aVar, null);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, iVar2, iVar);
    }

    public final Object g(m mVar, gim.c cVar) {
        rm6.c cVar2 = new rm6.c(this.f291042a, mVar, null, 14);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, cVar2, cVar);
    }
}
