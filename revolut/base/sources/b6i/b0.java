package b6i;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a8k.c f12761w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a8k.c cVar, Continuation continuation) {
        super(continuation);
        this.f12761w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f12761w.emit(null, this);
    }
}
