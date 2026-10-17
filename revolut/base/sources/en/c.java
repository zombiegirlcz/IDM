package en;

import ag.j;
import akl.s;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import ie.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import jli.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ln.d;
import ofm.h;
import sri.m;
import ue0.e;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class c extends fsi.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f127701h = 1;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f127702j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ImmutableSet navigationCommandsObservableSet, m navigator) {
        super(ln.b.f197104a);
        Intrinsics.checkNotNullParameter(navigationCommandsObservableSet, "navigationCommandsObservableSet");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.i = navigationCommandsObservableSet;
        this.f127702j = navigator;
    }

    @Override // fsi.a
    public void onResume() {
        switch (this.f127701h) {
            case 1:
                Set set = (Set) this.i;
                ArrayList arrayList = new ArrayList(w.t(set, 10));
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((d) it8.next()).T());
                }
                r rVarMerge = r.merge(arrayList);
                Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
                r rVarTakeUntil = rVarMerge.takeUntil(new b0(new f(this, 9), 7));
                Intrinsics.checkNotNullExpressionValue(rVarTakeUntil, "takeUntilLeaveScreenCommand(...)");
                r rVarF = o70.a.f(rVarTakeUntil);
                s sVar = new s(this, 25);
                Function1 function1M = M();
                Function0 function0L = L();
                r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new mp.r(new bo.c(new BreadcrumbException(), 17)));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new e0f.m(3, sVar), new e0f.m(3, function1M), new c86.f(6, function0L));
                te0.w.j0(this.e, cVarSubscribe);
                Intrinsics.h(cVarSubscribe);
                break;
        }
    }

    @Override // fsi.a
    public void onStart() {
        switch (this.f127701h) {
            case 0:
                efm.b bVarFlatMapCompletable = ((mm.d) this.i).f255131a.flatMapCompletable(new j(new s(this, 14), 18));
                Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                pfm.a aVarV = e.v(bVarFlatMapCompletable);
                Function1 function1M = M();
                pfm.a aVar = new pfm.a(aVarV, new a31.a(new bo.c(new BreadcrumbException(), 6), (byte) 0), 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                b function = b.f127700a;
                Intrinsics.checkNotNullParameter(function, "function");
                h hVarW = aVar.w(new bo.e(2, function1M), new a(0));
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                te0.w.j0(this.f137706c, hVarW);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mm.d actionsMediator, ImmutableMap actionHandlersMap) {
        super(new fsi.b("ACTION_MEDIATOR_DELEGATE"));
        Intrinsics.checkNotNullParameter(actionsMediator, "actionsMediator");
        Intrinsics.checkNotNullParameter(actionHandlersMap, "actionHandlersMap");
        this.i = actionsMediator;
        this.f127702j = actionHandlersMap;
    }
}
