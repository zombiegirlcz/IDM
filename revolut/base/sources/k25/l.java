package k25;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f180336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f180337x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u uVar, gim.c cVar) {
        super(cVar);
        this.f180336w = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f180337x |= Integer.MIN_VALUE;
        return this.f180336w.f(null, this);
    }
}
