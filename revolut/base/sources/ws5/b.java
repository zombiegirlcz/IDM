package ws5;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.c {
    public int A;
    public h u;
    public CryptoWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f299654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f299655x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f299656y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, gim.c cVar) {
        super(cVar);
        this.z = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f299656y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, this);
    }
}
