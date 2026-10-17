package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends gim.c {
    public h0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f184674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184675x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f184674w = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184675x |= Integer.MIN_VALUE;
        return this.f184674w.b3(this);
    }
}
