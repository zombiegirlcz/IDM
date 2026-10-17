package s06;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f258856w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f258856w |= Integer.MIN_VALUE;
        return this.v.L1(null, null, null, this);
    }
}
