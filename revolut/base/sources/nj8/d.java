package nj8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public String u;
    public w4l.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f216385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f216386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f216387y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, gim.c cVar) {
        super(cVar);
        this.f216386x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f216385w = obj2;
        this.f216387y |= Integer.MIN_VALUE;
        return this.f216386x.g(null, null, this);
    }
}
