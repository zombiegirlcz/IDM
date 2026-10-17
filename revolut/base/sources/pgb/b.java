package pgb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p26.j f235837w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p26.j jVar, Continuation continuation) {
        super(continuation);
        this.f235837w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f235837w.emit(null, this);
    }
}
