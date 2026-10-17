package aj6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a9j.s f5403w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a9j.s sVar, Continuation continuation) {
        super(continuation);
        this.f5403w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f5403w.emit(null, this);
    }
}
