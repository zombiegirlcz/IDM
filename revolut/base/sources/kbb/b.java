package kbb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jsl.k f182547w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jsl.k kVar, Continuation continuation) {
        super(continuation);
        this.f182547w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f182547w.emit(null, this);
    }
}
