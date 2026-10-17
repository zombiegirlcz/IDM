package j9k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ iyg.a0 f172356w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(iyg.a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f172356w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f172356w.emit(null, this);
    }
}
