package swf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f266208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f266208w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f266208w.emit(null, this);
    }
}
