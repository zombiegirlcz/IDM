package q35;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanInsuranceState;
import com.revolut.feature.credit.loan.api.models.rev10.LoanInterestRate;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public interface t {
    /* JADX INFO: renamed from: J */
    int getF70118q();

    /* JADX INFO: renamed from: J0 */
    e0 getF70121t();

    /* JADX INFO: renamed from: N0 */
    dj0.d getD();

    /* JADX INFO: renamed from: R0 */
    dj0.d getK();

    /* JADX INFO: renamed from: T */
    a0 getU();

    /* JADX INFO: renamed from: W */
    dj0.d getF70114l();

    /* JADX INFO: renamed from: a */
    dj0.d getF70110c();

    /* JADX INFO: renamed from: b */
    LocalDate getE();

    /* JADX INFO: renamed from: c */
    dj0.d getF70113j();

    /* JADX INFO: renamed from: c0 */
    int getF70117p();

    /* JADX INFO: renamed from: d */
    dj0.d getF70115m();

    /* JADX INFO: renamed from: e */
    LoanInsuranceState getF70122w();

    /* JADX INFO: renamed from: f0 */
    double getF70116n();

    default dj0.d getBalance() {
        dj0.d dVar;
        Loan loan = (Loan) this;
        if (loan.i instanceof LoanState.Planned) {
            return loan.f70113j;
        }
        if (loan.o == b95.a.MORTGAGE_LOAN) {
            return n1();
        }
        wi0.b.Companion.getClass();
        boolean zF = Intrinsics.f(loan.f70112h, wi0.b.p0);
        dj0.d dVar2 = loan.f70110c;
        return (!zF || (dVar = loan.f70115m) == null) ? dVar2 : dVar;
    }

    /* JADX INFO: renamed from: getConfig */
    h getF();

    /* JADX INFO: renamed from: getCountryCode */
    wi0.b getF70112h();

    /* JADX INFO: renamed from: getId */
    String getF70108a();

    /* JADX INFO: renamed from: getName */
    String getF70109b();

    /* JADX INFO: renamed from: getState */
    LoanState getI();

    /* JADX INFO: renamed from: j */
    j getF70120s();

    /* JADX INFO: renamed from: k0 */
    LoanInterestRate getF70119r();

    /* JADX INFO: renamed from: l */
    b95.a getO();

    default dj0.d n1() {
        return pyd.c.O(getK(), getF70114l());
    }

    /* JADX INFO: renamed from: p0 */
    LocalDate getF70111g();

    /* JADX INFO: renamed from: z */
    l getV();
}
