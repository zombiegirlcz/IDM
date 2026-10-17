package ugc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nj8.g f280016w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nj8.g gVar, Continuation continuation) {
        super(continuation);
        this.f280016w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f280016w.emit(null, this);
    }
}
