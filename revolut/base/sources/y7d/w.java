package y7d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xv5.f f311493w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(xv5.f fVar, Continuation continuation) {
        super(continuation);
        this.f311493w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f311493w.emit(null, this);
    }
}
