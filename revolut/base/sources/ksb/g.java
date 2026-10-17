package ksb;

import efm.d0;
import java.util.List;
import koe.x;
import kotlin.jvm.internal.Intrinsics;
import njf.j;
import tof.r9;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements bef.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f189406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nhf.a f189407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.g f189408c;
    public final l80.e d;

    public g(com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor, thf.g transactionItemMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f189406a = transactionsInteractor;
        this.f189407b = unitedWalletInteractor;
        this.f189408c = transactionItemMapper;
        this.d = dateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r22, gim.c r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof ksb.e
            if (r3 == 0) goto L19
            r3 = r2
            ksb.e r3 = (ksb.e) r3
            int r4 = r3.f189404w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f189404w = r4
            goto L1e
        L19:
            ksb.e r3 = new ksb.e
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f189404w
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L36
            if (r5 != r6) goto L2e
            yhm.o.b(r2)
            goto L7c
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            yhm.o.b(r2)
            r2 = 0
            r5 = 6
            com.revolut.domain.interactors.transactions.a r8 = r0.f189406a
            efm.r r2 = com.revolut.domain.interactors.transactions.a.c(r8, r1, r7, r2, r5)
            efm.r r2 = zi0.c.J(r2)
            ksb.d r5 = new ksb.d
            r8 = 1
            r5.<init>(r0, r1, r8)
            ksb.a r1 = new ksb.a
            r8 = 4
            r1.<init>(r5, r8)
            efm.r r1 = r2.flatMap(r1)
            java.lang.String r2 = "getTransactionDetails(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            kog.k r2 = new kog.k
            r5 = 14
            r2.<init>(r0, r5)
            efm.r r1 = nim.a.w(r1, r2)
            r2 = 3
            efm.r r1 = m70.a.g(r1, r7, r7, r2)
            efm.d0 r1 = r1.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.f189404w = r6
            java.lang.Object r2 = nim.a.b(r1, r3)
            if (r2 != r4) goto L7c
            return r4
        L7c:
            od0.i r2 = (od0.i) r2
            java.lang.Object r1 = r2.f224257a
            java.time.LocalDate r1 = (java.time.LocalDate) r1
            if (r1 == 0) goto Lbf
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 7
            com.revolut.core.ui_kit.models.Clause r1 = jrf.b.b(r2, r1)
            od0.h r2 = od0.i.Companion
            com.revolut.core.ui_kit.delegates.CounterTextDelegate$Model r8 = new com.revolut.core.ui_kit.delegates.CounterTextDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r10 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.transfer.core.R$string.bank_transfer_troubleshooting_section_edt_pending_title
            r4 = 14
            r10.<init>(r3, r7, r7, r4)
            com.revolut.core.ui_kit.delegates.t4 r11 = new com.revolut.core.ui_kit.delegates.t4
            r11.<init>(r1)
            r19 = 0
            r20 = 2032(0x7f0, float:2.847E-42)
            java.lang.String r9 = "ITEM_ID_ESTIMATION"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2.getClass()
            od0.i r1 = od0.h.a(r8)
            return r1
        Lbf:
            od0.h r1 = od0.i.Companion
            r1.getClass()
            od0.i r1 = od0.i.f224256b
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ksb.g.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ksb.f
            if (r0 == 0) goto L13
            r0 = r7
            ksb.f r0 = (ksb.f) r0
            int r1 = r0.f189405w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189405w = r1
            goto L18
        L13:
            ksb.f r0 = new ksb.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189405w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L58
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            zhm.f0 r7 = zhm.f0.f322471a
            efm.d0 r7 = r5.c(r6, r7)
            ksb.d r2 = new ksb.d
            r4 = 0
            r2.<init>(r5, r6, r4)
            ksb.a r6 = new ksb.a
            r4 = 2
            r6.<init>(r2, r4)
            ufm.i r2 = new ufm.i
            r4 = 0
            r2.<init>(r7, r6, r4)
            java.lang.String r6 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            r0.f189405w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r6 = r7.f186385a
            java.lang.String r0 = "component1(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r7.f186386b
            java.lang.String r0 = "component2(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            k71.q r7 = (k71.q) r7
            od0.h r0 = od0.i.Companion
            java.lang.Object r6 = zhm.d0.d0(r6)
            tof.a3 r6 = (tof.a3) r6
            if (r6 == 0) goto L7d
            thf.g r1 = r5.f189408c
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r6 = thf.g.a(r1, r6, r7)
            goto L7e
        L7d:
            r6 = 0
        L7e:
            r0.getClass()
            od0.i r6 = od0.h.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ksb.g.b(java.lang.String, gim.c):java.lang.Object");
    }

    public final d0 c(String str, List list) {
        d0 d0VarD = d0.D(com.revolut.domain.interactors.transactions.a.b(this.f189406a, new r9(str), list, 1, null, null, 24), ((j) this.f189407b).f().firstOrError(), new a(new x(27), 3));
        Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
        return d0VarD;
    }
}
