package fa8;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f133257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.isa.impl.ui.child_details.a f133258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f133259y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.junior.isa.impl.ui.child_details.a aVar, gim.c cVar) {
        super(cVar);
        this.f133258x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f133257w = obj2;
        this.f133259y |= Integer.MIN_VALUE;
        return com.revolut.feature.junior.isa.impl.ui.child_details.a.J2(this.f133258x, null, null, this);
    }
}
