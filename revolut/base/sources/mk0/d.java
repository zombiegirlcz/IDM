package mk0;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ akg.m f206140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(akg.m mVar, Continuation continuation) {
        super(continuation);
        this.f206140w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f206140w.emit(null, this);
    }
}
