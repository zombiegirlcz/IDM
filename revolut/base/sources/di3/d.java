package di3;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutParams;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public AccountId u;
    public CheckoutParams v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f114874w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f114875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f114876y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, gim.c cVar) {
        super(cVar);
        this.f114875x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114874w = obj2;
        this.f114876y |= Integer.MIN_VALUE;
        return this.f114875x.a(null, null, this);
    }
}
