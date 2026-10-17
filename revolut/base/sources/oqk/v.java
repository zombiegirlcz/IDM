package oqk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ood.x f227992w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ood.x xVar, Continuation continuation) {
        super(continuation);
        this.f227992w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f227992w.emit(null, this);
    }
}
