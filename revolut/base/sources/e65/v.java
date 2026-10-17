package e65;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends yji.n implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y45.i f122918l;

    public v(y45.i loanProductInteractor) {
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        this.f122918l = loanProductInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.credit.loan.api.models.rev10.Loan r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e65.j
            if (r0 == 0) goto L13
            r0 = r7
            e65.j r0 = (e65.j) r0
            int r1 = r0.f122901w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122901w = r1
            goto L18
        L13:
            e65.j r0 = new e65.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122901w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            e65.l r7 = new e65.l
            r2 = 1
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            r0.f122901w = r3
            nki.a r6 = r5.e
            java.lang.String r2 = "handle selected loan"
            java.lang.Object r7 = pu7.a.B(r6, r2, r7, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            e65.c r7 = (e65.c) r7
            if (r7 != 0) goto L4d
            e65.c$b r6 = e65.c.b.f122895a
            return r6
        L4d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e65.v.Z2(com.revolut.feature.credit.loan.api.models.rev10.Loan, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r1 instanceof e65.n
            if (r2 == 0) goto L17
            r2 = r1
            e65.n r2 = (e65.n) r2
            int r3 = r2.f122906w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f122906w = r3
            goto L1c
        L17:
            e65.n r2 = new e65.n
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f122906w
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L42
            if (r4 == r8) goto L3e
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            yhm.o.b(r1)
            return r1
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            yhm.o.b(r1)
            return r1
        L3e:
            yhm.o.b(r1)
            goto L55
        L42:
            yhm.o.b(r1)
            cpb.j r1 = new cpb.j
            r4 = 27
            r1.<init>(r0, r7, r4)
            r2.f122906w = r8
            java.lang.Object r1 = r0.Y2(r2, r1)
            if (r1 != r3) goto L55
            goto Lb2
        L55:
            java.util.List r1 = (java.util.List) r1
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L9e
            r2.f122906w = r6
            nii.y0 r1 = new nii.y0
            nii.z r8 = new nii.z
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r4 = com.revolut.feature.credit.core.R$string.loan_management_loan_selection_no_loans
            r5 = 14
            r9.<init>(r4, r7, r7, r5)
            r21 = 0
            r22 = 32766(0x7ffe, float:4.5915E-41)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            r5 = 4
            java.lang.String r6 = "NO_LOANS_DIALOG_ID"
            r1.<init>(r6, r8, r4, r5)
            kotlinx.coroutines.flow.Flow r1 = r0.L2(r1)
            byc.i r4 = new byc.i
            rv6.e r1 = (rv6.e) r1
            r5 = 6
            r4.<init>(r1, r5)
            java.lang.Object r1 = vkm.q.x(r4, r2)
            if (r1 != r3) goto L9d
            goto Lb2
        L9d:
            return r1
        L9e:
            int r4 = r1.size()
            if (r4 != r8) goto Lb4
            java.lang.Object r1 = zhm.d0.b0(r1)
            com.revolut.feature.credit.loan.api.models.rev10.Loan r1 = (com.revolut.feature.credit.loan.api.models.rev10.Loan) r1
            r2.f122906w = r5
            java.lang.Object r1 = r0.Z2(r1, r2)
            if (r1 != r3) goto Lb3
        Lb2:
            return r3
        Lb3:
            return r1
        Lb4:
            e65.f r2 = new e65.f
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e65.v.b3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof e65.m
            if (r0 == 0) goto L13
            r0 = r8
            e65.m r0 = (e65.m) r0
            int r1 = r0.f122905w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122905w = r1
            goto L18
        L13:
            e65.m r0 = new e65.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122905w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L4a
        L36:
            yhm.o.b(r8)
            dg4.c r8 = new dg4.c
            r2 = 23
            r5 = 0
            r8.<init>(r6, r7, r5, r2)
            r0.f122905w = r4
            java.lang.Object r8 = r6.Y2(r0, r8)
            if (r8 != r1) goto L4a
            goto L57
        L4a:
            com.revolut.feature.credit.loan.api.models.rev10.Loan r8 = (com.revolut.feature.credit.loan.api.models.rev10.Loan) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            r0.f122905w = r3
            java.lang.Object r7 = r6.Z2(r8, r0)
            if (r7 != r1) goto L58
        L57:
            return r1
        L58:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e65.v.c3(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object d3(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, l lVar) {
        return vkm.q.x(new byc.i((rv6.e) L2(new y0("LOAN_CANCELLATION_UNAVAILABLE_DIALOG_ID", new z(textLocalisedClause, textLocalisedClause2, null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), 4), lVar);
    }
}
