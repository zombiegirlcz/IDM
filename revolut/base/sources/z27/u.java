package z27;

import kotlin.coroutines.Continuation;
import xkf.b2;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b2 f319000w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b2 b2Var, Continuation continuation) {
        super(continuation);
        this.f319000w = b2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f319000w.emit(null, this);
    }
}
