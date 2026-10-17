package nya;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ntf.q f220733w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ntf.q qVar, Continuation continuation) {
        super(continuation);
        this.f220733w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f220733w.emit(null, this);
    }
}
