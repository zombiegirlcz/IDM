package vge;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ayf.g f288908w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ayf.g gVar, Continuation continuation) {
        super(continuation);
        this.f288908w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f288908w.emit(null, this);
    }
}
