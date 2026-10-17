package cu8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends gim.c {
    public ks8.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f108879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f108880x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Continuation continuation) {
        super(continuation);
        this.f108879w = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f108880x |= Integer.MIN_VALUE;
        return this.f108879w.f(null, this);
    }
}
