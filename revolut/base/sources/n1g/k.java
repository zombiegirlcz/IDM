package n1g;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lmg.k f211333w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lmg.k kVar, Continuation continuation) {
        super(continuation);
        this.f211333w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f211333w.emit(null, this);
    }
}
