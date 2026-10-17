package yki;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.b0;
import dki.n;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements c, pki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f314627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f314628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f314629c;
    public final Function1 d;
    public final n e;
    public final bli.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hli.e f314630g;

    public e(int i, int i2, Function1 function1, f controller, g model) {
        function1 = (i2 & 8) != 0 ? null : function1;
        n childControllerManagers = new n();
        bli.b parentControllerModelBindingDelegate = new bli.b(childControllerManagers, controller);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(childControllerManagers, "childControllerManagers");
        Intrinsics.checkNotNullParameter(parentControllerModelBindingDelegate, "parentControllerModelBindingDelegate");
        this.f314627a = i;
        this.f314628b = controller;
        this.f314629c = model;
        this.d = function1;
        this.e = childControllerManagers;
        this.f = parentControllerModelBindingDelegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(e eVar, b0 b0Var) {
        e eVar2 = eVar;
        com.revolut.kompot.navigable.a aVar = b0Var.f115523a;
        TransitionAnimation transitionAnimation = b0Var.f115525c;
        boolean z = b0Var.d;
        hli.e eVar3 = eVar2.f314630g;
        hli.e controllerContainer = eVar3;
        if (eVar3 == null) {
            KeyEvent.Callback callbackFindViewById = eVar2.d().D2().findViewById(eVar2.f314627a);
            if (callbackFindViewById == null) {
                throw new IllegalArgumentException(eVar2.d().getV().concat(": container for child manager should be presented").toString());
            }
            if (!(callbackFindViewById instanceof hli.e)) {
                throw new IllegalArgumentException(eVar2.d().getV().concat(": container for child manager should be ControllerContainer").toString());
            }
            hli.e eVar4 = (hli.e) callbackFindViewById;
            eVar4.setContainerId("MAIN_CONTAINER_ID");
            eVar2.f314630g = eVar4;
            controllerContainer = eVar4;
        }
        String id10 = controllerContainer.getContainerId();
        Intrinsics.checkNotNullParameter(controllerContainer, "controllerContainer");
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(controllerContainer.getContainerId(), "NO_CONTAINER_ID")) {
            throw new IllegalStateException("containerId should be set for child controller containers");
        }
        boolean zF = Intrinsics.f(controllerContainer.getContainerId(), "MODAL_CONTAINER_ID");
        n nVar = eVar2.e;
        com.revolut.kompot.navigable.b bVarC = nVar.c(id10);
        if (bVarC == null) {
            yji.h hVar = zF ? yji.f.f314513a : yji.g.f314514a;
            Integer num = eVar2.d().y2().f98419b;
            aki.c cVar = eVar2.d().y2().f98420c;
            ViewGroup viewGroup = (ViewGroup) controllerContainer;
            Function1 function1U2 = pd.b.e(eVar2.d()).U2();
            wji.d aVar2 = (!zF || function1U2 == null) ? new jpf.a(viewGroup, eVar2.d().y2().f98425m) : new ou5.b(viewGroup, function1U2, eVar2.d().y2().f98425m);
            int i = 0;
            int i2 = 2;
            d dVar = new d(i2, eVar2, e.class, "onChildControllerAttached", "onChildControllerAttached(Lcom/revolut/kompot/navigable/Controller;Lcom/revolut/kompot/navigable/ControllerManager;)V", i, 0);
            eVar2 = eVar;
            com.revolut.kompot.navigable.b bVar = new com.revolut.kompot.navigable.b(hVar, num, cVar, aVar2, dVar, new d(i2, eVar2, e.class, "onChildControllerDetached", "onChildControllerDetached(Lcom/revolut/kompot/navigable/Controller;Lcom/revolut/kompot/navigable/ControllerManager;)V", i, 1), new yea.l(1, eVar2, e.class, "onTransitionCanceled", "onTransitionCanceled(Z)V", i, 4));
            bVar.f98425m = eVar2.d().y2().f98425m;
            n.a(nVar, id10, bVar);
            bVarC = bVar;
        }
        bVarC.j(aVar, eVar2.d(), transitionAnimation, z);
        FlowStep flowStepD = eVar2.f314629c.s().d();
        if (flowStepD == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Function1 function1 = eVar2.d;
        if (function1 != null) {
            function1.invoke(flowStepD);
        }
    }

    @Override // pki.a
    public final void J() {
        this.f.J();
    }

    @Override // pki.a
    public final void J0(boolean z) {
        this.f.J0(z);
    }

    @Override // pki.a
    public final void J1(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f.J1(token);
    }

    @Override // pki.a
    public final void L1(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f.L1(stateStorage);
    }

    @Override // pki.a
    public final void R0() {
        this.f.R0();
    }

    @Override // pki.a
    public final void W() {
        this.f.W();
    }

    public final com.revolut.kompot.navigable.a a() {
        com.revolut.kompot.navigable.b bVarC;
        hli.e eVar = this.f314630g;
        if (eVar == null || (bVarC = this.e.c(eVar.getContainerId())) == null) {
            return null;
        }
        return bVarC.k;
    }

    @Override // yki.c
    public final boolean b() {
        return this.f314629c.s().c();
    }

    @Override // pki.a
    public final void b0(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f.b0(stateStorage);
    }

    public final iki.d c() {
        return pd.b.e(d()).R;
    }

    @Override // pki.a
    public final void c2() {
        this.f.c2();
    }

    public final ViewController d() {
        o oVar = this.f314628b;
        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
        return (ViewController) oVar;
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f314629c.s().o(state);
    }

    @Override // pki.a
    public final void e0(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f.e0(token);
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Bundle bundle = new Bundle();
        com.revolut.kompot.navigable.a aVarA = a();
        if (aVarA == null) {
            aVarA = null;
        }
        if (aVarA != null) {
            aVarA.g(bundle);
        }
        this.f314629c.s().q(outState, bundle);
    }

    @Override // pki.a
    public final void g1(boolean z) {
        this.f.g1(z);
    }

    @Override // pki.a
    public final void i1(boolean z) {
        this.f.i1(z);
    }

    @Override // pki.a
    public final boolean l0(boolean z) {
        if (this.f314629c.s().e(z)) {
            return true;
        }
        rd0.e.o(d(), c(), z);
        return true;
    }

    @Override // pki.a
    public final void n() {
        this.f.n();
    }

    @Override // yki.c
    public final boolean n0() {
        if (this.f314629c.s().d() == null) {
            return true;
        }
        com.revolut.kompot.navigable.a aVarA = a();
        if (aVarA == null) {
            return false;
        }
        return pd.b.g(aVarA);
    }

    @Override // pki.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this.f.o(i, permissions, grantResults);
    }

    @Override // pki.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f.onActivityResult(i, i2, intent);
    }

    @Override // pki.a
    public final void onCreate() {
        g gVar = this.f314629c;
        gVar.s().l(d().u2());
        d().i.a(gVar.s().f().b(new dki.f(this, 4)));
        KeyEvent.Callback callbackD2 = d().D2();
        lki.c cVar = callbackD2 instanceof lki.c ? (lki.c) callbackD2 : null;
        if (cVar != null) {
            cVar.B(new y99.c(this, 19));
        }
    }

    @Override // pki.a
    public final void onDestroy() throws aki.e {
        this.f314629c.s().h();
        ListIterator listIterator = ((aim.e) this.e.getAll()).listIterator(0);
        while (true) {
            aim.b bVar = (aim.b) listIterator;
            if (!bVar.hasNext()) {
                c().a(d().u2().f98378a);
                return;
            }
            ((com.revolut.kompot.navigable.b) bVar.next()).d();
        }
    }

    @Override // yki.c
    public final b s() {
        return this.f314629c.s();
    }

    @Override // pki.a
    public final void u(boolean z) {
        this.f.u(z);
    }

    @Override // pki.a
    public final boolean u1(oki.d defaultHandler) {
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        if (this.f.u1(defaultHandler)) {
            return true;
        }
        return this.f314629c.s().e(false);
    }

    @Override // pki.a
    public final void z() {
        this.f.z();
    }
}
