package c7e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.tab.accounts.models.ProductAccountId;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public hpg.j u;
    public ProductAccountId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Subaccount f21929w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f21930x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f21931y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f21931y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f21930x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f21931y.d3(null, null, this);
    }
}
