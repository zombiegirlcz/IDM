package com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import d3j.b;
import et6.b1;
import et6.p1;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mra.d;
import oki.h;
import sgm.e3;
import ux6.j;
import ux6.k;
import ux6.p;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements k {
    public final p1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b1 f73883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f73884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e3 f73885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pn3.a f73886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InvoiceCustomerListScreenContract$InputData f73887t;
    public final z1 u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73888w;

    public a(p1 invoiceInteractor, b1 customersInteractor, b beneficiaryInteractor, e3 contactsLoader, pn3.a contactsPermissionsController, InvoiceCustomerListScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        Intrinsics.checkNotNullParameter(customersInteractor, "customersInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(contactsLoader, "contactsLoader");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = invoiceInteractor;
        this.f73883p = customersInteractor;
        this.f73884q = beneficiaryInteractor;
        this.f73885r = contactsLoader;
        this.f73886s = contactsPermissionsController;
        this.f73887t = inputData;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.u = z1VarB;
        this.v = d.b(this, new j(0), stateMapper, null, false, 12);
        this.f73888w = e.a(this, new umd.n(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a r10, gw6.d r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof ux6.n
            if (r0 == 0) goto L13
            r0 = r12
            ux6.n r0 = (ux6.n) r0
            int r1 = r0.f283887w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283887w = r1
            goto L18
        L13:
            ux6.n r0 = new ux6.n
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283887w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L53
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r12)
            et6.b1 r10 = r10.f73883p
            lr6.e r4 = new lr6.e
            java.lang.String r5 = r11.b()
            java.lang.String r6 = r11.a()
            if (r6 == 0) goto L59
            r8 = 0
            r9 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            ufm.n r10 = r10.a(r4)
            r0.f283887w = r3
            java.lang.Object r12 = nim.a.b(r10, r0)
            if (r12 != r1) goto L53
            return r1
        L53:
            java.lang.String r10 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r10)
            return r12
        L59:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.Class r12 = r11.getClass()
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.f186429a
            kotlin.reflect.KClass r12 = r0.b(r12)
            java.lang.String r12 = r12.m()
            java.lang.String r0 = r11.b()
            java.lang.String r1 = r11.a()
            java.lang.String r11 = r11.c()
            java.lang.String r2 = ", name="
            java.lang.String r3 = ", email="
            java.lang.String r4 = "Unable to create customer for type="
            java.lang.StringBuilder r12 = v0.a.m(r4, r12, r2, r0, r3)
            java.lang.String r0 = ", revTag="
            java.lang.String r11 = a0.d.u(r12, r1, r0, r11)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a.I2(com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a, gw6.d, gim.c):java.lang.Object");
    }

    public final void J2(gw6.d dVar) {
        String strA = dVar.a();
        String strB = dVar.b();
        if (strA != null && !d0.W(strA) && !d0.W(strB)) {
            n2(new un8.j(this, dVar, null, 18), new whi.b(6));
        } else {
            h.v2(this.f73888w, new InvoiceCustomerListScreenContract$ModalStep.AddCustomer(dVar.b(), dVar.a()), ModalDestination.Style.POPUP.f98311a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73888w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.u, new uec.d(continuation, this, 10)), null, new p(this, continuation, 0), 3);
        l.b1(this, rd0.e.b(((pn3.b) this.f73886s).b()), null, new p(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
