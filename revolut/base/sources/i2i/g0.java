package i2i;

import d7j.o1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1 f157961w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(o1 o1Var, Continuation continuation) {
        super(continuation);
        this.f157961w = o1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f157961w.emit(null, this);
    }
}
