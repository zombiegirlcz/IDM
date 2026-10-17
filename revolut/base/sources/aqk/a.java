package aqk;

import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RateDetailsScreenContract$InputData f8471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qpk.a f8472m;

    public a(RateDetailsScreenContract$InputData inputData, qpk.a rateDetailsExchangeCommandProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rateDetailsExchangeCommandProvider, "rateDetailsExchangeCommandProvider");
        this.f8471l = inputData;
        this.f8472m = rateDetailsExchangeCommandProvider;
    }
}
