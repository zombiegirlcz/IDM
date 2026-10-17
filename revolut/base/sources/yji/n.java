package yji;

import aii.s;
import aii.t;
import aii.u;
import aii.x;
import com.revolut.kompot.common.ActionBreadcrumb;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import fli.a;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import skm.a2;
import skm.e0;
import wf0.r0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f314523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zkm.d f314524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zkm.d f314525c;
    public s d;
    public final nki.a e = new nki.a();
    public s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f314526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f314527h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashSet f314528j;
    public Function1 k;

    public static /* synthetic */ void O2(n nVar, BaseScreen baseScreen, Function1 function1, int i) {
        ModalDestination.Style style = (i & 1) != 0 ? ModalDestination.Style.FULLSCREEN_FADE.f98307a : ModalDestination.Style.POPUP.f98311a;
        if ((i & 2) != 0) {
            function1 = null;
        }
        nVar.M2(baseScreen, style, function1);
    }

    public static /* synthetic */ void P2(n nVar, ViewController viewController, ModalDestination.Style style, Function1 function1, int i) {
        if ((i & 1) != 0) {
            style = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        nVar.N2(viewController, style, function1);
    }

    public static void Q2(n nVar, dki.p pVar, ModalDestination.Style style, Function1 function1, int i) {
        if ((i & 1) != 0) {
            style = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        mki.i.f(pVar, nVar.r2(), style, function1);
    }

    public static /* synthetic */ void S2(n nVar, ViewController viewController, Function2 function2, int i) {
        ModalDestination.Style style = (i & 1) != 0 ? ModalDestination.Style.FULLSCREEN_FADE.f98307a : ModalDestination.Style.POPUP.f98311a;
        if ((i & 2) != 0) {
            function2 = null;
        }
        nVar.R2(viewController, style, function2);
    }

    public static a2 j2(n nVar, Flow flow, Function2 function2, Function2 function22, int i) {
        int i2 = 2;
        Continuation continuation = null;
        if ((i & 1) != 0) {
            function2 = new r0(i2, 22, continuation);
        }
        Function2 handleError = function2;
        a27.d onSuccessCompletion = new a27.d(1, 20, continuation);
        if ((i & 4) != 0) {
            function22 = new r0(i2, 23, continuation);
        }
        Function2 onEach = function22;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        aii.o oVarR2 = nVar.r2();
        s sVar = nVar.d;
        if (sVar != null) {
            nVar.s2(sVar);
        }
        return ue0.e.e(flow, oVarR2, nVar.p2(), handleError, aii.a.UNKNOWN, new ActionBreadcrumb(), onSuccessCompletion, onEach);
    }

    public static a2 l2(n nVar, Flow flow, e31.i iVar, Function2 function2, int i) {
        int i2 = 2;
        Continuation continuation = null;
        Function2 r0Var = iVar;
        if ((i & 1) != 0) {
            r0Var = new r0(i2, 24, continuation);
        }
        a27.d dVar = new a27.d(1, 21, continuation);
        if ((i & 4) != 0) {
            function2 = new r0(i2, 25, continuation);
        }
        return nVar.k2(flow, r0Var, dVar, function2);
    }

    public final aii.n A2(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return mki.i.b(r2(), uVar);
    }

    public final aii.n B2(InternalDestination internalDestination) {
        Intrinsics.checkNotNullParameter(internalDestination, "internalDestination");
        return mki.i.c(r2(), internalDestination);
    }

    public final Object C2(x xVar, Continuation continuation) {
        Object objD = mki.i.d(xVar, r2(), continuation);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }

    public void D2() {
    }

    public void E2() {
    }

    public void F2() {
    }

    public final void G2() {
        y2();
    }

    public void H2() {
    }

    public final void I2(s sVar) {
        CoroutineContext coroutineContext;
        s sVar2 = this.f;
        this.f = sVar;
        HashSet<n> hashSet = this.f314528j;
        if (hashSet != null) {
            for (n nVar : hashSet) {
                if (sVar2 == null) {
                    l lVar = this.f314523a;
                    if (lVar == null) {
                        Intrinsics.r("parent");
                        throw null;
                    }
                    nVar.v2(lVar);
                    nVar.d = this.f;
                    nVar.G2();
                } else {
                    nVar.d = sVar;
                    nVar.y2();
                }
            }
        }
        int i = m.f314522a[sVar.ordinal()];
        if (i == 1) {
            D2();
            return;
        }
        if (i == 2) {
            zkm.d dVar = this.f314524b;
            if (dVar != null) {
                e0.k(dVar, null);
            }
            zkm.d dVar2 = this.f314525c;
            if (dVar2 != null) {
                e0.k(dVar2, null);
            }
            this.k = null;
            E2();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            H2();
        } else {
            zkm.d dVar3 = this.f314525c;
            if (dVar3 != null && (coroutineContext = dVar3.f323100a) != null) {
                e0.n(coroutineContext);
            }
            F2();
        }
    }

    public final void J2() {
        this.k = null;
    }

    public final void K2(s sVar) {
        this.d = sVar;
    }

    public final Flow L2(tji.l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return oi0.d.J(q2(), dialogModel);
    }

    public final aii.n M2(BaseScreen baseScreen, ModalDestination.Style style, Function1 function1) {
        Intrinsics.checkNotNullParameter(baseScreen, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return mki.i.e(baseScreen, r2(), style, function1);
    }

    public final void N2(ViewController viewController, ModalDestination.Style style, Function1 function1) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        mki.i.g(viewController, r2(), style, function1);
    }

    public final void R2(ViewController viewController, ModalDestination.Style style, Function2 function2) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        if (function2 != null) {
            yj2.b bVar = new yj2.b(function2, new ky4.h(viewController, this, 1), 5);
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            viewController.H = bVar;
        }
        knm.b.j(r2(), new t(new com.revolut.kompot.common.b(viewController, style, 4)));
    }

    public final a2 T2(Function2 block, Function1 handleError) {
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(block, "block");
        aii.o oVarR2 = r2();
        CoroutineScope coroutineScopeP2 = p2();
        s sVar = this.d;
        if (sVar != null) {
            s2(sVar);
        }
        return ue0.e.N(oVarR2, coroutineScopeP2, handleError, aii.a.UNKNOWN, new ActionBreadcrumb(), block);
    }

    public final a2 V2(Function2 block, Function1 handleError) {
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(block, "block");
        aii.o oVarR2 = r2();
        zkm.d dVar = this.f314525c;
        if (dVar == null) {
            l lVar = this.f314523a;
            if (lVar == null) {
                Intrinsics.r("parent");
                throw null;
            }
            dVar = lVar.f;
        }
        zkm.d dVar2 = dVar;
        s sVar = this.d;
        if (sVar != null) {
            s2(sVar);
        }
        return ue0.e.O(oVarR2, dVar2, handleError, aii.a.UNKNOWN, new ActionBreadcrumb(), block);
    }

    public final void X2(cam.f fVar, Function1 func) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(func, "func");
        fVar.D(func);
    }

    public final Object Y2(Continuation continuation, Function1 function1) {
        tji.f fVarQ2 = q2();
        l lVar = this.f314523a;
        if (lVar != null) {
            return oi0.d.g0(fVarQ2, lVar.f314516a, function1, continuation);
        }
        Intrinsics.r("parent");
        throw null;
    }

    public final a2 k2(Flow flow, Function2 handleError, Function1 onSuccessCompletion, Function2 onEach) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        aii.o oVarR2 = r2();
        s sVar = this.d;
        if (sVar != null) {
            s2(sVar);
        }
        zkm.d dVar = this.f314525c;
        if (dVar == null) {
            l lVar = this.f314523a;
            if (lVar == null) {
                Intrinsics.r("parent");
                throw null;
            }
            dVar = lVar.f;
        }
        return ue0.e.f(flow, oVarR2, dVar, handleError, aii.a.UNKNOWN, new ActionBreadcrumb(), onSuccessCompletion, onEach);
    }

    public final void m2(n extension) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        HashSet hashSet = this.f314528j;
        if (hashSet == null || !hashSet.remove(extension) || this.f == null) {
            return;
        }
        extension.d = s.FINISHED;
        extension.y2();
    }

    public final void n2() {
        this.d = s.FINISHED;
        try {
            z2();
        } catch (Throwable th10) {
            gom.e.f145194a.e(th10, p.a.p("Exception during dynamic extension teardown [", getClass().getName(), "]"), new Object[0]);
            if (this.f != s.FINISHED) {
                try {
                    I2(s.FINISHED);
                } catch (Throwable th11) {
                    gom.e.f145194a.e(th11, p.a.p("Exception during forced FINISHED cleanup [", getClass().getName(), "]"), new Object[0]);
                }
            }
        }
    }

    public final ViewController o2(aii.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return mki.i.a(eVar, r2());
    }

    public final CoroutineScope p2() {
        zkm.d dVar = this.f314524b;
        if (dVar != null) {
            return dVar;
        }
        l lVar = this.f314523a;
        if (lVar != null) {
            return lVar.e;
        }
        Intrinsics.r("parent");
        throw null;
    }

    public final tji.f q2() {
        l lVar = this.f314523a;
        if (lVar != null) {
            return lVar.X();
        }
        Intrinsics.r("parent");
        throw null;
    }

    public final aii.o r2() {
        l lVar = this.f314523a;
        if (lVar != null) {
            return lVar.l1();
        }
        Intrinsics.r("parent");
        throw null;
    }

    public final s s2(s sVar) {
        int i = m.f314522a[sVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return sVar;
        }
        if (i == 4) {
            return (this.f314525c == null || !this.f314526g) ? s.SHOWN : s.HIDDEN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void t2() {
        tji.f dialogDisplayer = q2();
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        dialogDisplayer.a();
    }

    public final void u2(l parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f314523a = parent;
    }

    public final void v2(l parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.f314523a != null) {
            throw new IllegalArgumentException(" cannot be attached twice");
        }
        this.f314523a = parent;
        zkm.d dVar = this.f314524b;
        if (dVar != null) {
            e0.k(dVar, null);
        }
        zkm.d dVar2 = this.f314525c;
        if (dVar2 != null) {
            e0.k(dVar2, null);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        zkm.d dVarA = jh.d.a(gVar);
        l lVar = this.f314523a;
        if (lVar == null) {
            Intrinsics.r("parent");
            throw null;
        }
        this.f314524b = e0.D(e0.D(dVarA, lVar.f314516a), a.C0796a.f135993c);
        zkm.d dVarA2 = jh.d.a(gVar);
        l lVar2 = this.f314523a;
        if (lVar2 != null) {
            this.f314525c = e0.D(e0.D(dVarA2, lVar2.f314516a), a.c.f135994c);
        } else {
            Intrinsics.r("parent");
            throw null;
        }
    }

    public final void w2(n extension, Function1 function1) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (extension == this) {
            return;
        }
        HashSet hashSet = this.f314528j;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f314528j = hashSet;
        }
        if (hashSet.add(extension)) {
            extension.k = function1;
            if (this.f != null) {
                l lVar = this.f314523a;
                if (lVar == null) {
                    Intrinsics.r("parent");
                    throw null;
                }
                extension.v2(lVar);
                extension.d = this.f;
                extension.G2();
            }
        }
    }

    public final a2 x2(Function2 block, Function1 handleError) {
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(block, "block");
        aii.o oVarR2 = r2();
        CoroutineScope coroutineScopeP2 = p2();
        s sVar = this.d;
        if (sVar != null) {
            s2(sVar);
        }
        return ue0.e.N(oVarR2, coroutineScopeP2, handleError, aii.a.USER_ACTION, new ActionBreadcrumb(), new y65.l(this, block, (Continuation) null));
    }

    public final void y2() {
        if (this.f == s.FINISHED) {
            return;
        }
        this.i = true;
        if (this.f314527h) {
            return;
        }
        this.f314527h = true;
        if (this.f314525c == null) {
            do {
                this.i = false;
                z2();
            } while (this.i);
            return;
        }
        do {
            try {
                this.i = false;
                z2();
            } catch (Throwable th10) {
                try {
                    gom.e.f145194a.e(th10, "Exception in dynamic extension lifecycle [" + getClass().getName() + "]", new Object[0]);
                    Function1 function1 = this.k;
                    this.k = null;
                    n2();
                    if (function1 != null) {
                        try {
                            function1.invoke(th10);
                            Unit unit = Unit.f186387a;
                        } catch (Throwable th11) {
                            gom.e.f145194a.e(th11, "Exception in onError callback [" + getClass().getName() + "]", new Object[0]);
                            Unit unit2 = Unit.f186387a;
                        }
                    }
                    return;
                } finally {
                    this.f314527h = false;
                }
            }
        } while (this.i);
        Unit unit3 = Unit.f186387a;
    }

    public final void z2() {
        s sVar = this.d;
        if (sVar == null) {
            throw new IllegalArgumentException("onParentLifecycleChanged() must be called after update of parentLastLifecycleEvent");
        }
        s sVarS2 = s2(sVar);
        s sVar2 = this.f;
        if (sVar2 == sVarS2) {
            return;
        }
        while (true) {
            int[] iArr = m.f314522a;
            int i = iArr[sVarS2.ordinal()];
            if (i == 1) {
                int i2 = sVar2 == null ? -1 : iArr[sVar2.ordinal()];
                if (i2 == -1 || i2 == 1) {
                    sVar2 = s.CREATED;
                } else if (i2 == 2) {
                    sVar2 = s.FINISHED;
                } else {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sVar2 = s.HIDDEN;
                }
            } else if (i == 2) {
                int i3 = sVar2 == null ? -1 : iArr[sVar2.ordinal()];
                if (i3 == -1) {
                    sVar2 = null;
                } else if (i3 == 1 || i3 == 2 || i3 == 3) {
                    sVar2 = s.FINISHED;
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sVar2 = s.HIDDEN;
                }
            } else if (i == 3) {
                int i5 = sVar2 == null ? -1 : iArr[sVar2.ordinal()];
                if (i5 == -1 || i5 == 1) {
                    sVar2 = s.CREATED;
                } else if (i5 == 2) {
                    sVar2 = s.FINISHED;
                } else {
                    if (i5 != 3 && i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sVar2 = s.HIDDEN;
                }
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = sVar2 == null ? -1 : iArr[sVar2.ordinal()];
                if (i6 == -1) {
                    sVar2 = s.CREATED;
                } else if (i6 == 1) {
                    sVar2 = s.SHOWN;
                } else if (i6 != 2) {
                    if (i6 != 3 && i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sVar2 = s.SHOWN;
                } else {
                    sVar2 = s.FINISHED;
                }
            }
            if (sVar2 == null || sVar2 == this.f) {
                return;
            }
            I2(sVar2);
            if (sVar2 == sVarS2 && !this.i) {
                return;
            }
        }
    }
}
