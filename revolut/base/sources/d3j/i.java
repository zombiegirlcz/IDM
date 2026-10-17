package d3j;

import ahe.f0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f111217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f111217w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f111217w.emit(null, this);
    }
}
