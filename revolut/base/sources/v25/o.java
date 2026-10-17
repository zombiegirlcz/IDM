package v25;

import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m35.p;
import sfe.q;
import sfe.r;
import sfe.s;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends r25.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r35.a f285663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l35.b f285664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y45.i f285665n;
    public final y45.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m35.b f285666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b55.b f285667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f15.a f285668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f285669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m35.f f285670t;
    public final ang.f u;
    public final com.revolut.domain.interactors.transactions.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r35.e f285671w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f285672x;

    public o(r35.a loanCommandsFactory, l35.b loanInteractor, y45.i loanProductInteractor, y45.k loanStatementDocumentInteractor, m35.b loanAchDialogMapper, b55.b loanHelpRequestProvider, f15.a getCreditHelpExtension, p loanStateExplainerMapper, m35.f loanDialogMapper, ang.f userInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, r35.e repaymentNavigationHelper) {
        Intrinsics.checkNotNullParameter(loanCommandsFactory, "loanCommandsFactory");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanStatementDocumentInteractor, "loanStatementDocumentInteractor");
        Intrinsics.checkNotNullParameter(loanAchDialogMapper, "loanAchDialogMapper");
        Intrinsics.checkNotNullParameter(loanHelpRequestProvider, "loanHelpRequestProvider");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(loanStateExplainerMapper, "loanStateExplainerMapper");
        Intrinsics.checkNotNullParameter(loanDialogMapper, "loanDialogMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(repaymentNavigationHelper, "repaymentNavigationHelper");
        this.f285663l = loanCommandsFactory;
        this.f285664m = loanInteractor;
        this.f285665n = loanProductInteractor;
        this.o = loanStatementDocumentInteractor;
        this.f285666p = loanAchDialogMapper;
        this.f285667q = loanHelpRequestProvider;
        this.f285668r = getCreditHelpExtension;
        this.f285669s = loanStateExplainerMapper;
        this.f285670t = loanDialogMapper;
        this.u = userInteractor;
        this.v = transactionsInteractor;
        this.f285671w = repaymentNavigationHelper;
    }

    @Override // r25.b
    public final Object b3(s sVar, Continuation continuation) {
        ProductAccountId productAccountIdZ2 = r25.b.Z2(sVar);
        this.f285672x = productAccountIdZ2 != null ? productAccountIdZ2.f89729a : null;
        if (!(sVar instanceof sfe.i)) {
            if (sVar instanceof sfe.m) {
                sfe.m mVar = (sfe.m) sVar;
                f3(new yx4.b(mVar.f262419a, mVar.f262421c, null), mVar.f262420b.f89729a);
            } else if (sVar instanceof sfe.n) {
                sfe.n nVar = (sfe.n) sVar;
                yx4.a aVar = yx4.b.Companion;
                Object obj2 = nVar.f262423b;
                aVar.getClass();
                f3(yx4.a.a(obj2), nVar.f262422a.f89729a);
            } else if (sVar instanceof sfe.l) {
                A2(new LoanKompotFeatureConfig.AccountDetailsNavigationDestination(((sfe.l) sVar).f262417a.f89729a));
            } else {
                if (!(sVar instanceof sfe.p) && !(sVar instanceof sfe.o) && !(sVar instanceof r) && !(sVar instanceof sfe.h) && !(sVar instanceof q) && !(sVar instanceof sfe.k) && !(sVar instanceof sfe.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i = jli.h.f175850a;
            }
        }
        return Unit.f186387a;
    }

    @Override // r25.b
    public final boolean d3(Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        yx4.b.Companion.getClass();
        yx4.b bVarA = yx4.a.a(model);
        String str = this.f285672x;
        if (str == null) {
            return false;
        }
        return f3(bVarA, str);
    }

    public final void e3(dii.g gVar, String str) {
        if (Intrinsics.f(gVar, dii.e.f115068a)) {
            A2(new BridgeDestination(new FeatureCommand(new LoanKompotFeatureConfig.AutoPay(str, false))));
        } else if (Intrinsics.f(gVar, dii.f.f115069a)) {
            r25.b.c3(this, "showPocketDetails", new n(this, str, null), 4);
        } else {
            int i = jli.h.f175850a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f3(yx4.b r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v25.o.f3(yx4.b, java.lang.String):boolean");
    }
}
