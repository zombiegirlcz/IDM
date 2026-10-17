package n03;

import kotlin.coroutines.Continuation;
import mle.t;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f210861w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar, Continuation continuation) {
        super(continuation);
        this.f210861w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f210861w.emit(null, this);
    }
}
