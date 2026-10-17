package hz2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hui.d f156992w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(hui.d dVar, Continuation continuation) {
        super(continuation);
        this.f156992w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f156992w.emit(null, this);
    }
}
