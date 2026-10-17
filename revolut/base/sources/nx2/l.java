package nx2;

import kotlin.coroutines.Continuation;
import ntf.q;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f220109w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, Continuation continuation) {
        super(continuation);
        this.f220109w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f220109w.emit(null, this);
    }
}
