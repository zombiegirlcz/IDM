package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;

/* JADX INFO: loaded from: classes22.dex */
public final class o3 extends gim.c {
    public CreditApplicationStatusNavigationConfig u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3 f210647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f210648x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(q3 q3Var, gim.c cVar) {
        super(cVar);
        this.f210647w = q3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f210648x |= Integer.MIN_VALUE;
        return this.f210647w.g(null, null, null, this);
    }
}
