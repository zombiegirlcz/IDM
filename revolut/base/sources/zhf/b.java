package zhf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.i3;
import com.revolut.feature.transactions.impl.chat_widget.TransactionChatWidgetParcel$Retry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f322403a;

    public b(c cVar) {
        this.f322403a = cVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i3 i3Var = (i3) obj2;
        String str = i3Var.f54273a.f52049b;
        c cVar = this.f322403a;
        if (!Intrinsics.f(str, cVar.f322404a.c3().f310974a)) {
            return Unit.f186387a;
        }
        if (Intrinsics.f(((FullScreenStateDelegate.Model) i3Var.f54274b).k, TransactionChatWidgetParcel$Retry.f92029a)) {
            cVar.f322404a.f322415r.a();
        }
        return Unit.f186387a;
    }
}
