package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f215042w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f215043x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, gim.c cVar) {
        super(cVar);
        this.f215042w = uVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f215043x |= Integer.MIN_VALUE;
        return u.a(this.f215042w, null, this);
    }
}
