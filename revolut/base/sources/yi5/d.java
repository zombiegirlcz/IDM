package yi5;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public int A;
    public j u;
    public CryptoWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f314241w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f314242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f314243y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, gim.c cVar) {
        super(cVar);
        this.z = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f314243y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, this);
    }
}
