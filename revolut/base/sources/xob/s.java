package xob;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xif.m f307782w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xif.m mVar, Continuation continuation) {
        super(continuation);
        this.f307782w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f307782w.emit(null, this);
    }
}
