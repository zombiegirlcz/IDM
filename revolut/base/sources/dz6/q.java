package dz6;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.list.InvoiceTemplatesListScreenContract$InputData;
import et6.p1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends oki.h implements dli.b {
    public final InvoiceTemplatesListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p1 f121259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zjh.i f121260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f121261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f121262s;

    public q(InvoiceTemplatesListScreenContract$InputData inputData, p1 invoiceInteractor, zjh.i invoiceTemplateInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        Intrinsics.checkNotNullParameter(invoiceTemplateInteractor, "invoiceTemplateInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f121259p = invoiceInteractor;
        this.f121260q = invoiceTemplateInteractor;
        this.f121261r = new vii.b();
        this.f121262s = mra.d.b(this, new f(new Data(null, null, true, 3, null), inputData.f73968b), stateMapper, null, false, 12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        if (nim.a.b(r0, r4) == r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(dz6.q r19, java.lang.String r20, java.lang.String r21, gim.c r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r22
            et6.p1 r3 = r0.f121259p
            boolean r4 = r2 instanceof dz6.p
            if (r4 == 0) goto L1b
            r4 = r2
            dz6.p r4 = (dz6.p) r4
            int r5 = r4.f121258y
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f121258y = r5
            goto L20
        L1b:
            dz6.p r4 = new dz6.p
            r4.<init>(r0, r2)
        L20:
            java.lang.Object r0 = r4.f121256w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r5 = r4.f121258y
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L46
            if (r5 == r7) goto L3b
            if (r5 != r6) goto L33
            yhm.o.b(r0)
            goto L95
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            java.lang.String r1 = r4.v
            java.lang.String r5 = r4.u
            yhm.o.b(r0)
            r16 = r1
            r1 = r5
            goto L6e
        L46:
            yhm.o.b(r0)
            r0 = 0
            efm.r r0 = r3.d(r1, r0)
            vkm.d r0 = rd0.e.b(r0)
            dug.d r5 = new dug.d
            r9 = 22
            r5.<init>(r9)
            jhi.b r0 = mo3.a.g(r0, r8, r5, r7)
            r4.u = r1
            r5 = r21
            r4.v = r5
            r4.f121258y = r7
            java.lang.Object r0 = vkm.q.x(r0, r4)
            if (r0 != r2) goto L6c
            goto L94
        L6c:
            r16 = r5
        L6e:
            r9 = r0
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice r9 = (com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice) r9
            r17 = 0
            r18 = 50331647(0x2ffffff, float:3.7615817E-37)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice r0 = com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdate r0 = mif.e0.L(r0)
            ufm.n r0 = r3.i(r1, r0)
            r4.u = r8
            r4.v = r8
            r4.f121258y = r6
            java.lang.Object r0 = nim.a.b(r0, r4)
            if (r0 != r2) goto L95
        L94:
            return r2
        L95:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dz6.q.I2(dz6.q, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f121261r, new n(continuation, this, 0)), null, null, new dob.c(this, continuation, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f121262s;
    }
}
