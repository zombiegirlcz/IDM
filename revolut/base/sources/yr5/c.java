package yr5;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.f3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f316129a;

    public c(e eVar) {
        this.f316129a = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        f3 f3Var = (f3) obj2;
        ChatContextualChartDelegate.Model model = f3Var.f54139a;
        TrendViewDelegate.a trendViewState = f3Var.f54140b;
        e eVar = this.f316129a;
        if (!e.a(eVar, model)) {
            return Unit.f186387a;
        }
        n nVar = eVar.f316131a;
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        nVar.f3(new g6f.k(trendViewState, 6));
        return Unit.f186387a;
    }
}
