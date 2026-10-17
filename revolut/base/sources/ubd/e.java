package ubd;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.c {
    public boolean u;
    public sbd.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f278825w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f278826x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f278827y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, gim.c cVar) {
        super(cVar);
        this.f278826x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f278825w = obj2;
        this.f278827y |= Integer.MIN_VALUE;
        return this.f278826x.e(false, this);
    }
}
