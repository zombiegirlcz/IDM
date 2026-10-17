package l7j;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.c {
    public Exception u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f192689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f192690x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, gim.c cVar) {
        super(cVar);
        this.f192689w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f192690x |= Integer.MIN_VALUE;
        return this.f192689w.J2(null, null, this);
    }
}
