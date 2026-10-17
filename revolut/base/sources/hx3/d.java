package hx3;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hui.d f156376w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hui.d dVar, Continuation continuation) {
        super(continuation);
        this.f156376w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f156376w.emit(null, this);
    }
}
