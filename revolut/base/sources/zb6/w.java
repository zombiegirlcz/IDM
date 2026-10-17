package zb6;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends gim.c {
    public com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a u;
    public com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f320828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a f320829x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f320830y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar, gim.c cVar) {
        super(cVar);
        this.f320829x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f320828w = obj2;
        this.f320830y |= Integer.MIN_VALUE;
        return com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a.I2(this.f320829x, this);
    }
}
