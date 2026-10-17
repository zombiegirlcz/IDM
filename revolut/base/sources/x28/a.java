package x28;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.c {
    public String A;
    public /* synthetic */ Object B;
    public final /* synthetic */ j C;
    public int D;
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dsh.e f302513w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f302514x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public InvestWidgetContext f302515y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, gim.c cVar) {
        super(cVar);
        this.C = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.f(null, null, null, null, this);
    }
}
