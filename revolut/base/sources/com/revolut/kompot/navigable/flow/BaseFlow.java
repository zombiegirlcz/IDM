package com.revolut.kompot.navigable.flow;

import a97.i;
import aii.m;
import aii.o;
import aii.r;
import aii.s;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bmm.t;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.screen.BaseScreen;
import dce.l0;
import dki.b;
import dki.b0;
import dki.c;
import dki.d0;
import dki.g;
import dki.l;
import dki.n;
import dki.p;
import dki.x;
import hli.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nhi.k;
import skm.p0;
import yhm.d;
import yhm.j;
import yji.f;
import yji.h;
import zhm.w0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u00072\b\u0012\u0004\u0012\u00028\u00020\b2\u00020\t2\u00020\n:\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "STEP", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT_DATA", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/kompot/navigable/a;", "Ldki/p;", "Laii/o;", "Lyji/r;", "dki/c", "dki/d", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class BaseFlow<STEP extends FlowStep, INPUT_DATA extends IOData$Input, OUTPUT_DATA extends r> extends a implements p, o {
    public static final /* synthetic */ int O = 0;
    public final IOData$Input G;
    public final Lazy H;
    public final Lazy I;
    public Function1 J;
    public e K;
    public final n L;
    public final Lazy M;
    public final int N;

    public BaseFlow(IOData$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.G = inputData;
        this.H = j.b(new b(this, 0));
        this.I = j.b(new b(this, 1));
        this.J = new an0.e(12);
        this.L = new n();
        this.M = j.b(new b(this, 2));
        this.N = R$id.container;
    }

    public static final void d3(BaseFlow baseFlow, b0 b0Var) {
        a aVar = b0Var.f115523a;
        TransitionAnimation transitionAnimation = b0Var.f115525c;
        boolean z = b0Var.d;
        if (b0Var.f115524b && (aVar instanceof BaseFlow)) {
            aVar.j2(new t(aVar, baseFlow, 5));
        }
        e eVar = baseFlow.K;
        if (eVar == null) {
            Intrinsics.r("mainControllerContainer");
            throw null;
        }
        if (eVar == null) {
            Intrinsics.r("mainControllerContainer");
            throw null;
        }
        baseFlow.V2(eVar, eVar.getContainerId(), null).j(aVar, baseFlow, transitionAnimation, z);
        if (aVar instanceof BaseScreen) {
            baseFlow.M0(new hji.a(aVar, baseFlow, !transitionAnimation.equals(TransitionAnimation.NONE.f98393a)));
        }
        baseFlow.g3();
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        return W2() != c.UNHANDLED;
    }

    @Override // com.revolut.kompot.navigable.a
    public void G2(boolean z) {
        if (((g) S2()).B2(z)) {
            return;
        }
        rd0.e.o(this, pd.b.e(this).R, z);
    }

    @Override // com.revolut.kompot.navigable.a
    public void H2() {
        super.H2();
        g3();
        T2().f115553b.S1(s.SHOWN);
        Iterator it8 = zhm.b0.L(this.L.getAll()).iterator();
        while (true) {
            ListIterator listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                break;
            }
            com.revolut.kompot.navigable.b bVar = (com.revolut.kompot.navigable.b) listIterator.previous();
            a aVar = bVar.k;
            if (aVar != null) {
                bVar.c();
                if (bVar.f98422h && !aVar.x2()) {
                    break;
                }
            }
        }
        Iterator it9 = k.f215505b.iterator();
        while (it9.hasNext()) {
            ((xji.a) it9.next()).z2(this);
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public void I2() {
        super.I2();
        T2().a();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void J() {
        Iterator it8 = ((Iterable) T2().f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            ((com.revolut.kompot.navigable.b) it8.next()).f();
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public void J0(boolean z) {
        super.J0(z);
        T2().d(z);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void K2() {
        Iterator it8 = zhm.b0.L(this.L.getAll()).iterator();
        while (true) {
            ListIterator listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                super.K2();
                return;
            } else {
                a aVar = ((com.revolut.kompot.navigable.b) listIterator.previous()).k;
                if (aVar != null) {
                    aVar.K2();
                }
            }
        }
    }

    public aii.n M0(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ((x) this.I.getValue()).b(event);
    }

    public final void O2() {
        if (F2()) {
            return;
        }
        a aVar = this.f98405m;
        BaseFlow baseFlow = aVar instanceof BaseFlow ? (BaseFlow) aVar : null;
        if (baseFlow != null) {
            baseFlow.O2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.revolut.kompot.navigable.b P2(e eVar, h hVar, l0 l0Var) {
        Integer num = y2().f98419b;
        aki.c cVar = y2().f98420c;
        Intrinsics.i(eVar, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) eVar;
        boolean zO = c6d.b.o(hVar);
        Function1 function1U2 = l0Var;
        if (l0Var == null) {
            function1U2 = U2();
        }
        com.revolut.kompot.navigable.b bVar = new com.revolut.kompot.navigable.b(hVar, num, cVar, (!zO || function1U2 == null) ? new jpf.a(viewGroup, y2().f98425m) : new ou5.b(viewGroup, function1U2, y2().f98425m), new i(this, 13), new i(this, 14), new cn7.c(this));
        bVar.f98425m = y2().f98425m;
        return bVar;
    }

    public abstract qji.a Q2();

    /* JADX INFO: renamed from: R2, reason: from getter */
    public int getX() {
        return this.N;
    }

    public abstract dki.s S2();

    public final dki.r T2() {
        return (dki.r) this.H.getValue();
    }

    public Function1 U2() {
        return null;
    }

    public final com.revolut.kompot.navigable.b V2(e controllerContainer, String id10, dki.d dVar) {
        com.revolut.kompot.navigable.b bVarE;
        a aVar;
        lki.r rVarM;
        lki.r rVarE;
        Intrinsics.checkNotNullParameter(controllerContainer, "controllerContainer");
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(controllerContainer.getContainerId(), "NO_CONTAINER_ID")) {
            throw new IllegalStateException("containerId should be set for child controller containers");
        }
        n nVar = this.L;
        r10.t tVar = (dVar == null || (bVarE = nVar.e(0)) == null || (aVar = bVarE.k) == null || !aVar.f98408q || (rVarM = com.bumptech.glide.c.m(aVar.D2())) == null || (rVarE = rVarM.e(dVar.a(), pd.b.e(this).T)) == null) ? null : new r10.t(rVarE, bVarE);
        if (tVar == null) {
            h hVar = Intrinsics.f(controllerContainer.getContainerId(), "MODAL_CONTAINER_ID") ? f.f314513a : yji.g.f314514a;
            com.revolut.kompot.navigable.b bVarC = nVar.c(id10);
            if (bVarC != null) {
                return bVarC;
            }
            com.revolut.kompot.navigable.b bVarP2 = P2(controllerContainer, hVar, null);
            n.a(nVar, id10, bVarP2);
            return bVarP2;
        }
        com.revolut.kompot.navigable.b manager = P2(controllerContainer, yji.e.f314512a, new l0(tVar, 18));
        com.revolut.kompot.navigable.b embeddedIn = tVar.d();
        nVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(embeddedIn, "embeddedIn");
        dki.m mVarB = nVar.b(embeddedIn);
        if (mVarB instanceof dki.k) {
            dki.k kVar = (dki.k) mVarB;
            dki.j jVar = new dki.j(new ao.h(id10, manager), kVar);
            ((ArrayList) kVar.b()).add(jVar);
            nVar.f115551b.put(id10, jVar);
            return manager;
        }
        if (mVarB instanceof dki.j) {
            throw new IllegalStateException(("Cannot embed into an already-embedded manager: " + embeddedIn).toString());
        }
        if (mVarB instanceof l) {
            throw new IllegalStateException(("Cannot embed into a regular manager: " + embeddedIn).toString());
        }
        if (mVarB != null) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Parent modal manager not found for embeddedIn=" + embeddedIn).toString());
    }

    @Override // com.revolut.kompot.navigable.a
    public final void W() {
        Iterator it8 = ((Iterable) T2().f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            ((com.revolut.kompot.navigable.b) it8.next()).g();
        }
    }

    public c W2() {
        ListIterator listIterator;
        Iterator it8 = zhm.b0.L(this.L.getAll()).iterator();
        do {
            listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                return super.F2() ? c.INTERCEPTED : ((g) S2()).B2(false) ? c.POP_BACK_STACK : c.UNHANDLED;
            }
        } while (!((com.revolut.kompot.navigable.b) listIterator.previous()).b());
        return c.INTERCEPTED;
    }

    public void X2(int i, int i2, Intent intent) {
    }

    public void Y2(a controller, com.revolut.kompot.navigable.b controllerManager) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        if (!controller.x2() && controllerManager.f98423j) {
            a aVar = controllerManager.k;
            if (aVar == null || Intrinsics.f(aVar, controller)) {
                for (com.revolut.kompot.navigable.b bVar : this.L.d(controllerManager)) {
                    if (bVar.k != null) {
                        bVar.e();
                    }
                }
            }
        }
    }

    public void Z2(a controller, com.revolut.kompot.navigable.b controllerManager) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        if (controller.x2() || !controllerManager.f98423j) {
            return;
        }
        a aVar = controllerManager.k;
        if (aVar != null && !aVar.equals(controller)) {
            return;
        }
        Iterator it8 = zhm.b0.L(this.L.d(controllerManager)).iterator();
        while (true) {
            ListIterator listIterator = ((w0) it8).f322483a;
            if (!listIterator.hasPrevious()) {
                return;
            }
            com.revolut.kompot.navigable.b bVar = (com.revolut.kompot.navigable.b) listIterator.previous();
            a aVar2 = bVar.k;
            if (aVar2 != null) {
                if (controllerManager.f98424l) {
                    bVar.c();
                }
                if (bVar.f98423j && !aVar2.x2()) {
                    return;
                }
            }
        }
    }

    public void a3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // qji.c
    public final boolean b() {
        return ((g) S2()).b();
    }

    public void b3() {
    }

    public final void c3(b0 b0Var) {
        if (b0Var.e) {
            d3(this, b0Var);
        } else {
            pd.b.e(this).R.b(u2().f98378a, new cn7.c(new t(this, b0Var, 4)));
        }
    }

    @Override // com.revolut.kompot.navigable.a, yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ((g) S2()).J2(new d0(state, false));
    }

    public final void e3() {
        e eVar = this.K;
        if (eVar == null) {
            Intrinsics.r("mainControllerContainer");
            throw null;
        }
        com.revolut.kompot.navigable.b bVarC = this.L.c(eVar.getContainerId());
        a aVar = bVarC != null ? bVarC.k : null;
        if (aVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (aVar instanceof BaseFlow) {
            BaseFlow baseFlow = (BaseFlow) aVar;
            baseFlow.e3();
            g gVar = (g) S2();
            FlowStateWrapper flowStateWrapperA = FlowStateWrapper.a(gVar.A2(), null, null, g.s2(baseFlow.S2()), null, null, null, 59);
            Intrinsics.checkNotNullParameter(flowStateWrapperA, "<set-?>");
            gVar.f115533l = flowStateWrapperA;
            return;
        }
        Bundle state = new Bundle();
        aVar.g(state);
        g gVar2 = (g) S2();
        gVar2.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        FlowStateWrapper flowStateWrapperA2 = FlowStateWrapper.a(gVar2.A2(), null, null, null, state, null, null, 55);
        Intrinsics.checkNotNullParameter(flowStateWrapperA2, "<set-?>");
        gVar2.f115533l = flowStateWrapperA2;
    }

    public abstract void f3(FlowStep flowStep);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    @Override // com.revolut.kompot.navigable.a, yji.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r5.e3()
            dki.s r1 = r5.S2()
            dki.g r1 = (dki.g) r1
            java.util.ArrayList r2 = r1.f115534m
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            dki.g0 r0 = r1.z2()
            dki.g0 r3 = dki.g0.POSTPONED
            if (r0 != r3) goto L1c
            return
        L1c:
            com.revolut.kompot.navigable.flow.FlowStateWrapper r0 = r1.A2()
            android.os.Bundle r0 = r0.d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            if (r0 == 0) goto L45
            yki.h$a r4 = yki.h.Companion
            r4.getClass()
            boolean r0 = yki.h.a.a(r0)
            if (r0 == 0) goto L45
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L45
            int r0 = zhm.v.j(r3)
            java.lang.Object r0 = r3.remove(r0)
            com.revolut.kompot.navigable.flow.FlowStateWrapper r0 = (com.revolut.kompot.navigable.flow.FlowStateWrapper) r0
            goto L49
        L45:
            com.revolut.kompot.navigable.flow.FlowStateWrapper r0 = r1.A2()
        L49:
            java.lang.String r1 = "STATE_WRAPPER_ARG"
            r6.putParcelable(r1, r0)
            java.lang.String r0 = "BACK_STACK_ARG"
            r6.putParcelableArrayList(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.kompot.navigable.flow.BaseFlow.g(android.os.Bundle):void");
    }

    @Override // com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        T2().e(z);
    }

    public final void g3() {
        f3(((g) S2()).A2().f98430b);
    }

    /* JADX INFO: renamed from: getLayoutId */
    public int getP() {
        Integer num = y2().f98419b;
        return num != null ? num.intValue() : R$layout.base_flow_container;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = E2(inflater).inflate(getP(), (ViewGroup) null, false);
        if (!(viewInflate instanceof e)) {
            throw new IllegalArgumentException(a0.d.r(p2(), ": root ViewGroup should be ControllerContainer").toString());
        }
        e2((e) viewInflate);
        viewInflate.setTag(p2());
        KeyEvent.Callback callbackFindViewById = viewInflate.findViewById(getX());
        if (callbackFindViewById == null) {
            throw new IllegalArgumentException(a0.d.r(p2(), ": container for child manager should be presented").toString());
        }
        if (!(callbackFindViewById instanceof e)) {
            throw new IllegalArgumentException(a0.d.r(p2(), ": container for child manager should be ControllerContainer").toString());
        }
        e eVar = (e) callbackFindViewById;
        eVar.setContainerId("MAIN_CONTAINER_ID");
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.K = eVar;
        Intrinsics.checkNotNullParameter(viewInflate, "<set-?>");
        this.f98406n = viewInflate;
        return viewInflate;
    }

    @Override // com.revolut.kompot.navigable.a
    public final void i1(boolean z) {
        super.i1(z);
        T2().f(z);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void n() {
        super.n();
        T2().c();
    }

    @Override // com.revolut.kompot.navigable.a
    public void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.o(i, permissions, grantResults);
        T2().b(i, permissions, grantResults);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Set o2() {
        return (Set) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        dki.r rVarT2 = T2();
        rVarT2.f115552a.i2(new bli.a(i, rVarT2, intent, i2, 2));
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onCreate() {
        super.onCreate();
        Object objS2 = S2();
        Intrinsics.i(objS2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        yji.l lVar = (yji.l) objS2;
        tji.f fVarI3 = pd.b.e(this).i3();
        aki.c cVar = y2().f98420c;
        p0 p0Var = p0.f264001a;
        lVar.y1(fVarI3, this, cVar, zkm.o.f323119a.e, Q2().f());
        a3(D2());
        T2().f115553b.S1(s.CREATED);
        this.i.a(((g) S2()).f115539s.b(new dki.f(this, 0)));
        KeyEvent.Callback callbackD2 = D2();
        lki.c cVar2 = callbackD2 instanceof lki.c ? (lki.c) callbackD2 : null;
        if (cVar2 != null) {
            cVar2.B(new b(this, 3));
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onDestroy() throws aki.e {
        ListIterator listIterator = ((aim.e) this.L.getAll()).listIterator(0);
        while (true) {
            aim.b bVar = (aim.b) listIterator;
            if (!bVar.hasNext()) {
                super.onDestroy();
                this.i.clear();
                pd.b.e(this).R.a(u2().f98378a);
                b3();
                T2().f115553b.S1(s.FINISHED);
                return;
            }
            ((com.revolut.kompot.navigable.b) bVar.next()).d();
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final void u(boolean z) {
        super.u(z);
        T2().g(z);
    }
}
