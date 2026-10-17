package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 extends gim.c {
    public com.revolut.domain.interactors.transactions.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f127359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127360x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, gim.c cVar) {
        super(cVar);
        this.f127359w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127360x |= Integer.MIN_VALUE;
        return this.f127359w.c(null, null, this);
    }
}
