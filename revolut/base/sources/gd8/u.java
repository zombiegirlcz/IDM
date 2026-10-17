package gd8;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f143106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f143107x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, gim.c cVar) {
        super(cVar);
        this.f143106w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f143107x |= Integer.MIN_VALUE;
        return this.f143106w.b(null, this);
    }
}
