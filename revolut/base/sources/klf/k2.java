package klf;

import kkf.h9;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class k2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h9 f185522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(h9 h9Var, Continuation continuation) {
        super(continuation);
        this.f185522w = h9Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185522w.emit(null, this);
    }
}
