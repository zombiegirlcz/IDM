package d38;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public int A;
    public g u;
    public InvestWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f110924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f110925x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f110926y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.z = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f110926y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, this);
    }
}
