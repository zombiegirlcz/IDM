package jhi;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ akg.m f174270w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(akg.m mVar, Continuation continuation) {
        super(continuation);
        this.f174270w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f174270w.emit(null, this);
    }
}
