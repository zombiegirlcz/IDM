package n8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.impl.domain.model.AliasPortabilityOperationResult;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.c {
    public AccountId u;
    public AliasPortabilityOperationResult.Success v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213322w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f213323x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213324y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, gim.c cVar) {
        super(cVar);
        this.f213323x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213322w = obj2;
        this.f213324y |= Integer.MIN_VALUE;
        return o.b(this.f213323x, null, null, null, this);
    }
}
