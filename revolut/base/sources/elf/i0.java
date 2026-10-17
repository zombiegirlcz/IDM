package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends gim.c {
    public oq9.j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j0 f127347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127348x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, gim.c cVar) {
        super(cVar);
        this.f127347w = j0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127348x |= Integer.MIN_VALUE;
        return this.f127347w.Z2(null, this);
    }
}
