package rnb;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.c {
    public SavingsProduct u;
    public l71.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f255570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f255571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f255572y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gim.c cVar) {
        super(cVar);
        this.f255571x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f255570w = obj2;
        this.f255572y |= Integer.MIN_VALUE;
        return this.f255571x.c(null, this);
    }
}
