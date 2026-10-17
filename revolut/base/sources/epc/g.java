package epc;

import gim.i;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f128151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f128152x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f128151w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f128152x |= Integer.MIN_VALUE;
        return this.f128151w.b(null, null, this);
    }
}
