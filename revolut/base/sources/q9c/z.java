package q9c;

import kotlin.coroutines.Continuation;
import pkf.d1;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d1 f243888w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d1 d1Var, Continuation continuation) {
        super(continuation);
        this.f243888w = d1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f243888w.emit(null, this);
    }
}
