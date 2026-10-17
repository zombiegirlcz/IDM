package pvk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pkf.g f240269w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pkf.g gVar, Continuation continuation) {
        super(continuation);
        this.f240269w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f240269w.emit(null, this);
    }
}
