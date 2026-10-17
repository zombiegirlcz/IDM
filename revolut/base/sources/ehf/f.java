package ehf;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f126181a;

    public f(LocalDate beforeDate) {
        Intrinsics.checkNotNullParameter(beforeDate, "beforeDate");
        this.f126181a = beforeDate;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // zsc.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r4) {
        /*
            r3 = this;
            com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra r4 = (com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra) r4
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            qua.p r0 = r4.getF81653a()
            boolean r0 = ofm.q.y(r0)
            r1 = 1
            if (r0 == 0) goto L36
            qua.p r0 = r4.getF81653a()
            ibd.e r0 = r0.f249314a
            org.joda.time.LocalDate r0 = r0.f
            org.joda.time.LocalDate r2 = r3.f126181a
            if (r0 == 0) goto L25
            boolean r0 = r0.isBefore(r2)
            if (r0 != r1) goto L25
            goto L40
        L25:
            qua.p r0 = r4.getF81653a()
            ibd.e r0 = r0.f249314a
            org.joda.time.LocalDate r0 = r0.f
            if (r0 == 0) goto L36
            boolean r0 = r0.isEqual(r2)
            if (r0 != r1) goto L36
            goto L40
        L36:
            qua.p r4 = r4.getF81653a()
            boolean r4 = ofm.q.E(r4)
            if (r4 == 0) goto L41
        L40:
            return r1
        L41:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ehf.f.a(java.lang.Object):boolean");
    }

    @Override // zsc.d
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f126181a, ((f) obj2).f126181a);
    }

    @Override // zsc.d
    public final int hashCode() {
        return this.f126181a.hashCode();
    }
}
