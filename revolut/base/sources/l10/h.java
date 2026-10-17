package l10;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kx4.b0 f191379w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kx4.b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f191379w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f191379w.emit(null, this);
    }
}
