package com.revolut.kompot.navigable.root;

import aii.q;
import aki.a;
import android.view.View;
import androidx.collection.ArrayMap;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.b;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.root.RootFlow;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import dki.c;
import dki.g;
import dki.j;
import dki.k;
import dki.l;
import dki.m;
import dki.n;
import dki.s;
import iki.d;
import iki.f;
import iki.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r10.t;
import skm.e0;
import tji.i;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/kompot/navigable/root/RootFlow;", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "STEP", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT_DATA", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Laii/q;", "kompot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RootFlow<STEP extends FlowStep, INPUT_DATA extends IOData$Input> extends BaseFlow<STEP, INPUT_DATA, q> {
    public int P;
    public a Q;
    public final d R;
    public final d S;
    public final t T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootFlow(IOData$Input inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = a.c.f5958a;
        d dVar = new d();
        this.R = dVar;
        d dVar2 = new d();
        this.S = dVar2;
        this.T = new t(dVar, dVar2);
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void G2(boolean z) {
        if (((g) S2()).b()) {
            super.G2(z);
        } else {
            j3();
        }
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public void H2() {
        super.H2();
        Iterator it8 = i3().f271787b.iterator();
        while (it8.hasNext()) {
            ((i) it8.next()).c();
        }
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public void I2() {
        super.I2();
        Iterator it8 = i3().f271787b.iterator();
        while (it8.hasNext()) {
            ((i) it8.next()).f();
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final void M2(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.Q = aVar;
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final c W2() {
        if (super.W2() == c.UNHANDLED) {
            m2().onBackPressed();
        }
        return c.INTERCEPTED;
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void Y2(com.revolut.kompot.navigable.a controller, b controllerManager) {
        ModalDestination.Style styleB;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        super.Y2(controller, controllerManager);
        if (controllerManager.f98422h && (styleB = controller.q2().b()) != null && h.a(styleB)) {
            h3().setClickable(true);
        }
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void Z2(com.revolut.kompot.navigable.a controller, b manager) {
        com.revolut.kompot.navigable.a aVar;
        mki.b bVarQ2;
        ModalDestination.Style styleB;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(manager, "controllerManager");
        super.Z2(controller, manager);
        boolean z = manager.f98423j;
        boolean z3 = false;
        n nVar = this.L;
        if (z) {
            ArrayMap arrayMap = nVar.f115551b;
            Intrinsics.checkNotNullParameter(manager, "manager");
            m mVarB = nVar.b(manager);
            if (mVarB == null) {
                throw new IllegalStateException(("Modal manager not found: " + manager).toString());
            }
            if (mVarB instanceof k) {
                nVar.f115550a.remove(mVarB);
                k kVar = (k) mVarB;
                arrayMap.remove((String) kVar.a().f7847b);
                ArrayList arrayList = (ArrayList) kVar.b();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayMap.remove((String) ((j) arrayList.get(i)).a().f7847b);
                }
            } else {
                if (!(mVarB instanceof j)) {
                    if (!(mVarB instanceof l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException(("removeModal called on Regular entry: " + manager).toString());
                }
                j jVar = (j) mVarB;
                ((ArrayList) jVar.b().b()).remove(mVarB);
                arrayMap.remove((String) jVar.a().f7847b);
            }
        }
        b bVarE = nVar.e(0);
        ControllerContainerFrameLayout controllerContainerFrameLayoutH3 = h3();
        if (bVarE != null && (aVar = bVarE.k) != null && (bVarQ2 = aVar.q2()) != null && (styleB = bVarQ2.b()) != null && h.a(styleB)) {
            z3 = true;
        }
        controllerContainerFrameLayoutH3.setClickable(z3);
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public void a3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        sw0.a.a(view, h3());
        Iterator it8 = i3().f271787b.iterator();
        while (it8.hasNext()) {
            ((i) it8.next()).d();
        }
        s sVarS2 = S2();
        Intrinsics.i(sVarS2, "null cannot be cast to non-null type com.revolut.kompot.navigable.root.BaseRootFlowModel<*, *>");
        iki.j jVar = new iki.j(this);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        ((iki.b) sVarS2).u = jVar;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new f(this));
            return;
        }
        s sVarS22 = S2();
        Intrinsics.i(sVarS22, "null cannot be cast to non-null type com.revolut.kompot.navigable.root.BaseRootFlowModel<*, *>");
        iki.b bVar = (iki.b) sVarS22;
        bVar.Q2();
        bVar.f161976x = true;
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public void b3() {
        sw0.a.a(D2(), null);
        tji.f fVarI3 = i3();
        tji.d dVar = fVarI3.f271786a;
        tji.n nVar = dVar.d;
        if (nVar != null) {
            nVar.dismiss();
        }
        dVar.d = null;
        Iterator it8 = fVarI3.f271787b.iterator();
        while (it8.hasNext()) {
            ((i) it8.next()).e();
        }
        e0.n(this.R.f161978a.f323100a);
        e0.n(this.S.f161978a.f323100a);
        this.T.b();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public void f3(FlowStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
    }

    public abstract ControllerContainerFrameLayout h3();

    public abstract tji.f i3();

    public void j3() {
        m2().finish();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iki.e] */
    public final void k3(final com.revolut.kompot.navigable.a controller, final ModalDestination.Style style, final com.revolut.kompot.navigable.a aVar, final boolean z, final boolean z3) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(style, "style");
        ?? r110 = new Function0() { // from class: iki.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransitionAnimation modalTransitionAnimation;
                RootFlow rootFlow = this.f161980a;
                rootFlow.h3().setContainerId("MODAL_CONTAINER_ID");
                ControllerContainerFrameLayout controllerContainerFrameLayoutH3 = rootFlow.h3();
                boolean z4 = true;
                int i = rootFlow.P + 1;
                rootFlow.P = i;
                String strN = a0.d.n("modal_", i);
                boolean z6 = z3;
                ModalDestination.Style style2 = style;
                com.revolut.kompot.navigable.b bVarV2 = rootFlow.V2(controllerContainerFrameLayoutH3, strN, z6 ? new dki.d(style2) : null);
                if (bVarV2.f98423j) {
                    ModalDestination.Style.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(style2, "<this>");
                    ModalTransitionAnimation.Style styleY3 = style2.Y3();
                    if (!style2.equals(ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a)) {
                        if (!style2.equals(ModalDestination.Style.BOTTOM_DIALOG.f98301a) && !style2.equals(ModalDestination.Style.FULLSCREEN_FADE.f98307a) && !style2.equals(ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a) && !style2.equals(ModalDestination.Style.POPUP.f98311a) && !style2.equals(ModalDestination.Style.FullscreenPaged.f98310a) && !(style2 instanceof ModalDestination.Style.ExpandableBottomDialog) && !(style2 instanceof ModalDestination.Style.ContextualAlert) && !(style2 instanceof ModalDestination.Style.Custom)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z4 = z;
                    }
                    modalTransitionAnimation = new ModalTransitionAnimation(styleY3, z4);
                } else {
                    modalTransitionAnimation = TransitionAnimation.FADE.f98392a;
                }
                com.revolut.kompot.navigable.a aVar2 = aVar;
                com.revolut.kompot.navigable.a aVar3 = rootFlow;
                if (aVar2 != null) {
                    aVar3 = aVar2;
                }
                bVarV2.j(controller, aVar3, modalTransitionAnimation, false);
                return Unit.f186387a;
            }
        };
        if (z || Intrinsics.f(style, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a)) {
            r110.invoke();
            return;
        }
        this.S.b(controller.u2().f98378a, new iki.g(r110));
    }

    public com.revolut.kompot.navigable.a l3(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return null;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: n2, reason: from getter */
    public final a getQ() {
        return this.Q;
    }
}
