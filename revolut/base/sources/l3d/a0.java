package l3d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kx4.b0 f191884w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kx4.b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f191884w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f191884w.emit(null, this);
    }
}
