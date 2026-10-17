package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;

/* JADX INFO: loaded from: classes8.dex */
public final class m3 extends gim.c {
    public ProductAccountDescriptor$Value.Main u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t3 f288954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288955x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.f288954w = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f288955x |= Integer.MIN_VALUE;
        return t3.b(this.f288954w, null, this);
    }
}
