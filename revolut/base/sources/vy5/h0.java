package vy5;

import com.revolut.feature.tab.accounts.models.ProductAccountId;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends gim.c {
    public ProductAccountId u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f293157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f293158x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.f293157w = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f293158x |= Integer.MIN_VALUE;
        return this.f293157w.h(null, this);
    }
}
