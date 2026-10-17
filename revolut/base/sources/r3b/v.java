package r3b;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qph.g f251270w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qph.g gVar, Continuation continuation) {
        super(continuation);
        this.f251270w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f251270w.emit(null, this);
    }
}
