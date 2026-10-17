package c9k;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public AccountId u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CurrencyFilteringPolicy f22487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f22488x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f22489y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, gim.c cVar) {
        super(cVar);
        this.f22489y = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f22488x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f22489y.c(null, this, null);
    }
}
