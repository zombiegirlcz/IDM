package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class f1 extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f226573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r1 f226574y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(r1 r1Var, gim.c cVar) {
        super(cVar);
        this.f226574y = r1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226573x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f226574y.e(null, null, 0, this);
    }
}
