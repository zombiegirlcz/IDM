package e4j;

import a2g.q;
import cli.g;
import cli.y;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.details_suggestions.DetailsSuggestionScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements dli.b {
    public final cw9.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DetailsSuggestionScreenContract$InputData f122567p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f122568q;

    public c(cw9.d paymentsProductFeatureChecker, DetailsSuggestionScreenContract$InputData inputData, d stateMapper) {
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = paymentsProductFeatureChecker;
        this.f122567p = inputData;
        this.f122568q = mra.d.b(this, new b(false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (this.f122567p.f99697a) {
            l.a1(this, this.o.f(), null, null, new q(this, (Continuation) null, 10), 3);
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f122568q;
    }
}
