package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;

/* JADX INFO: loaded from: classes8.dex */
public final class t1 extends gim.c {
    public ProductAccountDescriptor$Value.Main u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v1 f289008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289009x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(v1 v1Var, gim.c cVar) {
        super(cVar);
        this.f289008w = v1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289009x |= Integer.MIN_VALUE;
        return this.f289008w.a(null, this);
    }
}
