package g22;

import cli.n;
import cli.y;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.ui.api.navigation.PaymentsBreakdownNavigation$InputData;
import com.revolut.feature.transfer.core.models.FundingSource;
import g06.k;
import kotlin.jvm.internal.Intrinsics;
import n5k.q;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends h implements a {

    @NotNull
    public static final f Companion = new f();
    public final PaymentsBreakdownNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x02.b f139768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x02.d f139769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f139770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f139771s;

    public g(PaymentsBreakdownNavigation$InputData inputData, x02.b apmQuoteInteractor, x02.d apmQuoteRouter, q rateExplanationExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmQuoteInteractor, "apmQuoteInteractor");
        Intrinsics.checkNotNullParameter(apmQuoteRouter, "apmQuoteRouter");
        Intrinsics.checkNotNullParameter(rateExplanationExtension, "rateExplanationExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f139768p = apmQuoteInteractor;
        this.f139769q = apmQuoteRouter;
        this.f139770r = rateExplanationExtension;
        this.f139771s = mra.d.b(this, new b(inputData.d, inputData.f62307a, !Intrinsics.f(r9.f115083b, inputData.f62308b.f92241b)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        PaymentsBreakdownNavigation$InputData paymentsBreakdownNavigation$InputData = this.o;
        ApmQuoteDirection apmQuoteDirection = paymentsBreakdownNavigation$InputData.f62309c;
        FundingSource fundingSource = paymentsBreakdownNavigation$InputData.f62308b;
        l.a1(this, ((q12.f) this.f139768p).c(apmQuoteDirection, new e(fundingSource, paymentsBreakdownNavigation$InputData.f62307a, fundingSource.f92241b, !Intrinsics.f(r0.f115083b, r4))), null, null, new k(this, null, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f139771s;
    }
}
