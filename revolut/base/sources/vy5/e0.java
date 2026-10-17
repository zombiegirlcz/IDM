package vy5;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f293149w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f293149w |= Integer.MIN_VALUE;
        return this.v.g(null, this);
    }
}
