package kh2;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public int A;
    public f u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184037x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f184038y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f184038y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.j(this);
    }
}
