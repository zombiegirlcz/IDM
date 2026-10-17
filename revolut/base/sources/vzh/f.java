package vzh;

import kotlin.coroutines.Continuation;
import vy5.c0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f293534w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c0 c0Var, Continuation continuation) {
        super(continuation);
        this.f293534w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f293534w.emit(null, this);
    }
}
