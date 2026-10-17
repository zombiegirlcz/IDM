package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ n C;
    public int D;
    public dsh.t u;
    public dsh.t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n f146491w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hlm.a f146492x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146493y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, gim.c cVar) {
        super(cVar);
        this.C = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.j(null, null, this);
    }
}
