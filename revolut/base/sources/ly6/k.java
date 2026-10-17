package ly6;

import com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.InvoiceRemindersScreenContract$InputData;
import et6.p1;
import kotlin.jvm.internal.Intrinsics;
import lu5.o;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends n implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1 f200720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InvoiceRemindersScreenContract$InputData.SingleInvoiceReminders f200721m;

    public k(p1 freelancerInvoiceInteractor, InvoiceRemindersScreenContract$InputData.SingleInvoiceReminders inputData) {
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f200720l = freelancerInvoiceInteractor;
        this.f200721m = inputData;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // ly6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit X1(jy6.h r12) {
        /*
            r11 = this;
            com.revolut.data.model.Data r0 = r12.d
            boolean r1 = r12.f179336c
            java.lang.Object r0 = zi0.c.I(r0)
            jy6.g r0 = (jy6.g) r0
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice r6 = r0.f179332a
            if (r6 == 0) goto L64
            com.revolut.data.model.Data r0 = r12.d
            java.lang.Object r0 = zi0.c.I(r0)
            jy6.g r0 = (jy6.g) r0
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings r8 = r0.f179333b
            java.util.List r0 = r6.o
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            r3 = 0
            if (r1 == r0) goto L27
            r4 = r2
            goto L28
        L27:
            r4 = r3
        L28:
            boolean r0 = r12.f179335b
            if (r0 == 0) goto L3d
            java.util.List r0 = r8.f
            if (r0 != 0) goto L32
            zhm.f0 r0 = zhm.f0.f322471a
        L32:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r1 == r0) goto L3d
            r5 = r2
            goto L3e
        L3d:
            r5 = r3
        L3e:
            if (r4 != 0) goto L4e
            if (r5 != 0) goto L4e
            aii.o r12 = r11.r2()
            ly6.d$a r0 = ly6.d.a.f200708b
            r12.M0(r0)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L4e:
            ly6.j r2 = new ly6.j
            r9 = 0
            r10 = 0
            r3 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            yi5.b r12 = new yi5.b
            r0 = 29
            r12.<init>(r0)
            r11.V2(r2, r12)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L64:
            r3 = r11
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ly6.k.X1(jy6.h):kotlin.Unit");
    }

    @Override // ly6.f
    public final akg.n a() {
        String str = this.f200721m.f73922a;
        p1 p1Var = this.f200720l;
        return nim.a.v(u0.m(rd0.e.b(p1Var.d(str, false)), rd0.e.b(p1Var.e(false))), new o(this, 15));
    }
}
