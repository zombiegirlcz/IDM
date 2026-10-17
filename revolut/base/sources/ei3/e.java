package ei3;

import com.revolut.feature.checkout.models.CheckoutOrder;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public CheckoutOrder u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f126364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f126365x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, gim.c cVar) {
        super(cVar);
        this.f126364w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f126365x |= Integer.MIN_VALUE;
        return m.d(this.f126364w, null, null, this);
    }
}
