package ts6;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends gim.c {
    public s0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f274016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f274017x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, gim.c cVar) {
        super(cVar);
        this.f274016w = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f274017x |= Integer.MIN_VALUE;
        return this.f274016w.o(null, this);
    }
}
