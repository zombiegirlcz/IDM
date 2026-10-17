package oki;

import aii.r;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h extends l implements pki.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f226127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zji.d f226128m = new zji.d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zji.d f226129n = new zji.d();

    public static void D2(yki.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.n();
    }

    public static boolean E2(yki.b bVar, Function1 stepMatcher) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(stepMatcher, "stepMatcher");
        return bVar.p(stepMatcher);
    }

    public static void r2(yki.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        bVar.a();
    }

    public static void s2(yki.b bVar, FlowStep step, boolean z, TransitionAnimation animation, boolean z3) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        bVar.g(step, z, animation, z3);
    }

    public static /* synthetic */ void t2(h hVar, yki.b bVar, FlowStep flowStep, boolean z, TransitionAnimation transitionAnimation, boolean z3, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            transitionAnimation = TransitionAnimation.SLIDE_END_TO_START.f98395a;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        hVar.getClass();
        s2(bVar, flowStep, z, transitionAnimation, z3);
    }

    public static void u2(h hVar, yki.h hVar2, FlowStep step, TransitionAnimation animation, int i) {
        if ((i & 2) != 0) {
            animation = TransitionAnimation.SLIDE_END_TO_START.f98395a;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(hVar2, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        hVar2.g(step, true, animation, false);
    }

    public static void v2(com.revolut.kompot.navigable.vc.modal.a aVar, FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        aVar.a(step, style);
    }

    public static void w2(yki.b bVar, FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        bVar.j(step, style);
    }

    public static /* synthetic */ void x2(h hVar, com.revolut.kompot.navigable.vc.modal.a aVar, FlowStep flowStep) {
        hVar.getClass();
        v2(aVar, flowStep, ModalDestination.Style.POPUP.f98311a);
    }

    public static void y2(com.revolut.kompot.navigable.vc.modal.a aVar, FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        aVar.b(step, style);
    }

    public static void z2(yki.b bVar, FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        bVar.k(step, style);
    }

    public final void B2() {
        this.f226129n.a(Unit.f186387a);
    }

    public final void C2(r result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f226128m.a(result);
    }

    public final zji.d F2() {
        return this.f226128m;
    }

    public final void G2() {
        this.f226127l = true;
    }

    public final void H2(cam.f fVar, Function1 func) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        fVar.D(func);
    }

    public void onBackPressed() {
        B2();
    }

    public final zji.d q2() {
        return this.f226129n;
    }
}
