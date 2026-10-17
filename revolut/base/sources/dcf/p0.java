package dcf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dah.d f112963w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(dah.d dVar, Continuation continuation) {
        super(continuation);
        this.f112963w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f112963w.emit(null, this);
    }
}
