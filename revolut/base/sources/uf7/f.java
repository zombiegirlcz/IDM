package uf7;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tzh.e f279599w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tzh.e eVar, Continuation continuation) {
        super(continuation);
        this.f279599w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f279599w.emit(null, this);
    }
}
