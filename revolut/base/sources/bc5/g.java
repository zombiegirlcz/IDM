package bc5;

import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import hd.r;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public CreditCardAutopayPayment u;
    public c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f14386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f14387x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14388y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, gim.c cVar) {
        super(cVar);
        this.f14387x = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f14386w = obj2;
        this.f14388y |= Integer.MIN_VALUE;
        return r.l(this.f14387x, null, null, this);
    }
}
