package a7e;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public SubaccountType u;
    public ProductId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f1853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1854y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, gim.c cVar) {
        super(cVar);
        this.f1853x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f1852w = obj2;
        this.f1854y |= Integer.MIN_VALUE;
        return this.f1853x.d(null, null, this);
    }
}
