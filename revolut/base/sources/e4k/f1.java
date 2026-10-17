package e4k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f122595w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f122595w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f122595w.emit(null, this);
    }
}
