package gsh;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ a0 B;
    public int C;
    public String u;
    public dsh.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a0 f146525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f146526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hlm.c f146527y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.B = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.i(null, null, null, this);
    }
}
