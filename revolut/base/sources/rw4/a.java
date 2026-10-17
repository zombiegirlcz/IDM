package rw4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rnb.c f257817w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rnb.c cVar, Continuation continuation) {
        super(continuation);
        this.f257817w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f257817w.emit(null, this);
    }
}
