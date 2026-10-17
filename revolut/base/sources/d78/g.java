package d78;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f111841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Continuation continuation) {
        super(continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f111841w |= Integer.MIN_VALUE;
        return this.v.b3(null, this);
    }
}
