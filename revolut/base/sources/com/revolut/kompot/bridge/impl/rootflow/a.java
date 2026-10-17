package com.revolut.kompot.bridge.impl.rootflow;

import aii.e0;
import aii.h;
import aii.i;
import aii.n;
import aii.u;
import aii.z;
import aki.a;
import android.content.ComponentCallbacks2;
import android.net.Uri;
import android.os.Parcelable;
import b81.c;
import bjl.o0;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Step;
import com.revolut.kompot.bridge.navigation.AppHomeDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.DeeplinkDestination;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.f0;
import dki.g0;
import dki.h0;
import dki.p;
import f9b.f;
import fli.e;
import iki.b;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nhi.j;
import skm.a2;
import sri.m;
import ulm.p0;
import vkm.q;
import vkm.t;
import vkm.y;
import wgb.v;
import whi.d;
import wli.o;
import wli.x;
import yji.l;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b implements d, o {
    public final g81.a A;
    public final c B;
    public final j C;
    public final gte.a D;
    public final f E;
    public final eli.j F;
    public final msb.a G;
    public final x H;
    public final KompotFlowContract$Configuration I;
    public final gpk.c J;
    public final o0 K;
    public volatile a2 L;
    public boolean M;
    public final List N;
    public final TransitionAnimation O;
    public final KompotFlowContract$State P;
    public final m z;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(sri.m r2, g81.a r3, b81.c r4, nhi.j r5, gte.a r6, f9b.f r7, eli.j r8, msb.a r9, wli.x r10, com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration r11, gpk.c r12, bjl.o0 r13) {
        /*
            r1 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "errorHandler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "errorActionPerformer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "featuresRegistry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "featureToggleInteractor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "errorView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "twoFaErrorHandler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "twoFaView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "deeplinkHandler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "savedStateRestorationDelegate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "revolutSsoAuthErrorHandler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r1.<init>()
            r1.z = r2
            r1.A = r3
            r1.B = r4
            r1.C = r5
            r1.D = r6
            r1.E = r7
            r1.F = r8
            r1.G = r9
            r1.H = r10
            r1.I = r11
            r1.J = r12
            r1.K = r13
            com.revolut.kompot.common.ParcelableDestination r2 = r11.getF98264a()
            boolean r3 = r2 instanceof com.revolut.kompot.bridge.navigation.DeeplinkDestination
            r4 = 0
            if (r3 == 0) goto L64
            r3 = r2
            com.revolut.kompot.bridge.navigation.DeeplinkDestination r3 = (com.revolut.kompot.bridge.navigation.DeeplinkDestination) r3
            goto L65
        L64:
            r3 = r4
        L65:
            if (r3 == 0) goto L6c
            com.revolut.kompot.common.ParcelableDestination r3 = r3.getF98271a()
            goto L6d
        L6c:
            r3 = r4
        L6d:
            if (r3 == 0) goto L91
            com.revolut.kompot.bridge.navigation.DeeplinkDestination r2 = (com.revolut.kompot.bridge.navigation.DeeplinkDestination) r2
            com.revolut.kompot.common.ParcelableDestination r5 = r2.getF98272b()
            boolean r5 = r5 instanceof com.revolut.kompot.bridge.navigation.AppHomeDestination
            if (r5 != 0) goto L91
            com.revolut.kompot.common.ParcelableDestination r2 = r2.getF98272b()
            boolean r2 = r2 instanceof com.revolut.kompot.common.ControllerDestination.Modal
            if (r2 != 0) goto L91
            com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Step$FeatureRegistryStep r2 = r1.R2(r3)
            com.revolut.kompot.navigable.TransitionAnimation$SLIDE_END_TO_START r3 = com.revolut.kompot.navigable.TransitionAnimation.SLIDE_END_TO_START.f98395a
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r2, r3)
            java.util.List r2 = zhm.u.c(r5)
            goto L93
        L91:
            zhm.f0 r2 = zhm.f0.f322471a
        L93:
            r1.N = r2
            com.revolut.kompot.common.ParcelableDestination r2 = r11.getF98264a()
            boolean r3 = r2 instanceof com.revolut.kompot.bridge.navigation.AppHomeDestination
            if (r3 == 0) goto La0
            r4 = r2
            com.revolut.kompot.bridge.navigation.AppHomeDestination r4 = (com.revolut.kompot.bridge.navigation.AppHomeDestination) r4
        La0:
            if (r4 != 0) goto La5
            com.revolut.kompot.navigable.TransitionAnimation$NONE r2 = com.revolut.kompot.navigable.TransitionAnimation.NONE.f98393a
            goto Lbc
        La5:
            com.revolut.kompot.navigable.TransitionAnimation r2 = r4.getF77324c()
            com.revolut.kompot.navigable.TransitionAnimation$a r3 = com.revolut.kompot.navigable.TransitionAnimation.INSTANCE
            com.revolut.kompot.common.transition.AccountCreationTransitionAnimation r4 = jji.b.a(r3)
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r4)
            if (r2 == 0) goto Lba
            com.revolut.kompot.common.transition.AccountCreationTransitionAnimation r2 = jji.b.b(r3)
            goto Lbc
        Lba:
            com.revolut.kompot.navigable.TransitionAnimation$NONE r2 = com.revolut.kompot.navigable.TransitionAnimation.NONE.f98393a
        Lbc:
            r1.O = r2
            com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$State r2 = com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$State.f98267a
            r1.P = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.kompot.bridge.impl.rootflow.a.<init>(sri.m, g81.a, b81.c, nhi.j, gte.a, f9b.f, eli.j, msb.a, wli.x, com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration, gpk.c, bjl.o0):void");
    }

    @Override // dki.g
    public final boolean C2(u navigationDestination) {
        Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
        boolean z = navigationDestination instanceof AppHomeDestination;
        m mVar = this.z;
        if (z) {
            AppHomeDestination appHomeDestination = (AppHomeDestination) navigationDestination;
            if (!h80.c.a()) {
                mVar.c(appHomeDestination.getF83419c());
                return true;
            }
            r2();
            S2(appHomeDestination, false, appHomeDestination.getF77324c());
            return true;
        }
        if (navigationDestination instanceof BridgeDestination) {
            mVar.c(((BridgeDestination) navigationDestination).getF98270a());
            return true;
        }
        if (navigationDestination instanceof e0) {
            e0 e0Var = (e0) navigationDestination;
            u uVarA = e0Var.a();
            if (!(uVarA instanceof StackDestination)) {
                return C2(uVarA);
            }
            S2((Parcelable) uVarA, e0Var.getF71512c(), e0Var.getF77324c());
            return true;
        }
        if (navigationDestination instanceof StackDestination) {
            Parcelable parcelable = (Parcelable) navigationDestination;
            StackDestination stackDestination = (StackDestination) navigationDestination;
            S2(parcelable, stackDestination.getF71512c(), stackDestination.getF77324c());
            return true;
        }
        if (navigationDestination instanceof ControllerDestination.Modal) {
            ControllerDestination.Modal modal = (ControllerDestination.Modal) navigationDestination;
            U2(((nhi.b) this.C).d(modal.getF98284a()).a(), modal.getF98283b());
            return true;
        }
        if (navigationDestination instanceof ExternalDestination.ImplicitActivity) {
            ExternalDestination.ImplicitActivity implicitActivity = (ExternalDestination.ImplicitActivity) navigationDestination;
            Uri e = implicitActivity.getE();
            Continuation continuation = null;
            String string = e != null ? e.toString() : null;
            if (string == null) {
                string = "";
            }
            if (Intrinsics.f(implicitActivity.getF98294a(), "android.intent.action.VIEW") && this.H.y1(string)) {
                n2(new v(this, string, continuation, 5), new whi.b(6));
                return true;
            }
        }
        return false;
    }

    @Override // dki.g
    public final boolean H2() {
        gpk.c cVar = this.J;
        ComponentCallbacks2 componentCallbacks2M2 = ((BaseFlow) cVar.f145463a).m2();
        return (((KompotFlowContract$Configuration) cVar.f145464b).getF98265b() || (!(componentCallbacks2M2 instanceof dri.a) || ((dri.a) componentCallbacks2M2).D0())) && !jh.d.h(((asi.d) cVar.f145465c).a());
    }

    @Override // iki.b
    public final TransitionAnimation O2() {
        return this.O;
    }

    public final KompotFlowContract$Step.FeatureRegistryStep R2(ParcelableDestination parcelableDestination) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        u uVar = parcelableDestination;
        while (linkedHashSet.add(uVar)) {
            u uVarC = ((nhi.b) this.C).c(uVar);
            if (uVarC == null) {
                return new KompotFlowContract$Step.FeatureRegistryStep((ParcelableDestination) uVar);
            }
            if (!(uVarC instanceof StackDestination)) {
                throw new IllegalStateException("Initial destination interceptor must return a StackDestination, but returned ".concat(uVarC.getClass().getName()).toString());
            }
            uVar = uVarC;
        }
        throw new IllegalStateException(("Cyclic initial destination interception detected for " + uVar).toString());
    }

    public final void S2(Parcelable parcelable, boolean z, TransitionAnimation transitionAnimation) {
        u uVarC = ((nhi.b) this.C).c((u) parcelable);
        if (uVarC != null) {
            C2(uVarC);
        } else {
            E2(new KompotFlowContract$Step.FeatureRegistryStep(parcelable), z, transitionAnimation, false);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        ModalDestination.Style style;
        f0 f0Var;
        if (jh.d.h(((asi.d) this.J.f145465c).a()) && (f0Var = this.f115535n) != null) {
            if (!f0Var.a()) {
                f0Var = null;
            }
            if (f0Var != null) {
                M2(f0Var);
                this.f115539s.a(new h0());
                this.f115535n = null;
                l1().M0(new e());
            }
        }
        if (z2() == g0.POSTPONED || this.M) {
            return;
        }
        KompotFlowContract$Configuration kompotFlowContract$Configuration = this.I;
        ParcelableDestination f98264a = kompotFlowContract$Configuration.getF98264a();
        DeeplinkDestination deeplinkDestination = f98264a instanceof DeeplinkDestination ? (DeeplinkDestination) f98264a : null;
        ParcelableDestination f98272b = deeplinkDestination != null ? deeplinkDestination.getF98272b() : null;
        ControllerDestination.Modal modal = f98272b instanceof ControllerDestination.Modal ? (ControllerDestination.Modal) f98272b : null;
        yhi.b[] elements = {yhi.b.POPUP, yhi.b.BOTTOM_DIALOG};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        boolean z = kompotFlowContract$Configuration instanceof KompotFlowContract$Configuration.Overlay;
        KompotFlowContract$Configuration.Overlay overlay = z ? (KompotFlowContract$Configuration.Overlay) kompotFlowContract$Configuration : null;
        if (!d0.T(setY0, overlay != null ? overlay.f98263b : null)) {
            if (modal != null) {
                this.M = true;
                U2(((nhi.b) this.C).d(modal.getF98284a()).a(), modal.getF98283b());
                return;
            }
            return;
        }
        this.M = true;
        com.revolut.kompot.navigable.a aVarT2 = T2(kompotFlowContract$Configuration.getF98264a());
        aVarT2.M2(a.c.f5958a);
        aVarT2.l2(new p0(this, 8));
        KompotFlowContract$Configuration.Overlay overlay2 = z ? (KompotFlowContract$Configuration.Overlay) kompotFlowContract$Configuration : null;
        yhi.b bVar = overlay2 != null ? overlay2.f98263b : null;
        int i = bVar == null ? -1 : whi.e.f297676a[bVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                style = ModalDestination.Style.POPUP.f98311a;
            } else if (i == 2) {
                style = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            U2(aVarT2, style);
            return;
        }
        throw new IllegalStateException("Unexpected overlay style");
    }

    public final com.revolut.kompot.navigable.a T2(Parcelable parcelable) {
        boolean z = parcelable instanceof ControllerDestination;
        j jVar = this.C;
        if (z) {
            return ((nhi.b) jVar).d(((ControllerDestination) parcelable).getF98284a()).a();
        }
        if (!(parcelable instanceof u)) {
            throw new IllegalStateException("Unknown destination type: ".concat(parcelable.getClass().getName()).toString());
        }
        return ((nhi.b) jVar).a((u) parcelable, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U2(com.revolut.kompot.navigable.a aVar, ModalDestination.Style style) {
        if (aVar instanceof p) {
            l.i2(this, (p) aVar, style, null, 2);
        } else if (aVar instanceof BaseScreen) {
            l.g2(this, (BaseScreen) aVar, style, null, 2);
        } else {
            if (!(aVar instanceof ViewController)) {
                throw new IllegalStateException("Unexpected controller type");
            }
            knm.b.j(l1(), new com.revolut.kompot.common.b(aVar, style, 4));
        }
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        IllegalStateException illegalStateException = new IllegalStateException(v1.c.u("Unexpected handleErrorEvent call, original error: ", throwable));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.ERROR;
        rd0.d.a(cVar, null, null, illegalStateException, h0Var);
        i iVar = new i(throwable, (aii.a) null, 6);
        rd0.d.a(cVar, null, null, iVar.c(), h0Var);
        l2(new v(this, iVar, null, 4), new yi5.b(26));
        return true;
    }

    @Override // iki.b, dki.g, yji.l
    public final n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        if (event instanceof zhi.a) {
            return new zhi.b(new t(new y(new w65.c(this, continuation, 23), q.L(cp5.d.c0(((zhi.a) event).b(), this.F), Long.MAX_VALUE, new whi.f(this, continuation, 1))), new a0e.n(this, continuation, 16)));
        }
        if (event instanceof iji.a) {
            return new iji.b(q.L(((iji.a) event).b(), Long.MAX_VALUE, new whi.f(this, continuation, 0)));
        }
        if (event instanceof h) {
            return ((nhi.b) this.C).d(((h) event).b());
        }
        if (event instanceof aii.y) {
            return new z(new w64.d(this, event, continuation, 8));
        }
        if (!(event instanceof i)) {
            return super.o2(event);
        }
        i iVar = (i) event;
        Throwable thC = iVar.c();
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, thC, h0Var);
        l2(new v(this, iVar, continuation, 4), new yi5.b(26));
        return new aii.j();
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        KompotFlowContract$Step step = (KompotFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof KompotFlowContract$Step.FeatureRegistryStep) {
            return T2(((KompotFlowContract$Step.FeatureRegistryStep) step).f98269a);
        }
        if (Intrinsics.f(step, KompotFlowContract$Step.Empty.f98268a)) {
            return new LayoutViewerScreen(R$layout.screen_transparent);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dki.g
    public final List w2() {
        return this.N;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.P;
    }

    @Override // dki.g
    public final FlowStep y2() {
        KompotFlowContract$Configuration kompotFlowContract$Configuration = this.I;
        ParcelableDestination f98264a = kompotFlowContract$Configuration.getF98264a();
        yhi.b[] elements = {yhi.b.POPUP, yhi.b.BOTTOM_DIALOG};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        KompotFlowContract$Configuration.Overlay overlay = kompotFlowContract$Configuration instanceof KompotFlowContract$Configuration.Overlay ? (KompotFlowContract$Configuration.Overlay) kompotFlowContract$Configuration : null;
        if (d0.T(setY0, overlay != null ? overlay.f98263b : null) || z2() == g0.POSTPONED) {
            return KompotFlowContract$Step.Empty.f98268a;
        }
        if (!(f98264a instanceof DeeplinkDestination)) {
            return R2(f98264a);
        }
        DeeplinkDestination deeplinkDestination = (DeeplinkDestination) f98264a;
        if (!(deeplinkDestination.getF98272b() instanceof ControllerDestination.Modal)) {
            return R2(deeplinkDestination.getF98272b());
        }
        ParcelableDestination f98271a = deeplinkDestination.getF98271a();
        if (f98271a != null) {
            return R2(f98271a);
        }
        throw new IllegalStateException("cannot navigate to a modal deeplink without base destination");
    }
}
