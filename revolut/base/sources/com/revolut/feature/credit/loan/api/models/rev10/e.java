package com.revolut.feature.credit.loan.api.models.rev10;

import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import kotlin.jvm.internal.Intrinsics;
import q35.t;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e {
    public static final long a(Loan loan) {
        Intrinsics.checkNotNullParameter(loan, "<this>");
        return ChronoUnit.DAYS.between(LocalDate.now(), loan.f70111g);
    }

    public static final String b(t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        LoanState i = tVar.getI();
        if (i instanceof LoanState.Terminated) {
            return ((LoanState.Terminated) i).d;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r7 != null ? r7.f70125b : null) == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty c(com.revolut.feature.credit.loan.api.models.rev10.LoanState r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Overdue
            r1 = 0
            if (r0 == 0) goto L64
            com.revolut.feature.credit.loan.api.models.rev10.LoanState$Overdue r7 = (com.revolut.feature.credit.loan.api.models.rev10.LoanState.Overdue) r7
            com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual r0 = r7.d
            dj0.d r0 = r0.f70125b
            com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual r7 = r7.e
            if (r7 == 0) goto L17
            dj0.d r2 = r7.f70125b
            goto L18
        L17:
            r2 = r1
        L18:
            if (r0 != 0) goto L24
            if (r7 == 0) goto L1f
            dj0.d r7 = r7.f70125b
            goto L20
        L1f:
            r7 = r1
        L20:
            if (r7 != 0) goto L24
            goto L9e
        L24:
            dj0.d[] r7 = new dj0.d[]{r0, r2}
            java.lang.String r3 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            java.util.List r7 = kotlin.collections.d.L(r7)
            dj0.c r3 = dj0.d.Companion
            r3.getClass()
            dj0.d r3 = dj0.d.e
            java.util.Iterator r7 = r7.iterator()
            r4 = 0
        L3d:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L5d
            java.lang.Object r5 = r7.next()
            int r6 = r4 + 1
            if (r4 < 0) goto L59
            if (r4 != 0) goto L51
            dj0.d r5 = (dj0.d) r5
            r3 = r5
            goto L57
        L51:
            dj0.d r5 = (dj0.d) r5
            dj0.d r3 = pyd.c.O(r3, r5)
        L57:
            r4 = r6
            goto L3d
        L59:
            zhm.v.s()
            throw r1
        L5d:
            com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty r7 = new com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty
            r1 = 4
            r7.<init>(r0, r2, r3, r1)
            return r7
        L64:
            boolean r0 = r7 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Outstanding
            r2 = 6
            if (r0 == 0) goto L77
            com.revolut.feature.credit.loan.api.models.rev10.LoanState$Outstanding r7 = (com.revolut.feature.credit.loan.api.models.rev10.LoanState.Outstanding) r7
            com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual r7 = r7.d
            dj0.d r7 = r7.f70125b
            if (r7 == 0) goto L9e
            com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty r0 = new com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty
            r0.<init>(r7, r1, r7, r2)
            return r0
        L77:
            boolean r0 = r7 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Terminated
            if (r0 == 0) goto L8c
            com.revolut.feature.credit.loan.api.models.rev10.LoanState$Terminated r7 = (com.revolut.feature.credit.loan.api.models.rev10.LoanState.Terminated) r7
            com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual r7 = r7.f70199b
            if (r7 == 0) goto L9e
            dj0.d r7 = r7.f70125b
            if (r7 == 0) goto L9e
            com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty r0 = new com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty
            r2 = 5
            r0.<init>(r1, r7, r7, r2)
            return r0
        L8c:
            boolean r0 = r7 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Cancelled
            if (r0 == 0) goto L9f
            com.revolut.feature.credit.loan.api.models.rev10.LoanState$Cancelled r7 = (com.revolut.feature.credit.loan.api.models.rev10.LoanState.Cancelled) r7
            com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual r7 = r7.f70186b
            dj0.d r7 = r7.f70125b
            if (r7 == 0) goto L9e
            com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty r0 = new com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty
            r0.<init>(r7, r1, r7, r2)
            return r0
        L9e:
            return r1
        L9f:
            boolean r0 = r7 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Healthy
            if (r0 != 0) goto Lb6
            boolean r0 = r7 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Forbearance
            if (r0 != 0) goto Lb6
            boolean r0 = r7 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Planned
            if (r0 != 0) goto Lb6
            boolean r7 = r7 instanceof com.revolut.feature.credit.loan.api.models.rev10.LoanState.Repaid
            if (r7 == 0) goto Lb0
            return r1
        Lb0:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.loan.api.models.rev10.e.c(com.revolut.feature.credit.loan.api.models.rev10.LoanState):com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty");
    }
}
