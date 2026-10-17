package e98;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f123926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f123927x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f123926w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f123927x |= Integer.MIN_VALUE;
        return this.f123926w.a(null, null, this);
    }
}
