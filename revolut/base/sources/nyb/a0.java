package nyb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ntf.q f220770w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ntf.q qVar, Continuation continuation) {
        super(continuation);
        this.f220770w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f220770w.emit(null, this);
    }
}
