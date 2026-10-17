package gb0;

import g0c.o;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f142207w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, Continuation continuation) {
        super(continuation);
        this.f142207w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f142207w.emit(null, this);
    }
}
