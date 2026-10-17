package dli;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import cli.a0;
import cli.v;
import com.revolut.kompot.navigable.vc.ViewController;
import dce.l0;
import java.util.List;
import koi.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import os2.g;
import yhm.j;
import yhm.k;
import yji.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements c, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f115769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f115770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115771c;
    public final Function1 d;
    public final List e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f115772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f115773h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f115774j;

    public e(a controller, b model, Function0 function0, int i, Function1 layoutManagerProvider, List delegates, h listAdapter) {
        v uiStatesModelBinding = new v(controller, model, function0);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(layoutManagerProvider, "layoutManagerProvider");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(listAdapter, "listAdapter");
        Intrinsics.checkNotNullParameter(uiStatesModelBinding, "uiStatesModelBinding");
        this.f115769a = controller;
        this.f115770b = function0;
        this.f115771c = i;
        this.d = layoutManagerProvider;
        this.e = delegates;
        this.f = listAdapter;
        this.f115772g = uiStatesModelBinding;
        k kVar = k.NONE;
        final int i2 = 0;
        this.i = j.c(kVar, new Function0(this) { // from class: dli.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f115768b;

            {
                this.f115768b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        e eVar = this.f115768b;
                        Function1 function1 = eVar.d;
                        o oVar = eVar.f115769a;
                        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
                        return (RecyclerView.LayoutManager) function1.invoke(((ViewController) oVar).m2());
                    default:
                        RecyclerView recyclerView = this.f115768b.f115773h;
                        if (recyclerView != null) {
                            return recyclerView;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i3 = 1;
        this.f115774j = j.c(kVar, new Function0(this) { // from class: dli.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f115768b;

            {
                this.f115768b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        e eVar = this.f115768b;
                        Function1 function1 = eVar.d;
                        o oVar = eVar.f115769a;
                        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
                        return (RecyclerView.LayoutManager) function1.invoke(((ViewController) oVar).m2());
                    default:
                        RecyclerView recyclerView = this.f115768b.f115773h;
                        if (recyclerView != null) {
                            return recyclerView;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
    }

    @Override // pki.a
    public final void J() {
        this.f115772g.getClass();
    }

    @Override // pki.a
    public final void J0(boolean z) {
        this.f115772g.getClass();
    }

    @Override // pki.a
    public final void J1(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f115772g.J1(token);
    }

    @Override // pki.a
    public final void L1(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f115772g.L1(stateStorage);
    }

    @Override // pki.a
    public final void R0() {
        this.f115772g.R0();
    }

    @Override // pki.a
    public final void W() {
        this.f115772g.getClass();
    }

    @Override // pki.a
    public final void b0(yii.c stateStorage) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        this.f115772g.b0(stateStorage);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // dli.c
    public final RecyclerView.LayoutManager b2() {
        return (RecyclerView.LayoutManager) this.i.getValue();
    }

    @Override // pki.a
    public final void c2() {
        this.f115772g.getClass();
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f115772g.e(state);
    }

    @Override // pki.a
    public final void e0(g token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f115772g.e0(token);
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f115772g.g(outState);
    }

    @Override // pki.a
    public final void g1(boolean z) {
        this.f115772g.g1(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // dli.c
    public final RecyclerView h() {
        return (RecyclerView) this.f115774j.getValue();
    }

    @Override // pki.a
    public final void i1(boolean z) {
        this.f115772g.getClass();
    }

    @Override // pki.a
    public final boolean l0(boolean z) {
        this.f115772g.getClass();
        return false;
    }

    @Override // pki.a
    public final void n() {
        this.f115772g.getClass();
    }

    @Override // pki.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        this.f115772g.o(i, permissions, grantResults);
    }

    @Override // pki.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f115772g.getClass();
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pki.a
    public final void onCreate() {
        v vVar = this.f115772g;
        vVar.onCreate();
        o oVar = this.f115769a;
        Intrinsics.i(oVar, "null cannot be cast to non-null type com.revolut.kompot.navigable.vc.ViewController<*>");
        RecyclerView recyclerView = (RecyclerView) ((ViewController) oVar).D2().findViewById(this.f115771c);
        if (recyclerView == null) {
            throw new IllegalStateException(e.class.getSimpleName().concat(": recyclerViewId is not valid. Forgot to override?"));
        }
        this.f115773h = recyclerView;
        RecyclerView recyclerViewH = h();
        h hVar = this.f;
        hVar.f.b(this.e);
        recyclerViewH.setAdapter(hVar);
        recyclerViewH.setLayoutManager(b2());
        if (((Boolean) jo0.g.f176839y.getValue()).booleanValue()) {
            RecyclerView.ItemAnimator itemAnimator = recyclerViewH.getItemAnimator();
            if (Intrinsics.f(itemAnimator != null ? itemAnimator.getClass() : null, DefaultItemAnimator.class)) {
                RecyclerView.ItemAnimator itemAnimator2 = recyclerViewH.getItemAnimator();
                Intrinsics.i(itemAnimator2, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
                ((DefaultItemAnimator) itemAnimator2).setSupportsChangeAnimations(false);
            }
        } else {
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            recyclerViewH.setItemAnimator(defaultItemAnimator);
        }
        recyclerViewH.addItemDecoration(new o31.b());
        recyclerViewH.addItemDecoration(new s31.b());
        vVar.f25040g = new l0(this, 23);
    }

    @Override // pki.a
    public final void onDestroy() {
        this.f115772g.onDestroy();
    }

    @Override // pki.a
    public final void u(boolean z) {
        this.f115772g.getClass();
    }

    @Override // pki.a
    public final boolean u1(oki.d defaultHandler) {
        Intrinsics.checkNotNullParameter(defaultHandler, "defaultHandler");
        return this.f115772g.u1(defaultHandler);
    }

    @Override // dli.c
    public final koi.a w() {
        return this.f;
    }

    @Override // pki.a
    public final void z() {
        this.f115772g.z();
    }
}
