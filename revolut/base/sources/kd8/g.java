package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public String u;
    public v6d.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f182823w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f182824x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f182825y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, gim.c cVar) {
        super(cVar);
        this.f182824x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f182823w = obj2;
        this.f182825y |= Integer.MIN_VALUE;
        return this.f182824x.a(null, null, this);
    }
}
