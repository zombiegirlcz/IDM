package r2d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dmf.a f251096w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dmf.a aVar, Continuation continuation) {
        super(continuation);
        this.f251096w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f251096w.emit(null, this);
    }
}
