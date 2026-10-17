package mc7;

import com.revolut.feature.spending_analytics.api.widget.CashflowWidgetContext;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public CashflowWidgetContext u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f204299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f204300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f204301y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, gim.c cVar) {
        super(cVar);
        this.f204301y = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f204300x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f204301y.i(null, null, null, this);
    }
}
