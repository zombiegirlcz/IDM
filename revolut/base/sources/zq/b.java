package zq;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends gim.c {
    public c u;
    public ar.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f324337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f324338x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f324339y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(continuation);
        this.f324338x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f324337w = obj2;
        this.f324339y |= Integer.MIN_VALUE;
        return c.d(this.f324338x, null, this);
    }
}
