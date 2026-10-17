package k50;

/* JADX INFO: loaded from: classes19.dex */
public final class y3 extends gim.c {
    public s2 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181300x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(j4 j4Var, gim.c cVar) {
        super(cVar);
        this.f181299w = j4Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181300x |= Integer.MIN_VALUE;
        return j4.R2(this.f181299w, null, this);
    }
}
