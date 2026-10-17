package xf1;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public i u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f304765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f304766x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f304767y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f304767y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f304766x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f304767y.a(null, this);
    }
}
