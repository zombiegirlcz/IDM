package grd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ god.k f146001w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(god.k kVar, Continuation continuation) {
        super(continuation);
        this.f146001w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f146001w.emit(null, this);
    }
}
