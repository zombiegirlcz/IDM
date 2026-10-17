package xfb;

import ahe.m0;
import com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalarySwitchBot;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements rfb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f305208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f305209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f305210c;

    public f(gte.a featureToggleInteractor, jla.h productCatalogueInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f305208a = featureToggleInteractor;
        this.f305209b = productCatalogueInteractor;
        this.f305210c = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rfb.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(rfb.e r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xfb.a
            if (r0 == 0) goto L13
            r0 = r6
            xfb.a r0 = (xfb.a) r0
            int r1 = r0.f305203w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305203w = r1
            goto L1a
        L13:
            xfb.a r0 = new xfb.a
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305203w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.f305203w = r3
            java.lang.Object r6 = r4.e(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            rfb.a r6 = new rfb.a
            com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub r0 = com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub.f82951a
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xfb.f.a(rfb.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // rfb.b
    public final Flow b(rfb.e origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return new m0(rd0.e.e(new v1(new wh3.h(this, origin, (Continuation) null, 14)), h0.f322473a, new x18.c(3, 7, null)), 22);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rfb.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum c(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof xfb.b
            if (r0 == 0) goto L13
            r0 = r6
            xfb.b r0 = (xfb.b) r0
            int r1 = r0.f305204w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305204w = r1
            goto L1a
        L13:
            xfb.b r0 = new xfb.b
            gim.c r6 = (gim.c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305204w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L5f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            yhm.o.b(r6)
            com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase2 r6 = com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase2.f82946c
            gte.a r2 = r5.f305208a
            jte.d r2 = (jte.d) r2
            boolean r6 = r2.c(r6)
            if (r6 == 0) goto L43
            rfb.f r6 = rfb.f.V2
            return r6
        L43:
            qfb.b r6 = qfb.b.f245285a
            java.lang.String r6 = r6.a()
            r2 = 0
            jla.h r4 = r5.f305209b
            bla.c r6 = r4.d(r6, r2)
            boolean r6 = r6.a()
            if (r6 == 0) goto L6a
            r0.f305204w = r3
            java.lang.Object r6 = r5.f(r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L6a
            rfb.f r6 = rfb.f.V1
            return r6
        L6a:
            rfb.f r6 = rfb.f.UNAVAILABLE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xfb.f.c(kotlin.coroutines.Continuation):java.lang.Enum");
    }

    @Override // rfb.b
    public final boolean d() {
        return ((jte.d) this.f305208a).c(SalaryAccountApi$Toggles$SalarySwitchBot.f82948c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (((jte.d) r8).c(com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase2.f82946c) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(rfb.e r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof xfb.c
            if (r0 == 0) goto L13
            r0 = r11
            xfb.c r0 = (xfb.c) r0
            int r1 = r0.f305205w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305205w = r1
            goto L18
        L13:
            xfb.c r0 = new xfb.c
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305205w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r11)
            goto L9e
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            yhm.o.b(r11)
            goto L6b
        L38:
            yhm.o.b(r11)
            rfb.d r11 = rfb.d.f253751a
            boolean r11 = kotlin.jvm.internal.Intrinsics.f(r10, r11)
            r2 = 0
            jla.h r6 = r9.f305209b
            qfb.b r7 = qfb.b.f245285a
            gte.a r8 = r9.f305208a
            if (r11 == 0) goto L75
            com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase2 r10 = com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase2.f82946c
            jte.d r8 = (jte.d) r8
            boolean r10 = r8.c(r10)
            if (r10 != 0) goto L73
            java.lang.String r10 = r7.a()
            bla.c r10 = r6.d(r10, r2)
            boolean r10 = r10.a()
            if (r10 == 0) goto La7
            r0.f305205w = r5
            java.lang.Object r11 = r9.f(r0)
            if (r11 != r1) goto L6b
            goto L9d
        L6b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            if (r10 != 0) goto La7
        L73:
            r3 = r5
            goto La7
        L75:
            rfb.c r11 = rfb.c.f253750a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r11)
            if (r10 == 0) goto Lac
            java.lang.String r10 = r7.a()
            bla.c r10 = r6.d(r10, r2)
            boolean r10 = r10.a()
            if (r10 != 0) goto L95
            com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase2 r10 = com.revolut.feature.retail.salary_account.api.SalaryAccountApi$Toggles$SalaryAccountPhase2.f82946c
            jte.d r8 = (jte.d) r8
            boolean r10 = r8.c(r10)
            if (r10 == 0) goto La7
        L95:
            r0.f305205w = r4
            java.lang.Object r11 = r9.f(r0)
            if (r11 != r1) goto L9e
        L9d:
            return r1
        L9e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            if (r10 != 0) goto La7
            goto L73
        La7:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        Lac:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: xfb.f.e(rfb.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xfb.d
            if (r0 == 0) goto L13
            r0 = r5
            xfb.d r0 = (xfb.d) r0
            int r1 = r0.f305206w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305206w = r1
            goto L18
        L13:
            xfb.d r0 = new xfb.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305206w
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
            ang.f r5 = r4.f305210c
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f305206w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            do3.n r5 = (do3.n) r5
            boolean r5 = te0.w.Y(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xfb.f.f(gim.c):java.lang.Object");
    }
}
