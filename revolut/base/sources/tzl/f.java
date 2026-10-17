package tzl;

import ard.b0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f275983w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.f275983w = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f275983w.emit(null, this);
    }
}
