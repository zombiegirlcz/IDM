package chj;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f24273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24274x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(u0 u0Var, gim.c cVar) {
        super(cVar);
        this.f24273w = u0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f24274x |= Integer.MIN_VALUE;
        return u0.l3(this.f24273w, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, this);
    }
}
