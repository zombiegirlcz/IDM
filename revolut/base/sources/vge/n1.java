package vge;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class n1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3j.b f288957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(q3j.b bVar, Continuation continuation) {
        super(continuation);
        this.f288957w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f288957w.emit(null, this);
    }
}
