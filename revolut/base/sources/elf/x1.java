package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class x1 extends gim.c {
    public z1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z1 f127437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127438x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(z1 z1Var, gim.c cVar) {
        super(cVar);
        this.f127437w = z1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127438x |= Integer.MIN_VALUE;
        return this.f127437w.Z2(null, this);
    }
}
