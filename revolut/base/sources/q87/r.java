package q87;

import c2d.l0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0 f243031w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(l0 l0Var, Continuation continuation) {
        super(continuation);
        this.f243031w = l0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243031w.emit(null, this);
    }
}
