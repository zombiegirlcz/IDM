package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;

/* JADX INFO: loaded from: classes8.dex */
public final class q3 extends gim.c {
    public ProductAccountDescriptor$Value.Main u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t3 f288983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288984x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.f288983w = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f288984x |= Integer.MIN_VALUE;
        return this.f288983w.q(null, this);
    }
}
