package yy9;

import com.revolut.feature.apm.core.api.product.ApmProduct;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.c {
    public ApmProduct u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f317910w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317911x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, gim.c cVar) {
        super(cVar);
        this.f317910w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317911x |= Integer.MIN_VALUE;
        return this.f317910w.b(null, null, null, this);
    }
}
