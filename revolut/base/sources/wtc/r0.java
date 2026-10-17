package wtc;

import com.revolut.feature.security_hub.api.models.WalletBalanceLimit;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends gim.c {
    public qtc.g u;
    public WalletBalanceLimit v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f299900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f299901x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t0 f299902y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.f299902y = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f299901x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f299902y.a(null, this);
    }
}
