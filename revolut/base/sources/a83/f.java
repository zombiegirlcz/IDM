package a83;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a07.o f2045w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a07.o oVar, Continuation continuation) {
        super(continuation);
        this.f2045w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f2045w.emit(null, this);
    }
}
