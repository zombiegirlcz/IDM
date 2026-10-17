package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends gim.c {
    public aii.u u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k1 f184766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184767x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, gim.c cVar) {
        super(cVar);
        this.f184766w = k1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184767x |= Integer.MIN_VALUE;
        return this.f184766w.b3(null, this);
    }
}
