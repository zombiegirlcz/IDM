package com.revolut.feature.apm.bizum.impl.ui.transfer.transfer;

import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import kotlin.jvm.internal.Intrinsics;
import ns1.f;
import yji.n;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends n implements qt1.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BizumTransferInputData f61643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f61644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ns1.b f61645n;

    public c(BizumTransferInputData inputData, f bizumErrorProvider, ns1.b bizumErrorExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bizumErrorProvider, "bizumErrorProvider");
        Intrinsics.checkNotNullParameter(bizumErrorExtension, "bizumErrorExtension");
        this.f61643l = inputData;
        this.f61644m = bizumErrorProvider;
        this.f61645n = bizumErrorExtension;
    }
}
