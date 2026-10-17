package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class y2 extends gim.c {
    public ifj.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z2 f114162w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114163x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(z2 z2Var, gim.c cVar) {
        super(cVar);
        this.f114162w = z2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114163x |= Integer.MIN_VALUE;
        return this.f114162w.a(this);
    }
}
