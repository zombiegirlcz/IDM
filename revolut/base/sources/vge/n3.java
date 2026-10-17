package vge;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes8.dex */
public final class n3 extends gim.c {
    public ProductId u;
    public tge.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProductAccountDescriptor$Value f288959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f288960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t3 f288961y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.f288961y = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f288960x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f288961y.n(null, null, this);
    }
}
