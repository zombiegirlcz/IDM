package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ n C;
    public int D;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f146488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f146489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public n f146490y;
    public hlm.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, gim.c cVar) {
        super(cVar);
        this.C = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.i(0, 0, this);
    }
}
