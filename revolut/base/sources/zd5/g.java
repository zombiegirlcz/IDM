package zd5;

import j8l.h;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tul.b f321317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f321318x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tul.b bVar, gim.c cVar) {
        super(cVar);
        this.f321317w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f321318x |= Integer.MIN_VALUE;
        return this.f321317w.f(null, null, null, this);
    }
}
