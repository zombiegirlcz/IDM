package d7j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class d1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d6e.d f111987w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(d6e.d dVar, Continuation continuation) {
        super(continuation);
        this.f111987w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f111987w.emit(null, this);
    }
}
