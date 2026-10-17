package sx2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ spb.f f266337w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(spb.f fVar, Continuation continuation) {
        super(continuation);
        this.f266337w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f266337w.emit(null, this);
    }
}
