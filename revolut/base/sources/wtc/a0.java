package wtc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wk2.g f299850w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(wk2.g gVar, Continuation continuation) {
        super(continuation);
        this.f299850w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f299850w.emit(null, this);
    }
}
