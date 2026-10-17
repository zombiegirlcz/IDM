package d7e;

import com.revolut.feature.tab.accounts.models.ProductAccountId;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.c {
    public ProductAccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f111945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111946x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f111945w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111946x |= Integer.MIN_VALUE;
        return this.f111945w.c(null, this);
    }
}
