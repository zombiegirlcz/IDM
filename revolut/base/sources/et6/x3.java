package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class x3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ y3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129376w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(y3 y3Var, gim.c cVar) {
        super(cVar);
        this.v = y3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129376w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
