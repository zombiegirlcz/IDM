package vgc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f288828w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f288828w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f288828w.emit(null, this);
    }
}
