package dfj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class p2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahd.b f114067w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(ahd.b bVar, Continuation continuation) {
        super(continuation);
        this.f114067w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f114067w.emit(null, this);
    }
}
