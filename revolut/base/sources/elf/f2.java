package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class f2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127324w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(h2 h2Var, gim.c cVar) {
        super(cVar);
        this.v = h2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127324w |= Integer.MIN_VALUE;
        return this.v.Z2(null, this);
    }
}
