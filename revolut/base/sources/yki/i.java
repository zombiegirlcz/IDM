package yki;

import aii.b0;
import android.os.Bundle;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.flow.FlowTaskState;
import dki.c0;
import dki.y;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yki.h;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f314631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f314632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ControllerKey f314633c;
    public a d;
    public Bundle e;
    public final com.revolut.kompot.navigable.vc.modal.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zji.f f314634g;

    /* JADX WARN: Multi-variable type inference failed */
    public i(j hostModel, Function2 controllersFactory) {
        Intrinsics.checkNotNullParameter(hostModel, "hostModel");
        Intrinsics.checkNotNullParameter(controllersFactory, "controllersFactory");
        this.f314631a = hostModel;
        this.f314632b = controllersFactory;
        Intrinsics.i(hostModel, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewControllerModel<*>");
        this.f = new com.revolut.kompot.navigable.vc.modal.a((yji.l) hostModel, new yi3.d(this, 4));
        this.f314634g = new zji.f();
    }

    @Override // yki.b
    public final void a() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // yki.b
    public final Set b() {
        a aVar = this.d;
        return aVar != null ? aVar.b() : h0.f322473a;
    }

    @Override // yki.b
    public final boolean c() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.c();
        }
        return false;
    }

    @Override // yki.b
    public final FlowStep d() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    @Override // yki.b
    public final boolean e(boolean z) {
        a aVar = this.d;
        if (aVar != null) {
            return aVar.e(z);
        }
        return false;
    }

    @Override // yki.b
    public final zji.f f() {
        return this.f314634g;
    }

    @Override // yki.b
    public final void g(FlowStep step, boolean z, TransitionAnimation animation, boolean z3) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        a aVar = this.d;
        if (aVar != null) {
            t().g(step, z, animation, z3);
            return;
        }
        if (aVar == null) {
            Object obj2 = this.f314631a;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
            aVar = new a((yji.l) obj2, step, f0.f322471a, this.f314632b);
            this.d = aVar;
        }
        s(aVar);
    }

    @Override // yki.b
    public final void h() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // yki.b
    public final void i(boolean z) {
        a aVarT = t();
        boolean zC = aVarT.c();
        aVarT.i(z);
        if (zC || z) {
            return;
        }
        this.d = null;
    }

    @Override // yki.b
    public final void j(FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.d == null) {
            this.f.a(step, style);
        } else {
            t().j(step, style);
        }
    }

    @Override // yki.b
    public final void k(FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        if (this.d == null) {
            this.f.b(step, style);
        } else {
            t().k(step, style);
        }
    }

    @Override // yki.b
    public final void l(ControllerKey parentKey) {
        Intrinsics.checkNotNullParameter(parentKey, "parentKey");
        this.f314633c = parentKey;
        if (this.d == null) {
            this.f314631a.M0();
        } else {
            s(t());
        }
    }

    @Override // yki.b
    public final void m(ViewController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (this.d == null) {
            this.f.f98442a.l1().M0(new b0());
        } else {
            t().m(controller);
        }
    }

    @Override // yki.b
    public final void n() {
        if (this.d != null) {
            t().n();
        } else {
            this.f314634g.a(new c0());
        }
    }

    @Override // yki.b
    public final void o(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.e = bundle;
        h.Companion.getClass();
        if (h.a.a(bundle)) {
            return;
        }
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        bundle.setClassLoader(FlowTaskState.class.getClassLoader());
        FlowTaskState flowTaskState = (FlowTaskState) bundle.getParcelable("TASK_STATE_ARG");
        FlowStep flowStep = flowTaskState != null ? flowTaskState.f98436a : null;
        if (flowStep != null) {
            a aVar = this.d;
            if (aVar == null) {
                Object obj2 = this.f314631a;
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                a aVar2 = new a((yji.l) obj2, flowStep, f0.f322471a, this.f314632b);
                this.d = aVar2;
                aVar = aVar2;
            }
            aVar.o(bundle);
        }
    }

    @Override // yki.b
    public final boolean p(Function1 stepMatcher) {
        Intrinsics.checkNotNullParameter(stepMatcher, "stepMatcher");
        a aVar = this.d;
        if (aVar != null) {
            return aVar.p(stepMatcher);
        }
        return false;
    }

    @Override // yki.b
    public final void q(Bundle outBundle, Bundle childBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Intrinsics.checkNotNullParameter(childBundle, "childBundle");
        outBundle.putBoolean("FLOW_TRANSIENT_STATE_ARG", this.d == null);
        a aVar = this.d;
        if (aVar != null) {
            aVar.q(outBundle, childBundle);
        } else {
            this.f.e(outBundle);
        }
    }

    @Override // yki.b
    public final void r(y fromCommand, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fromCommand, "fromCommand");
        t().r(fromCommand, bundle);
    }

    public final void s(a aVar) {
        ControllerKey controllerKey = this.f314633c;
        if (controllerKey == null) {
            throw new IllegalStateException("Required value was null.");
        }
        aVar.l(controllerKey);
        aVar.f314625h.b(new oki.e(this, 1));
    }

    public final a t() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
