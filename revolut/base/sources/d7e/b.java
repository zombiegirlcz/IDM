package d7e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f111937a;

    public b(ang.f userInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f111937a = userInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
                this.f111937a = userInteractor;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.revolut.feature.subaccount.api.models.Subaccount.Group r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof d7e.a
            if (r0 == 0) goto L13
            r0 = r15
            d7e.a r0 = (d7e.a) r0
            int r1 = r0.f111936y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111936y = r1
            goto L18
        L13:
            d7e.a r0 = new d7e.a
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f111934w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111936y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.revolut.feature.subaccount.api.models.Subaccount$Group r14 = r0.v
            com.revolut.feature.subaccount.api.models.Subaccount$Group r0 = r0.u
            yhm.o.b(r15)
            goto L4b
        L2b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L33:
            yhm.o.b(r15)
            ang.f r15 = r13.f111937a
            r2 = 0
            efm.d0 r15 = r15.f(r2)
            r0.u = r14
            r0.v = r14
            r0.f111936y = r3
            java.lang.Object r15 = nim.a.b(r15, r0)
            if (r15 != r1) goto L4a
            return r1
        L4a:
            r0 = r14
        L4b:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
            do3.n r15 = (do3.n) r15
            boolean r14 = x8e.a.c(r14, r15)
            r15 = 14
            r1 = 0
            if (r14 == 0) goto L89
            xfe.d r2 = new xfe.d
            com.revolut.core.ui_kit.models.TextLocalisedClause r3 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.subaccount.impl.R$string.vaults_closure_alert_pockets_title_v2
            r3.<init>(r14, r1, r1, r15)
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.tab.accounts.api.R$string.accounts_remove_subaccount_body
            com.revolut.core.ui_kit.models.TextClause r5 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r6 = r0.a()
            r11 = 0
            r12 = 126(0x7e, float:1.77E-43)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.List r15 = zhm.u.c(r5)
            r0 = 12
            r4.<init>(r14, r15, r1, r0)
            r6 = 0
            r7 = 12
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L89:
            xfe.d r3 = new xfe.d
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.subaccount.impl.R$string.group_pockets_leave_pocket_title_v2
            r4.<init>(r14, r1, r1, r15)
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r14 = com.revolut.feature.subaccount.impl.R$string.group_pockets_leave_pocket_subtitle
            r5.<init>(r14, r1, r1, r15)
            r7 = 0
            r8 = 12
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d7e.b.a(com.revolut.feature.subaccount.api.models.Subaccount$Group, gim.c):java.lang.Object");
    }
}
