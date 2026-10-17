package wj9;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import vi9.l;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f298033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination.InputData f298034b;

    public k(l payLaterInstalmentItemMapper, PayLaterKompotFeatureConfig.PaymentBreakdownNavigationDestination.InputData inputData) {
        Intrinsics.checkNotNullParameter(payLaterInstalmentItemMapper, "payLaterInstalmentItemMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f298033a = payLaterInstalmentItemMapper;
        this.f298034b = inputData;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(t1.t(domainState.f298021a, domainState.f298022b), new wgk.f(25), new wf0.b(18), new vjh.c(this, 24));
    }
}
