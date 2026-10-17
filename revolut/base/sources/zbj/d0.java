package zbj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z6k.j f320901w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(z6k.j jVar, Continuation continuation) {
        super(continuation);
        this.f320901w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f320901w.emit(null, this);
    }
}
