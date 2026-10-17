package nn8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nj8.g f217480w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nj8.g gVar, Continuation continuation) {
        super(continuation);
        this.f217480w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f217480w.emit(null, this);
    }
}
