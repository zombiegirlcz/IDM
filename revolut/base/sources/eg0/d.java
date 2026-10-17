package eg0;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f125511w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Continuation continuation) {
        super(continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f125511w |= Integer.MIN_VALUE;
        return h.a(this.v, null, this);
    }
}
