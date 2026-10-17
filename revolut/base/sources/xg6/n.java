package xg6;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.c {
    public int A;
    public String u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f305591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f305592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f305593y;
    public final /* synthetic */ q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, gim.c cVar) {
        super(cVar);
        this.z = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f305593y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, 0L, 0L, this);
    }
}
