package gq;

/* JADX INFO: loaded from: classes.dex */
public final class d extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ e B;
    public int C;
    public boolean u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f145472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f145473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f145474y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.B = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return e.a(this.B, false, this);
    }
}
