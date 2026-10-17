package uyh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uxh.c f284365w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(uxh.c cVar, Continuation continuation) {
        super(continuation);
        this.f284365w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f284365w.emit(null, this);
    }
}
