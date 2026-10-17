package pdg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p26.j f235182w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p26.j jVar, Continuation continuation) {
        super(continuation);
        this.f235182w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f235182w.emit(null, this);
    }
}
