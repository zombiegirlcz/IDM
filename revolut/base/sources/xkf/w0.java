package xkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xif.m f306790w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(xif.m mVar, Continuation continuation) {
        super(continuation);
        this.f306790w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f306790w.emit(null, this);
    }
}
