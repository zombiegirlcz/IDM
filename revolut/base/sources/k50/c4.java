package k50;

/* JADX INFO: loaded from: classes19.dex */
public final class c4 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181044w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181045x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.f181044w = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181045x |= Integer.MIN_VALUE;
        return j4.T2(this.f181044w, null, this);
    }
}
