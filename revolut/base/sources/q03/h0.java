package q03;

import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsScreenContract$InputData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutCardSettingsScreenContract$InputData f241072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f241073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mt8.d f241074c;
    public final fk3.a d;
    public final ha3.d e;
    public final u03.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e03.c f241075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xua.a f241076h;
    public final kdh.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wz2.b f241077j;
    public final wtc.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ptc.a f241078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rul.e f241079m;

    public h0(RevolutCardSettingsScreenContract$InputData inputData, l93.f cardsInteractor, mt8.d kycInteractor, fk3.a configInteractor, ha3.d cardScaInteractor, u03.n settingsDataMapper, e03.c uiConfigurationProvider, xua.a recurringPaymentInteractor, kdh.b deviceManagementInteractor, wz2.b updateSecuritySettingControllerModelExtension, wtc.h linkedWalletsInteractor, ptc.a wealthProtectionInteractor, rul.e securityHubFeatureChecker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(cardScaInteractor, "cardScaInteractor");
        Intrinsics.checkNotNullParameter(settingsDataMapper, "settingsDataMapper");
        Intrinsics.checkNotNullParameter(uiConfigurationProvider, "uiConfigurationProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        Intrinsics.checkNotNullParameter(updateSecuritySettingControllerModelExtension, "updateSecuritySettingControllerModelExtension");
        Intrinsics.checkNotNullParameter(linkedWalletsInteractor, "linkedWalletsInteractor");
        Intrinsics.checkNotNullParameter(wealthProtectionInteractor, "wealthProtectionInteractor");
        Intrinsics.checkNotNullParameter(securityHubFeatureChecker, "securityHubFeatureChecker");
        this.f241072a = inputData;
        this.f241073b = cardsInteractor;
        this.f241074c = kycInteractor;
        this.d = configInteractor;
        this.e = cardScaInteractor;
        this.f = settingsDataMapper;
        this.f241075g = uiConfigurationProvider;
        this.f241076h = recurringPaymentInteractor;
        this.i = deviceManagementInteractor;
        this.f241077j = updateSecuritySettingControllerModelExtension;
        this.k = linkedWalletsInteractor;
        this.f241078l = wealthProtectionInteractor;
        this.f241079m = securityHubFeatureChecker;
    }

    public final Object a(gim.i iVar) {
        Object objA = nim.a.a(((ha3.x) this.f241073b).l(this.f241072a.f64900a), iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q03.b0
            if (r0 == 0) goto L13
            r0 = r6
            q03.b0 r0 = (q03.b0) r0
            int r1 = r0.f241061w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241061w = r1
            goto L18
        L13:
            q03.b0 r0 = new q03.b0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241061w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L61
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsScreenContract$InputData r6 = r5.f241072a
            java.lang.String r6 = r6.f64900a
            l93.f r2 = r5.f241073b
            ha3.x r2 = (ha3.x) r2
            efm.r r6 = r2.v(r6)
            vkm.d r6 = rd0.e.b(r6)
            q03.h r2 = new q03.h
            r4 = 1
            r2.<init>(r5, r4)
            kotlinx.coroutines.flow.Flow r6 = c6d.b.i(r6, r2)
            pyb.g r2 = new pyb.g
            r4 = 13
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f241061w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            java.util.Set r6 = (java.util.Set) r6
            i93.e r0 = i93.e.ATM_WITHDRAWAL
            boolean r6 = r6.contains(r0)
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.h0.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h93.f0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q03.c0
            if (r0 == 0) goto L13
            r0 = r6
            q03.c0 r0 = (q03.c0) r0
            int r1 = r0.f241063w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241063w = r1
            goto L18
        L13:
            q03.c0 r0 = new q03.c0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241063w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            boolean r5 = r5.W
            if (r5 == 0) goto L5e
            com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsScreenContract$InputData r5 = r4.f241072a
            java.lang.String r5 = r5.f64900a
            l93.f r6 = r4.f241073b
            efm.r r5 = l93.f.f(r6, r5)
            pyb.g r6 = new pyb.g
            r2 = 15
            r6.<init>(r2)
            r2 = 0
            efm.r r5 = m70.a.g(r5, r2, r6, r3)
            r0.f241063w = r3
            java.lang.Object r6 = nim.a.c(r5, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            kotlin.jvm.internal.Intrinsics.h(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r3 = r6.booleanValue()
        L5e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.h0.c(h93.f0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof q03.d0
            if (r0 == 0) goto L13
            r0 = r5
            q03.d0 r0 = (q03.d0) r0
            int r1 = r0.f241064w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241064w = r1
            goto L18
        L13:
            q03.d0 r0 = new q03.d0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241064w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            h93.l0 r5 = h93.l0.INDIA_GLOBAL
            l93.f r2 = r4.f241073b
            ha3.x r2 = (ha3.x) r2
            ufm.b r5 = r2.q(r5)
            r0.f241064w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.h0.d(gim.c):java.lang.Object");
    }

    public final jhi.b e() {
        return mo3.a.g(rd0.e.b(((ha3.x) this.f241073b).v(this.f241072a.f64900a)), null, new pyb.g(12), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r3.Z2(r5, r0) != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(i93.e r9, boolean r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof q03.g0
            if (r0 == 0) goto L13
            r0 = r11
            q03.g0 r0 = (q03.g0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            q03.g0 r0 = new q03.g0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f241068x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            wz2.b r3 = r8.f241077j
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L42
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            yhm.o.b(r11)
            goto L9b
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            boolean r9 = r0.f241067w
            h93.f0 r10 = r0.v
            i93.e r2 = r0.u
            yhm.o.b(r11)
            goto L78
        L42:
            boolean r10 = r0.f241067w
            i93.e r9 = r0.u
            yhm.o.b(r11)
            goto L5e
        L4a:
            yhm.o.b(r11)
            jhi.b r11 = r8.e()
            r0.u = r9
            r0.f241067w = r10
            r0.z = r6
            java.lang.Object r11 = vkm.q.x(r11, r0)
            if (r11 != r1) goto L5e
            goto L9a
        L5e:
            h93.f0 r11 = (h93.f0) r11
            vkm.t1 r2 = r3.b3()
            r0.u = r9
            r0.v = r11
            r0.f241067w = r10
            r0.z = r5
            java.lang.Object r2 = vkm.q.x(r2, r0)
            if (r2 != r1) goto L73
            goto L9a
        L73:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r11
            r11 = r7
        L78:
            od0.i r11 = (od0.i) r11
            wz2.a r5 = new wz2.a
            java.lang.Object r11 = r11.f224257a
            i93.c r11 = (i93.c) r11
            if (r11 != 0) goto L84
            i93.c r11 = r10.f150113g
        L84:
            h93.f0 r10 = h93.f0.b(r10, r11)
            r5.<init>(r10, r2, r9)
            r10 = 0
            r0.u = r10
            r0.v = r10
            r0.f241067w = r9
            r0.z = r4
            java.lang.Object r9 = r3.Z2(r5, r0)
            if (r9 != r1) goto L9b
        L9a:
            return r1
        L9b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.h0.f(i93.e, boolean, gim.c):java.lang.Object");
    }
}
