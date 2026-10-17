package q50;

import com.revolut.core.ui_kit.delegates.k4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pak.h f242281a;

    public t(pak.h hVar) {
        this.f242281a = hVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        k4 k4Var = (k4) obj2;
        String str = k4Var.f54367a.f52138b;
        u uVar = (u) this.f242281a.f234573b;
        if (Intrinsics.f(str, uVar.c3().f310974a)) {
            uVar.f3(new ai7.a(3, k4Var.f54368b));
        }
        return Unit.f186387a;
    }
}
