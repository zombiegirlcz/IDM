package mz3;

import com.revolut.feature.credit.application.plugins.api.models.config.CreditOfferConfig;

/* JADX INFO: loaded from: classes22.dex */
public final class j2 extends gim.c {
    public final /* synthetic */ l2 A;
    public int B;
    public it3.d u;
    public grl.r2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public wi0.b f210617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f210618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CreditOfferConfig f210619y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(l2 l2Var, gim.c cVar) {
        super(cVar);
        this.A = l2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, null, null, null, null, this);
    }
}
