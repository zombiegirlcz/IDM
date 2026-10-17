package i2l;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hui.d f158017w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(hui.d dVar, Continuation continuation) {
        super(continuation);
        this.f158017w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f158017w.emit(null, this);
    }
}
