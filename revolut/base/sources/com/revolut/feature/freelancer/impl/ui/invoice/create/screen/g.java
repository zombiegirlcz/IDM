package com.revolut.feature.freelancer.impl.ui.invoice.create.screen;

import au6.k1;
import au6.k2;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTax;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdateItem;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreenContract$ModalStep;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.kompot.common.ModalDestination;
import eh9.j;
import et6.h1;
import et6.p1;
import is2.t;
import ix6.b0;
import ix6.g0;
import ix6.h0;
import ix6.k0;
import ix6.l0;
import ix6.m0;
import ix6.x;
import ix6.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import vkm.j2;
import vkm.q;
import vkm.t0;
import vkm.v1;
import yji.l;
import zhm.w;
import zjh.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements b0 {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final w80.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f73848p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InvoiceCreateScreenContract$InputData f73849q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kx6.e f73850r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kx6.g f73851s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p1 f73852t;
    public final i u;
    public final i4b.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f73853w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j2 f73854x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f73855y;
    public final y z;

    public g(w80.b amountFormatter, h1 freelancerInteractor, InvoiceCreateScreenContract$InputData inputData, kx6.e invoiceCreateCommandFactory, kx6.g invoiceDialogFactory, p1 invoiceInteractor, i invoiceTemplateInteractor, i4b.f legalEntityContextProvider, h stateMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(invoiceCreateCommandFactory, "invoiceCreateCommandFactory");
        Intrinsics.checkNotNullParameter(invoiceDialogFactory, "invoiceDialogFactory");
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        Intrinsics.checkNotNullParameter(invoiceTemplateInteractor, "invoiceTemplateInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = amountFormatter;
        this.f73848p = freelancerInteractor;
        this.f73849q = inputData;
        this.f73850r = invoiceCreateCommandFactory;
        this.f73851s = invoiceDialogFactory;
        this.f73852t = invoiceInteractor;
        this.u = invoiceTemplateInteractor;
        this.v = legalEntityContextProvider;
        this.f73853w = q.c(null);
        this.f73854x = q.c(null);
        this.f73855y = new vii.b();
        this.z = mra.d.b(this, new a(0), stateMapper, null, false, 12);
        this.A = hx7.e.a(this, new in1.a(this, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g r6, gim.c r7) {
        /*
            et6.p1 r0 = r6.f73852t
            boolean r1 = r7 instanceof ix6.i0
            if (r1 == 0) goto L15
            r1 = r7
            ix6.i0 r1 = (ix6.i0) r1
            int r2 = r1.f169395w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f169395w = r2
            goto L1a
        L15:
            ix6.i0 r1 = new ix6.i0
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f169395w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L51
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r6)
            r1.f169395w = r3     // Catch: java.lang.Throwable -> L51
            au6.v0 r6 = r0.f129298b     // Catch: java.lang.Throwable -> L51
            au6.k1 r6 = (au6.k1) r6     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L51
            if (r6 != r7) goto L41
            return r7
        L41:
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice r6 = (com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice) r6     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = r6.f73374a     // Catch: java.lang.Throwable -> L51
            r7 = 0
            efm.r r6 = r0.d(r6, r7)     // Catch: java.lang.Throwable -> L51
            vkm.d r6 = rd0.e.b(r6)     // Catch: java.lang.Throwable -> L51
            return r6
        L4f:
            r2 = r6
            goto L54
        L51:
            r0 = move-exception
            r6 = r0
            goto L4f
        L54:
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 5
            r5 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            go.g r6 = new go.g
            r7 = 2
            r6.<init>(r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g.I2(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g, gim.c):java.lang.Object");
    }

    public static h0 M2(g gVar, FreelancerInvoiceItemPayload freelancerInvoiceItemPayload) {
        String name = freelancerInvoiceItemPayload.f73394b;
        sr6.h unit = freelancerInvoiceItemPayload.f73395c;
        double d = freelancerInvoiceItemPayload.d;
        dj0.d unitPrice = freelancerInvoiceItemPayload.e;
        List list = freelancerInvoiceItemPayload.i;
        ArrayList taxesIds = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            taxesIds.add(((FreelancerInvoiceTax) it8.next()).f73416a.f73418a);
        }
        Intrinsics.checkNotNullParameter(freelancerInvoiceItemPayload, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unit, "unit");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        Intrinsics.checkNotNullParameter(taxesIds, "taxesIds");
        return new h0(freelancerInvoiceItemPayload, new FreelancerInvoiceUpdateItem(name, unit, d, unitPrice, taxesIds));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f73855y, new j(continuation, this, 24)), null, null, new c(this, null), 3);
        l.a1(this, boh.f.e(this.z.B(new kotlin.jvm.internal.h0() { // from class: ix6.j0
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) obj2).f73839c;
            }
        }), new g0(this, 1)), null, null, new d(this, null), 3);
        h1 h1Var = this.f73848p;
        w4l.f fVar = ((k2) h1Var.f129237b).f9557h;
        Unit unit = Unit.f186387a;
        l.a1(this, yh5.b.d(rd0.e.b(fVar.f(unit, false)), new v1(new hsd.c(this, continuation, 29))), null, null, new b(this, null), 3);
        l.a1(this, rd0.e.b(nim.a.w(((k1) this.f73852t.f129298b).f9551j.f(unit, false), new et6.w(28))), null, null, new e(this, null), 3);
        l.a1(this, mo3.a.g(rd0.e.b(h1Var.c()), null, new iui.b(20), 1), null, null, new f(this, null), 3);
        l.a1(this, q.j(t1.d(new t0(this.f73853w, 1), 300L), -1, 2), null, null, new k0(this, continuation, 1), 3);
        l.a1(this, q.j(t1.d(new t0(this.f73854x, 1), 300L), -1, 2), null, null, new k0(this, continuation, 0), 3);
    }

    public final FreelancerInvoice J2() {
        ix6.q qVar = (ix6.q) ((a) ((j2) this.z.f22677a).getValue()).f73839c.getContent();
        if (qVar != null) {
            return qVar.f169408a;
        }
        return null;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    public final void K2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        FreelancerInvoice freelancerInvoiceJ2 = J2();
        if (freelancerInvoiceJ2 != null) {
            String str = freelancerInvoiceJ2.f73374a;
            Continuation continuation = null;
            if (!a0.H(listId, "ITEM_ID_ITEM_REMOVE", false)) {
                if (listId.equals("ITEM_ID_DETAILS_INVOICE_NUMBER")) {
                    C2(new ix6.w(str));
                    return;
                }
                if (listId.equals("ITEM_ID_DETAILS_PAYMENT_SCHEDULE")) {
                    C2(new ix6.y(freelancerInvoiceJ2));
                    return;
                }
                if (listId.equals("ITEM_ID_DETAILS_CURRENCY")) {
                    n2(new m0(this, freelancerInvoiceJ2, continuation, 0), new whi.b(6));
                    return;
                } else if (listId.equals("ITEM_ID_ADDITIONAL_OPTIONS_PAYMENT_METHODS")) {
                    C2(new x(str));
                    return;
                } else {
                    if (listId.equals("ITEM_ID_ADDITIONAL_OPTIONS_TEMPLATE")) {
                        L2(freelancerInvoiceJ2);
                        return;
                    }
                    return;
                }
            }
            if (obj2 instanceof FreelancerInvoiceItemPayload) {
                n2(new l0(this, obj2, freelancerInvoiceJ2, continuation, 0), new whi.b(6));
            }
        }
    }

    public final void L2(FreelancerInvoice freelancerInvoice) {
        InvoiceTemplate invoiceTemplate;
        ix6.q qVar = (ix6.q) ((a) ((j2) this.z.f22677a).getValue()).f73839c.getContent();
        if (qVar == null || (invoiceTemplate = qVar.f169409b) == null) {
            C2(new z(freelancerInvoice.f73374a));
        } else {
            oki.h.v2(this.A, new InvoiceCreateScreenContract$ModalStep.TemplateOverride(invoiceTemplate, freelancerInvoice.z), ModalDestination.Style.POPUP.f98311a);
        }
    }

    public final void N2(FreelancerInvoice freelancerInvoice) {
        H2(this.z, new t(freelancerInvoice, 26));
        j2 j2Var = this.f73853w;
        j2Var.getClass();
        j2Var.g(null, freelancerInvoice);
    }

    public final void O2(h0 h0Var) {
        FreelancerInvoiceItemPayload freelancerInvoiceItemPayload = h0Var.f169393a;
        FreelancerInvoice freelancerInvoiceJ2 = J2();
        if (freelancerInvoiceJ2 != null) {
            List list = freelancerInvoiceJ2.f73387t;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (Object obj2 : list) {
                if (Intrinsics.f(((FreelancerInvoiceItemPayload) obj2).f73393a, freelancerInvoiceItemPayload.f73393a)) {
                    obj2 = freelancerInvoiceItemPayload;
                }
                arrayList.add(obj2);
            }
            y yVar = this.z;
            ix6.q qVar = (ix6.q) ((a) ((j2) yVar.f22677a).getValue()).f73839c.getContent();
            Continuation continuation = null;
            H2(yVar, new t(qVar != null ? ix6.q.a(qVar, FreelancerInvoice.a(freelancerInvoiceJ2, null, null, null, arrayList, null, null, null, null, 66584575), null, 2) : null, 25));
            n2(new ikf.g(this, h0Var, continuation, 25), new whi.b(6));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
