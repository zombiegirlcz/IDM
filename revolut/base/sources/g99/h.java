package g99;

import com.revolut.core.ui_kit.background.StatefulAnimatedBackground;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import fo1.b0;
import g23.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.h0;
import skm.p0;
import skm.r;
import zkm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends yji.d implements xji.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f141515c;
    public final StatefulAnimatedBackground d;
    public final ControllerContainerFrameLayout e;
    public final cwj.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f141516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f141517h;
    public final zkm.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f141518j;

    public h(com.revolut.kompot.navigable.a parentController, StatefulAnimatedBackground background, ControllerContainerFrameLayout container, cwj.a activationCoordinator, boolean z, k mode) {
        Intrinsics.checkNotNullParameter(parentController, "parentController");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(activationCoordinator, "activationCoordinator");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f141515c = parentController;
        this.d = background;
        this.e = container;
        this.f = activationCoordinator;
        this.f141516g = z;
        this.f141517h = mode;
        p0 p0Var = p0.f264001a;
        this.i = e0.c(o.f323119a.e.plus(e0.e()));
        this.f141518j = e0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(g99.h r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof g99.b
            if (r0 == 0) goto L13
            r0 = r5
            g99.b r0 = (g99.b) r0
            int r1 = r0.f141510w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141510w = r1
            goto L18
        L13:
            g99.b r0 = new g99.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141510w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            skm.r r5 = r4.f141518j
            r0.f141510w = r3
            java.lang.Object r5 = r5.y(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.revolut.kompot.navigable.a r4 = r4.f141515c
            android.app.Activity r4 = r4.m2()
            boolean r5 = r4 instanceof com.revolut.feature.onboarding.core.launcher.OnboardingLauncherActivity
            r0 = 0
            if (r5 == 0) goto L4b
            com.revolut.feature.onboarding.core.launcher.OnboardingLauncherActivity r4 = (com.revolut.feature.onboarding.core.launcher.OnboardingLauncherActivity) r4
            goto L4c
        L4b:
            r4 = r0
        L4c:
            if (r4 == 0) goto L55
            android.view.Window r4 = r4.getWindow()
            r4.setBackgroundDrawable(r0)
        L55:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g99.h.Q(g99.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (skm.k0.b(800, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(g99.h r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof g99.c
            if (r0 == 0) goto L13
            r0 = r9
            g99.c r0 = (g99.c) r0
            int r1 = r0.f141511w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141511w = r1
            goto L18
        L13:
            g99.c r0 = new g99.c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141511w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            goto L89
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            yhm.o.b(r9)
            goto L71
        L39:
            yhm.o.b(r9)
            goto L66
        L3d:
            yhm.o.b(r9)
            com.revolut.kompot.view.ControllerContainerFrameLayout r9 = r8.e
            android.view.ViewPropertyAnimator r9 = r9.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r9 = r9.alpha(r2)
            r6 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r9 = r9.setDuration(r6)
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            android.view.ViewPropertyAnimator r9 = r9.setInterpolator(r2)
            r9.start()
            r0.f141511w = r5
            java.lang.Object r9 = skm.k0.b(r6, r0)
            if (r9 != r1) goto L66
            goto L88
        L66:
            r0.f141511w = r4
            r4 = 100
            java.lang.Object r9 = skm.k0.b(r4, r0)
            if (r9 != r1) goto L71
            goto L88
        L71:
            com.revolut.core.ui_kit.background.StatefulAnimatedBackground r8 = r8.d
            g99.l r9 = g99.l.COMPLETION
            java.lang.String r9 = r9.a()
            po0.b0 r2 = po0.b0.ONCE
            r8.d(r9, r2)
            r0.f141511w = r3
            r8 = 800(0x320, double:3.953E-321)
            java.lang.Object r8 = skm.k0.b(r8, r0)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g99.h.R(g99.h, gim.c):java.lang.Object");
    }

    @Override // yji.d
    public final void M() {
        if (this.f141517h instanceof j) {
            this.f141518j.U(Unit.f186387a);
        }
    }

    @Override // yji.d
    public final void onCreate() {
        if (this.f141517h instanceof i) {
            nhi.k.a(this);
        }
        boolean z = this.f141516g;
        zkm.d dVar = this.i;
        Continuation continuation = null;
        if (!z) {
            e0.C(dVar, null, null, new e(this, null), 3);
            return;
        }
        h0 h0VarG = e0.g(dVar, null, null, new g(this, null), 3);
        e0.C(dVar, null, null, new q(this, e0.C(dVar, null, null, new g1k.i(h0VarG, this, continuation, 20), 3), h0VarG, continuation, 9), 3);
        e0.C(dVar, null, null, new b0(this, continuation, 20), 3);
    }

    @Override // yji.d
    public final void onDestroy() {
        e0.k(this.i, null);
        if (this.f141517h instanceof i) {
            nhi.k.b(this);
        }
    }

    @Override // xji.a
    public final void z2(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (controller.f98405m != this.f141515c || (controller instanceof LayoutViewerScreen)) {
            return;
        }
        this.f141518j.U(Unit.f186387a);
    }
}
