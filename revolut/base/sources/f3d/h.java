package f3d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahd.b f131948w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ahd.b bVar, Continuation continuation) {
        super(continuation);
        this.f131948w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f131948w.emit(null, this);
    }
}
