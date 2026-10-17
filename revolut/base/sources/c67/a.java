package c67;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f21689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f21690x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21691y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f21690x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21689w = obj2;
        this.f21691y |= Integer.MIN_VALUE;
        return this.f21690x.i(null, null, null, this);
    }
}
