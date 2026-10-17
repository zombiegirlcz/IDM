package l2d;

import kotlin.coroutines.Continuation;
import kx4.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f191785w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f191785w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f191785w.emit(null, this);
    }
}
