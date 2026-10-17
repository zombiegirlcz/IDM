package olg;

import com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.c {
    public SendChecksBeneficiaryParams u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f226405w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226406x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, gim.c cVar) {
        super(cVar);
        this.f226405w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226406x |= Integer.MIN_VALUE;
        return this.f226405w.c(null, this);
    }
}
