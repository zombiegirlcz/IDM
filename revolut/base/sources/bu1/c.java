package bu1;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public int A;
    public f u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f18659y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f18659y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.j(this);
    }
}
