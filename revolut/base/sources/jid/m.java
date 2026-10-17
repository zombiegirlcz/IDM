package jid;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.c {
    public String u;
    public g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f174439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f174440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f174441y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gim.c cVar) {
        super(cVar);
        this.f174441y = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f174440x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f174441y.a(null, 0.0d, this);
    }
}
