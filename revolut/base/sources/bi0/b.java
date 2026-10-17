package bi0;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.c {
    public hlm.a u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f15356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f15357y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, gim.c cVar) {
        super(cVar);
        this.f15357y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f15356x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f15357y.b(this);
    }
}
