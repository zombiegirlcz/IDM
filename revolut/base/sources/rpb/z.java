package rpb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f256355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f256356x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f256355w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f256356x |= Integer.MIN_VALUE;
        return this.f256355w.d(null, null, this);
    }
}
