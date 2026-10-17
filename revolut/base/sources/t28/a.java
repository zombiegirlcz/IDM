package t28;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public int A;
    public e u;
    public InvestWidgetContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f267446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f267447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f267448y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, gim.c cVar) {
        super(cVar);
        this.z = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f267448y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, null, null, null, this);
    }
}
