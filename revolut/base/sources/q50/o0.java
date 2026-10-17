package q50;

import com.revolut.core.ui_kit.delegates.m4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ks0.n f242257a;

    public o0(ks0.n nVar) {
        this.f242257a = nVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        m4 m4Var = (m4) obj2;
        String str = m4Var.f54457a.f52148b;
        p0 p0Var = (p0) this.f242257a.f189085b;
        if (Intrinsics.f(str, p0Var.c3().f310974a)) {
            p0Var.f3(new pig.y(m4Var.f54458b, 19));
        }
        return Unit.f186387a;
    }
}
