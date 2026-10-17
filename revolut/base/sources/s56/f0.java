package s56;

import com.revolut.feature.defi.accounts.api.model.DeFiBalance;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends gim.c {
    public int A;
    public DeFiBalance u;
    public w4l.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i0 f259950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f259951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f259952y;
    public final /* synthetic */ i0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.z = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259952y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.h(null, null, this);
    }
}
