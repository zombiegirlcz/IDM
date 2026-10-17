package n8a;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.AliasDeletionResult;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public AccountId u;
    public AliasDeletionResult.Success v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f213319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f213320x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f213321y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, gim.c cVar) {
        super(cVar);
        this.f213320x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213319w = obj2;
        this.f213321y |= Integer.MIN_VALUE;
        return o.a(this.f213320x, null, null, this);
    }
}
