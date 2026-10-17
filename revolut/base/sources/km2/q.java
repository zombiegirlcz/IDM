package km2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ha3.w f185704w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ha3.w wVar, Continuation continuation) {
        super(continuation);
        this.f185704w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185704w.emit(null, this);
    }
}
