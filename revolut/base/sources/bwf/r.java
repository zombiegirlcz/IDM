package bwf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f19350w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(k kVar, Continuation continuation) {
        super(continuation);
        this.f19350w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f19350w.emit(null, this);
    }
}
