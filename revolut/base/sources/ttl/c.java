package ttl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tnb.j f274442w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tnb.j jVar, Continuation continuation) {
        super(continuation);
        this.f274442w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f274442w.emit(null, this);
    }
}
