package di3;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutParams;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public int A;
    public AccountId u;
    public CheckoutParams.CardOrder v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public pi3.h f114883w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114884x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f114885y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114885y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, null, this);
    }
}
