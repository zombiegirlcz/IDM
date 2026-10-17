package hmf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f153727w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f153727w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f153727w.emit(null, this);
    }
}
