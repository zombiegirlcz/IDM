package hqe;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f154688w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f154688w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f154688w.emit(null, this);
    }
}
