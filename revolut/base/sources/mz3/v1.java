package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingScreenConfig;

/* JADX INFO: loaded from: classes22.dex */
public final class v1 extends gim.c {
    public final /* synthetic */ y1 A;
    public int B;
    public ws3.a u;
    public it3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CreditApplicationStatusNavigationConfig f210693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ManualUnderwritingScreenConfig f210694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ju3.g f210695y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(y1 y1Var, gim.c cVar) {
        super(cVar);
        this.A = y1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.g(null, null, null, this);
    }
}
