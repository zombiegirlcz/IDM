package f23;

import com.revolut.feature.checkout.models.CheckoutOrder;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public CheckoutOrder u;
    public b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f131364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f131365x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f131366y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, gim.c cVar) {
        super(cVar);
        this.f131365x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f131364w = obj2;
        this.f131366y |= Integer.MIN_VALUE;
        return m.Z2(this.f131365x, null, null, this);
    }
}
