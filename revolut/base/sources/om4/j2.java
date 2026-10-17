package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class j2 extends gim.c {
    public int A;
    public String u;
    public x2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public od0.h f226607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226608x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f226609y;
    public final /* synthetic */ x2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.z = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226609y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.n(null, this);
    }
}
