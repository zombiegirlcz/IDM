package o83;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o42.j f222922w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o42.j jVar, Continuation continuation) {
        super(continuation);
        this.f222922w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f222922w.emit(null, this);
    }
}
