package yki;

import ag.q;
import aii.s;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.flow.ReusableFlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.flow.BackStackEntry;
import com.revolut.kompot.navigable.vc.flow.FlowTaskState;
import dki.b0;
import dki.c0;
import dki.g0;
import dki.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import yhm.m;
import yhm.o;
import yki.h;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yji.l f314621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlowStep f314622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f314623c;
    public final Function2 d;
    public final com.revolut.kompot.navigable.vc.modal.a e;
    public FlowTaskState f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f314624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zji.f f314625h;
    public Bundle i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ryc.a f314626j;
    public ControllerKey k;

    public a(yji.l hostModel, FlowStep initialStep, List initialBackStack, Function2 controllersFactory) {
        Intrinsics.checkNotNullParameter(hostModel, "hostModel");
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        Intrinsics.checkNotNullParameter(initialBackStack, "initialBackStack");
        Intrinsics.checkNotNullParameter(controllersFactory, "controllersFactory");
        this.f314621a = hostModel;
        this.f314622b = initialStep;
        this.f314623c = initialBackStack;
        this.d = controllersFactory;
        this.e = new com.revolut.kompot.navigable.vc.modal.a(hostModel, new yi3.d(this, 3));
        this.f314624g = new ArrayList();
        this.f314625h = new zji.f();
    }

    @Override // yki.b
    public final void a() {
        if (c()) {
            ArrayList arrayList = this.f314624g;
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                v((FlowTaskState) it8.next(), true);
            }
            arrayList.clear();
        }
    }

    @Override // yki.b
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        FlowTaskState flowTaskState = this.f;
        if (flowTaskState == null) {
            Intrinsics.r("taskState");
            throw null;
        }
        ControllerKey controllerKey = flowTaskState.d;
        if (controllerKey != null) {
            linkedHashSet.add(controllerKey);
        }
        Iterator it8 = this.f314624g.iterator();
        while (it8.hasNext()) {
            ControllerKey controllerKey2 = ((FlowTaskState) it8.next()).d;
            if (controllerKey2 != null) {
                linkedHashSet.add(controllerKey2);
            }
        }
        return linkedHashSet;
    }

    @Override // yki.b
    public final boolean c() {
        return !this.f314624g.isEmpty();
    }

    @Override // yki.b
    public final FlowStep d() {
        FlowTaskState flowTaskState = this.f;
        if (flowTaskState != null) {
            return flowTaskState.f98436a;
        }
        Intrinsics.r("taskState");
        throw null;
    }

    @Override // yki.b
    public final boolean e(boolean z) {
        if (!c()) {
            return false;
        }
        FlowTaskState state = this.f;
        if (state == null) {
            Intrinsics.r("taskState");
            throw null;
        }
        TransitionAnimation transitionAnimation = state.f98438c;
        ArrayList arrayList = this.f314624g;
        this.f = (FlowTaskState) arrayList.remove(v.j(arrayList));
        com.revolut.kompot.navigable.a aVarT = t();
        FlowTaskState backstackTopEntry = this.f;
        if (backstackTopEntry == null) {
            Intrinsics.r("taskState");
            throw null;
        }
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(backstackTopEntry, "backstackTopEntry");
        ryc.a aVar = new ryc.a();
        aVar.f258289a = state;
        aVar.f258290b = backstackTopEntry;
        this.f314626j = aVar;
        this.f314625h.a(new b0(aVarT, !aVarT.f98408q, transitionAnimation, true, z));
        return true;
    }

    @Override // yki.b
    public final zji.f f() {
        return this.f314625h;
    }

    @Override // yki.b
    public final void g(FlowStep step, boolean z, TransitionAnimation animation, boolean z3) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f314625h.a(new y(step, z, animation, z3));
    }

    @Override // yki.b
    public final void i(boolean z) {
        ArrayList arrayList = this.f314624g;
        if (!z) {
            if (c()) {
                this.f = (FlowTaskState) arrayList.remove(v.j(arrayList));
            }
        } else {
            ryc.a aVar = this.f314626j;
            if (aVar != null) {
                this.f = (FlowTaskState) aVar.f258289a;
                arrayList.add((FlowTaskState) aVar.f258290b);
            }
        }
    }

    @Override // yki.b
    public final void j(FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        this.e.a(step, style);
    }

    @Override // yki.b
    public final void k(FlowStep step, ModalDestination.Style style) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(style, "style");
        this.e.b(step, style);
    }

    @Override // yki.b
    public final void l(ControllerKey parentKey) {
        Intrinsics.checkNotNullParameter(parentKey, "parentKey");
        this.k = parentKey;
        Bundle bundle = this.i;
        if (bundle == null) {
            w();
        } else {
            FlowTaskState flowTaskState = this.f;
            if (flowTaskState != null) {
                v(flowTaskState, false);
            }
            bundle.setClassLoader(a.class.getClassLoader());
            if (bundle.containsKey("TASK_STATE_ARG") && bundle.containsKey("BACK_STACK_ARG")) {
                Intrinsics.checkNotNullParameter(bundle, "<this>");
                bundle.setClassLoader(FlowTaskState.class.getClassLoader());
                FlowTaskState flowTaskState2 = (FlowTaskState) bundle.getParcelable("TASK_STATE_ARG");
                if (flowTaskState2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.f = flowTaskState2;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("BACK_STACK_ARG");
                if (parcelableArrayList == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ArrayList arrayList = this.f314624g;
                arrayList.clear();
                arrayList.addAll(parcelableArrayList);
            } else {
                gom.c cVar = gom.e.f145194a;
                cVar.f("DefaultFlowCoordinator");
                cVar.e(t.e("Coordinator wanted to restore flow model state but failed.\n                Expected: bundle must have TASK_STATE_ARG and BACK_STACK_ARG keys\n                Actual: bundle has " + bundle.keySet() + " keys\n            "), new Object[0]);
                w();
            }
        }
        s sVar = this.f314621a.f314520h;
        this.f314625h.a(new b0(t(), false, TransitionAnimation.NONE.f98393a, false, sVar == null || sVar == s.CREATED));
        this.e.c();
    }

    @Override // yki.b
    public final void m(ViewController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (controller.q2().d()) {
            this.e.f98442a.l1().M0(new aii.b0());
        } else {
            e(true);
        }
    }

    @Override // yki.b
    public final void n() {
        a();
        this.f314625h.a(new c0());
    }

    @Override // yki.b
    public final void o(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.i = bundle;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        aVar.f98444c = bundle;
    }

    @Override // yki.b
    public final boolean p(Function1 stepMatcher) {
        Object next;
        Intrinsics.checkNotNullParameter(stepMatcher, "stepMatcher");
        ArrayList arrayList = this.f314624g;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((Boolean) stepMatcher.invoke(((FlowTaskState) next).f98436a)).booleanValue()) {
                break;
            }
        }
        FlowTaskState flowTaskState = (FlowTaskState) next;
        if (flowTaskState == null) {
            return false;
        }
        while (c() && !Intrinsics.f(((FlowTaskState) d0.m0(arrayList)).f98436a, flowTaskState.f98436a)) {
            v((FlowTaskState) d0.m0(arrayList), true);
            arrayList.remove(v.j(arrayList));
        }
        return true;
    }

    @Override // yki.b
    public final void q(Bundle outBundle, Bundle childBundle) {
        FlowTaskState flowTaskStateA;
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Intrinsics.checkNotNullParameter(childBundle, "childBundle");
        ArrayList arrayList = this.f314624g;
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList);
        h.Companion.getClass();
        if (!h.a.a(childBundle) || arrayList.isEmpty()) {
            FlowTaskState flowTaskState = this.f;
            if (flowTaskState == null) {
                Intrinsics.r("taskState");
                throw null;
            }
            flowTaskStateA = FlowTaskState.a(flowTaskState, childBundle, null, 13);
            this.f = flowTaskStateA;
        } else {
            flowTaskStateA = (FlowTaskState) arrayList2.remove(v.j(arrayList2));
        }
        outBundle.putParcelable("TASK_STATE_ARG", flowTaskStateA);
        outBundle.putParcelableArrayList("BACK_STACK_ARG", arrayList2);
        this.e.e(outBundle);
    }

    @Override // yki.b
    public final void r(y nextCommand, Bundle bundle) {
        Object objA;
        Intrinsics.checkNotNullParameter(nextCommand, "fromCommand");
        boolean z = nextCommand.f115564b;
        TransitionAnimation animation = nextCommand.f115565c;
        if (z) {
            FlowTaskState flowTaskState = this.f;
            if (flowTaskState == null) {
                Intrinsics.r("taskState");
                throw null;
            }
            this.f314624g.add(FlowTaskState.a(flowTaskState, bundle, null, 13));
        } else {
            FlowTaskState flowTaskState2 = this.f;
            if (flowTaskState2 == null) {
                Intrinsics.r("taskState");
                throw null;
            }
            v(flowTaskState2, false);
        }
        if (this.f == null) {
            Intrinsics.r("taskState");
            throw null;
        }
        FlowStep step = nextCommand.f115563a;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f = new FlowTaskState(step, null, animation, null);
        com.revolut.kompot.navigable.a controller = t();
        Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
        Intrinsics.checkNotNullParameter(controller, "controller");
        try {
            m.Companion aVar = m.INSTANCE;
            if (controller instanceof hki.a) {
                if (nextCommand.f115564b) {
                    throw new IllegalArgumentException("addCurrentStepToBackStack must be false");
                }
                if (!Intrinsics.f(animation, TransitionAnimation.FADE.f98392a)) {
                    throw new IllegalArgumentException(("animation=" + animation + ", expected 'FADE'").toString());
                }
                controller.j2(new ajm.d(controller, 21));
            }
            objA = Unit.f186387a;
        } catch (Throwable th10) {
            m.Companion aVar2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            new Handler(Looper.getMainLooper()).post(new q(thA, 25));
        }
        this.f314625h.a(new b0(controller, false, nextCommand.f115565c, false, nextCommand.d));
    }

    public final com.revolut.kompot.navigable.a s() {
        FlowTaskState flowTaskState = this.f;
        if (flowTaskState != null) {
            return (com.revolut.kompot.navigable.a) this.d.invoke(this, flowTaskState.f98436a);
        }
        Intrinsics.r("taskState");
        throw null;
    }

    public final com.revolut.kompot.navigable.a t() {
        com.revolut.kompot.navigable.a aVarD;
        com.revolut.kompot.navigable.a aVar;
        ControllerKey controllerKey = this.k;
        if (controllerKey == null) {
            Intrinsics.r("parentControllerKey");
            throw null;
        }
        FlowTaskState flowTaskState = this.f;
        if (flowTaskState == null) {
            Intrinsics.r("taskState");
            throw null;
        }
        ControllerKey controllerKeyL = flowTaskState.d;
        if (controllerKeyL == null) {
            FlowStep flowStep = flowTaskState.f98436a;
            ReusableFlowStep reusableFlowStep = flowStep instanceof ReusableFlowStep ? (ReusableFlowStep) flowStep : null;
            controllerKeyL = reusableFlowStep != null ? t1.l(reusableFlowStep, controllerKey) : null;
        }
        if (controllerKeyL != null) {
            aki.c cVar = this.f314621a.d;
            if (cVar == null) {
                Intrinsics.r("_controllersCache");
                throw null;
            }
            aVarD = ((aki.f) cVar).d(controllerKeyL);
        } else {
            aVarD = null;
        }
        if (aVarD == null) {
            FlowTaskState flowTaskState2 = this.f;
            if (flowTaskState2 == null) {
                Intrinsics.r("taskState");
                throw null;
            }
            FlowStep flowStep2 = flowTaskState2.f98436a;
            ControllerKey controllerKey2 = this.k;
            if (controllerKey2 == null) {
                Intrinsics.r("parentControllerKey");
                throw null;
            }
            aVar = (com.revolut.kompot.navigable.a) this.d.invoke(this, flowStep2);
            if (flowStep2 instanceof ReusableFlowStep) {
                aVar.M2(new aki.b(controllerKey2));
                yff.b bVar = new yff.b(flowStep2, controllerKey2, 6);
                Intrinsics.checkNotNullParameter(bVar, "<set-?>");
                aVar.f98399b = bVar;
            }
        } else {
            aVar = aVarD;
        }
        if (aVarD == null && aVar != null) {
            aVar.j2(new yff.b(aVar, this, 5));
        }
        FlowTaskState flowTaskState3 = this.f;
        if (flowTaskState3 != null) {
            this.f = FlowTaskState.a(flowTaskState3, null, aVar.u2(), 7);
            return aVar;
        }
        Intrinsics.r("taskState");
        throw null;
    }

    public final g0 u() {
        if (this.i != null) {
            return g0.REQUIRED;
        }
        return null;
    }

    public final void v(FlowTaskState flowTaskState, boolean z) {
        ControllerKey controllerKey = flowTaskState.d;
        if (controllerKey != null) {
            aki.c cVar = this.f314621a.d;
            if (cVar != null) {
                aki.c.a(cVar, controllerKey, z);
            } else {
                Intrinsics.r("_controllersCache");
                throw null;
            }
        }
    }

    public final void w() {
        List<BackStackEntry> list = this.f314623c;
        this.f = new FlowTaskState(this.f314622b, null, list.isEmpty() ? TransitionAnimation.NONE.f98393a : ((BackStackEntry) d0.m0(list)).f98435b, null);
        ArrayList arrayList = this.f314624g;
        arrayList.clear();
        for (BackStackEntry backStackEntry : list) {
            arrayList.add(new FlowTaskState(backStackEntry.f98434a, null, backStackEntry.f98435b, null));
        }
    }
}
