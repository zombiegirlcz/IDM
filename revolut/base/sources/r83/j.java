package r83;

import h93.l0;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public l0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f252325w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f252326x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, gim.c cVar) {
        super(cVar);
        this.f252325w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f252326x |= Integer.MIN_VALUE;
        return this.f252325w.m(null, this);
    }
}
