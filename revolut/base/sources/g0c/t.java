package g0c;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f139445w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar, Continuation continuation) {
        super(continuation);
        this.f139445w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f139445w.emit(null, this);
    }
}
