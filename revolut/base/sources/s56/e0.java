package s56;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ i0 B;
    public int C;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w4l.k f259947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DeFiBalance f259948x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i0 f259949y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.B = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.g(null, null, null, null, null, this);
    }
}
