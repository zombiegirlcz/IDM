package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class z6 extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e7 f185054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f185055x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(e7 e7Var, gim.c cVar) {
        super(cVar);
        this.f185054w = e7Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f185055x |= Integer.MIN_VALUE;
        return e7.Z2(this.f185054w, null, null, null, this);
    }
}
