package qt8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qph.g f249015w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qph.g gVar, Continuation continuation) {
        super(continuation);
        this.f249015w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f249015w.emit(null, this);
    }
}
