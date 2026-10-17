package n8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PortabilityRequestArgsModel;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.c {
    public AccountId u;
    public PortabilityRequestArgsModel v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f213335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213336y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.f213335x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213334w = obj2;
        this.f213336y |= Integer.MIN_VALUE;
        return this.f213335x.i(null, null, this);
    }
}
