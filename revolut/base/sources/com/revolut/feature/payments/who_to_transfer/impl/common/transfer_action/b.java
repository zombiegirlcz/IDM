package com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action;

import com.revolut.retail.core.navigation.FeatureCommand;
import dx1.h;
import kotlin.jvm.internal.Intrinsics;
import lo5.p;
import wp1.c;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rq9.a f80103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy1.b f80104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f80105c;

    public b(rq9.a groupBillsNaviCommandProvider, p cryptoSendNaviCommandProvider, oy1.b apmNavigationProvider, c billsNavigationProvider) {
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(cryptoSendNaviCommandProvider, "cryptoSendNaviCommandProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(billsNavigationProvider, "billsNavigationProvider");
        this.f80103a = groupBillsNaviCommandProvider;
        this.f80104b = apmNavigationProvider;
        this.f80105c = billsNavigationProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0243, code lost:
    
        if (r3 == r5) goto L210;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem r17, com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel r18, g3a.e r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.b.a(com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem, com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestinationParcel, g3a.e, gim.c):java.lang.Object");
    }

    public final FeatureCommand b(h hVar) {
        return u0.e(this.f80104b.c(hVar));
    }
}
