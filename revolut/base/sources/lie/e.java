package lie;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public emg.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f195484w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f195485x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, gim.c cVar) {
        super(cVar);
        this.f195484w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f195485x |= Integer.MIN_VALUE;
        return this.f195484w.d(null, this);
    }
}
