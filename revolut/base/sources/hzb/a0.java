package hzb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hui.d f157083w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(hui.d dVar, Continuation continuation) {
        super(continuation);
        this.f157083w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f157083w.emit(null, this);
    }
}
