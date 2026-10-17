package osf;

import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.c {
    public bsf.e u;
    public TransferReasonsValues v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TransferReasonsRequest f229333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f229334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f229335y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f229335y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f229334x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f229335y.b3(null, this);
    }
}
