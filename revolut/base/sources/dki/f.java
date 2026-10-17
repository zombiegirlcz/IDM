package dki;

import android.os.Bundle;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStateWrapper;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements zji.e, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yji.r f115532b;

    public /* synthetic */ f(yji.r rVar, int i) {
        this.f115531a = i;
        this.f115532b = rVar;
    }

    @Override // zji.e
    public final void a(Object obj2) {
        Bundle bundle;
        switch (this.f115531a) {
            case 0:
                u p0 = (u) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                BaseFlow baseFlow = (BaseFlow) this.f115532b;
                if (!(p0 instanceof y)) {
                    if (p0 instanceof a) {
                        if (rd0.e.h(pd.b.e(baseFlow).R, p0)) {
                            mki.j.a("BaseFlowModel.back()");
                            baseFlow.O2();
                            return;
                        }
                        return;
                    }
                    if (p0 instanceof c0) {
                        if (rd0.e.h(pd.b.e(baseFlow).R, p0)) {
                            mki.j.a("BaseFlowModel.quit()");
                            rd0.e.o(baseFlow, pd.b.e(baseFlow).R, false);
                            return;
                        }
                        return;
                    }
                    if (p0 instanceof z) {
                        mki.j.a("BaseFlowModel.postFlowResult()");
                        baseFlow.J.invoke(((z) p0).f115566a);
                        return;
                    }
                    if (!(p0 instanceof h0)) {
                        if (!(p0 instanceof b0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mki.j.a("Push controller");
                        baseFlow.c3((b0) p0);
                        return;
                    }
                    if (rd0.e.h(pd.b.e(baseFlow).R, p0)) {
                        mki.j.a("BaseFlowModel.startPostponedSavedStateRestore()");
                        a0 a0Var = b0.Companion;
                        com.revolut.kompot.navigable.a controller = ((g) baseFlow.S2()).u2();
                        a0Var.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        baseFlow.c3(new b0(controller, true, TransitionAnimation.NONE.f98393a, false, true));
                        return;
                    }
                    return;
                }
                if (rd0.e.h(pd.b.e(baseFlow).R, p0)) {
                    mki.j.a("BaseFlowModel.next()");
                    y yVar = (y) p0;
                    boolean z = yVar.f115564b;
                    n nVar = baseFlow.L;
                    hli.e eVar = baseFlow.K;
                    if (eVar == null) {
                        Intrinsics.r("mainControllerContainer");
                        throw null;
                    }
                    com.revolut.kompot.navigable.b bVarC = nVar.c(eVar.getContainerId());
                    com.revolut.kompot.navigable.a aVar = bVarC != null ? bVarC.k : null;
                    if (aVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (z) {
                        baseFlow.e3();
                    }
                    s sVarS2 = baseFlow.S2();
                    FlowStep step = yVar.f115563a;
                    TransitionAnimation animation = yVar.f115565c;
                    BaseFlow baseFlow2 = aVar instanceof BaseFlow ? (BaseFlow) aVar : null;
                    s sVarS22 = baseFlow2 != null ? baseFlow2.S2() : null;
                    g gVar = (g) sVarS2;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(step, "step");
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    if (z) {
                        gVar.f115534m.add(FlowStateWrapper.a(gVar.A2(), null, null, g.s2(sVarS22), null, null, null, 59));
                    } else {
                        gVar.D2(gVar.A2(), false);
                    }
                    FlowStateWrapper flowStateWrapperA = FlowStateWrapper.a(gVar.A2(), null, step, null, null, animation, null, 1);
                    Intrinsics.checkNotNullParameter(flowStateWrapperA, "<set-?>");
                    gVar.f115533l = flowStateWrapperA;
                    FlowState flowState = (FlowState) gVar.o.invoke(gVar.A2().f98429a);
                    if (flowState != null) {
                        gVar.L2(flowState);
                    }
                    gVar.o = i.f115544a;
                    baseFlow.c3(new b0(((g) baseFlow.S2()).u2(), false, yVar.f115565c, false, yVar.d));
                    return;
                }
                return;
            case 1:
                u p03 = (u) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                BaseScrollerFlow baseScrollerFlow = (BaseScrollerFlow) this.f115532b;
                if (p03 instanceof a) {
                    if (rd0.e.h(pd.b.e(baseScrollerFlow).R, p03)) {
                        mki.j.a("BaseScrollerFlow.back()");
                        if (baseScrollerFlow.F2()) {
                            return;
                        }
                        com.revolut.kompot.navigable.a aVar2 = baseScrollerFlow.f98405m;
                        BaseFlow baseFlow3 = aVar2 instanceof BaseFlow ? (BaseFlow) aVar2 : null;
                        if (baseFlow3 != null) {
                            baseFlow3.O2();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (p03 instanceof c0) {
                    if (rd0.e.h(pd.b.e(baseScrollerFlow).R, p03)) {
                        mki.j.a("BaseScrollerFlow.quit()");
                        rd0.e.o(baseScrollerFlow, pd.b.e(baseScrollerFlow).R, false);
                        return;
                    }
                    return;
                }
                if (!(p03 instanceof z)) {
                    throw new IllegalStateException(a0.d.r(qk.d.f(p03), " is not supported by the ScrollerFlow"));
                }
                mki.j.a("BaseScrollerFlow.postFlowResult()");
                baseScrollerFlow.I.invoke(((z) p03).f115566a);
                return;
            case 2:
                aii.r p010 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                BaseScreen baseScreen = (BaseScreen) this.f115532b;
                mki.j.a("BaseScreenModel.postScreenResult()");
                baseScreen.H.invoke(p010);
                return;
            case 3:
                aii.r p011 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                ViewController viewController = (ViewController) this.f115532b;
                mki.j.a("ViewController#postScreenResult");
                viewController.H.invoke(p011);
                return;
            default:
                u p012 = (u) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                yki.e eVar2 = (yki.e) this.f115532b;
                if (p012 instanceof y) {
                    if (rd0.e.h(eVar2.c(), p012)) {
                        mki.j.a("FlowCoordinator.next()");
                        y yVar2 = (y) p012;
                        if (yVar2.f115564b) {
                            bundle = new Bundle();
                            com.revolut.kompot.navigable.a aVarA = eVar2.a();
                            if (aVarA == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            aVarA.g(bundle);
                        } else {
                            bundle = null;
                        }
                        eVar2.f314629c.s().r(yVar2, bundle);
                        return;
                    }
                    return;
                }
                if (p012 instanceof b0) {
                    mki.j.a("Push controller");
                    b0 b0Var = (b0) p012;
                    if (b0Var.e) {
                        yki.e.f(eVar2, b0Var);
                        return;
                    } else {
                        eVar2.c().b(eVar2.d().u2().f98378a, new yea.l(1, new yff.b(eVar2, b0Var, 7), kotlin.jvm.internal.s.class, "suspendConversion0", "scheduleNavAction$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5));
                        return;
                    }
                }
                if (p012 instanceof c0) {
                    if (rd0.e.h(eVar2.c(), p012)) {
                        mki.j.a("FlowCoordinator#quit()");
                        rd0.e.o(eVar2.d(), eVar2.c(), false);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException((qk.d.f(p012) + " is not supported").toString());
        }
    }

    public final boolean equals(Object obj2) {
        switch (this.f115531a) {
            case 0:
                if ((obj2 instanceof zji.e) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 1:
                if ((obj2 instanceof zji.e) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 2:
                if ((obj2 instanceof zji.e) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            case 3:
                if ((obj2 instanceof zji.e) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof zji.e) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f115531a) {
            case 0:
                return new kotlin.jvm.internal.q(1, 0, BaseFlow.class, (BaseFlow) this.f115532b, "processFlowNavigationCommand", "processFlowNavigationCommand(Lcom/revolut/kompot/navigable/flow/FlowNavigationCommand;)V");
            case 1:
                return new kotlin.jvm.internal.q(1, 0, BaseScrollerFlow.class, (BaseScrollerFlow) this.f115532b, "processFlowNavigationCommand", "processFlowNavigationCommand(Lcom/revolut/kompot/navigable/flow/FlowNavigationCommand;)V");
            case 2:
                return new kotlin.jvm.internal.q(1, 0, BaseScreen.class, (BaseScreen) this.f115532b, "onPostScreenResult", "onPostScreenResult(Lcom/revolut/kompot/common/IOData$Output;)V");
            case 3:
                return new kotlin.jvm.internal.q(1, 0, ViewController.class, (ViewController) this.f115532b, "onPostScreenResult", "onPostScreenResult(Lcom/revolut/kompot/common/IOData$Output;)V");
            default:
                return new kotlin.jvm.internal.q(1, 0, yki.e.class, (yki.e) this.f115532b, "processFlowNavigationCommand", "processFlowNavigationCommand(Lcom/revolut/kompot/navigable/flow/FlowNavigationCommand;)V");
        }
    }

    public final int hashCode() {
        switch (this.f115531a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
