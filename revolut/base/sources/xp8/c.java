package xp8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xif.m f307901w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xif.m mVar, Continuation continuation) {
        super(continuation);
        this.f307901w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f307901w.emit(null, this);
    }
}
