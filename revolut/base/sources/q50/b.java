package q50;

import com.revolut.core.ui_kit.delegates.i4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ om4.d0 f242202a;

    public b(om4.d0 d0Var) {
        this.f242202a = d0Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        i4 i4Var = (i4) obj2;
        String str = i4Var.f54275a.f52127a;
        c cVar = (c) this.f242202a.f226551b;
        if (Intrinsics.f(str, cVar.c3().f310974a)) {
            cVar.f3(new pig.y(i4Var.f54276b, 18));
        }
        return Unit.f186387a;
    }
}
