package z57;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f319522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f319523x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f319524y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f319523x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f319522w = obj2;
        this.f319524y |= Integer.MIN_VALUE;
        return this.f319523x.i(null, null, null, this);
    }
}
