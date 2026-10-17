package ol1;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public int A;
    public f u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226309x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f226310y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226310y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.j(this);
    }
}
