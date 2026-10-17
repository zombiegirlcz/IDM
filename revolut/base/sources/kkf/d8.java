package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class d8 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e8 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184648w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(e8 e8Var, gim.c cVar) {
        super(cVar);
        this.v = e8Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184648w |= Integer.MIN_VALUE;
        return this.v.Z2(null, this);
    }
}
