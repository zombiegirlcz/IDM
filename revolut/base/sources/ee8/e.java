package ee8;

import ao.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f125146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f125147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f125148c;

    public e(h juniorCoparentInteractor, hj8.a juniorProfileInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f125146a = juniorCoparentInteractor;
        this.f125147b = juniorProfileInteractor;
        this.f125148c = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r15, zm3.a r16, gim.c r17) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee8.e.a(java.lang.String, zm3.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, zm3.a r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof ee8.b
            if (r0 == 0) goto L13
            r0 = r14
            ee8.b r0 = (ee8.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            ee8.b r0 = new ee8.b
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f125141y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r4 = r0.f125140x
            int r12 = r0.f125139w
            java.lang.String[] r13 = r0.v
            java.lang.String[] r0 = r0.u
            yhm.o.b(r14)
            goto L74
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            yhm.o.b(r14)
            int r14 = com.revolut.feature.junior_coparent.impl.R$string.junior_co_parent_contact_confirmation_title
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]
            r5 = 0
            java.lang.String r13 = hx7.q.v(r13)
            r2[r5] = r13
            r0.u = r2
            r0.v = r2
            r0.f125139w = r14
            r0.f125140x = r4
            r0.A = r4
            hj8.a r13 = r11.f125147b
            w4l.j r5 = w4l.j.f294644c
            akg.n r12 = hj8.a.a(r13, r12, r5)
            zfd.e r12 = zi0.c.w(r12)
            e6e.a r13 = new e6e.a
            r5 = 28
            r13.<init>(r5)
            jhi.b r12 = mo3.a.g(r12, r3, r13, r4)
            java.lang.Object r12 = vkm.q.x(r12, r0)
            if (r12 != r1) goto L6f
            return r1
        L6f:
            r13 = r14
            r14 = r12
            r12 = r13
            r13 = r2
            r0 = r13
        L74:
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r14 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r14
            java.lang.String r14 = r14.f77099b
            r13[r4] = r14
            java.util.List r13 = zhm.v.k(r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r14 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r0 = 12
            r14.<init>(r12, r13, r3, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r13 = com.revolut.feature.junior_coparent.impl.R$string.rev_u18_co_parent_contact_confirmation_message
            com.revolut.core.ui_kit.models.Custom r4 = new com.revolut.core.ui_kit.models.Custom
            int r0 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorForeground
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r0)
            r9 = 0
            r10 = 254(0xfe, float:3.56E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0 = 10
            r12.<init>(r13, r3, r4, r0)
            com.revolut.core.ui_kit.models.TextLocalisedClause r13 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.junior_coparent.impl.R$string.junior_co_parent_contact_confirmation_action_confirm
            r1 = 14
            r13.<init>(r0, r3, r3, r1)
            com.revolut.core.ui_kit.models.TextLocalisedClause r0 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.feature.junior_coparent.impl.R$string.junior_co_parent_contact_confirmation_action_cancel
            r0.<init>(r2, r3, r3, r1)
            com.revolut.feature.junior_coparent.impl.provider.CoparentConfirmationDialogProvider$DialogConfiguration r1 = new com.revolut.feature.junior_coparent.impl.provider.CoparentConfirmationDialogProvider$DialogConfiguration
            r1.<init>(r14, r12, r13, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ee8.e.b(java.lang.String, zm3.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, zm3.a r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof ee8.c
            if (r0 == 0) goto L13
            r0 = r11
            ee8.c r0 = (ee8.c) r0
            int r1 = r0.f125144y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125144y = r1
            goto L18
        L13:
            ee8.c r0 = new ee8.c
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f125142w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125144y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r11)
            return r11
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            yhm.o.b(r11)
            return r11
        L3a:
            zm3.a r10 = r0.v
            java.lang.String r9 = r0.u
            yhm.o.b(r11)
            goto L69
        L42:
            yhm.o.b(r11)
            r0.u = r9
            r0.v = r10
            r0.f125144y = r5
            ao.h r11 = r8.f125146a
            vd8.h r2 = vd8.h.d
            a83.j0 r11 = r11.q(r2)
            zfd.e r11 = zi0.c.w(r11)
            e6e.a r2 = new e6e.a
            r7 = 29
            r2.<init>(r7)
            jhi.b r11 = mo3.a.g(r11, r6, r2, r5)
            java.lang.Object r11 = vkm.q.x(r11, r0)
            if (r11 != r1) goto L69
            goto L8b
        L69:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L7f
            r0.u = r6
            r0.v = r6
            r0.f125144y = r4
            java.lang.Object r9 = r8.b(r9, r10, r0)
            if (r9 != r1) goto L7e
            goto L8b
        L7e:
            return r9
        L7f:
            r0.u = r6
            r0.v = r6
            r0.f125144y = r3
            java.lang.Object r9 = r8.a(r9, r10, r0)
            if (r9 != r1) goto L8c
        L8b:
            return r1
        L8c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ee8.e.c(java.lang.String, zm3.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ee8.d
            if (r0 == 0) goto L13
            r0 = r5
            ee8.d r0 = (ee8.d) r0
            int r1 = r0.f125145w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125145w = r1
            goto L18
        L13:
            ee8.d r0 = new ee8.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125145w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f125148c
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f125145w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ee8.e.d(gim.c):java.lang.Object");
    }
}
