package nyb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ntf.q f220841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ntf.q qVar, Continuation continuation) {
        super(continuation);
        this.f220841w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f220841w.emit(null, this);
    }
}
