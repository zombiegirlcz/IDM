package olf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ayf.g f226389w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ayf.g gVar, Continuation continuation) {
        super(continuation);
        this.f226389w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f226389w.emit(null, this);
    }
}
