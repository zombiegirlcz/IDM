package r65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o55.c f251642p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n65.a f251643q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f251644r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, LoanSelectNewRepaymentDayScreenContract$InputData inputData, o55.c loanChecklistRepository, n65.a loanChangeRepaymentDayDialogMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanChecklistRepository, "loanChecklistRepository");
        Intrinsics.checkNotNullParameter(loanChangeRepaymentDayDialogMapper, "loanChangeRepaymentDayDialogMapper");
        this.f251642p = loanChecklistRepository;
        this.f251643q = loanChangeRepaymentDayDialogMapper;
        LoanDetails loanDetails = inputData.f70407b;
        this.f251644r = new c(loanDetails, loanDetails.f70146c);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f251644r;
    }
}
