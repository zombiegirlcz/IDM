package m11;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ly4.d f201186w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ly4.d dVar, Continuation continuation) {
        super(continuation);
        this.f201186w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f201186w.emit(null, this);
    }
}
