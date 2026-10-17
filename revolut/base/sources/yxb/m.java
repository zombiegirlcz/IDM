package yxb;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.c {
    public String u;
    public Integer v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f317623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s f317624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f317625y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, gim.c cVar) {
        super(cVar);
        this.f317624x = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f317623w = obj2;
        this.f317625y |= Integer.MIN_VALUE;
        return this.f317624x.w(null, null, this);
    }
}
