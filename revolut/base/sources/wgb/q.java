package wgb;

import com.revolut.data.model.Data;
import com.revolut.feature.terms.api.model.TermsScope;
import egb.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.c {
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.salary_promotion.b A;
    public int B;
    public Data u;
    public q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TermsScope f297291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f297292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f297293y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar, gim.c cVar) {
        super(cVar);
        this.A = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.salary_account.impl.salary_promotion.b.I2(this.A, null, null, false, this);
    }
}
