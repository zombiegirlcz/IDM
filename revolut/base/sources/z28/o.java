package z28;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vkf.d f319022w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vkf.d dVar, Continuation continuation) {
        super(continuation);
        this.f319022w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f319022w.emit(null, this);
    }
}
