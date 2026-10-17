package ubd;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public sbd.h u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f278822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f278823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f278824y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, gim.c cVar) {
        super(cVar);
        this.f278823x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f278822w = obj2;
        this.f278824y |= Integer.MIN_VALUE;
        return this.f278823x.d(null, this);
    }
}
