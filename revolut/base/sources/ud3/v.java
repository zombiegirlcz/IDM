package ud3;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tzh.e f279122w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(tzh.e eVar, Continuation continuation) {
        super(continuation);
        this.f279122w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f279122w.emit(null, this);
    }
}
