package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f317922w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317923x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, gim.c cVar) {
        super(cVar);
        this.f317922w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317923x |= Integer.MIN_VALUE;
        return this.f317922w.a(null, this);
    }
}
