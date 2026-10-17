package pfk;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f235679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f235680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f235681y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.f235680x = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f235679w = obj2;
        this.f235681y |= Integer.MIN_VALUE;
        return s.a(this.f235680x, null, null, this);
    }
}
