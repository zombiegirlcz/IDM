package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m6 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.f1 f184829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.m1 f184830n;
    public final jr6.m o;

    public m6(klf.h0 commonDataSource, klf.f1 freelancerDataSource, klf.m1 juniorDataSource, jr6.m freelancerDialogFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(freelancerDataSource, "freelancerDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        this.f184828l = commonDataSource;
        this.f184829m = freelancerDataSource;
        this.f184830n = juniorDataSource;
        this.o = freelancerDialogFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kkf.k6
            if (r0 == 0) goto L13
            r0 = r5
            kkf.k6 r0 = (kkf.k6) r0
            int r1 = r0.f184793x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184793x = r1
            goto L18
        L13:
            kkf.k6 r0 = new kkf.k6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184793x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kkf.m6 r0 = r0.u
            yhm.o.b(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.u = r4
            r0.f184793x = r3
            jr6.m r5 = r4.o
            ct6.t r5 = (ct6.t) r5
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            eii.c r5 = (eii.c) r5
            com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController r1 = new com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController
            r1.<init>(r5)
            r5 = 0
            r2 = 2
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r3 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            yji.n.P2(r0, r1, r3, r5, r2)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.m6.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kkf.l6
            if (r0 == 0) goto L13
            r0 = r5
            kkf.l6 r0 = (kkf.l6) r0
            int r1 = r0.f184810x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184810x = r1
            goto L18
        L13:
            kkf.l6 r0 = new kkf.l6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184810x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kkf.m6 r0 = r0.u
            yhm.o.b(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.u = r4
            r0.f184810x = r3
            jr6.m r5 = r4.o
            ct6.t r5 = (ct6.t) r5
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            eii.c r5 = (eii.c) r5
            com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController r1 = new com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController
            r1.<init>(r5)
            r5 = 0
            r2 = 2
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r3 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            yji.n.P2(r0, r1, r3, r5, r2)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.m6.b3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (Z2(r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (b3(r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r5 = r7 instanceof kkf.j6
            if (r5 == 0) goto L13
            r5 = r7
            kkf.j6 r5 = (kkf.j6) r5
            int r0 = r5.f184776w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f184776w = r0
            goto L1a
        L13:
            kkf.j6 r5 = new kkf.j6
            gim.c r7 = (gim.c) r7
            r5.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f184776w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            goto L5b
        L35:
            yhm.o.b(r7)
            java.lang.String r7 = "ID_IN_PERSON_SETTLEMENT_BANNER"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L49
            r5.f184776w = r3
            java.lang.Object r5 = r4.Z2(r5)
            if (r5 != r0) goto L5b
            goto L59
        L49:
            java.lang.String r7 = "ID_ONLINE_SETTLEMENT_BANNER"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L5a
            r5.f184776w = r2
            java.lang.Object r5 = r4.b3(r5)
            if (r5 != r0) goto L5b
        L59:
            return r0
        L5a:
            r3 = 0
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.m6.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
