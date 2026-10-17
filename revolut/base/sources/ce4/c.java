package ce4;

import ft3.h1;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public nx3.a u;
    public h1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f23346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23347y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, gim.c cVar) {
        super(cVar);
        this.f23346x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23345w = obj2;
        this.f23347y |= Integer.MIN_VALUE;
        return this.f23346x.c(this);
    }
}
