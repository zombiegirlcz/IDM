package uqh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u97.e f282156w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(u97.e eVar, Continuation continuation) {
        super(continuation);
        this.f282156w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f282156w.emit(null, this);
    }
}
