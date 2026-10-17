package ki3;

import com.revolut.feature.checkout.models.CheckoutOrder;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public CheckoutOrder u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.checkout.impl.resume.flow.a f184171w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184172x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.checkout.impl.resume.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f184171w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184172x |= Integer.MIN_VALUE;
        return com.revolut.feature.checkout.impl.resume.flow.a.I2(this.f184171w, null, this);
    }
}
