package yji;

import aii.s;
import aii.u;
import aii.x;
import android.os.SystemClock;
import com.revolut.kompot.common.ActionBreadcrumb;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import fli.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import skm.a2;
import skm.e0;
import skm.p0;
import wf0.r0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CoroutineDispatcher f314516a = p0.f264003c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tji.f f314517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.revolut.kompot.navigable.a f314518c;
    public aki.c d;
    public zkm.d e;
    public zkm.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f314519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f314520h;
    public Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashSet f314521j;
    public final nki.a k;

    public l() {
        a.C0796a c0796a = a.C0796a.f135993c;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        this.e = e0.D(e0.D(jh.d.a(gVar), this.f314516a), c0796a);
        this.f = e0.D(e0.D(jh.d.a(gVar), this.f314516a), a.c.f135994c);
        this.k = new nki.a();
    }

    public static a2 a1(l lVar, Flow flow, Function2 function2, Function1 function1, Function2 function22, int i) {
        if ((i & 1) != 0) {
            function2 = new r0(17);
        }
        Function2 handleError = function2;
        if ((i & 2) != 0) {
            function1 = new a27.d(17);
        }
        Function1 onSuccessCompletion = function1;
        if ((i & 4) != 0) {
            function22 = new r0(18);
        }
        Function2 onEach = function22;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        return ue0.e.e(flow, lVar.l1(), lVar.e, handleError, aii.a.UNKNOWN, new ActionBreadcrumb(), onSuccessCompletion, onEach);
    }

    public static a2 b1(l lVar, Flow flow, Function2 function2, Function2 function22, int i) {
        if ((i & 1) != 0) {
            function2 = new r0(19);
        }
        Function2 handleError = function2;
        a27.d onSuccessCompletion = new a27.d(18);
        if ((i & 4) != 0) {
            function22 = new r0(20);
        }
        Function2 onEach = function22;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        return ue0.e.f(flow, lVar.l1(), lVar.f, handleError, aii.a.UNKNOWN, new ActionBreadcrumb(), onSuccessCompletion, onEach);
    }

    public static /* synthetic */ aii.n g2(l lVar, BaseScreen baseScreen, ModalDestination.Style style, Function1 function1, int i) {
        if ((i & 1) != 0) {
            style = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return lVar.Y1(baseScreen, style, function1);
    }

    public static /* synthetic */ aii.n i2(l lVar, dki.p pVar, ModalDestination.Style style, Function1 function1, int i) {
        if ((i & 1) != 0) {
            style = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return lVar.d2(pVar, style, function1);
    }

    public static /* synthetic */ void j2(l lVar, ViewController viewController, ModalDestination.Style style, Function1 function1, int i) {
        if ((i & 1) != 0) {
            style = ModalDestination.Style.FULLSCREEN_FADE.f98307a;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        lVar.f2(viewController, style, function1);
    }

    public static Object k2(l lVar, BaseFlow baseFlow, gim.c frame) {
        eim.c cVar = new eim.c(fim.h.b(frame));
        mki.i.f(baseFlow, lVar.l1(), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new j(cVar));
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }

    public final a2 A1(Function2 block, Function1 handleError) {
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(block, "block");
        return ue0.e.N(l1(), this.e, handleError, aii.a.USER_ACTION, new ActionBreadcrumb(), new y65.l(this, block, (Continuation) null));
    }

    public final aii.n C1(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return mki.i.b(l1(), uVar);
    }

    public final aii.n F1(InternalDestination internalDestination) {
        Intrinsics.checkNotNullParameter(internalDestination, "internalDestination");
        return mki.i.c(l1(), internalDestination);
    }

    public final Object G1(x xVar, Continuation continuation) {
        Object objD = mki.i.d(xVar, l1(), continuation);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }

    public void I1() {
    }

    public void K1() {
    }

    public aii.o O0() {
        return l1();
    }

    public void O1() {
    }

    public void P1() {
    }

    public void R1() {
    }

    public void S1(s event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f314520h = event;
        Set set = this.i;
        if (set == null) {
            Intrinsics.r("extensions");
            throw null;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((n) it8.next()).K2(event);
        }
        HashSet hashSet = this.f314521j;
        if (hashSet != null) {
            Iterator it9 = hashSet.iterator();
            while (it9.hasNext()) {
                ((n) it9.next()).K2(event);
            }
        }
        int i = i.f314515a[event.ordinal()];
        if (i == 1) {
            T1(this.f314519g > 0 ? SystemClock.elapsedRealtime() - this.f314519g : 0L);
        } else if (i == 2) {
            this.f314519g = SystemClock.elapsedRealtime();
            e0.n(this.f.f323100a);
            R1();
            P1();
        } else if (i == 3) {
            I1();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            e0.n(this.e.f323100a);
            O1();
            K1();
        }
        Set set2 = this.i;
        if (set2 == null) {
            Intrinsics.r("extensions");
            throw null;
        }
        Iterator it10 = set2.iterator();
        while (it10.hasNext()) {
            ((n) it10.next()).G2();
        }
        HashSet hashSet2 = this.f314521j;
        if (hashSet2 != null) {
            Iterator it11 = hashSet2.iterator();
            while (it11.hasNext()) {
                ((n) it11.next()).G2();
            }
        }
    }

    public void T1(long j2) {
    }

    public final tji.f X() {
        tji.f fVar = this.f314517b;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("_dialogDisplayer");
        throw null;
    }

    public final Flow X1(tji.l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return oi0.d.J(X(), dialogModel);
    }

    public final aii.n Y1(BaseScreen baseScreen, ModalDestination.Style style, Function1 function1) {
        Intrinsics.checkNotNullParameter(baseScreen, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return mki.i.e(baseScreen, l1(), style, function1);
    }

    public final void d0(boolean z, boolean z3) {
        oi0.d.I(X(), z, z3);
    }

    public final aii.n d2(dki.p pVar, ModalDestination.Style style, Function1 function1) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        return mki.i.f(pVar, l1(), style, function1);
    }

    public final ViewController e1(aii.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return mki.i.a(eVar, l1());
    }

    public final void f2(ViewController viewController, ModalDestination.Style style, Function1 function1) {
        Intrinsics.checkNotNullParameter(viewController, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        mki.i.g(viewController, l1(), style, function1);
    }

    public aii.o h1() {
        return l1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aii.o, com.revolut.kompot.navigable.a] */
    public final aii.o l1() {
        ?? r06 = this.f314518c;
        if (r06 != 0) {
            return r06;
        }
        Intrinsics.r("_eventsDispatcher");
        throw null;
    }

    public final a2 l2(Function2 block, Function1 handleError) {
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(block, "block");
        return ue0.e.N(l1(), this.e, handleError, aii.a.UNKNOWN, new ActionBreadcrumb(), block);
    }

    public final a2 n2(Function2 block, Function1 handleError) {
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(block, "block");
        return ue0.e.O(l1(), this.f, handleError, aii.a.UNKNOWN, new ActionBreadcrumb(), block);
    }

    public boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    public aii.n o2(aii.m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event instanceof aii.i) && o1(((aii.i) event).c())) {
            return new aii.j();
        }
        return null;
    }

    public final Object p2(Continuation continuation, Function1 function1) {
        return oi0.d.g0(X(), this.f314516a, function1, continuation);
    }

    public final void s1() {
        oi0.d.u(X());
    }

    public final void t1(tji.l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        oi0.d.v(X(), dialogModel);
    }

    public final void v1(n extension, Function1 function1) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        HashSet hashSet = this.f314521j;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f314521j = hashSet;
        }
        Set set = this.i;
        if (set == null) {
            Intrinsics.r("extensions");
            throw null;
        }
        if (set.contains(extension) || !hashSet.add(extension)) {
            return;
        }
        extension.J2();
        extension.v2(this);
        s sVar = this.f314520h;
        extension.K2(sVar);
        if (sVar != null) {
            extension.G2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void y1(tji.f dialogDisplayer, aii.o eventsDispatcher, aki.c controllersCache, CoroutineDispatcher mainDispatcher, Set controllerModelExtensions) {
        Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
        Intrinsics.checkNotNullParameter(eventsDispatcher, "eventsDispatcher");
        Intrinsics.checkNotNullParameter(controllersCache, "controllersCache");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(controllerModelExtensions, "controllerModelExtensions");
        this.f314517b = dialogDisplayer;
        this.f314518c = (com.revolut.kompot.navigable.a) eventsDispatcher;
        this.d = controllersCache;
        this.f314516a = mainDispatcher;
        this.f = e0.D(this.f, mainDispatcher);
        this.e = e0.D(this.e, mainDispatcher);
        Set set = controllerModelExtensions;
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            ((n) it8.next()).u2(this);
        }
        this.i = set;
    }

    public final void z1(Function2 onEach, Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(onEach, "onEach");
        ue0.e.e(flow, l1(), this.e, new r0(21), aii.a.DATA_LOADING, new ActionBreadcrumb(), new a27.d(19), onEach);
    }
}
