package zgj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z6k.j f322151w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(z6k.j jVar, Continuation continuation) {
        super(continuation);
        this.f322151w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f322151w.emit(null, this);
    }
}
