package l2e;

import gim.c;
import kotlin.coroutines.Continuation;
import kx4.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f191790w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f191790w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f191790w.emit(null, this);
    }
}
