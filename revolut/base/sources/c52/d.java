package c52;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.c {
    public TransferTrustData u;
    public iy9.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f21363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f21364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f21365y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, gim.c cVar) {
        super(cVar);
        this.f21364x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21363w = obj2;
        this.f21365y |= Integer.MIN_VALUE;
        return this.f21364x.g3(null, this);
    }
}
