package ahd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a9j.s f4947w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a9j.s sVar, Continuation continuation) {
        super(continuation);
        this.f4947w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f4947w.emit(null, this);
    }
}
