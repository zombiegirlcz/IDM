package j9k;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f61.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f172351w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f61.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f172351w |= Integer.MIN_VALUE;
        return this.v.x(this);
    }
}
