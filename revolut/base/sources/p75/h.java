package p75;

import com.revolut.feature.credit.loan.impl.ui.rev10.renameloan.RenameLoanScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RenameLoanScreenContract$InputData f233555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l35.b f233556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f233557r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, RenameLoanScreenContract$InputData inputData, l35.b loanInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        this.f233555p = inputData;
        this.f233556q = loanInteractor;
        this.f233557r = new e(inputData.f70486a, null);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f233557r;
    }
}
