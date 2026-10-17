package com.revolut.kompot.navigable.flow.scroller;

import aii.m;
import aii.n;
import aii.o;
import aii.r;
import aii.s;
import ali.i;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.b;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.revolut.kompot.navigable.flow.scroller.ScrollerFlowStep;
import dki.x;
import eki.g;
import eki.h;
import fki.c;
import hli.e;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nhi.k;
import skm.p0;
import tji.f;
import vkm.q;
import vkm.q0;
import yhm.d;
import yhm.j;
import yji.l;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u00020\u00072\b\u0012\u0004\u0012\u00028\u00020\b2\u00020\t¨\u0006\n"}, d2 = {"Lcom/revolut/kompot/navigable/flow/scroller/BaseScrollerFlow;", "Lcom/revolut/kompot/navigable/flow/scroller/ScrollerFlowStep;", "STEP", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT_DATA", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/kompot/navigable/a;", "Leki/h;", "Laii/o;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class BaseScrollerFlow<STEP extends ScrollerFlowStep, INPUT_DATA extends IOData$Input, OUTPUT_DATA extends r> extends a implements h, o {
    public static final /* synthetic */ int Q = 0;
    public final Lazy G;
    public final Lazy H;
    public Function1 I;
    public final Lazy J;
    public final int K;
    public final i L;
    public final Lazy M;
    public final Lazy N;
    public final Lazy O;
    public RecyclerView P;

    public BaseScrollerFlow(IOData$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.G = j.b(new Function0(this) { // from class: eki.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseScrollerFlow f127165b;

            {
                this.f127165b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BaseScrollerFlow baseScrollerFlow = this.f127165b;
                        Object objQ2 = baseScrollerFlow.Q2();
                        Intrinsics.i(objQ2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new dki.r(baseScrollerFlow, (yji.l) objQ2, new e(0, 0, BaseScrollerFlow.class, baseScrollerFlow, "childControllerManagers", "getChildControllerManagers()Ljava/util/LinkedList;"), new f(3, baseScrollerFlow, BaseScrollerFlow.class, "onActivityResultInternal", "onActivityResultInternal(IILandroid/content/Intent;)V", 0, 0));
                    case 1:
                        BaseScrollerFlow baseScrollerFlow2 = this.f127165b;
                        Object objQ22 = baseScrollerFlow2.Q2();
                        Intrinsics.i(objQ22, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new x(baseScrollerFlow2, (yji.l) objQ22, baseScrollerFlow2.f98405m, baseScrollerFlow2.y2(), baseScrollerFlow2.D2());
                    case 2:
                        BaseScrollerFlow baseScrollerFlow3 = this.f127165b;
                        return new m(baseScrollerFlow3.K, baseScrollerFlow3, baseScrollerFlow3.y2().f98420c, new eif.c(1, baseScrollerFlow3.Q2(), n.class, "getController", "getController(Lcom/revolut/kompot/navigable/flow/scroller/ScrollerFlowStep;)Lcom/revolut/kompot/navigable/Controller;", 0, 7));
                    case 3:
                        BaseScrollerFlow baseScrollerFlow4 = this.f127165b;
                        int i2 = c.f127169a[baseScrollerFlow4.L.ordinal()];
                        int i3 = 1;
                        if (i2 != 1) {
                            if (i2 != 2 && i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i3 = 0;
                        }
                        return new LinearLayoutManager(baseScrollerFlow4.m2(), i3, false);
                    case 4:
                        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
                        if (this.f127165b.L == ali.i.PAGER) {
                            return pagerSnapHelper;
                        }
                        return null;
                    default:
                        return this.f127165b.O2().g();
                }
            }
        });
        final int i2 = 1;
        this.H = j.b(new Function0(this) { // from class: eki.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseScrollerFlow f127165b;

            {
                this.f127165b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BaseScrollerFlow baseScrollerFlow = this.f127165b;
                        Object objQ2 = baseScrollerFlow.Q2();
                        Intrinsics.i(objQ2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new dki.r(baseScrollerFlow, (yji.l) objQ2, new e(0, 0, BaseScrollerFlow.class, baseScrollerFlow, "childControllerManagers", "getChildControllerManagers()Ljava/util/LinkedList;"), new f(3, baseScrollerFlow, BaseScrollerFlow.class, "onActivityResultInternal", "onActivityResultInternal(IILandroid/content/Intent;)V", 0, 0));
                    case 1:
                        BaseScrollerFlow baseScrollerFlow2 = this.f127165b;
                        Object objQ22 = baseScrollerFlow2.Q2();
                        Intrinsics.i(objQ22, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new x(baseScrollerFlow2, (yji.l) objQ22, baseScrollerFlow2.f98405m, baseScrollerFlow2.y2(), baseScrollerFlow2.D2());
                    case 2:
                        BaseScrollerFlow baseScrollerFlow3 = this.f127165b;
                        return new m(baseScrollerFlow3.K, baseScrollerFlow3, baseScrollerFlow3.y2().f98420c, new eif.c(1, baseScrollerFlow3.Q2(), n.class, "getController", "getController(Lcom/revolut/kompot/navigable/flow/scroller/ScrollerFlowStep;)Lcom/revolut/kompot/navigable/Controller;", 0, 7));
                    case 3:
                        BaseScrollerFlow baseScrollerFlow4 = this.f127165b;
                        int i22 = c.f127169a[baseScrollerFlow4.L.ordinal()];
                        int i3 = 1;
                        if (i22 != 1) {
                            if (i22 != 2 && i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i3 = 0;
                        }
                        return new LinearLayoutManager(baseScrollerFlow4.m2(), i3, false);
                    case 4:
                        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
                        if (this.f127165b.L == ali.i.PAGER) {
                            return pagerSnapHelper;
                        }
                        return null;
                    default:
                        return this.f127165b.O2().g();
                }
            }
        });
        this.I = new ej6.x(28);
        final int i3 = 2;
        this.J = j.b(new Function0(this) { // from class: eki.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseScrollerFlow f127165b;

            {
                this.f127165b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BaseScrollerFlow baseScrollerFlow = this.f127165b;
                        Object objQ2 = baseScrollerFlow.Q2();
                        Intrinsics.i(objQ2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new dki.r(baseScrollerFlow, (yji.l) objQ2, new e(0, 0, BaseScrollerFlow.class, baseScrollerFlow, "childControllerManagers", "getChildControllerManagers()Ljava/util/LinkedList;"), new f(3, baseScrollerFlow, BaseScrollerFlow.class, "onActivityResultInternal", "onActivityResultInternal(IILandroid/content/Intent;)V", 0, 0));
                    case 1:
                        BaseScrollerFlow baseScrollerFlow2 = this.f127165b;
                        Object objQ22 = baseScrollerFlow2.Q2();
                        Intrinsics.i(objQ22, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new x(baseScrollerFlow2, (yji.l) objQ22, baseScrollerFlow2.f98405m, baseScrollerFlow2.y2(), baseScrollerFlow2.D2());
                    case 2:
                        BaseScrollerFlow baseScrollerFlow3 = this.f127165b;
                        return new m(baseScrollerFlow3.K, baseScrollerFlow3, baseScrollerFlow3.y2().f98420c, new eif.c(1, baseScrollerFlow3.Q2(), n.class, "getController", "getController(Lcom/revolut/kompot/navigable/flow/scroller/ScrollerFlowStep;)Lcom/revolut/kompot/navigable/Controller;", 0, 7));
                    case 3:
                        BaseScrollerFlow baseScrollerFlow4 = this.f127165b;
                        int i22 = c.f127169a[baseScrollerFlow4.L.ordinal()];
                        int i32 = 1;
                        if (i22 != 1) {
                            if (i22 != 2 && i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i32 = 0;
                        }
                        return new LinearLayoutManager(baseScrollerFlow4.m2(), i32, false);
                    case 4:
                        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
                        if (this.f127165b.L == ali.i.PAGER) {
                            return pagerSnapHelper;
                        }
                        return null;
                    default:
                        return this.f127165b.O2().g();
                }
            }
        });
        this.K = R$layout.flow_scroller_item_container;
        this.L = i.PAGER;
        final int i5 = 3;
        this.M = j.b(new Function0(this) { // from class: eki.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseScrollerFlow f127165b;

            {
                this.f127165b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        BaseScrollerFlow baseScrollerFlow = this.f127165b;
                        Object objQ2 = baseScrollerFlow.Q2();
                        Intrinsics.i(objQ2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new dki.r(baseScrollerFlow, (yji.l) objQ2, new e(0, 0, BaseScrollerFlow.class, baseScrollerFlow, "childControllerManagers", "getChildControllerManagers()Ljava/util/LinkedList;"), new f(3, baseScrollerFlow, BaseScrollerFlow.class, "onActivityResultInternal", "onActivityResultInternal(IILandroid/content/Intent;)V", 0, 0));
                    case 1:
                        BaseScrollerFlow baseScrollerFlow2 = this.f127165b;
                        Object objQ22 = baseScrollerFlow2.Q2();
                        Intrinsics.i(objQ22, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new x(baseScrollerFlow2, (yji.l) objQ22, baseScrollerFlow2.f98405m, baseScrollerFlow2.y2(), baseScrollerFlow2.D2());
                    case 2:
                        BaseScrollerFlow baseScrollerFlow3 = this.f127165b;
                        return new m(baseScrollerFlow3.K, baseScrollerFlow3, baseScrollerFlow3.y2().f98420c, new eif.c(1, baseScrollerFlow3.Q2(), n.class, "getController", "getController(Lcom/revolut/kompot/navigable/flow/scroller/ScrollerFlowStep;)Lcom/revolut/kompot/navigable/Controller;", 0, 7));
                    case 3:
                        BaseScrollerFlow baseScrollerFlow4 = this.f127165b;
                        int i22 = c.f127169a[baseScrollerFlow4.L.ordinal()];
                        int i32 = 1;
                        if (i22 != 1) {
                            if (i22 != 2 && i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i32 = 0;
                        }
                        return new LinearLayoutManager(baseScrollerFlow4.m2(), i32, false);
                    case 4:
                        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
                        if (this.f127165b.L == ali.i.PAGER) {
                            return pagerSnapHelper;
                        }
                        return null;
                    default:
                        return this.f127165b.O2().g();
                }
            }
        });
        final int i6 = 4;
        this.N = j.b(new Function0(this) { // from class: eki.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseScrollerFlow f127165b;

            {
                this.f127165b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        BaseScrollerFlow baseScrollerFlow = this.f127165b;
                        Object objQ2 = baseScrollerFlow.Q2();
                        Intrinsics.i(objQ2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new dki.r(baseScrollerFlow, (yji.l) objQ2, new e(0, 0, BaseScrollerFlow.class, baseScrollerFlow, "childControllerManagers", "getChildControllerManagers()Ljava/util/LinkedList;"), new f(3, baseScrollerFlow, BaseScrollerFlow.class, "onActivityResultInternal", "onActivityResultInternal(IILandroid/content/Intent;)V", 0, 0));
                    case 1:
                        BaseScrollerFlow baseScrollerFlow2 = this.f127165b;
                        Object objQ22 = baseScrollerFlow2.Q2();
                        Intrinsics.i(objQ22, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new x(baseScrollerFlow2, (yji.l) objQ22, baseScrollerFlow2.f98405m, baseScrollerFlow2.y2(), baseScrollerFlow2.D2());
                    case 2:
                        BaseScrollerFlow baseScrollerFlow3 = this.f127165b;
                        return new m(baseScrollerFlow3.K, baseScrollerFlow3, baseScrollerFlow3.y2().f98420c, new eif.c(1, baseScrollerFlow3.Q2(), n.class, "getController", "getController(Lcom/revolut/kompot/navigable/flow/scroller/ScrollerFlowStep;)Lcom/revolut/kompot/navigable/Controller;", 0, 7));
                    case 3:
                        BaseScrollerFlow baseScrollerFlow4 = this.f127165b;
                        int i22 = c.f127169a[baseScrollerFlow4.L.ordinal()];
                        int i32 = 1;
                        if (i22 != 1) {
                            if (i22 != 2 && i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i32 = 0;
                        }
                        return new LinearLayoutManager(baseScrollerFlow4.m2(), i32, false);
                    case 4:
                        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
                        if (this.f127165b.L == ali.i.PAGER) {
                            return pagerSnapHelper;
                        }
                        return null;
                    default:
                        return this.f127165b.O2().g();
                }
            }
        });
        final int i21 = 5;
        this.O = j.b(new Function0(this) { // from class: eki.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseScrollerFlow f127165b;

            {
                this.f127165b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        BaseScrollerFlow baseScrollerFlow = this.f127165b;
                        Object objQ2 = baseScrollerFlow.Q2();
                        Intrinsics.i(objQ2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new dki.r(baseScrollerFlow, (yji.l) objQ2, new e(0, 0, BaseScrollerFlow.class, baseScrollerFlow, "childControllerManagers", "getChildControllerManagers()Ljava/util/LinkedList;"), new f(3, baseScrollerFlow, BaseScrollerFlow.class, "onActivityResultInternal", "onActivityResultInternal(IILandroid/content/Intent;)V", 0, 0));
                    case 1:
                        BaseScrollerFlow baseScrollerFlow2 = this.f127165b;
                        Object objQ22 = baseScrollerFlow2.Q2();
                        Intrinsics.i(objQ22, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                        return new x(baseScrollerFlow2, (yji.l) objQ22, baseScrollerFlow2.f98405m, baseScrollerFlow2.y2(), baseScrollerFlow2.D2());
                    case 2:
                        BaseScrollerFlow baseScrollerFlow3 = this.f127165b;
                        return new m(baseScrollerFlow3.K, baseScrollerFlow3, baseScrollerFlow3.y2().f98420c, new eif.c(1, baseScrollerFlow3.Q2(), n.class, "getController", "getController(Lcom/revolut/kompot/navigable/flow/scroller/ScrollerFlowStep;)Lcom/revolut/kompot/navigable/Controller;", 0, 7));
                    case 3:
                        BaseScrollerFlow baseScrollerFlow4 = this.f127165b;
                        int i22 = c.f127169a[baseScrollerFlow4.L.ordinal()];
                        int i32 = 1;
                        if (i22 != 1) {
                            if (i22 != 2 && i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i32 = 0;
                        }
                        return new LinearLayoutManager(baseScrollerFlow4.m2(), i32, false);
                    case 4:
                        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
                        if (this.f127165b.L == ali.i.PAGER) {
                            return pagerSnapHelper;
                        }
                        return null;
                    default:
                        return this.f127165b.O2().g();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        Iterator it8 = d0.I0(P2().f127178m).iterator();
        while (it8.hasNext()) {
            if (((b) it8.next()).b()) {
                return true;
            }
        }
        if (this.z) {
            return super.F2();
        }
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public void H2() {
        super.H2();
        R2().f115553b.S1(s.SHOWN);
        Iterator it8 = d0.I0(P2().f127178m).iterator();
        while (it8.hasNext()) {
            ((b) it8.next()).c();
        }
        Iterator it9 = k.f215505b.iterator();
        while (it9.hasNext()) {
            ((xji.a) it9.next()).z2(this);
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final void I2() {
        super.I2();
        R2().a();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void J() {
        Iterator it8 = ((Iterable) R2().f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            ((b) it8.next()).f();
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final void J0(boolean z) {
        super.J0(z);
        R2().d(z);
    }

    @Override // aii.o
    public final n M0(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ((x) this.H.getValue()).b(event);
    }

    public abstract rji.a O2();

    public final eki.m P2() {
        return (eki.m) this.J.getValue();
    }

    public abstract eki.n Q2();

    public final dki.r R2() {
        return (dki.r) this.G.getValue();
    }

    /* JADX INFO: renamed from: S2, reason: from getter */
    public final Function1 getI() {
        return this.I;
    }

    public abstract int T2();

    public abstract void U2(View view);

    public abstract void V2(ScrollerFlowStep scrollerFlowStep);

    @Override // com.revolut.kompot.navigable.a
    public final void W() {
        Iterator it8 = ((Iterable) R2().f115554c.invoke()).iterator();
        while (it8.hasNext()) {
            ((b) it8.next()).g();
        }
    }

    public final void W2(c cVar) {
        String str = cVar.f135845b;
        if (str == null) {
            return;
        }
        List currentList = P2().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator it8 = currentList.iterator();
        final int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.f(((ScrollerFlowStep) it8.next()).getF79006a(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || i > ((LinearLayoutManager) this.M.getValue()).getItemCount()) {
            return;
        }
        if (cVar.f135846c) {
            RecyclerView recyclerView = this.P;
            if (recyclerView == null) {
                Intrinsics.r("recyclerView");
                throw null;
            }
            final int i2 = 0;
            recyclerView.post(new Runnable(this) { // from class: eki.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseScrollerFlow f127167b;

                {
                    this.f127167b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            RecyclerView recyclerView2 = this.f127167b.P;
                            if (recyclerView2 != null) {
                                recyclerView2.smoothScrollToPosition(i);
                                return;
                            } else {
                                Intrinsics.r("recyclerView");
                                throw null;
                            }
                        default:
                            ((LinearLayoutManager) this.f127167b.M.getValue()).scrollToPosition(i);
                            return;
                    }
                }
            });
            return;
        }
        RecyclerView recyclerView2 = this.P;
        if (recyclerView2 == null) {
            Intrinsics.r("recyclerView");
            throw null;
        }
        final int i3 = 1;
        recyclerView2.post(new Runnable(this) { // from class: eki.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseScrollerFlow f127167b;

            {
                this.f127167b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        RecyclerView recyclerView22 = this.f127167b.P;
                        if (recyclerView22 != null) {
                            recyclerView22.smoothScrollToPosition(i);
                            return;
                        } else {
                            Intrinsics.r("recyclerView");
                            throw null;
                        }
                    default:
                        ((LinearLayoutManager) this.f127167b.M.getValue()).scrollToPosition(i);
                        return;
                }
            }
        });
    }

    public final void X2(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.I = function1;
    }

    @Override // qji.c
    public final boolean b() {
        return false;
    }

    @Override // com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        R2().e(z);
    }

    /* JADX INFO: renamed from: getLayoutId */
    public abstract int getN();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.revolut.kompot.navigable.a
    public final View h2(LayoutInflater inflater) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        KeyEvent.Callback callbackInflate = E2(inflater).inflate(getN(), (ViewGroup) null, false);
        e eVar = callbackInflate instanceof e ? (e) callbackInflate : 0;
        if (eVar == 0) {
            throw new IllegalStateException("Root ViewGroup should be ControllerContainer");
        }
        e2(eVar);
        View view = (View) eVar;
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.f98406n = view;
        D2().setTag(getU());
        RecyclerView recyclerView = (RecyclerView) D2().findViewById(T2());
        Intrinsics.h(recyclerView);
        this.P = recyclerView;
        recyclerView.setLayoutManager((LinearLayoutManager) this.M.getValue());
        recyclerView.setAdapter(P2());
        if (this.L == i.PAGER) {
            recyclerView.setScrollingTouchSlop(1);
        }
        SnapHelper snapHelper = (SnapHelper) this.N.getValue();
        if (snapHelper != null) {
            snapHelper.attachToRecyclerView(recyclerView);
        }
        recyclerView.addOnScrollListener(new eki.d(this));
        return D2();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void i1(boolean z) {
        super.i1(z);
        R2().f(z);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void n() {
        super.n();
        R2().c();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void o(int i, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.o(i, permissions, grantResults);
        R2().b(i, permissions, grantResults);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Set o2() {
        return (Set) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        dki.r rVarR2 = R2();
        rVarR2.f115552a.i2(new bli.a(i, rVarR2, intent, i2, 2));
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final void onCreate() {
        super.onCreate();
        Object objQ2 = Q2();
        Intrinsics.i(objQ2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        l lVar = (l) objQ2;
        f fVarI3 = pd.b.e(this).i3();
        aki.c cVar = y2().f98420c;
        p0 p0Var = p0.f264001a;
        lVar.y1(fVarI3, this, cVar, zkm.o.f323119a.e, O2().f());
        U2(D2());
        R2().f115553b.S1(s.CREATED);
        this.i.a(((g) Q2()).f127172m.b(new dki.f(this, 1)));
        q.G(new q0((MutableSharedFlow) ((g) Q2()).f127171l.getValue(), new ea4.d(this, null, 26), 1), this.f98401g);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void onDestroy() throws aki.e {
        eki.m mVarP2 = P2();
        List currentList = P2().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        mVarP2.e(currentList, f0.f322471a);
        Iterator it8 = P2().f127178m.iterator();
        while (it8.hasNext()) {
            ((b) it8.next()).d();
        }
        super.onDestroy();
        this.i.clear();
        pd.b.e(this).R.a(u2().f98378a);
        R2().f115553b.S1(s.FINISHED);
    }

    @Override // com.revolut.kompot.navigable.a
    public final void u(boolean z) {
        super.u(z);
        R2().g(z);
    }
}
