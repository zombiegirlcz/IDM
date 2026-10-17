package ob1;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o42.j f223856w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o42.j jVar, Continuation continuation) {
        super(continuation);
        this.f223856w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f223856w.emit(null, this);
    }
}
