package n8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.impl.domain.model.AliasPortabilityRequestResult;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public AccountId u;
    public AliasPortabilityRequestResult.Success v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f213329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213330y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, gim.c cVar) {
        super(cVar);
        this.f213329x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213328w = obj2;
        this.f213330y |= Integer.MIN_VALUE;
        return o.c(this.f213329x, null, null, null, this);
    }
}
