package n09;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lmg.k f210942w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(lmg.k kVar, Continuation continuation) {
        super(continuation);
        this.f210942w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f210942w.emit(null, this);
    }
}
