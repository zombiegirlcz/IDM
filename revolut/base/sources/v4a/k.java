package v4a;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uxh.c f286008w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(uxh.c cVar, Continuation continuation) {
        super(continuation);
        this.f286008w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f286008w.emit(null, this);
    }
}
