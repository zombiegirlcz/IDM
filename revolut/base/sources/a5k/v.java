package a5k;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.c {
    public TransferTrustData u;
    public iy9.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f1490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1491y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, gim.c cVar) {
        super(cVar);
        this.f1490x = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f1489w = obj2;
        this.f1491y |= Integer.MIN_VALUE;
        return this.f1490x.Z2(null, this);
    }
}
