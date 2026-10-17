package uf0;

import c7i.b0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.c {
    public int A;
    public int B;
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f279498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f279499x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f279500y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f279498w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f279498w.emit(null, this);
    }
}
