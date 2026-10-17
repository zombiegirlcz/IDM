package fg0;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends gim.c {
    public zf0.c u;
    public k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f134874w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f134875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f134876y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f134876y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f134875x = obj2;
        this.z |= Integer.MIN_VALUE;
        return k.a(this.f134876y, null, this);
    }
}
