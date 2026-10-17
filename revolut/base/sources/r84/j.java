package r84;

import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AddDebtScreenContract$InputData f252362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ww3.c f252363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f252364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f252365s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AddDebtScreenContract$InputData inputData, ww3.c outstandingDebtsInteractor, w80.b amountFormatter, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(outstandingDebtsInteractor, "outstandingDebtsInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f252362p = inputData;
        this.f252363q = outstandingDebtsInteractor;
        this.f252364r = amountFormatter;
        this.f252365s = new e(null, null, false, inputData.f67427b);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f252365s;
    }
}
