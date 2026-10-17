package p1j;

import n1j.p;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.c {
    public p u;
    public k1j.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f231962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f231963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f231964y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f231963x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f231962w = obj2;
        this.f231964y |= Integer.MIN_VALUE;
        return this.f231963x.a(null, this);
    }
}
