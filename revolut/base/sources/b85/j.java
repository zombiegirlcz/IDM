package b85;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentdetails.LoanRepaymentDetailsControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends oki.h implements g {
    public final LoanRepaymentDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f15.a f13104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b55.b f13105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m35.c f13106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f13107s;

    public j(LoanRepaymentDetailsControllerContract$InputData inputData, n mapper, f15.a getCreditHelpExtension, b55.b loanHelpRequestProvider, m35.c loanAutopayAccountMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(loanHelpRequestProvider, "loanHelpRequestProvider");
        Intrinsics.checkNotNullParameter(loanAutopayAccountMapper, "loanAutopayAccountMapper");
        this.o = inputData;
        this.f13104p = getCreditHelpExtension;
        this.f13105q = loanHelpRequestProvider;
        this.f13106r = loanAutopayAccountMapper;
        this.f13107s = mra.d.b(this, new f(inputData.f70532a, inputData.f70533b, inputData.f70534c, new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.b1(this, rd0.e.d(ngm.n.K(new a2j.c(29, continuation, this)), h0.f322473a), null, new b74.e(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f13107s;
    }
}
