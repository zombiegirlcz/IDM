package ihd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8c.c f161378w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i8c.c cVar, Continuation continuation) {
        super(continuation);
        this.f161378w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f161378w.emit(null, this);
    }
}
