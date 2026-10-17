package huh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f155661w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f155661w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f155661w.emit(null, this);
    }
}
