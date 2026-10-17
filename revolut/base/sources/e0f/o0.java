package e0f;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 extends gim.c {
    public int A;
    public xi0.b u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TopUpConfig f121655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountId f121656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f121657y;
    public final /* synthetic */ t0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.z = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f121657y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(null, null, null, this);
    }
}
