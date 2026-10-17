package v4k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uxh.c f286128w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(uxh.c cVar, Continuation continuation) {
        super(continuation);
        this.f286128w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f286128w.emit(null, this);
    }
}
