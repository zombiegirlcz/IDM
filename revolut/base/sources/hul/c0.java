package hul;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f155712w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(y yVar, Continuation continuation) {
        super(continuation);
        this.f155712w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f155712w.emit(null, this);
    }
}
