package w7b;

import kotlin.coroutines.Continuation;
import vy5.c0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f295496w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c0 c0Var, Continuation continuation) {
        super(continuation);
        this.f295496w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f295496w.emit(null, this);
    }
}
