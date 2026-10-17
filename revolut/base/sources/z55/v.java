package z55;

import br4.k0;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a f319515b;

    public /* synthetic */ v(com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar, int i) {
        this.f319514a = i;
        this.f319515b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f319514a) {
            case 0:
                Loan it8 = (Loan) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                String strB = com.revolut.feature.credit.loan.api.models.rev10.e.b(it8);
                if (strB != null) {
                    return rd0.e.c(new k0(ra5.b.a(this.f319515b.f70352q, strB), 1), kotlin.coroutines.g.f186406a);
                }
                od0.i.Companion.getClass();
                efm.r rVarJust = efm.r.just(od0.i.f224256b);
                Intrinsics.h(rVarJust);
                return rVarJust;
            default:
                Intrinsics.checkNotNullParameter((LoanDetails) obj2, "it");
                com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.a aVar = this.f319515b;
                return nim.a.w(y45.i.f(aVar.f70351p, aVar.f70353r.f70343a), new w(1));
        }
    }
}
