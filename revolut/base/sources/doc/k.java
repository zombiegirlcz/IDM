package doc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dk9.g f116508w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(dk9.g gVar, Continuation continuation) {
        super(continuation);
        this.f116508w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f116508w.emit(null, this);
    }
}
