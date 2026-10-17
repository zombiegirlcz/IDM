package t2b;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements MutableStateFlow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f267528a;

    public c() {
        this(0);
    }

    public final void a(Function1 function) {
        j2 j2Var;
        Object value;
        Intrinsics.checkNotNullParameter(function, "function");
        do {
            j2Var = this.f267528a;
            value = j2Var.getValue();
        } while (!j2Var.h(value, value != null ? function.invoke(value) : null));
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f267528a.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List d() {
        return this.f267528a.d();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        this.f267528a.setValue(obj2);
        return Unit.f186387a;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        return this.f267528a.getValue();
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final boolean h(Object obj2, Object obj3) {
        return this.f267528a.h(obj2, obj3);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void i() {
        this.f267528a.i();
        throw null;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean k(Object obj2) {
        this.f267528a.setValue(obj2);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final StateFlow l() {
        return this.f267528a.l();
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final void setValue(Object obj2) {
        this.f267528a.setValue(obj2);
    }

    public c(int i) {
        this.f267528a = q.c(null);
    }
}
