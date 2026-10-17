package fb6;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.c {
    public com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f133461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a f133462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f133463y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar, gim.c cVar) {
        super(cVar);
        this.f133462x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f133461w = obj2;
        this.f133463y |= Integer.MIN_VALUE;
        return com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a.I2(this.f133462x, this);
    }
}
