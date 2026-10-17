package t45;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.c {
    public LoanDetails u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f267903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267904x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f267903w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267904x |= Integer.MIN_VALUE;
        return this.f267903w.i(null, this);
    }
}
