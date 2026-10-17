package i7e;

import g0c.o;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f159278w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar, Continuation continuation) {
        super(continuation);
        this.f159278w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f159278w.emit(null, this);
    }
}
