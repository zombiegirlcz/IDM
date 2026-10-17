package ubd;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.c {
    public sbd.h u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f278815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f278816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f278817y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, gim.c cVar) {
        super(cVar);
        this.f278816x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f278815w = obj2;
        this.f278817y |= Integer.MIN_VALUE;
        return this.f278816x.a(null, this);
    }
}
