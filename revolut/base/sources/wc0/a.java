package wc0;

import com.google.firebase.messaging.t;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import efm.d0;
import g3l.d;
import java.util.Iterator;
import k3l.h;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import qc0.j;
import qc0.k;
import skm.p0;
import te0.w;
import tm.g;
import ufm.b;
import ufm.i;
import w38.v;
import w4l.c;
import wli.x;
import xl2.f;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f296310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f296311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ln.a f296312c;
    public final j d;
    public final f e;
    public final g f;

    public a(k state, x deeplinkHandler, ln.a navigationCommandsDispatcher, j router, f backendFlowConfiguration, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f296310a = state;
        this.f296311b = deeplinkHandler;
        this.f296312c = navigationCommandsDispatcher;
        this.d = router;
        this.e = backendFlowConfiguration;
        this.f = actionDelegateFactory.e(new vt3.a(this, 17));
    }

    public final i a(String str) {
        int i = 19;
        i iVar = new i(w.o0(p0.f264003c, new w3k.i(this, str, null, 21)), new c(new v(this, str, i), i), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    @Override // g3l.d
    public final d0 b(k3l.j result) {
        BackendScreen backendScreen;
        String str;
        Object next;
        Intrinsics.checkNotNullParameter(result, "result");
        od0.i iVar = (od0.i) w.O(this.f296310a.k());
        BackendFlow backendFlow = iVar != null ? (BackendFlow) iVar.g() : null;
        if (backendFlow != null) {
            Iterator it8 = edl.a.h(backendFlow).iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((BackendScreen) next).getId(), result.a().getF104385a())) {
                    break;
                }
            }
            backendScreen = (BackendScreen) next;
        } else {
            backendScreen = null;
        }
        StatusDialogScreen statusDialogScreen = backendScreen instanceof StatusDialogScreen ? (StatusDialogScreen) backendScreen : null;
        if (statusDialogScreen != null && ((result instanceof h) || (result instanceof k3l.i))) {
            String str2 = statusDialogScreen.f;
            if (str2 != null) {
                return a(str2);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (statusDialogScreen != null && (result instanceof k3l.g) && (str = statusDialogScreen.f) != null) {
            return a(str);
        }
        if (statusDialogScreen != null) {
            z zVarD = this.f.a(null).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
