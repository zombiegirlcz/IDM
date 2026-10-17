package hee;

import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.c {
    public TransferArrivalRequest u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b f151705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f151706x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar, gim.c cVar) {
        super(cVar);
        this.f151705w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f151706x |= Integer.MIN_VALUE;
        return this.f151705w.J2(null, this);
    }
}
