package xka;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xif.m f306635w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xif.m mVar, Continuation continuation) {
        super(continuation);
        this.f306635w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f306635w.emit(null, this);
    }
}
