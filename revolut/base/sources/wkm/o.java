package wkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ cua.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f298323w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(cua.b bVar, Continuation continuation) {
        super(continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f298323w |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}
