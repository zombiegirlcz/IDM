package py1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f240645a;

    public d(com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f240645a = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.recipients.BizumContact r21, gim.c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof py1.b
            if (r3 == 0) goto L19
            r3 = r2
            py1.b r3 = (py1.b) r3
            int r4 = r3.f240643w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f240643w = r4
            goto L1e
        L19:
            py1.b r3 = new py1.b
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f240643w
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L36
            if (r5 != r6) goto L2e
            yhm.o.b(r2)
            goto L82
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            yhm.o.b(r2)
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r2 = r1.f62117b
            com.revolut.feature.apm.core.models.recipients.ApmContact$State r5 = r1.f
            boolean r2 = r2 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Email
            if (r2 == 0) goto L49
            int r1 = com.revolut.feature.apm.bizum.api.R$string.bizum_chat_footer_no_phone_number
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            goto L93
        L49:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$DELETED r2 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.DELETED.f62100a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r5, r2)
            if (r2 == 0) goto L59
            int r1 = com.revolut.feature.apm.bizum.api.R$string.bizum_chat_footer_no_alias
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            goto L93
        L59:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$NOT_REGISTERED r2 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.NOT_REGISTERED.f62101a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r5, r2)
            if (r2 == 0) goto L73
            java.lang.String r2 = r1.d
            if (r2 == 0) goto L73
            int r2 = r2.length()
            if (r2 <= 0) goto L73
            int r1 = com.revolut.feature.apm.bizum.api.R$string.bizum_chat_footer_contact_no_longer_registered
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            goto L93
        L73:
            boolean r2 = r1.b()
            if (r2 == 0) goto L92
            r3.f240643w = r6
            java.lang.Object r2 = r0.b(r1, r3)
            if (r2 != r4) goto L82
            return r4
        L82:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L92
            int r1 = com.revolut.feature.apm.bizum.api.R$string.bizum_chat_footer_send_more
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            goto L93
        L92:
            r2 = r7
        L93:
            if (r2 == 0) goto Lc2
            com.revolut.core.ui_kit.delegates.TextDelegate$Model r8 = new com.revolut.core.ui_kit.delegates.TextDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = r2.intValue()
            r2 = 14
            r10.<init>(r1, r7, r7, r2)
            ip0.ak0 r12 = new ip0.ak0
            r1 = 3
            r12.<init>(r7, r7, r1)
            r18 = 0
            r19 = 2036(0x7f4, float:2.853E-42)
            java.lang.String r9 = "APM_DISCLAIMER_ITEM_ID"
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r12 = 0
            r13 = 15
            r9 = 0
            r10 = 0
            yp0.b.r(r8, r9, r10, r11, r12, r13)
            return r8
        Lc2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: py1.d.a(com.revolut.feature.apm.core.models.recipients.BizumContact, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.apm.core.models.recipients.BizumContact r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof py1.c
            if (r0 == 0) goto L13
            r0 = r13
            py1.c r0 = (py1.c) r0
            int r1 = r0.f240644w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240644w = r1
            goto L18
        L13:
            py1.c r0 = new py1.c
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240644w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L8a
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            tof.oa r5 = new tof.oa
            tof.e7 r13 = new tof.e7
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r2 = r12.f62116a
            java.lang.String r2 = r2.getF62112a()
            r13.<init>(r2)
            tof.j7 r2 = new tof.j7
            com.revolut.feature.apm.core.models.recipients.ApmIdentifier r12 = r12.f62116a
            java.lang.String r12 = r12.getF62112a()
            r2.<init>(r12)
            r12 = 2
            tof.i7[] r12 = new tof.i7[r12]
            r4 = 0
            r12[r4] = r13
            r12[r3] = r2
            java.util.List r12 = zhm.v.k(r12)
            r5.<init>(r12)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r3)
            com.revolut.domain.interactors.transactions.TransactionsSort r8 = com.revolut.domain.interactors.transactions.TransactionsSort.NO_SORT
            r9 = 0
            r10 = 18
            com.revolut.domain.interactors.transactions.a r4 = r11.f240645a
            r6 = 0
            efm.r r12 = com.revolut.domain.interactors.transactions.a.d(r4, r5, r6, r7, r8, r9, r10)
            px0.a r13 = new px0.a
            r2 = 11
            r13.<init>(r2)
            efm.r r12 = nim.a.w(r12, r13)
            r13 = 3
            r2 = 0
            efm.r r12 = m70.a.g(r12, r2, r2, r13)
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            efm.r r12 = ue0.e.E(r12, r13)
            r0.f240644w = r3
            java.lang.Object r13 = nim.a.c(r12, r0)
            if (r13 != r1) goto L8a
            return r1
        L8a:
            java.lang.String r12 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: py1.d.b(com.revolut.feature.apm.core.models.recipients.BizumContact, gim.c):java.lang.Object");
    }
}
