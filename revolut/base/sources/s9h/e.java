package s9h;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dsh.e f261185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f261186x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f261187y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, gim.c cVar) {
        super(cVar);
        this.f261187y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f261186x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f261187y.j(null, null, null, this);
    }
}
