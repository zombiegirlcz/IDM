package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class y1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127440w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, gim.c cVar) {
        super(cVar);
        this.v = z1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127440w |= Integer.MIN_VALUE;
        return this.v.b3(null, this);
    }
}
