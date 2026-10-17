package tr1;

import kotlin.coroutines.Continuation;
import tnb.j;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f273631w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, Continuation continuation) {
        super(continuation);
        this.f273631w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f273631w.emit(null, this);
    }
}
