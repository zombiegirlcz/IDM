package uoc;

import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PenContributionScreenContract$InputData f281612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f281613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f281614r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p stateMapper, PenContributionScreenContract$InputData inputData, w80.b amountFormatter) {
        dj0.d dVar;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f281612p = inputData;
        this.f281613q = amountFormatter;
        dj0.d dVar2 = inputData.f85223c;
        this.f281614r = new c(dVar2, dVar2.compareTo(inputData.d) >= 0 && ((dVar = inputData.e) == null || dVar2.compareTo(dVar) <= 0));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f281614r;
    }
}
