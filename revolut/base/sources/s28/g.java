package s28;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public int A;
    public h u;
    public InvestWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f259263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f259264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f259265y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.z = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259265y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, this);
    }
}
