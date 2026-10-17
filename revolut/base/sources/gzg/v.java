package gzg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ god.k f148125w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(god.k kVar, Continuation continuation) {
        super(continuation);
        this.f148125w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f148125w.emit(null, this);
    }
}
