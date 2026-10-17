package uyh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ su4.s f284368w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(su4.s sVar, Continuation continuation) {
        super(continuation);
        this.f284368w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f284368w.emit(null, this);
    }
}
