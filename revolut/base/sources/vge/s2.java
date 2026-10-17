package vge;

import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;

/* JADX INFO: loaded from: classes8.dex */
public final class s2 extends gim.c {
    public int A;
    public ProductAccountDescriptor$Value.Main u;
    public ProductAccountMetadata v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hlm.a f288999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f289001y;
    public final /* synthetic */ t2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var, gim.c cVar) {
        super(cVar);
        this.z = t2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f289001y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.r(null, null, this);
    }
}
