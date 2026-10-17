package dyh;

import ahe.f0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f121134w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f121134w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f121134w.emit(null, this);
    }
}
