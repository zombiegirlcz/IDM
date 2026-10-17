package xge;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x4k.e f305725w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(x4k.e eVar, Continuation continuation) {
        super(continuation);
        this.f305725w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f305725w.emit(null, this);
    }
}
