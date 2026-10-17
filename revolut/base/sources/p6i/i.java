package p6i;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import h6i.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.c {
    public int A;
    public f0 u;
    public SavingsProduct v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f233331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f233332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f233333y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233333y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.e(null, this);
    }
}
