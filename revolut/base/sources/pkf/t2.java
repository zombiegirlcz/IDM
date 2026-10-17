package pkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class t2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f237131w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(g gVar, Continuation continuation) {
        super(continuation);
        this.f237131w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f237131w.emit(null, this);
    }
}
