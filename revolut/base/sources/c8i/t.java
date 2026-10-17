package c8i;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22225w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, gim.c cVar) {
        super(cVar);
        this.v = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f22225w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
