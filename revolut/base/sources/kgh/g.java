package kgh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kbb.n f183990w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kbb.n nVar, Continuation continuation) {
        super(continuation);
        this.f183990w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f183990w.emit(null, this);
    }
}
