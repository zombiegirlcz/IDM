package om4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ oce.c f226651w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(oce.c cVar, Continuation continuation) {
        super(continuation);
        this.f226651w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f226651w.emit(null, this);
    }
}
