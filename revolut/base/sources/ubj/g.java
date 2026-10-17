package ubj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tzh.e f278920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tzh.e eVar, Continuation continuation) {
        super(continuation);
        this.f278920w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f278920w.emit(null, this);
    }
}
