package ahe;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a9j.s f5008w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a9j.s sVar, Continuation continuation) {
        super(continuation);
        this.f5008w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f5008w.emit(null, this);
    }
}
