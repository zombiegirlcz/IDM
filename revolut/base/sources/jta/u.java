package jta;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f178461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f178462x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, gim.c cVar) {
        super(cVar);
        this.f178461w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f178462x |= Integer.MIN_VALUE;
        return v.I2(this.f178461w, null, this);
    }
}
