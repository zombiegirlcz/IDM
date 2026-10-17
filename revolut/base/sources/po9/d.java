package po9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.i3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f237912a;

    public d(e eVar) {
        this.f237912a = eVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i3 i3Var = (i3) obj2;
        String str = i3Var.f54273a.f52049b;
        e eVar = this.f237912a;
        if (Intrinsics.f(str, eVar.f237913a.c3().f310974a) && Intrinsics.f(((FullScreenStateDelegate.Model) i3Var.f54274b).k, q.f237929a)) {
            eVar.f237913a.f79120r.a();
        }
        return Unit.f186387a;
    }
}
