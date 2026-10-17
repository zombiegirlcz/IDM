package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class g2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127333w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, gim.c cVar) {
        super(cVar);
        this.v = h2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127333w |= Integer.MIN_VALUE;
        return this.v.b3(this);
    }
}
