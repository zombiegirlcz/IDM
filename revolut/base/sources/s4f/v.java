package s4f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rx6.e f259868w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(rx6.e eVar, Continuation continuation) {
        super(continuation);
        this.f259868w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f259868w.emit(null, this);
    }
}
