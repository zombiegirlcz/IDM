package ce4;

import ft3.h1;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.c {
    public nx3.a u;
    public h1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f23372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23373y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.f23372x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23371w = obj2;
        this.f23373y |= Integer.MIN_VALUE;
        return this.f23372x.o(this);
    }
}
