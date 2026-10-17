package fa8;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public com.revolut.feature.junior_profile.api.models.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.isa.impl.ui.child_details.a f133255w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f133256x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.junior.isa.impl.ui.child_details.a aVar, gim.c cVar) {
        super(cVar);
        this.f133255w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f133256x |= Integer.MIN_VALUE;
        return com.revolut.feature.junior.isa.impl.ui.child_details.a.I2(this.f133255w, null, this);
    }
}
