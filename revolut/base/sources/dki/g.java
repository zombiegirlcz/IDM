package dki;

import android.os.Bundle;
import android.os.Parcelable;
import com.revolut.kompot.navigable.ControllerKey;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.ChildFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStateWrapper;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g extends yji.l implements s {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FlowStateWrapper f115533l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f0 f115535n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r10.f f115536p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f115534m = new ArrayList();
    public Function1 o = b.f115540a;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zhm.f0 f115537q = zhm.f0.f322471a;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TransitionAnimation.NONE f115538r = TransitionAnimation.NONE.f98393a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zji.f f115539s = new zji.f();

    public static final class a {
        private a() {
        }
    }

    public static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f115540a = new b();

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            FlowState it8 = (FlowState) obj2;
            Intrinsics.checkNotNullParameter(it8, "it");
            return null;
        }
    }

    public static /* synthetic */ void F2(g gVar, FlowStep flowStep, boolean z, TransitionAnimation transitionAnimation, int i) {
        if ((i & 4) != 0) {
            transitionAnimation = null;
        }
        gVar.E2(flowStep, z, transitionAnimation, false);
    }

    public static ChildFlowState s2(s sVar) {
        g gVar = sVar instanceof g ? (g) sVar : null;
        if (gVar != null) {
            if (gVar.z2() == g0.POSTPONED) {
                gVar = null;
            }
            if (gVar != null) {
                return new ChildFlowState(FlowStateWrapper.a(gVar.A2(), null, null, null, null, null, null, 63), new ArrayList(gVar.f115534m));
            }
        }
        return null;
    }

    public final FlowStateWrapper A2() {
        FlowStateWrapper flowStateWrapper = this.f115533l;
        if (flowStateWrapper != null) {
            return flowStateWrapper;
        }
        Intrinsics.r("stateWrapper");
        throw null;
    }

    public final boolean B2(boolean z) {
        if (!b()) {
            return false;
        }
        TransitionAnimation transitionAnimation = A2().e;
        FlowStateWrapper flowStateWrapperA2 = A2();
        ArrayList arrayList = this.f115534m;
        FlowStateWrapper flowStateWrapper = (FlowStateWrapper) arrayList.remove(zhm.v.j(arrayList));
        Intrinsics.checkNotNullParameter(flowStateWrapper, "<set-?>");
        this.f115533l = flowStateWrapper;
        com.revolut.kompot.navigable.a aVarU2 = u2();
        this.f115536p = new r10.f(flowStateWrapperA2, A2());
        this.f115539s.a(new b0(aVarU2, !aVarU2.f98408q, transitionAnimation, true, z));
        return true;
    }

    public boolean C2(aii.u navigationDestination) {
        Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
        return false;
    }

    public final void D2(FlowStateWrapper flowStateWrapper, boolean z) {
        ControllerKey controllerKey = flowStateWrapper.f;
        if (controllerKey != null) {
            aki.c cVar = this.d;
            if (cVar != null) {
                aki.c.a(cVar, controllerKey, z);
            } else {
                Intrinsics.r("_controllersCache");
                throw null;
            }
        }
    }

    public final void E2(FlowStep step, boolean z, TransitionAnimation transitionAnimation, boolean z3) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (transitionAnimation == null) {
            transitionAnimation = TransitionAnimation.SLIDE_END_TO_START.f98395a;
        }
        this.f115539s.a(new y(step, z, transitionAnimation, z3));
    }

    public final void G2(aii.r data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f115539s.a(new z(data));
    }

    public boolean H2() {
        return this instanceof com.revolut.feature.tax_residency.impl.flows.collection.a;
    }

    public final void I2() {
        r2();
        this.f115539s.a(new c0());
    }

    public final void J2(f0 restorationPolicy) {
        f0 e0Var;
        Intrinsics.checkNotNullParameter(restorationPolicy, "restorationPolicy");
        boolean zH2 = H2();
        if (restorationPolicy instanceof d0) {
            Bundle bundle = ((d0) restorationPolicy).f115527a;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            e0Var = new d0(bundle, zH2);
        } else {
            if (!(restorationPolicy instanceof e0)) {
                throw new NoWhenBranchMatchedException();
            }
            s parentFlowModel = ((e0) restorationPolicy).f115529a;
            Intrinsics.checkNotNullParameter(parentFlowModel, "parentFlowModel");
            e0Var = new e0(parentFlowModel, zH2);
        }
        this.f115535n = e0Var;
    }

    @Override // yji.l
    public void K1() {
        r2();
        this.f115535n = null;
    }

    public final boolean K2(h stepRestorationCriteria) {
        Object next;
        Intrinsics.checkNotNullParameter(stepRestorationCriteria, "stepRestorationCriteria");
        ArrayList arrayList = this.f115534m;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((Boolean) stepRestorationCriteria.l().invoke(((FlowStateWrapper) next).f98430b)).booleanValue()) {
                break;
            }
        }
        FlowStateWrapper flowStateWrapper = (FlowStateWrapper) next;
        if (flowStateWrapper == null) {
            return false;
        }
        while (b() && !Intrinsics.f(((FlowStateWrapper) zhm.d0.m0(arrayList)).f98430b, flowStateWrapper.f98430b)) {
            D2((FlowStateWrapper) zhm.d0.m0(arrayList), true);
            arrayList.remove(zhm.v.j(arrayList));
        }
        if (stepRestorationCriteria.m()) {
            this.f115539s.a(new dki.a());
        }
        return true;
    }

    public final void L2(FlowState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        FlowStateWrapper flowStateWrapperA = FlowStateWrapper.a(A2(), value, null, null, null, null, null, 62);
        Intrinsics.checkNotNullParameter(flowStateWrapperA, "<set-?>");
        this.f115533l = flowStateWrapperA;
    }

    public final void M2(f0 f0Var) {
        boolean z = f0Var instanceof d0;
        ArrayList arrayList = this.f115534m;
        if (!z) {
            if (!(f0Var instanceof e0)) {
                if (f0Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                N2();
                return;
            }
            s sVar = ((e0) f0Var).f115529a;
            g gVar = sVar instanceof g ? (g) sVar : null;
            ChildFlowState childFlowState = gVar != null ? gVar.A2().f98431c : null;
            if (childFlowState == null) {
                N2();
                return;
            }
            FlowStateWrapper flowStateWrapper = childFlowState.f98426a;
            Intrinsics.i(flowStateWrapper, "null cannot be cast to non-null type com.revolut.kompot.navigable.flow.FlowStateWrapper<STATE of com.revolut.kompot.navigable.flow.BaseFlowModel, STEP of com.revolut.kompot.navigable.flow.BaseFlowModel>");
            Intrinsics.checkNotNullParameter(flowStateWrapper, "<set-?>");
            this.f115533l = flowStateWrapper;
            ArrayList arrayList2 = childFlowState.f98427b;
            arrayList.clear();
            arrayList.addAll(arrayList2);
            return;
        }
        Bundle bundle = ((d0) f0Var).f115527a;
        if (this.f115533l != null) {
            D2(A2(), false);
        }
        bundle.setClassLoader(getClass().getClassLoader());
        if (!bundle.containsKey("STATE_WRAPPER_ARG") || !bundle.containsKey("BACK_STACK_ARG")) {
            N2();
            return;
        }
        Parcelable parcelable = bundle.getParcelable("STATE_WRAPPER_ARG");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        FlowStateWrapper flowStateWrapper2 = (FlowStateWrapper) parcelable;
        Intrinsics.checkNotNullParameter(flowStateWrapper2, "<set-?>");
        this.f115533l = flowStateWrapper2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("BACK_STACK_ARG");
        if (parcelableArrayList == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        arrayList.clear();
        arrayList.addAll(parcelableArrayList);
    }

    public final void N2() {
        FlowStateWrapper flowStateWrapper = new FlowStateWrapper(x2(), y2(), w2().isEmpty() ? TransitionAnimation.NONE.f98393a : (TransitionAnimation) ((Pair) zhm.d0.m0(w2())).f186386b);
        Intrinsics.checkNotNullParameter(flowStateWrapper, "<set-?>");
        this.f115533l = flowStateWrapper;
        List<Pair> listW2 = w2();
        ArrayList arrayList = this.f115534m;
        arrayList.clear();
        for (Pair pair : listW2) {
            arrayList.add(new FlowStateWrapper(x2(), (FlowStep) pair.f186385a, (TransitionAnimation) pair.f186386b));
        }
    }

    @Override // yji.l
    public final void S1(aii.s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == aii.s.CREATED) {
            f0 f0Var = this.f115535n;
            if (f0Var == null || !f0Var.a()) {
                M2(f0Var);
            } else {
                N2();
            }
            boolean z = z2() == g0.REQUIRED;
            this.f115539s.a(new b0(u2(), z, z ? TransitionAnimation.NONE.f98393a : v2(), false, true));
        }
        super.S1(event);
    }

    public final boolean b() {
        return !this.f115534m.isEmpty();
    }

    @Override // yji.l
    public aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ((event instanceof aii.v) && C2(((aii.v) event).b())) ? aii.w.f5295a : super.o2(event);
    }

    public final void q2() {
        this.f115539s.a(new dki.a());
    }

    public final void r2() {
        if (b()) {
            ArrayList arrayList = this.f115534m;
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                D2((FlowStateWrapper) it8.next(), true);
            }
            arrayList.clear();
        }
    }

    public abstract com.revolut.kompot.navigable.a t2(FlowStep flowStep);

    public final com.revolut.kompot.navigable.a u2() {
        ControllerKey controllerKey = A2().f;
        com.revolut.kompot.navigable.a aVarD = null;
        if (controllerKey != null) {
            aki.c cVar = this.d;
            if (cVar == null) {
                Intrinsics.r("_controllersCache");
                throw null;
            }
            aVarD = ((aki.f) cVar).d(controllerKey);
        }
        com.revolut.kompot.navigable.a aVarT2 = aVarD == null ? t2(A2().f98430b) : aVarD;
        if (aVarD == null) {
            aVarT2.j2(new bmm.t(aVarT2, this, 6));
        }
        FlowStateWrapper flowStateWrapperA = FlowStateWrapper.a(A2(), null, null, null, null, null, aVarT2.u2(), 31);
        Intrinsics.checkNotNullParameter(flowStateWrapperA, "<set-?>");
        this.f115533l = flowStateWrapperA;
        return aVarT2;
    }

    public TransitionAnimation v2() {
        return this.f115538r;
    }

    public List w2() {
        return this.f115537q;
    }

    public abstract FlowState x2();

    public abstract FlowStep y2();

    public final g0 z2() {
        f0 f0Var = this.f115535n;
        if (f0Var != null && f0Var.a()) {
            return g0.POSTPONED;
        }
        if (this.f115535n != null) {
            return g0.REQUIRED;
        }
        return null;
    }
}
