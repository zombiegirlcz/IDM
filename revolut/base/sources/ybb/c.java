package ybb;

import kotlin.coroutines.Continuation;
import xkf.b2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b2 f312212w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b2 b2Var, Continuation continuation) {
        super(continuation);
        this.f312212w = b2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f312212w.emit(null, this);
    }
}
