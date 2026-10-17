package zgj;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 implements cli.n {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimCheckoutScreenContract$InputData f322165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gej.a f322166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final unj.e f322167c;
    public final fhj.g d;
    public final fhj.a e;
    public final com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fhj.m f322168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fhj.j f322169h;
    public final fhj.e i;

    public l0(EsimCheckoutScreenContract$InputData inputData, gej.a bytesFormatter, unj.e coverageItemMapper, fhj.g payWithItemMapper, fhj.d autoRenewalItemMapper, fhj.b activationInfoItemMapper, fhj.a actionButtonClauseMapper, com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a esimDynamicTermsMapper, fhj.m revPointsOptionsMapper, fhj.j summaryMapper, fhj.e navBarStateMapper, fhj.h refundDueInfoMapper, fhj.c dataPlanAdditionalInfoMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(coverageItemMapper, "coverageItemMapper");
        Intrinsics.checkNotNullParameter(payWithItemMapper, "payWithItemMapper");
        Intrinsics.checkNotNullParameter(autoRenewalItemMapper, "autoRenewalItemMapper");
        Intrinsics.checkNotNullParameter(activationInfoItemMapper, "activationInfoItemMapper");
        Intrinsics.checkNotNullParameter(actionButtonClauseMapper, "actionButtonClauseMapper");
        Intrinsics.checkNotNullParameter(esimDynamicTermsMapper, "esimDynamicTermsMapper");
        Intrinsics.checkNotNullParameter(revPointsOptionsMapper, "revPointsOptionsMapper");
        Intrinsics.checkNotNullParameter(summaryMapper, "summaryMapper");
        Intrinsics.checkNotNullParameter(navBarStateMapper, "navBarStateMapper");
        Intrinsics.checkNotNullParameter(refundDueInfoMapper, "refundDueInfoMapper");
        Intrinsics.checkNotNullParameter(dataPlanAdditionalInfoMapper, "dataPlanAdditionalInfoMapper");
        this.f322165a = inputData;
        this.f322166b = bytesFormatter;
        this.f322167c = coverageItemMapper;
        this.d = payWithItemMapper;
        this.e = actionButtonClauseMapper;
        this.f = esimDynamicTermsMapper;
        this.f322168g = revPointsOptionsMapper;
        this.f322169h = summaryMapper;
        this.i = navBarStateMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        r domainState = (r) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (a0) iii.c.f(t1.y(domainState.f322176c, domainState.d, domainState.f322175b, domainState.e, domainState.k, domainState.f322180l, domainState.f322182n), new zg6.c(this, 12), new z8d.h(this, 19), new y66.q(domainState, this, 28));
    }
}
