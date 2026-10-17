package cbk;

import ard.b0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f22879w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f22879w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f22879w.emit(null, this);
    }
}
