package jwf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i52.l f178989w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i52.l lVar, Continuation continuation) {
        super(continuation);
        this.f178989w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f178989w.emit(null, this);
    }
}
