package x8j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d6j.y f303474w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d6j.y yVar, Continuation continuation) {
        super(continuation);
        this.f303474w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f303474w.emit(null, this);
    }
}
