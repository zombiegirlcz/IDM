package exe;

import com.revolut.feature.checkout.models.CheckoutOrder;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.c {
    public CheckoutOrder u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f130421w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f130422x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, gim.c cVar) {
        super(cVar);
        this.f130421w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f130422x |= Integer.MIN_VALUE;
        return this.f130421w.c(null, this);
    }
}
