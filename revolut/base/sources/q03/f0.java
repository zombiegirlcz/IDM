package q03;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pvk.k f241066w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(pvk.k kVar, Continuation continuation) {
        super(continuation);
        this.f241066w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f241066w.emit(null, this);
    }
}
