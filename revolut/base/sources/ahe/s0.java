package ahe;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a3i.h f5029w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(a3i.h hVar, Continuation continuation) {
        super(continuation);
        this.f5029w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f5029w.emit(null, this);
    }
}
