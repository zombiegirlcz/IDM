package s8a;

import com.revolut.feature.pix.api.model.PixQrCodeTransferData;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public PixQrCodeTransferData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f260959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f260960x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f260959w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f260960x |= Integer.MIN_VALUE;
        return this.f260959w.c(null, this);
    }
}
