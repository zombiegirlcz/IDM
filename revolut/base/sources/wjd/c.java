package wjd;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public wl0.o u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f298039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f298040x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f298039w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f298040x |= Integer.MIN_VALUE;
        return this.f298039w.e3(this);
    }
}
