package ts5;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public int A;
    public n u;
    public CryptoWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f273962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f273963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f273964y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, gim.c cVar) {
        super(cVar);
        this.z = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f273964y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, this);
    }
}
