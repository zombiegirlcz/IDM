package wyk;

import com.revolut.retail.feature.trading_onboarding.impl.ui.documents.TradingOnboardingOpenDocumentFlowContract$InputData;
import d8l.d;
import hyk.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wvg.d0;
import wyg.s;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements j {
    public final TradingOnboardingOpenDocumentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f301304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e1l.a f301305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f301306r;

    public b(TradingOnboardingOpenDocumentFlowContract$InputData inputData, c onboardingRepository, e1l.a errorDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        Intrinsics.checkNotNullParameter(errorDialogProvider, "errorDialogProvider");
        this.o = inputData;
        this.f301304p = onboardingRepository;
        this.f301305q = errorDialogProvider;
        this.f301306r = d.a(this, new s(1));
    }

    @Override // yki.j
    public final void M0() {
        l2(new wr1.s(this, null, 13), new d0(this, 23));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f301306r;
    }
}
