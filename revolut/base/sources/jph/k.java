package jph;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jhd.d f177287w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(jhd.d dVar, Continuation continuation) {
        super(continuation);
        this.f177287w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f177287w.emit(null, this);
    }
}
