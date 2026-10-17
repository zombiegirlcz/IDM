package osf;

import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.c {
    public bsf.e u;
    public TransferReasonsRequest v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f229330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f229331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f229332y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f229331x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f229330w = obj2;
        this.f229332y |= Integer.MIN_VALUE;
        return this.f229331x.Z2(null, this);
    }
}
