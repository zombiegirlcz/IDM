package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f127291w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, gim.c cVar) {
        super(cVar);
        this.v = b0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f127291w |= Integer.MIN_VALUE;
        return this.v.c3(this);
    }
}
