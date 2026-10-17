package f7f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ esj.e f132602w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(esj.e eVar, Continuation continuation) {
        super(continuation);
        this.f132602w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f132602w.emit(null, this);
    }
}
