package fkf;

import r10.q;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public f u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f135807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f135808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f135809y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar, gim.c cVar) {
        super(cVar);
        this.f135808x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f135807w = obj2;
        this.f135809y |= Integer.MIN_VALUE;
        return this.f135808x.d(null, this);
    }
}
