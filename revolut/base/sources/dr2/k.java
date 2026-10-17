package dr2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dk9.g f117078w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(dk9.g gVar, Continuation continuation) {
        super(continuation);
        this.f117078w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f117078w.emit(null, this);
    }
}
