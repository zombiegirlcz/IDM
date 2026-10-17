package cui;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cq6.i f109030w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(cq6.i iVar, Continuation continuation) {
        super(continuation);
        this.f109030w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f109030w.emit(null, this);
    }
}
