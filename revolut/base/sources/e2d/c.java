package e2d;

import ahe.f0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f122049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f122049w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f122049w.emit(null, this);
    }
}
