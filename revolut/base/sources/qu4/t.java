package qu4;

/* JADX INFO: loaded from: classes22.dex */
public final class t extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f249240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f249241x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, gim.c cVar) {
        super(cVar);
        this.f249240w = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f249241x |= Integer.MIN_VALUE;
        return u.I2(this.f249240w, null, this);
    }
}
