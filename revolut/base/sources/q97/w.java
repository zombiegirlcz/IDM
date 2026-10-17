package q97;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pkf.d1 f243810w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(pkf.d1 d1Var, Continuation continuation) {
        super(continuation);
        this.f243810w = d1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243810w.emit(null, this);
    }
}
