package b0a;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f11644w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f11644w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f11644w.emit(null, this);
    }
}
