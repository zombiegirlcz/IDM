package com.revolut.kompot.navigable.screen;

import aii.n;
import aii.o;
import aii.r;
import aii.s;
import ald.p;
import an0.e;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.c;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreen;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.a;
import java.util.Iterator;
import java.util.Set;
import jki.g;
import jki.h;
import jki.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nhi.k;
import qji.b;
import skm.p0;
import ukm.f;
import vkm.q;
import vkm.q0;
import vkm.v1;
import vkm.y;
import vkm.z1;
import yhm.d;
import yhm.j;
import yji.l;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u00072\u00020\b2\u00020\t¨\u0006\n"}, d2 = {"Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ljki/m;", "UI_STATE", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT_DATA", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/kompot/navigable/a;", "Laii/o;", "Lyji/r;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class BaseScreen<UI_STATE extends m, INPUT_DATA extends IOData$Input, OUTPUT_DATA extends r> extends a implements o {
    public static final /* synthetic */ int L = 0;
    public final IOData$Input G;
    public Function1 H;
    public final z1 I;
    public final z1 J;
    public final Lazy K;

    public BaseScreen(IOData$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.G = inputData;
        this.H = new e(29);
        this.I = q.a(1, 1, f.DROP_OLDEST);
        this.J = q.b(16, 5, null);
        this.K = j.b(new ite.d(this, 3));
    }

    @Override // com.revolut.kompot.navigable.a
    public final void H2() {
        Object objT2 = T2();
        Intrinsics.i(objT2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        ((l) objT2).S1(s.SHOWN);
        super.H2();
        Continuation continuation = null;
        wkm.l lVarQ = q.Q(this.I, new ekg.a(continuation, this, 1));
        Intrinsics.checkNotNullParameter(lVarQ, "<this>");
        int i = 6;
        q.G(new q0(new v1(new afe.a(lVarQ, continuation, i)), new p(this, continuation, i), 1), this.f98402h);
        V2(D2());
        if (R2()) {
            D2().postDelayed(new ag.q(this, 23), 400L);
        } else {
            View currentFocus = m2().getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
            }
            c.A(D2(), 400L);
        }
        Iterator it8 = k.f215505b.iterator();
        while (it8.hasNext()) {
            ((xji.a) it8.next()).z2(this);
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final void I2() {
        super.I2();
        Object objT2 = T2();
        Intrinsics.i(objT2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        ((l) objT2).S1(s.HIDDEN);
        Y2();
    }

    @Override // aii.o
    public final n M0(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.f5291a == null) {
            event.f5291a = this;
        }
        Object objT2 = T2();
        Intrinsics.i(objT2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        n nVarO2 = ((l) objT2).o2(event);
        if (nVarO2 != null) {
            return nVarO2;
        }
        yji.o oVar = this.f98405m;
        o oVar2 = oVar instanceof o ? (o) oVar : null;
        if (oVar2 != null) {
            return oVar2.M0(event);
        }
        return null;
    }

    /* JADX INFO: renamed from: O2 */
    public abstract void Z2(m mVar, jki.o oVar);

    public Flow P2() {
        return null;
    }

    public final b Q2() {
        return z2().R1();
    }

    public boolean R2() {
        return this instanceof PenContributionScreen;
    }

    public abstract sji.b S2();

    public abstract h T2();

    public void U2(int i, int i2, Intent intent) {
    }

    public void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void X2() {
    }

    public void Y2() {
    }

    @Override // com.revolut.kompot.navigable.a, yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.e(state);
        hx7.b.r(o2(), state);
        T2().e(state);
    }

    @Override // com.revolut.kompot.navigable.a, yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.g(outState);
        T2().g(outState);
        hx7.b.s(o2(), outState);
    }

    @Override // com.revolut.kompot.navigable.a
    public void g1(boolean z) {
        super.g1(z);
        m2().getWindow().setSoftInputMode((m2().getWindow().getAttributes().softInputMode & 15) | 16);
        this.J.k(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        KeyEvent.Callback callbackInflate = E2(inflater).inflate(getV(), (ViewGroup) null, false);
        hli.e eVar = callbackInflate instanceof hli.e ? (hli.e) callbackInflate : 0;
        if (eVar == 0) {
            throw new IllegalStateException("Root ViewGroup should be ControllerContainer");
        }
        e2(eVar);
        View view = (View) eVar;
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f98406n = view;
        view.setTag(p2());
        return view;
    }

    @Override // com.revolut.kompot.navigable.a
    public final void i1(boolean z) {
        View currentFocus;
        super.i1(z);
        if (!z || R2() || (currentFocus = m2().getCurrentFocus()) == null) {
            return;
        }
        c.o(currentFocus);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Set o2() {
        return (Set) this.K.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        i2(new bli.a(i, this, intent, i2, 3));
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onCreate() {
        Flow flowW2;
        super.onCreate();
        zji.b bVarB = ((g) T2()).f175189m.b(new dki.f(this, 2));
        zji.c cVar = this.i;
        cVar.a(bVarB);
        Object objT2 = T2();
        Intrinsics.i(objT2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        l lVar = (l) objT2;
        tji.f fVarI3 = pd.b.e(this).i3();
        aki.c cVar2 = y2().f98420c;
        p0 p0Var = p0.f264001a;
        lVar.y1(fVarI3, this, cVar2, zkm.o.f323119a.e, S2().f());
        Flow flowP2 = P2();
        if (flowP2 != null) {
            t38.e eVarF = ta6.a.f(new y(new g2d.c(), flowP2), ((g) T2()).w2(), new a0e.n());
            Intrinsics.checkNotNullParameter(eVarF, "<this>");
            flowW2 = t1.e(eVarF, new a26.p());
        } else {
            flowW2 = null;
        }
        if (flowW2 == null) {
            flowW2 = ((g) T2()).w2();
        }
        q.G(new q0(flowW2, new jki.d(2, this.I, MutableSharedFlow.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), 1), this.f98401g);
        cVar.a(((g) T2()).f175190n.b(new zji.e() { // from class: jki.a
            @Override // zji.e
            public final void a(Object obj2) {
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                mki.j.a("BaseScreenModel.postBack()");
                this.f175184a.C2().F2();
            }
        }));
        W2(D2());
        Object objT22 = T2();
        Intrinsics.i(objT22, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        ((l) objT22).S1(s.CREATED);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onDestroy() throws aki.e {
        super.onDestroy();
        this.i.clear();
        Object objT2 = T2();
        Intrinsics.i(objT2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        ((l) objT2).S1(s.FINISHED);
        X2();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void u(boolean z) {
        super.u(z);
        m2().getWindow().setSoftInputMode((m2().getWindow().getAttributes().softInputMode & 15) | 48);
    }
}
