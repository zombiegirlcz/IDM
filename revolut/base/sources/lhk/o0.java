package lhk;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends gim.c {
    public zfk.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f195364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f195365x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f195364w = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f195365x |= Integer.MIN_VALUE;
        return this.f195364w.f(null, null, this);
    }
}
