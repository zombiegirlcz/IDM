package hee;

import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.c {
    public int A;
    public TransferArrivalRequest u;
    public tde.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b f151702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TransferArrivalRequest f151703x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f151704y;
    public final /* synthetic */ com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar, gim.c cVar) {
        super(cVar);
        this.z = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f151704y = obj2;
        this.A |= Integer.MIN_VALUE;
        return com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b.I2(this.z, null, this);
    }
}
