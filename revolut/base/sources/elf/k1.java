package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(n1 n1Var, gim.c cVar) {
        super(cVar);
        this.v = n1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127361w |= Integer.MIN_VALUE;
        return n1.Z2(this.v, null, this);
    }
}
