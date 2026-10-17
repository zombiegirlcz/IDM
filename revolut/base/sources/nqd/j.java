package nqd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lmg.k f218414w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lmg.k kVar, Continuation continuation) {
        super(continuation);
        this.f218414w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f218414w.emit(null, this);
    }
}
