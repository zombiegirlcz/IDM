package qc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class z0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f244514b;

    public /* synthetic */ z0(f1 f1Var, int i) {
        this.f244513a = i;
        this.f244514b = f1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        String str;
        switch (this.f244513a) {
            case 0:
                NaviCommand chooserCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(chooserCommand, "chooserCommand");
                return new pfm.h(new b1(this.f244514b, chooserCommand, 0), 2);
            case 1:
                this.f244514b.v("STEP_RESULT");
                return Unit.f186387a;
            case 2:
                f1 f1Var = this.f244514b;
                te0.r rVarE = f1Var.j().e();
                kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
                m70.a.c(t0Var);
                rVarE.set("");
                te0.r rVarB = f1Var.j().b();
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                rVarB.set("");
                return Unit.f186387a;
            case 3:
                return f1.e(this.f244514b, (od0.i) obj2);
            case 4:
                BackendFlow flow = (BackendFlow) obj2;
                Intrinsics.checkNotNullParameter(flow, "flow");
                f1 f1Var2 = this.f244514b;
                Object obj3 = null;
                if (!f1Var2.k().isEmpty()) {
                    String currentScreenId = (String) f1Var2.k().lastElement();
                    Intrinsics.h(currentScreenId);
                    Intrinsics.checkNotNullParameter(flow, "flow");
                    Intrinsics.checkNotNullParameter(currentScreenId, "currentScreenId");
                    Iterator it8 = edl.a.e(flow).iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next2 = it8.next();
                            if (Intrinsics.f(((BackendScreen) next2).getId(), currentScreenId)) {
                                obj3 = next2;
                            }
                        }
                    }
                    if (obj3 != null) {
                        return f1Var2.r();
                    }
                    pfm.h hVar = new pfm.h(new ly2.d(flow, 23, currentScreenId, f1Var2), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar.e(f1Var2.f.c0(new f(currentScreenId)));
                }
                Intrinsics.checkNotNullParameter(flow, "flow");
                Iterator it9 = flow.e.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (Intrinsics.f(((BackendScreen) next).getId(), flow.f63266g)) {
                        }
                    } else {
                        next = null;
                    }
                }
                BackendScreen backendScreen = (BackendScreen) next;
                if (backendScreen == null) {
                    backendScreen = (BackendScreen) zhm.d0.b0(flow.e);
                }
                DeeplinkScreen deeplinkScreen = backendScreen instanceof DeeplinkScreen ? (DeeplinkScreen) backendScreen : null;
                if (deeplinkScreen != null && (str = deeplinkScreen.f63391b) != null) {
                    return f1Var2.r().e(f1Var2.u(str));
                }
                Iterator it10 = zhm.d0.I0(nkm.y.J(nkm.t.g(backendScreen.getId(), new la0.a(flow, 2)))).iterator();
                while (it10.hasNext()) {
                    f1Var2.v((String) it10.next());
                }
                String str2 = flow.f63266g;
                return f1Var2.p(f1.f(str2 != null ? f1.g(str2, flow.e) : null));
            default:
                NaviCommand resultCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(resultCommand, "resultCommand");
                return new pfm.h(new b1(this.f244514b, resultCommand, 1), 2);
        }
    }
}
