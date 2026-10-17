package i28;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public InvestWidgetContext u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f157890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f157891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f157892y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, gim.c cVar) {
        super(cVar);
        this.f157891x = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f157890w = obj2;
        this.f157892y |= Integer.MIN_VALUE;
        return this.f157891x.e(null, null, this);
    }
}
