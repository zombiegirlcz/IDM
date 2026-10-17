package ved;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v6e.p f288277w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(v6e.p pVar, Continuation continuation) {
        super(continuation);
        this.f288277w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f288277w.emit(null, this);
    }
}
