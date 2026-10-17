package kd8;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends gim.c {
    public v6d.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f182846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f182847x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, gim.c cVar) {
        super(cVar);
        this.f182846w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f182847x |= Integer.MIN_VALUE;
        return this.f182846w.a(null, null, this);
    }
}
