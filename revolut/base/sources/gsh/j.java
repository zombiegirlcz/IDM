package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.c {
    public boolean A;
    public /* synthetic */ Object B;
    public final /* synthetic */ n C;
    public int D;
    public String u;
    public dsh.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n f146485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hlm.a f146486x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146487y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, gim.c cVar) {
        super(cVar);
        this.C = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.h(null, null, this);
    }
}
