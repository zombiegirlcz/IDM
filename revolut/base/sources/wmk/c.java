package wmk;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f298685w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.v = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f298685w |= Integer.MIN_VALUE;
        return this.v.b3(this);
    }
}
