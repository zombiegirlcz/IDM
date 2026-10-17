package dz6;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f121256w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f121257x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f121258y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, gim.c cVar) {
        super(cVar);
        this.f121257x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121256w = obj2;
        this.f121258y |= Integer.MIN_VALUE;
        return q.I2(this.f121257x, null, null, this);
    }
}
