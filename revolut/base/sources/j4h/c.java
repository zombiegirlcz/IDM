package j4h;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.f3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fn2.c f171380a;

    public c(fn2.c cVar) {
        this.f171380a = cVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        f3 f3Var = (f3) obj2;
        ChatContextualChartDelegate.Model model = f3Var.f54139a;
        TrendViewDelegate.a trendViewState = f3Var.f54140b;
        fn2.c cVar = this.f171380a;
        if (!fn2.c.a(cVar, model)) {
            return Unit.f186387a;
        }
        l lVar = (l) cVar.f136517b;
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        lVar.f3(new g6f.k(trendViewState, 2));
        return Unit.f186387a;
    }
}
