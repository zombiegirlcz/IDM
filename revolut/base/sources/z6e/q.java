package z6e;

import com.revolut.feature.tab.accounts.models.ProductAccountId;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.c {
    public ProductAccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f319755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f319756x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, gim.c cVar) {
        super(cVar);
        this.f319755w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f319756x |= Integer.MIN_VALUE;
        return this.f319755w.d(null, this);
    }
}
