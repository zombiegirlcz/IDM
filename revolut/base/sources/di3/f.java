package di3;

import com.revolut.feature.checkout.models.CheckoutParams;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public CheckoutParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f114880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114881x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, gim.c cVar) {
        super(cVar);
        this.f114880w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114881x |= Integer.MIN_VALUE;
        return this.f114880w.c(null, this);
    }
}
