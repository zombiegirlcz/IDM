package eik;

import com.revolut.core.ui_kit.models.Clause;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g B;
    public int C;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f126684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public oki.h f126685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public yki.b f126686y;
    public Clause z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g gVar, gim.c cVar) {
        super(cVar);
        this.B = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.N2(0, false, this);
    }
}
