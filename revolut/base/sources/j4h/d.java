package j4h;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.delegates.h3;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fn2.c f171381a;

    public d(fn2.c cVar) {
        this.f171381a = cVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        Object next;
        h3 h3Var = (h3) obj2;
        ChatContextualChartDelegate.Model model = h3Var.f54227a;
        g6 g6Var = h3Var.f54228b;
        fn2.c cVar = this.f171381a;
        if (!fn2.c.a(cVar, model)) {
            return Unit.f186387a;
        }
        Iterator<E> it8 = eel.c.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((eel.c) next).getId(), g6Var.f54199a)) {
                break;
            }
        }
        eel.c chartPeriod = (eel.c) next;
        if (chartPeriod != null) {
            l lVar = (l) cVar.f136517b;
            Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
            lVar.f3(new i4h.p(chartPeriod, 2));
        }
        return Unit.f186387a;
    }
}
