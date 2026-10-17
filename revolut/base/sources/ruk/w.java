package ruk;

import com.revolut.retail.feature.stockdetails.impl.ui.screens.analyst_details_screen.AnalystDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;

/* JADX INFO: loaded from: classes12.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalystDetailsScreenContract$InputData f257623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f257624b;

    public w(AnalystDetailsScreenContract$InputData inputData, q1 wealthDisclaimersMapper, twk.b priceTargetMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(priceTargetMapper, "priceTargetMapper");
        this.f257623a = inputData;
        this.f257624b = wealthDisclaimersMapper;
    }
}
