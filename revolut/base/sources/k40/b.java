package k40;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahd.b f180820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ahd.b bVar, Continuation continuation) {
        super(continuation);
        this.f180820w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f180820w.emit(null, this);
    }
}
