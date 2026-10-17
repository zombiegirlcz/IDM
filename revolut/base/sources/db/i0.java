package db;

import com.feature.user.details.impl.ui.details.UserDetailsControllerContract$InputData;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes16.dex */
public final class i0 extends oki.h implements k {

    @NotNull
    public static final z Companion = new z();
    public final gte.a A;
    public final cli.y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final bb.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f112612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UserDetailsControllerContract$InputData f112613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e60.a f112614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cpa.a f112615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jvh.a f112616t;
    public final tla.d u;
    public final yn3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yme.a f112617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xoj.a f112618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final bma.a f112619y;
    public final u z;

    public i0(cli.n stateMapper, bb.b userDetailsRepository, ang.f userInteractor, UserDetailsControllerContract$InputData inputData, e60.a mediaPickerBottomDialog, cpa.a profileAvatarEncoder, jvh.a workflowInteractor, tla.d profileAppNavigationCommandsProvider, yn3.d cooldownCheckerInteractor, yme.a taxResidencyInteractor, xoj.a featuresInteractor, bma.a behaviourInteractor, u dialogProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userDetailsRepository, "userDetailsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mediaPickerBottomDialog, "mediaPickerBottomDialog");
        Intrinsics.checkNotNullParameter(profileAvatarEncoder, "profileAvatarEncoder");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(profileAppNavigationCommandsProvider, "profileAppNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(cooldownCheckerInteractor, "cooldownCheckerInteractor");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(behaviourInteractor, "behaviourInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = userDetailsRepository;
        this.f112612p = userInteractor;
        this.f112613q = inputData;
        this.f112614r = mediaPickerBottomDialog;
        this.f112615s = profileAvatarEncoder;
        this.f112616t = workflowInteractor;
        this.u = profileAppNavigationCommandsProvider;
        this.v = cooldownCheckerInteractor;
        this.f112617w = taxResidencyInteractor;
        this.f112618x = featuresInteractor;
        this.f112619y = behaviourInteractor;
        this.z = dialogProvider;
        this.A = featureToggleInteractor;
        this.B = mra.d.b(this, new l(new Data(null, null, true, 3, null), "TAB_ID_SECTION_0", null, new Data(null, null, true, 3, null), null, zhm.h0.f322473a), stateMapper, null, false, 12);
        this.C = hx7.e.a(this, new cwj.h(this, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(db.i0 r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof db.h0
            if (r0 == 0) goto L13
            r0 = r6
            db.h0 r0 = (db.h0) r0
            int r1 = r0.f112611w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112611w = r1
            goto L18
        L13:
            db.h0 r0 = new db.h0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112611w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            jvh.a r6 = r4.f112616t
            com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName r2 = new com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName
            r2.<init>(r5)
            r0.f112611w = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.String r6 = (java.lang.String) r6
            db.n r5 = new db.n
            r5.<init>(r6)
            r4.C2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: db.i0.I2(db.i0, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        bb.b bVar = this.o;
        bVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, bVar.e.b(Unit.f186387a, loadingStrategy), new d0(this, continuation, 2), null, new d0(this, continuation, 3), 2);
        yji.l.a1(this, this.f112612p.j(loadingStrategy), new d0(this, continuation, 0), null, new d0(this, continuation, 1), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof db.a0
            if (r0 == 0) goto L13
            r0 = r7
            db.a0 r0 = (db.a0) r0
            int r1 = r0.f112599w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112599w = r1
            goto L18
        L13:
            db.a0 r0 = new db.a0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112599w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L84
        L2a:
            r7 = move-exception
            goto L89
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L4c
        L38:
            yhm.o.b(r7)
            xoj.a r7 = r6.f112618x
            yoj.c r2 = yoj.c.PERSONAL_DETAILS_TAX_RESIDENCY
            efm.d0 r7 = xoj.a.c(r7, r2)
            r0.f112599w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4c
            goto L83
        L4c:
            yoj.a r7 = (yoj.a) r7
            boolean r7 = yoj.b.k(r7)
            if (r7 != 0) goto L57
            zhm.f0 r7 = zhm.f0.f322471a
            return r7
        L57:
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            yme.a r7 = r6.f112617w     // Catch: java.lang.Throwable -> L2a
            hoe.a r7 = (hoe.a) r7     // Catch: java.lang.Throwable -> L2a
            joe.b r2 = r7.f154277a     // Catch: java.lang.Throwable -> L2a
            joe.o r2 = (joe.o) r2     // Catch: java.lang.Throwable -> L2a
            w4l.f r2 = r2.e     // Catch: java.lang.Throwable -> L2a
            kotlin.Unit r3 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2a
            r5 = 0
            efm.r r2 = r2.f(r3, r5)     // Catch: java.lang.Throwable -> L2a
            hg4.a r3 = new hg4.a     // Catch: java.lang.Throwable -> L2a
            r5 = 24
            r3.<init>(r7, r5)     // Catch: java.lang.Throwable -> L2a
            efm.r r7 = pd.b.r(r2, r3)     // Catch: java.lang.Throwable -> L2a
            r2 = 3
            r3 = 0
            efm.r r7 = m70.a.g(r7, r3, r3, r2)     // Catch: java.lang.Throwable -> L2a
            r0.f112599w = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = nim.a.c(r7, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L2a
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            goto L8f
        L89:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L8f:
            zhm.f0 r0 = zhm.f0.f322471a
            boolean r1 = r7 instanceof yhm.n
            if (r1 == 0) goto L96
            r7 = r0
        L96:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: db.i0.J2(gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(gim.c r23) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db.i0.K2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r1 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(gim.c r18) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db.i0.L2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof db.g0
            if (r0 == 0) goto L13
            r0 = r7
            db.g0 r0 = (db.g0) r0
            int r1 = r0.f112610w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112610w = r1
            goto L18
        L13:
            db.g0 r0 = new db.g0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112610w
            com.revolut.feature.tax_residency.api.navigation.TaxResidencyFeatureConfig$TaxResidencyProfile r3 = com.revolut.feature.tax_residency.api.navigation.TaxResidencyFeatureConfig.TaxResidencyProfile.f89984a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)
            goto L65
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            ang.f r7 = r6.f112612p
            efm.d0 r7 = r7.f(r5)
            r0.f112610w = r5
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4a
            goto L64
        L4a:
            do3.n r7 = (do3.n) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            wi0.a r2 = wi0.b.Companion
            r2.getClass()
            wi0.b r2 = wi0.b.f297770q3
            boolean r7 = te0.w.S(r7, r2)
            if (r7 == 0) goto La0
            r0.f112610w = r4
            java.lang.Object r7 = r6.J2(r0)
            if (r7 != r1) goto L65
        L64:
            return r1
        L65:
            java.util.List r7 = (java.util.List) r7
            int r0 = r7.size()
            if (r0 != r5) goto L92
            java.lang.Object r7 = zhm.d0.b0(r7)
            zme.f r7 = (zme.f) r7
            wi0.b r7 = r7.f323482a
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.f297770q3
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            if (r7 == 0) goto L92
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.tax_residency.api.navigation.TaxResidencyFeatureConfig$TaxResidencyTinChange r1 = com.revolut.feature.tax_residency.api.navigation.TaxResidencyFeatureConfig.TaxResidencyTinChange.f89985a
            r0.<init>(r1)
            r7.<init>(r0)
            r6.C1(r7)
            goto Lad
        L92:
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            r0.<init>(r3)
            r7.<init>(r0)
            r6.C1(r7)
            goto Lad
        La0:
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            r0.<init>(r3)
            r7.<init>(r0)
            r6.C1(r7)
        Lad:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: db.i0.M2(gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        cli.y yVar = this.B;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        if (Intrinsics.f(((l) j2Var.getValue()).e, "EDIT_PHONE_NUMBER") || Intrinsics.f(((l) j2Var2.getValue()).e, "EDIT_EMAIL_ADDRESS") || Intrinsics.f(((l) j2Var2.getValue()).e, "EDIT_TAX_RESIDENCIES")) {
            n2(new e0(this, null, 2), new whi.b(6));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
