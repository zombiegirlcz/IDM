package nj5;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public int A;
    public h u;
    public CryptoWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f216368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f216369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f216370y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.z = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f216370y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, this);
    }
}
