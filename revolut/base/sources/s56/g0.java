package s56;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends gim.c {
    public DeFiBalance u;
    public wk5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f259953w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i0 f259954x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f259955y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.f259954x = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259953w = obj2;
        this.f259955y |= Integer.MIN_VALUE;
        return i0.a(this.f259954x, null, null, null, this);
    }
}
