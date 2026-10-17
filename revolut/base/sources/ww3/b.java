package ww3;

import ft3.h1;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public h1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f300595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f300596x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f300595w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f300596x |= Integer.MIN_VALUE;
        return this.f300595w.c(null, null, this);
    }
}
