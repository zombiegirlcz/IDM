package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;

/* JADX INFO: loaded from: classes8.dex */
public final class s3 extends gim.c {
    public ProductAccountDescriptor$Value u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t3 f289002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289003x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.f289002w = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289003x |= Integer.MIN_VALUE;
        return this.f289002w.v(null, this);
    }
}
