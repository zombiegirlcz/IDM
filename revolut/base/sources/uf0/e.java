package uf0;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tzh.e f279497w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tzh.e eVar, Continuation continuation) {
        super(continuation);
        this.f279497w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f279497w.emit(null, this);
    }
}
