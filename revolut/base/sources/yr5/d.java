package yr5;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.delegates.h3;
import d6j.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f316130a;

    public d(e eVar) {
        this.f316130a = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        Object objA;
        h3 h3Var = (h3) obj2;
        ChatContextualChartDelegate.Model model = h3Var.f54227a;
        g6 g6Var = h3Var.f54228b;
        e eVar = this.f316130a;
        if (!e.a(eVar, model)) {
            return Unit.f186387a;
        }
        n nVar = eVar.f316131a;
        String tabId = g6Var.f54199a;
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = ((u9j.e) nVar.f316145p).e(tabId);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        qta.f fVar = (qta.f) objA;
        if (fVar != null) {
            nVar.f3(new g0(fVar, 2));
        }
        return Unit.f186387a;
    }
}
