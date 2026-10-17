package ska;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public String u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f263783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f263784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f263785y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f263785y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f263784x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f263785y.a(null, this);
    }
}
