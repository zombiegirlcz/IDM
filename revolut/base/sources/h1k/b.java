package h1k;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ god.k f148586w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(god.k kVar, Continuation continuation) {
        super(continuation);
        this.f148586w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f148586w.emit(null, this);
    }
}
