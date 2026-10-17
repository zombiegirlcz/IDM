package pkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ im9.k f237026w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(im9.k kVar, Continuation continuation) {
        super(continuation);
        this.f237026w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237026w.emit(null, this);
    }
}
