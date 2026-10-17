package rkj;

import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanNumberTransferScreenContract$InputData f254888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p56.a f254889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ugc.a f254890c;

    public b(EsimMobilePlanNumberTransferScreenContract$InputData inputData, p56.a mobilePlanIconMapper, ugc.a recipientNameResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mobilePlanIconMapper, "mobilePlanIconMapper");
        Intrinsics.checkNotNullParameter(recipientNameResolver, "recipientNameResolver");
        this.f254888a = inputData;
        this.f254889b = mobilePlanIconMapper;
        this.f254890c = recipientNameResolver;
    }
}
