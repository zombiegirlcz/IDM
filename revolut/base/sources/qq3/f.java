package qq3;

import kotlin.coroutines.Continuation;
import pkf.d1;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d1 f248468w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d1 d1Var, Continuation continuation) {
        super(continuation);
        this.f248468w = d1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f248468w.emit(null, this);
    }
}
