package okl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class k1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ oce.c f226207w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(oce.c cVar, Continuation continuation) {
        super(continuation);
        this.f226207w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f226207w.emit(null, this);
    }
}
