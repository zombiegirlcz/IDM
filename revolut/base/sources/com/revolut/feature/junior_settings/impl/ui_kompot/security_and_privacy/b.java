package com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_settings.api.JuniorSettingsApi$Toggles$YouthRevolutWallet;
import gim.i;
import go.g;
import jul.o;
import kbb.c;
import kd8.e;
import kl.t1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import te8.z;
import vkm.q;
import vo8.g0;
import vo8.k;
import vo8.p;
import vo8.t;
import vo8.u;
import wkm.l;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements k {

    @NotNull
    public static final u Companion = new u();
    public final o A;
    public final vii.b B;
    public final y C;
    public final com.revolut.kompot.navigable.vc.modal.a D;
    public final JuniorSecurityAndPrivacyControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f77332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t1 f77333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wk8.a f77334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f77335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f77336t;
    public final j60.a u;
    public final z v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f4h.a f77337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kgm.c f77338x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z80.b f77339y;
    public final gte.a z;

    public b(JuniorSecurityAndPrivacyControllerContract$InputData inputData, hj8.a juniorProfileInteractor, t1 juniorSettingsInteractor, wk8.a juniorReferralsInteractor, e juniorConsentInteractor, c juniorConfigInteractor, j60.a bottomExpandableDialogControllerExtension, z juniorProductsInteractor, f4h.a migrateAssetsPermissionInteractor, kgm.c juniorDeviceInteractor, z80.b phoneToolsProvider, gte.a featureToggleInteractor, o revolutWalletAvailabilityInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorSettingsInteractor, "juniorSettingsInteractor");
        Intrinsics.checkNotNullParameter(juniorReferralsInteractor, "juniorReferralsInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(migrateAssetsPermissionInteractor, "migrateAssetsPermissionInteractor");
        Intrinsics.checkNotNullParameter(juniorDeviceInteractor, "juniorDeviceInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revolutWalletAvailabilityInteractor, "revolutWalletAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f77332p = juniorProfileInteractor;
        this.f77333q = juniorSettingsInteractor;
        this.f77334r = juniorReferralsInteractor;
        this.f77335s = juniorConsentInteractor;
        this.f77336t = juniorConfigInteractor;
        this.u = bottomExpandableDialogControllerExtension;
        this.v = juniorProductsInteractor;
        this.f77337w = migrateAssetsPermissionInteractor;
        this.f77338x = juniorDeviceInteractor;
        this.f77339y = phoneToolsProvider;
        this.z = featureToggleInteractor;
        this.A = revolutWalletAvailabilityInteractor;
        this.B = new vii.b();
        this.C = d.b(this, new p(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), false, false, false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.D = hx7.e.a(this, new vh9.b(this, 12));
    }

    public static final Object I2(b bVar, i iVar) {
        return q.x(mo3.a.g(hj8.a.a(bVar.f77332p, bVar.o.f77325a, w4l.h.f294642c), null, new t(0), 1), iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r20.p2(r2, r1) == r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b r20, com.revolut.core.ui_kit.delegates.RowDelegate.Model r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b.J2(com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b, com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r20.p2(r2, r1) == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b r20, com.revolut.core.ui_kit.delegates.RowDelegate.Model r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b.K2(com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.b, com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    public static final Object L2(b bVar, in8.d dVar, i iVar) {
        Object objL = bVar.f77333q.l(bVar.o.f77325a, dVar, iVar);
        return objL == fim.a.COROUTINE_SUSPENDED ? objL : Unit.f186387a;
    }

    @Override // yji.l
    public final void I1() {
        Flow gVar;
        int i = 2;
        Continuation continuation = null;
        g0 g0Var = new g0(i, this, continuation);
        vii.b bVar = this.B;
        l lVarQ = q.Q(bVar, g0Var);
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new vo8.h0(i, this, continuation), 3);
        yji.l.a1(this, rd0.e.n(q.Q(bVar, new g0(4, this, continuation)), h0Var), null, null, new vo8.h0(5, this, continuation), 3);
        yji.l.a1(this, rd0.e.n(q.Q(bVar, new g0(3, this, continuation)), h0Var), null, null, new vo8.h0(4, this, continuation), 3);
        int i2 = 1;
        yji.l.a1(this, rd0.e.n(q.Q(bVar, new g0(i2, this, continuation)), h0Var), null, null, new vo8.h0(i2, this, continuation), 3);
        yji.l.a1(this, nim.a.v(rd0.e.b(this.f77336t.H()), new vn8.a(8)), null, null, new vo8.h0(6, this, continuation), 3);
        JuniorSecurityAndPrivacyControllerContract$InputData juniorSecurityAndPrivacyControllerContract$InputData = this.o;
        yji.l.a1(this, rd0.e.d(mo3.a.g(rd0.e.b(z.b(this.v, juniorSecurityAndPrivacyControllerContract$InputData.f77325a, false, 6)), null, new t(1), 1), h0Var), null, null, new vo8.h0(3, this, continuation), 3);
        String juniorUserId = juniorSecurityAndPrivacyControllerContract$InputData.f77325a;
        o oVar = this.A;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(juniorUserId, "juniorUserId");
        if (((jte.d) ((gte.a) oVar.f178695b)).c(JuniorSettingsApi$Toggles$YouthRevolutWallet.f77254c)) {
            gVar = rd0.e.e(mo3.a.f(rd0.e.b(z.b((z) oVar.f178696c, juniorUserId, false, 6)), new ol6.b(20), new ngh.i(22), new ol6.b(21)), h0Var, new n28.b(3, 28, null));
        } else {
            gVar = new g(Boolean.FALSE, 2);
        }
        yji.l.a1(this, gVar, null, null, new rf9.h(this, continuation, 17), 3);
        yji.l.a1(this, rd0.e.n(q.Q(bVar, new g0(5, this, continuation)), h0Var), null, null, new vo8.h0(7, this, continuation), 3);
        int i3 = 0;
        yji.l.a1(this, rd0.e.n(q.Q(bVar, new g0(i3, this, continuation)), h0Var), null, null, new vo8.h0(i3, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.D;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
