package yok;

import kotlin.coroutines.Continuation;
import ymk.x;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f315696w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x xVar, Continuation continuation) {
        super(continuation);
        this.f315696w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f315696w.emit(null, this);
    }
}
