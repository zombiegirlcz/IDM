package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class m1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127376w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, gim.c cVar) {
        super(cVar);
        this.v = n1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127376w |= Integer.MIN_VALUE;
        return this.v.e3(this);
    }
}
