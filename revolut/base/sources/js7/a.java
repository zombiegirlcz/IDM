package js7;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public String u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f178145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f178146x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f178147y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, gim.c cVar) {
        super(cVar);
        this.f178146x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f178145w = obj2;
        this.f178147y |= Integer.MIN_VALUE;
        return this.f178146x.a(null, null, this);
    }
}
