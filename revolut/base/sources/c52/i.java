package c52;

import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.c {
    public TransferReviewInfo.Send u;
    public k71.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f21377w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f21378x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21379y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, gim.c cVar) {
        super(cVar);
        this.f21378x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21377w = obj2;
        this.f21379y |= Integer.MIN_VALUE;
        return r.d3(this.f21378x, null, null, this);
    }
}
