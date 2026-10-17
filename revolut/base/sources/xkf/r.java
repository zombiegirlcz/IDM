package xkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xif.m f306764w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xif.m mVar, Continuation continuation) {
        super(continuation);
        this.f306764w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f306764w.emit(null, this);
    }
}
