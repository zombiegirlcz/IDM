package s65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n65.d f260150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f260151b;

    public s(n65.d loanSelectNewRepaymentDayCalendarMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(loanSelectNewRepaymentDayCalendarMapper, "loanSelectNewRepaymentDayCalendarMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f260150a = loanSelectNewRepaymentDayCalendarMapper;
        this.f260151b = dateProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LoanDetails loanDetails = domainState.f260135a;
        wi0.b bVar = loanDetails.f70144a.f70112h;
        int i = domainState.f260136b;
        int i2 = loanDetails.f70146c;
        int i3 = 0;
        if (i != i2) {
            int i5 = 27;
            return (m) iii.c.f(domainState.f260137c, new r(this, i3), new s20.c(i5), new lk7.p(this, i5, domainState, bVar));
        }
        n65.c cVarA = this.f260150a.a(i2, i, bVar, false);
        i iVar = new i(cVarA.f212708a, cVarA.f212709b);
        koi.j[] elements = {cVarA.f212710c, cVarA.d};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new m(iVar, false, false, kotlin.collections.d.L(elements));
    }
}
