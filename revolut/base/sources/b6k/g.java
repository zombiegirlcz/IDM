package b6k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r10.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12852w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r10.a aVar, Continuation continuation) {
        super(continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f12852w |= Integer.MIN_VALUE;
        return this.v.W(null, this);
    }
}
