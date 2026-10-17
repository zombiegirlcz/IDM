package wtc;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.c {
    public String u;
    public cuc.r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f299890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ufm.d f299891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f299892y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ufm.d dVar, gim.c cVar) {
        super(cVar);
        this.f299891x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f299890w = obj2;
        this.f299892y |= Integer.MIN_VALUE;
        return this.f299891x.b(null, this);
    }
}
