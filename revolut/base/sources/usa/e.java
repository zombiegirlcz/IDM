package usa;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public TransferTrustData u;
    public iy9.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f282846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f282847x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f282848y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f282847x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f282846w = obj2;
        this.f282848y |= Integer.MIN_VALUE;
        return this.f282847x.Z2(null, this);
    }
}
