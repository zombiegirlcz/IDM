package m3d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l2d.g f202372w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l2d.g gVar, Continuation continuation) {
        super(continuation);
        this.f202372w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f202372w.emit(null, this);
    }
}
