package n7i;

import com.revolut.feature.credit.card.api.models.limits.CreditCardLimits;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.c {
    public CreditCardLimits.Direction u;
    public Object[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f213154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f213155x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f213156y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, gim.c cVar) {
        super(cVar);
        this.f213156y = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f213155x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f213156y.a(null, null, null, this);
    }
}
