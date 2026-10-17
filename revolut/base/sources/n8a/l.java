package n8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.AliasRegistrationResult;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.c {
    public AccountId u;
    public AliasRegistrationResult.Success v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f213332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213333y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, gim.c cVar) {
        super(cVar);
        this.f213332x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213331w = obj2;
        this.f213333y |= Integer.MIN_VALUE;
        return o.d(this.f213332x, null, null, null, this);
    }
}
