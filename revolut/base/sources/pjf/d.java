package pjf;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f236747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f236748x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f236747w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f236748x |= Integer.MIN_VALUE;
        return this.f236747w.d(this);
    }
}
