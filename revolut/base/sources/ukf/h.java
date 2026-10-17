package ukf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u97.e f280741w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u97.e eVar, Continuation continuation) {
        super(continuation);
        this.f280741w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f280741w.emit(null, this);
    }
}
