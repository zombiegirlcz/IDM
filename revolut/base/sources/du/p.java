package du;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dk9.g f117505w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(dk9.g gVar, Continuation continuation) {
        super(continuation);
        this.f117505w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f117505w.emit(null, this);
    }
}
