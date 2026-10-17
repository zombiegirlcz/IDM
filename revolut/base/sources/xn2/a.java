package xn2;

import gim.c;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import xkf.b2;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b2 f307306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FlowCollector f307307x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n38.a f307308y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b2 b2Var, Continuation continuation) {
        super(continuation);
        this.f307306w = b2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f307306w.emit(null, this);
    }
}
