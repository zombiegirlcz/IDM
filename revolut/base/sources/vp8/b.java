package vp8;

import kotlin.coroutines.Continuation;
import vgf.n0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f291138w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f291138w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f291138w.emit(null, this);
    }
}
