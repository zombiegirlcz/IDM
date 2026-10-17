package x15;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import ft3.d1;
import ft3.j1;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f302249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f302250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f302251c;

    public d(Set productOrdering, q creditProducts) {
        Intrinsics.checkNotNullParameter(productOrdering, "productOrdering");
        Intrinsics.checkNotNullParameter(creditProducts, "creditProducts");
        this.f302249a = zhm.d0.d1(productOrdering);
        x xVarB = creditProducts.b();
        w wVar = xVarB instanceof w ? (w) xVarB : null;
        List list = wVar != null ? wVar.f302304a : null;
        List list2 = list == null ? zhm.f0.f322471a : list;
        int iB = q0.b(zhm.w.t(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : list2) {
            linkedHashMap.put(((Loan) obj2).f70108a, obj2);
        }
        this.f302250b = linkedHashMap;
        o oVarA = creditProducts.a();
        n nVar = oVarA instanceof n ? (n) oVarA : null;
        List list3 = nVar != null ? nVar.f302294a : null;
        List<m> list4 = list3 == null ? zhm.f0.f322471a : list3;
        int iB2 = q0.b(zhm.w.t(list4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (m mVar : list4) {
            linkedHashMap2.put(mVar.f302280a, mVar.f302284h.f69796h);
        }
        this.f302251c = linkedHashMap2;
    }

    public final int a(ProductAccount productAccount) {
        ProductAccountId.Payload payload = productAccount.getF89504c().f89730b;
        CreditAccountType creditAccountType = payload instanceof CreditAccountType ? (CreditAccountType) payload : null;
        if (!(creditAccountType instanceof CreditAccountType.Loan)) {
            return 1;
        }
        Loan loan = (Loan) this.f302250b.get(((CreditAccountType.Loan) creditAccountType).f70629b);
        return (loan != null ? loan.i : null) instanceof LoanState.Repaid ? 0 : 1;
    }

    public final int b(d1 d1Var) {
        if (d1Var == null) {
            return Integer.MAX_VALUE;
        }
        List list = this.f302249a;
        int iIndexOf = list.indexOf(d1Var);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        Iterator it8 = list.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (((d1) it8.next()).f137810a == d1Var.f137810a) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final d1 c(ProductAccount productAccount) {
        b95.a aVar;
        ProductAccountId.Payload payload = productAccount.getF89504c().f89730b;
        CreditAccountType creditAccountType = payload instanceof CreditAccountType ? (CreditAccountType) payload : null;
        if (creditAccountType instanceof CreditAccountType.CreditCard) {
            return mif.a.m(d1.Companion, j1.CREDIT_CARD, null);
        }
        if (creditAccountType instanceof CreditAccountType.Loan) {
            Loan loan = (Loan) this.f302250b.get(((CreditAccountType.Loan) creditAccountType).f70629b);
            if (loan != null && (aVar = loan.o) != null) {
                int i = c.f302246a[aVar.ordinal()];
                if (i == 1) {
                    return new d1(j1.FIXED_TERM_CREDIT, gt3.d.LOAN, null);
                }
                if (i == 2) {
                    return new d1(j1.FIXED_TERM_CREDIT, gt3.d.REFINANCING, null);
                }
                if (i == 3) {
                    return mif.a.m(d1.Companion, j1.MORTGAGE, null);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (creditAccountType instanceof CreditAccountType.PayLater) {
                return mif.a.m(d1.Companion, j1.BUY_NOW_PAY_LATER, null);
            }
            if (Intrinsics.f(creditAccountType, CreditAccountType.Overdraft.INSTANCE)) {
                return mif.a.m(d1.Companion, j1.OVERDRAFT, null);
            }
            if (creditAccountType instanceof CreditAccountType.Application) {
                ft3.q0 q0Var = ((CreditAccountType.Application) creditAccountType).f70622c;
                return new d1(q0Var.getF137852c(), q0Var.getD(), null);
            }
            if (creditAccountType instanceof CreditAccountType.EmptyState) {
                ft3.q0 q0Var2 = ((CreditAccountType.EmptyState) creditAccountType).f70627b;
                return new d1(q0Var2.getF137852c(), q0Var2.getD(), null);
            }
            if (creditAccountType != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        ProductAccount first = (ProductAccount) obj2;
        ProductAccount second = (ProductAccount) obj3;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        b bVarD = d(first);
        int iK = Intrinsics.k(bVarD.a(), d(second).a());
        if (iK != 0) {
            return iK;
        }
        if (bVarD == b.APPLICATION) {
            return 0;
        }
        int iK2 = Intrinsics.k(b(c(first)), b(c(second)));
        if (iK2 != 0) {
            return iK2;
        }
        if (bVarD == b.CLOSED_PRODUCT) {
            return Intrinsics.k(a(first), a(second));
        }
        return 0;
    }

    public final b d(ProductAccount productAccount) {
        ProductAccountId.Payload payload = productAccount.getF89504c().f89730b;
        CreditAccountType creditAccountType = payload instanceof CreditAccountType ? (CreditAccountType) payload : null;
        if (creditAccountType instanceof CreditAccountType.Loan) {
            Loan loan = (Loan) this.f302250b.get(((CreditAccountType.Loan) creditAccountType).f70629b);
            LoanState loanState = loan != null ? loan.i : null;
            if ((loanState instanceof LoanState.Cancelled) || (loanState instanceof LoanState.Terminated) || (loanState instanceof LoanState.Repaid)) {
                return b.CLOSED_PRODUCT;
            }
            if (Intrinsics.f(loanState, LoanState.Healthy.f70189a) || Intrinsics.f(loanState, LoanState.Planned.f70196a) || (loanState instanceof LoanState.Overdue) || (loanState instanceof LoanState.Outstanding) || (loanState instanceof LoanState.Forbearance) || loanState == null) {
                return b.ACTIVE_PRODUCT;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(creditAccountType instanceof CreditAccountType.CreditCard)) {
            if ((creditAccountType instanceof CreditAccountType.PayLater) || Intrinsics.f(creditAccountType, CreditAccountType.Overdraft.INSTANCE)) {
                return b.ACTIVE_PRODUCT;
            }
            if (creditAccountType instanceof CreditAccountType.Application) {
                return b.APPLICATION;
            }
            if (creditAccountType instanceof CreditAccountType.EmptyState) {
                return b.DISCOVER;
            }
            if (creditAccountType == null) {
                return b.UNKNOWN;
            }
            throw new NoWhenBranchMatchedException();
        }
        yw4.q qVar = (yw4.q) this.f302251c.get(((CreditAccountType.CreditCard) creditAccountType).f70624b);
        int i = qVar == null ? -1 : c.f302247b[qVar.ordinal()];
        if (i != -1) {
            if (i == 1 || i == 2) {
                return b.CLOSED_PRODUCT;
            }
            if (i != 3 && i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b.ACTIVE_PRODUCT;
    }
}
