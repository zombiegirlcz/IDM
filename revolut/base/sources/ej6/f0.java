package ej6;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f126737w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f126738x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f126739y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f126737w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f126737w.emit(null, this);
    }
}
