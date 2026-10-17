package o9k;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 extends gim.c {
    public TransferTrustData u;
    public iy9.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f223333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t0 f223334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f223335y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.f223334x = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f223333w = obj2;
        this.f223335y |= Integer.MIN_VALUE;
        return this.f223334x.a(null, null, this);
    }
}
