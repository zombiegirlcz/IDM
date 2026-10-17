package ys5;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public int A;
    public d u;
    public CryptoWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f316395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f316396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f316397y;
    public final /* synthetic */ d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, gim.c cVar) {
        super(cVar);
        this.z = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f316397y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, this);
    }
}
