package w38;

import com.revolut.feature.tab.accounts.models.ProductAccountId;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends gim.c {
    public ProductAccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f294178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f294179x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(q0 q0Var, gim.c cVar) {
        super(cVar);
        this.f294178w = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f294179x |= Integer.MIN_VALUE;
        return this.f294178w.g(null, this);
    }
}
