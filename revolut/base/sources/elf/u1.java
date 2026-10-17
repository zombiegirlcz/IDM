package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class u1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ v1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127417w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, gim.c cVar) {
        super(cVar);
        this.v = v1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127417w |= Integer.MIN_VALUE;
        return this.v.b3(null, this);
    }
}
