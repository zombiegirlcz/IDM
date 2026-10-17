package hz6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hui.d f157039w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hui.d dVar, Continuation continuation) {
        super(continuation);
        this.f157039w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f157039w.emit(null, this);
    }
}
