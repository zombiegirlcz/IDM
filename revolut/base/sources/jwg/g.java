package jwg;

import i52.l;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f179004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, Continuation continuation) {
        super(continuation);
        this.f179004w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f179004w.emit(null, this);
    }
}
