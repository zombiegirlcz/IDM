package eob;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egh.e f127892w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(egh.e eVar, Continuation continuation) {
        super(continuation);
        this.f127892w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f127892w.emit(null, this);
    }
}
