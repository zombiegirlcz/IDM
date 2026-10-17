package ky4;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements MutableSharedFlow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z1 f190620a;

    public e() {
        this(0);
    }

    public final void a() {
        Unit value = Unit.f186387a;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f190620a.k(value);
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        z1 z1Var = this.f190620a;
        z1Var.getClass();
        return z1.m(z1Var, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List d() {
        return this.f190620a.d();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        return this.f190620a.emit((Unit) obj2, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void i() throws Throwable {
        this.f190620a.i();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean k(Object obj2) {
        Unit value = (Unit) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f190620a.k(value);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final StateFlow l() {
        return this.f190620a.l();
    }

    public e(int i) {
        this.f190620a = q.b(0, 2, ukm.f.DROP_OLDEST);
        a();
    }
}
