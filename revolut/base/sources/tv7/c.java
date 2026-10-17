package tv7;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tnb.j f274720w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tnb.j jVar, Continuation continuation) {
        super(continuation);
        this.f274720w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f274720w.emit(null, this);
    }
}
