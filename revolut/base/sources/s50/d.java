package s50;

import kotlin.coroutines.Continuation;
import n30.j;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f259907w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, Continuation continuation) {
        super(continuation);
        this.f259907w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f259907w.emit(null, this);
    }
}
