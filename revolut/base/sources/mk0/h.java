package mk0;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ im9.k f206148w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(im9.k kVar, Continuation continuation) {
        super(continuation);
        this.f206148w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f206148w.emit(null, this);
    }
}
