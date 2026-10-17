package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127442w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, gim.c cVar) {
        super(cVar);
        this.v = a1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127442w |= Integer.MIN_VALUE;
        return this.v.Z2(this);
    }
}
