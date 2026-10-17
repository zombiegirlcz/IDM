package l1k;

import kotlin.coroutines.Continuation;
import kx4.b0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f191558w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f191558w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f191558w.emit(null, this);
    }
}
