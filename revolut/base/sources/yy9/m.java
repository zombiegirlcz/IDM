package yy9;

import com.revolut.feature.apm.core.api.product.ApmProduct;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.c {
    public ApmProduct u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f317908w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317909x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, gim.c cVar) {
        super(cVar);
        this.f317908w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317909x |= Integer.MIN_VALUE;
        return this.f317908w.a(null, null, null, this);
    }
}
