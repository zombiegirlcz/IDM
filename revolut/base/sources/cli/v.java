package cli;

import android.app.Activity;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import dce.l0;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q0;
import vkm.v1;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements a0, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f25037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f25038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f25039c;
    public final a d;
    public final z1 e;
    public final z1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f25040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f25041h;
    public int i;

    public v(w controller, z model, Function0 function0) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f25037a = controller;
        this.f25038b = model;
        this.f25039c = function0;
        this.d = new a();
        this.e = vkm.q.a(1, 1, ukm.f.DROP_OLDEST);
        this.f = vkm.q.b(16, 5, null);
        this.f25041h = new LinkedHashSet();
    }

    @Override // pki.a
    public final void J1(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f25041h.add(token);
    }

    @Override // pki.a
    public final void L1(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        g state = this.f25038b.getState();
        Continuation continuation = null;
        h hVar = state instanceof h ? (h) state : null;
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
            String str = hVar.e;
            States$PersistentDomain state2 = (States$PersistentDomain) ((j2) hVar.f22677a).getValue();
            stateStorage.getClass();
            Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-kompot-navigable-vc-ui-PersistentModelStateKey$-key$0");
            Intrinsics.checkNotNullParameter(state2, "state");
            String strQ = j6.a.q("model_state_", str);
            stateStorage.f314332c.d(strQ, state2);
            CoroutineScope coroutineScope = stateStorage.f314330a;
            p0 p0Var = p0.f264001a;
            e0.C(coroutineScope, elm.f.f127540b, null, new wo2.l(stateStorage, strQ, state2, continuation, 27), 2);
        }
    }

    @Override // pki.a
    public final void R0() {
        Continuation continuation = null;
        wkm.l lVarQ = vkm.q.Q(this.e, new bw4.s(continuation, this, 18));
        Intrinsics.checkNotNullParameter(lVarQ, "<this>");
        vkm.q.G(new q0(new v1(new afe.a(lVarQ, continuation, 6)), new ck7.j(this, continuation, 3), 1), a().f98402h);
        Activity activity = a().m2();
        Intrinsics.checkNotNullParameter(activity, "activity");
        boolean z = activity instanceof AppCompatActivity;
        a aVar = this.d;
        boolean z3 = false;
        if (z) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            if (appCompatActivity.getLifecycle().getState().compareTo(Lifecycle.State.RESUMED) < 0) {
                Transition enterTransition = appCompatActivity.getWindow().getEnterTransition();
                Transition reenterTransition = appCompatActivity.getWindow().getReenterTransition();
                if (enterTransition != null) {
                    enterTransition.addListener(aVar);
                    aVar.f25015c = enterTransition;
                    z3 = true;
                }
                if (reenterTransition != null && !Intrinsics.f(enterTransition, reenterTransition)) {
                    reenterTransition.addListener(aVar);
                    aVar.d = reenterTransition;
                    z3 = true;
                }
            }
        }
        if (z3) {
            aVar.f25013a = new bvb.a(this, 24);
        }
    }

    public final ViewController a() {
        yji.o oVar = this.f25037a;
        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
        return (ViewController) oVar;
    }

    @Override // pki.a
    public final void b0(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        g state = this.f25038b.getState();
        h hVar = state instanceof h ? (h) state : null;
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
            String str = hVar.e;
            stateStorage.getClass();
            Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-kompot-navigable-vc-ui-PersistentModelStateKey$-key$0");
            States$PersistentDomain states$PersistentDomain = (States$PersistentDomain) stateStorage.f314332c.c("model_state_" + str);
            if (states$PersistentDomain != null) {
                hVar.D(new c7e.i(hVar, states$PersistentDomain, 28));
            }
        }
    }

    public final boolean c() {
        TransitionAnimation transitionAnimation;
        return (this.f25041h.isEmpty() || (this.i == 1)) && ((a().f98411t == yji.b.NONE) || (a().f98411t == yji.b.ENTER && (transitionAnimation = a().q2().f206461b) != null && !transitionAnimation.I0())) && !this.d.f25014b;
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Object state2 = this.f25038b.getState();
        qki.a aVar = state2 instanceof qki.a ? (qki.a) state2 : null;
        if (aVar != null) {
            aVar.e(state);
        }
    }

    @Override // pki.a
    public final void e0(os2.g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f25041h.remove(token);
        if (c()) {
            this.f.k(Unit.f186387a);
        }
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Object state = this.f25038b.getState();
        qki.a aVar = state instanceof qki.a ? (qki.a) state : null;
        if (aVar != null) {
            aVar.g(outState);
        }
    }

    @Override // pki.a
    public final void g1(boolean z) {
        if (z && c()) {
            this.f.k(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // pki.a
    public final void onCreate() {
        Flow flow;
        View viewD2 = a().D2();
        if (viewD2.isAttachedToWindow()) {
            onViewAttachedToWindow(viewD2);
        }
        viewD2.addOnAttachStateChangeListener(this);
        z zVar = this.f25038b;
        ?? F = 0;
        F = 0;
        Function0 function0 = this.f25039c;
        if (function0 != null && (flow = (Flow) function0.invoke()) != null) {
            t38.e eVar = new t38.e(new vkm.y(new a35.j(2, 12, F), flow), 24, zVar.getState().F(), new a0e.n(3, 3, (Continuation) F));
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            F = t1.e(eVar, new a26.p());
        }
        if (F == 0) {
            F = zVar.getState().F();
        }
        vkm.q.G(new q0(F, new a97.i(2, this.e, MutableSharedFlow.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), 1), a().f98401g);
    }

    @Override // pki.a
    public final void onDestroy() {
        a().D2().removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f25038b.getState().d = false;
        View viewD2 = a().D2();
        if (!viewD2.isLaidOut() || viewD2.isLayoutRequested()) {
            viewD2.addOnLayoutChangeListener(new u(this, 0));
        } else {
            this.f25038b.getState().d = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // pki.a
    public final void z() {
        a aVar = this.d;
        Transition transition = aVar.f25015c;
        if (transition != null) {
            transition.removeListener(aVar);
        }
        Transition transition2 = aVar.d;
        if (transition2 != null) {
            transition2.removeListener(aVar);
        }
        aVar.f25015c = null;
        aVar.d = null;
        aVar.f25014b = false;
    }
}
