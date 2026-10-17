package o75;

import com.revolut.feature.credit.loan.impl.ui.rev10.refinancedsettlementprompt.LoanRefinancedSettlementPromptScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o55.c f222723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f222724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f222725r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LoanRefinancedSettlementPromptScreenContract$InputData inputData, p stateMapper, o55.c loanChecklistRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(loanChecklistRepository, "loanChecklistRepository");
        this.f222723p = loanChecklistRepository;
        this.f222724q = inputData.f70483a;
        this.f222725r = f.f222721a;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f222725r;
    }
}
