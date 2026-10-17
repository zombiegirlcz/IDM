package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.c {
    public String u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f182834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f182835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f182836y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, gim.c cVar) {
        super(cVar);
        this.f182835x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f182834w = obj2;
        this.f182836y |= Integer.MIN_VALUE;
        return this.f182835x.f(null, this);
    }
}
