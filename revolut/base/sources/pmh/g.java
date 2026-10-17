package pmh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pkf.g f237577w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pkf.g gVar, Continuation continuation) {
        super(continuation);
        this.f237577w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237577w.emit(null, this);
    }
}
