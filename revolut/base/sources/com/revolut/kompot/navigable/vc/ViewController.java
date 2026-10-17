package com.revolut.kompot.navigable.vc;

import ag.q;
import aii.m;
import aii.n;
import aii.r;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cli.s;
import com.revolut.kompot.navigable.a;
import gki.l;
import hli.e;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m84.c;
import mif.e0;
import mqc.p;
import oki.d;
import oki.f;
import oki.h;
import os2.g;
import skm.a2;
import skm.p0;
import uji.b;
import yhm.j;
import yhm.k;
import yji.o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u0007*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/r;", "OUTPUT", "Lcom/revolut/kompot/navigable/a;", "Loki/f;", "<init>", "()V", "Companion", "a", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ViewController<OUTPUT extends r> extends a implements f {
    public final Boolean G = Boolean.FALSE;
    public Function1 H = new ojk.a(14);
    public final Object I = j.c(k.NONE, new d(this, 0));
    public final s J = new s();

    public static boolean O2(ViewController viewController) {
        return super.F2();
    }

    public static a2 P2(ViewController viewController, Flow flow, Function2 onEach, int i) {
        c onError = new c(13);
        a27.d onSuccessCompletion = new a27.d(10);
        if ((i & 4) != 0) {
            onEach = new p(16);
        }
        viewController.getClass();
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        return viewController.f2(flow, onError, onSuccessCompletion, onEach);
    }

    @Override // com.revolut.kompot.navigable.a
    public boolean F2() {
        return k().u1(new d(this, 1));
    }

    @Override // com.revolut.kompot.navigable.a
    public final void G2(boolean z) {
        if (k().l0(z)) {
            return;
        }
        super.G2(z);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        b3(D2());
        S2().S1(aii.s.SHOWN);
        k().R0();
        Boolean g3 = getG();
        if (Intrinsics.f(g3, Boolean.TRUE)) {
            D2().postDelayed(new q(this, 27), 400L);
        } else if (Intrinsics.f(g3, Boolean.FALSE)) {
            View currentFocus = m2().getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
            }
            com.bumptech.glide.c.A(D2(), 400L);
        } else if (g3 != null) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it8 = nhi.k.f215505b.iterator();
        while (it8.hasNext()) {
            ((xji.a) it8.next()).z2(this);
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final void I2() {
        yii.c cVar;
        super.I2();
        a3();
        S2().S1(aii.s.HIDDEN);
        k().z();
        gki.j jVar = y2().f98425m;
        if (jVar != null) {
            l lVar = (l) ((b) jVar).a(l.f144406b);
            if (lVar == null || (cVar = lVar.f144407a) == null) {
                return;
            }
            k().L1(cVar);
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public void J() {
        k().J();
    }

    @Override // com.revolut.kompot.navigable.a
    public void J0(boolean z) {
        super.J0(z);
        k().J0(z);
        this.J.d(z);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void K2() {
        k().c2();
        super.K2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // aii.o
    public final n M0(m event) {
        n nVarO2;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f5291a == null) {
            event.f5291a = this;
        }
        if (event instanceof aii.f) {
            ((aii.f) event).a().a(D2(), new g(k()), ((e) pd.b.e(this).D2()).W(this.F), e0.p(this));
            nVarO2 = fli.b.f135995a;
        } else {
            nVarO2 = null;
        }
        if (nVarO2 != null || (nVarO2 = S2().o2(event)) != null) {
            return nVarO2;
        }
        o oVar = this.f98405m;
        aii.o oVar2 = oVar instanceof aii.o ? (aii.o) oVar : null;
        if (oVar2 != null) {
            return oVar2.M0(event);
        }
        return null;
    }

    @Override // qji.c
    /* JADX INFO: renamed from: Q2, reason: merged with bridge method [inline-methods] */
    public abstract xki.e R1();

    public abstract pki.b R2();

    public final yji.l S2() {
        Object objR2 = R2();
        Intrinsics.i(objR2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        return (yji.l) objR2;
    }

    /* JADX INFO: renamed from: T2, reason: from getter */
    public Boolean getG() {
        return this.G;
    }

    public final qji.b U2() {
        return z2().R1();
    }

    public boolean V2() {
        return false;
    }

    @Override // com.revolut.kompot.navigable.a
    public void W() {
        k().W();
    }

    public void W2(int i, int i2, Intent intent) {
    }

    public void X2(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
    }

    public void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void Z2() {
    }

    public void a3() {
    }

    public void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void c3(r result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.H.invoke(result);
    }

    @Override // com.revolut.kompot.navigable.a, yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        hx7.b.r(o2(), state);
        k().e(state);
        SparseArray sparseParcelableArray = state.getSparseParcelableArray("CONTAINER_VIEW_STATE_KEY");
        if (sparseParcelableArray != null) {
            ((e) D2()).e(sparseParcelableArray);
        }
        yji.l lVarS2 = S2();
        h hVar = lVarS2 instanceof h ? (h) lVarS2 : null;
        if (hVar != null) {
            hVar.G2();
        }
    }

    @Override // com.revolut.kompot.navigable.a, yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.g(outState);
        k().g(outState);
        hx7.b.s(o2(), outState);
        if (V2()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            ((e) D2()).J(sparseArray);
            outState.putSparseParcelableArray("CONTAINER_VIEW_STATE_KEY", sparseArray);
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public void g1(boolean z) {
        super.g1(z);
        k().g1(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.revolut.kompot.navigable.a
    public View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = E2(inflater).inflate(getO(), (ViewGroup) null, false);
        if (!(viewInflate instanceof e)) {
            throw new IllegalArgumentException(p2().concat(": root ViewGroup should be ControllerContainer").toString());
        }
        e2((e) viewInflate);
        viewInflate.setTag(p2());
        Intrinsics.checkNotNullParameter(viewInflate, "<set-?>");
        this.f98406n = viewInflate;
        return viewInflate;
    }

    @Override // com.revolut.kompot.navigable.a
    public void i1(boolean z) {
        View currentFocus;
        super.i1(z);
        k().i1(z);
        if (z && Intrinsics.f(getG(), Boolean.FALSE) && (currentFocus = m2().getCurrentFocus()) != null) {
            com.bumptech.glide.c.o(currentFocus);
        }
        this.J.e(z);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void n() {
        super.n();
        k().n();
        this.J.c();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.o(i, permissions, grantResults);
        X2(i, permissions, grantResults);
        k().o(i, permissions, grantResults);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public Set o2() {
        return (Set) this.I.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        W2(i, i2, intent);
        k().onActivityResult(i, i2, intent);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onCreate() {
        yii.c cVar;
        super.onCreate();
        gki.j jVar = y2().f98425m;
        if (jVar != null) {
            l lVar = (l) ((b) jVar).a(l.f144406b);
            if (lVar != null && (cVar = lVar.f144407a) != null) {
                k().b0(cVar);
            }
        }
        yji.l lVarS2 = S2();
        tji.f fVarI3 = pd.b.e(this).i3();
        aki.c cVar2 = y2().f98420c;
        p0 p0Var = p0.f264001a;
        lVarS2.y1(fVarI3, this, cVar2, zkm.o.f323119a.e, R1().f());
        zji.b bVarB = ((h) R2()).F2().b(new dki.f(this, 3));
        zji.c cVar3 = this.i;
        cVar3.a(bVarB);
        cVar3.a(((h) R2()).q2().b(new oki.e(this, 0)));
        k().onCreate();
        Y2(D2());
        S2().S1(aii.s.CREATED);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onDestroy() throws aki.e {
        super.onDestroy();
        Z2();
        this.i.clear();
        S2().S1(aii.s.FINISHED);
        k().onDestroy();
    }

    @Override // com.revolut.kompot.navigable.a
    public void u(boolean z) {
        super.u(z);
        k().u(z);
    }
}
