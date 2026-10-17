package q4k;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public a2k.b u;
    public f5j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f242182w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f242183x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f242184y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.f242183x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f242182w = obj2;
        this.f242184y |= Integer.MIN_VALUE;
        return this.f242183x.Z2(null, this);
    }
}
